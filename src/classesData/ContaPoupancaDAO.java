package classesData;

import basicClasses.ContaPoupanca;
import javax.persistence.*;

public class ContaPoupancaDAO extends DAOGeneric<ContaPoupanca>{

    public ContaPoupancaDAO(EntityManager em) {
        super(em);
    }
    
}
