package classesFacade;

import basicClasses.Cliente;
import businessClass.ControleCliente;
import interfaceClasses.IFachadaCliente;
import java.util.List;


public class FachadaCliente implements IFachadaCliente{
    
    private final ControleCliente controleCliente;

    public FachadaCliente() {
        this.controleCliente = new ControleCliente(null);
    }
    
    
    // Método para listar todos
    @Override
    public List<Cliente> listaTodosClientes(){
        return controleCliente.listaTodosClientes();
    }
    
}
