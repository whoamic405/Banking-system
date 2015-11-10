package businessClass;

import basicClasses.Agencia;
import classesData.AgenciaDAO;
import classesData.DAOFactory;
import java.util.List;

public class ControleAgencia {
    
    private final AgenciaDAO dao;

    public ControleAgencia(AgenciaDAO dao) {
        this.dao = DAOFactory.getAgenciaDAO();
    }

    // Listar Agencia
    public List<Agencia> listaAgencia(){
        return dao.listarTodos();
    }
    
}
