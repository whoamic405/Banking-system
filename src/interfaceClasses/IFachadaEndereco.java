package interfaceClasses;

import basicClasses.Endereco;
import java.util.List;

public interface IFachadaEndereco {
 
     // Método para inserir    
    public void inserir(Endereco endereco) throws Exception;
    
    // Método para atualizar
    public void atualizar(Endereco endereco) throws Exception;
    
    // Método para remover
    public void remover(Endereco endereco) throws Exception;
    
    // Método para listar por ID
    public List<Endereco> listarEnderecoPorId(int id)throws Exception;
}
