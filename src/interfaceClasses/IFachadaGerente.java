package interfaceClasses;

import basicClasses.Gerente;
import java.util.List;


public interface IFachadaGerente {
    
    // Método para autenticar
    public void autenticar(Gerente g, boolean verdadeiro) throws Exception;
    
    // Método para atualizar
    public void atualizarGerente(Gerente gerente) throws Exception;
    
    // Método para listar todos
    public List<Gerente> listarTodos();
    
}
