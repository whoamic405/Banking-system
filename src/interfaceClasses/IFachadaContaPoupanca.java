package interfaceClasses;

import basicClasses.ContaPoupanca;
import java.util.List;


public interface IFachadaContaPoupanca {
    
    // Método para inserir
    public void inserir(ContaPoupanca contaPoupanca) throws Exception;
    
     // Método para atualizar
    public void atualizar(ContaPoupanca contaPoupanca) throws Exception;
    
    // Método para remover
    public void remover(ContaPoupanca contaPoupanca) throws Exception;
    
    // Método para listar todos
    public List<ContaPoupanca> listarTodas();
    
}
