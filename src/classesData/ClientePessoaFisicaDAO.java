package classesData;

import basicClasses.ClientePessoaFisica;
import java.util.List;
import javax.persistence.*;

public class ClientePessoaFisicaDAO extends DAOGeneric<ClientePessoaFisica> {

    public ClientePessoaFisicaDAO(EntityManager em) {
        super(em);
    }

    public List<ClientePessoaFisica> listaTodosPessoaFisicas(String nome) {

        List<ClientePessoaFisica> lista = null;

        try {
            Query query = getEntityManager().createQuery("SELECT c FROM ClientePessoaFisica c WHERE c.nome LIKE :nome");
            query.setParameter("nome", nome+"%");
            lista = query.getResultList();
        } catch (Exception ex) {
            ex.getMessage();
        }

        return lista;
    }

}
