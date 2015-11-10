package classesData;

import basicClasses.ContaCorrente;
import javax.persistence.*;

public class ContaCorrenteDAO extends DAOGeneric<ContaCorrente>{

    public ContaCorrenteDAO(EntityManager em) {
        super(em);
    }
    
}
