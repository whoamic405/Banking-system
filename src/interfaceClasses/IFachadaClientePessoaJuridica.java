package interfaceClasses;

import basicClasses.ClientePessoaJuridica;
import java.util.List;

public interface IFachadaClientePessoaJuridica {
    
    // Método para inserir
    public void inserir(ClientePessoaJuridica clientePessoaJuridica) throws Exception;
    
    // Método para atualizar
    public void atualizar(ClientePessoaJuridica clientePessoaJuridica) throws Exception;
    
    // Método para listar todos
    public List<ClientePessoaJuridica> listaTodosPessoaJuridica();
    
    // Método para listar todos por nome
    public List<ClientePessoaJuridica> listaTodosPessoaJuridicaPorNome(String nome);
    
}
