package classesData;

import basicClasses.Cliente;
import javax.persistence.*;

public class ClienteDAO extends DAOGeneric<Cliente>{
    
    public ClienteDAO(EntityManager em) {
        super(em);
    }
    
}
