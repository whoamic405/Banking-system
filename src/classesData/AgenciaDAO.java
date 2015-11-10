package classesData;

import basicClasses.Agencia;
import javax.persistence.*;

public class AgenciaDAO extends DAOGeneric<Agencia>{

    public AgenciaDAO(EntityManager em) {
        super(em);
    }
        
}
