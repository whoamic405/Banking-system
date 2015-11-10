package businessClass;

import basicClasses.Cliente;
import classesData.ClienteDAO;
import classesData.DAOFactory;
import java.util.List;

public class ControleCliente {
    
    private final ClienteDAO dao;

    public ControleCliente(ClienteDAO dao) {
        this.dao = DAOFactory.getDAOCliente();
    }
    
    // Método para listar todos
    public List<Cliente> listaTodosClientes(){
        return dao.listarTodos();
    }
}
