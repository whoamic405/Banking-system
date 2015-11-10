package classesData;

import basicClasses.Conta;
import javax.persistence.*;

public class ContaDAO extends DAOGeneric<Conta>{

    public ContaDAO(EntityManager em) {
        super(em);
    }
    
}
