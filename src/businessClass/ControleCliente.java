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
    
    // Remover Cliente
    public void removerCliente(Cliente cliente){
        this.dao.remover(cliente);
    }
    
    // Método para listar todos
    public List<Cliente> listaTodosClientes(){
        return dao.listarTodos();
    }
}
