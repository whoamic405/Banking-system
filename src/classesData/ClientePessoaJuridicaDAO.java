package classesData;

import basicClasses.ClientePessoaJuridica;
import java.util.List;
import javax.persistence.*;

public class ClientePessoaJuridicaDAO extends DAOGeneric<ClientePessoaJuridica> {

    public ClientePessoaJuridicaDAO(EntityManager em) {
        super(em);
    }

    // Método para listar todos por nome
    public List<ClientePessoaJuridica> listaTodosPessoaJuridicaPorNome(String nome) {

        List<ClientePessoaJuridica> lista = null;

        try {

            Query query = getEntityManager().createQuery("SELECT c FROM ClientePessoaJuridica c WHERE c.nome=:nome");
            query.setParameter("nome", nome);
            lista = query.getResultList();

        } catch (Exception ex) {
            ex.getMessage();
        }
        return lista;
    }

}
