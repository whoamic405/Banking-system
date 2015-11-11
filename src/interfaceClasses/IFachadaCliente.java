package interfaceClasses;

import basicClasses.Cliente;
import java.util.List;

public interface IFachadaCliente {

    // Remover Cliente
    public void removerCliente(Cliente cliente);
    
    // Método para listar todos
    public List<Cliente> listaTodosClientes();

}
