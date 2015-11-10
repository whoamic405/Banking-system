package classesData;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;

public abstract class DAOGeneric<Entidade> {

    private EntityManager entityManager;
    private final Class<Entidade> classePersistente;

    @SuppressWarnings({"unchecked", "OverridableMethodCallInConstructor"})
    public DAOGeneric(EntityManager em) {
        this.setEntityManager(em);
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        classePersistente = (Class<Entidade>) parameterizedType.getActualTypeArguments()[0];
    }

    public void inserir(Entidade objeto) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.begin();
            getEntityManager().persist(objeto);
            tx.commit();
            System.out.println(classePersistente.getSimpleName() + " salvo com sucesso");
        } catch (PersistenceException e) {
            tx.rollback();
        }
    }


    public Entidade alterar(Entidade objeto) {

        EntityTransaction tx = getEntityManager().getTransaction();
        tx.begin();

        objeto = getEntityManager().merge(objeto);

        tx.commit();

        System.out.println(classePersistente.getSimpleName() + " atualizado com sucesso");

        return objeto;
    }


    public final void inserirColecao(Collection<Entidade> colecao) {
        try {
            EntityTransaction tx = getEntityManager().getTransaction();
            tx.begin();

            for (Entidade entidade : colecao) {
                getEntityManager().persist(entidade);
            }

            tx.commit();

            System.out.println(classePersistente.getSimpleName() + " salvos com sucesso: " + colecao.size());
        } catch (PersistenceException e) {
            e.printStackTrace();
        }
    }

 
    public final void remover(Entidade objeto) {
        EntityTransaction tx = getEntityManager().getTransaction();
        tx.begin();

        // Este merge foi incluido para permitir a exclusao de objetos no estado Detached
        objeto = getEntityManager().merge(objeto);

        getEntityManager().remove(objeto);

        tx.commit();

        System.out.println(classePersistente.getSimpleName() + " removido com sucesso");
    }

 
    public final Entidade buscarPorChave(Serializable chave) {
        Entidade instance = null;
        try {
            instance = (Entidade) getEntityManager().find(getClassePersistente(), chave);
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        return instance;
    }

    public List<Entidade> listarTodos() {

        String Entidade = this.classePersistente.getSimpleName();

        List<Entidade> lista = null;

        try {
            @SuppressWarnings("JPQLValidation")
            Query query = getEntityManager().createQuery("FROM " + Entidade);
            lista = query.getResultList();
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        return lista;
    }

  
    public final void refresh(Entidade object) {
        getEntityManager().refresh(object);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    protected final Class<Entidade> getClassePersistente() {
        return classePersistente;
    }

}
