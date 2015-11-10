package interfaceClasses;

import basicClasses.ClientePessoaFisica;
import java.util.List;

public interface IFachadaClientePessoaFisica {

    // Método para inserir
    public void inserir(ClientePessoaFisica clientePessoaFisica) throws Exception;

    // Método para atualizar
    public void atualizar(ClientePessoaFisica clientePessoaFisica) throws Exception;

    // Método para remover
    public void remover(ClientePessoaFisica clientePessoaFisica) throws Exception;

    // Método para listar todos
    public List<ClientePessoaFisica> listaTodosPessoaFisicas();

    // Método para listar todos por nome
    public List<ClientePessoaFisica> listaTodosPessoaFisicasPorNome(String nome);

}
