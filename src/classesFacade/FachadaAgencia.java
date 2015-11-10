package classesFacade;

import interfaceClasses.IFachadaAgencia;
import basicClasses.Agencia;
import java.util.List;
import businessClass.ControleAgencia;

public class FachadaAgencia implements IFachadaAgencia{
    
    private final ControleAgencia controleAgencia;
    
    public FachadaAgencia() {
        this.controleAgencia = new ControleAgencia(null);
    }
    // Método para listar 
    @Override
    public List<Agencia> listaAgencia(){
        return controleAgencia.listaAgencia();
    }
    
}
