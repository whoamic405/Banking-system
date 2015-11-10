package interfaceClasses;

import basicClasses.ContaCorrente;
import java.util.List;

public interface IFachadaContaCorrente {
    
     // Método para inserir
    public void inserir(ContaCorrente contaCorrente) throws Exception;
    
    // Método para atualizar
    public void atualizar(ContaCorrente contaCorrente) throws Exception;
    
    // Método para remover
    public void remover(ContaCorrente contaCorrente) throws Exception;
    
    // Método para listar todos
    public List<ContaCorrente> listarTodas();
    
}
