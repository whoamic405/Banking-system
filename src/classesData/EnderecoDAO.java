package classesData;

import basicClasses.Endereco;
import java.util.List;
import javax.persistence.*;

public class EnderecoDAO extends DAOGeneric<Endereco>{

    public EnderecoDAO(EntityManager em) {
        super(em);
    }
    
     public List<Endereco> listarEnderecoPorId(int id) {

        List<Endereco> listarEndereco = null;

        try {

            Query query = getEntityManager().createQuery("SELECT e FROM Endereco e WHERE e.id=:id");
            query.setParameter("id", id);
            listarEndereco = query.getResultList();

        } catch (Exception ex) {
            ex.getMessage();
        }

        return listarEndereco;

    }
    
}
