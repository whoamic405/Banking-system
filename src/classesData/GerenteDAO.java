package classesData;

import basicClasses.Gerente;
import java.util.List;
import javax.persistence.*;

public class GerenteDAO extends DAOGeneric<Gerente> {

    public GerenteDAO(EntityManager em) {
        super(em);
    }

    // Verificando Login e Senha
    public Gerente autenticar(Gerente g) throws Exception {

       Gerente returnUser = null;
        
        Query query = getEntityManager().createQuery("SELECT g FROM Gerente g WHERE g.login=:login AND g.senha=:senha");
        query.setParameter("login", g.getLogin());
        query.setParameter("senha", g.getSenha());
        List<Gerente> gerentes = query.getResultList();

        for (Gerente u : gerentes) {
			if (gerentes.isEmpty()) {
				returnUser = null;
			}
			if (gerentes.size() == 1) {
				returnUser = u;
			} else {
				//artificio tecnico temporario
				returnUser = gerentes.get(0);
			}
		}
		return returnUser;
    }

}
