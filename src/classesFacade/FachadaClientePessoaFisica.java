package classesFacade;

import interfaceClasses.IFachadaClientePessoaFisica;
import basicClasses.ClientePessoaFisica;
import java.util.List;
import businessClass.ControleClientePessoaFisica;

public class FachadaClientePessoaFisica implements IFachadaClientePessoaFisica{
    
    private final  ControleClientePessoaFisica controleClientePessoaFisica;
    
    public FachadaClientePessoaFisica() {
        this.controleClientePessoaFisica = new ControleClientePessoaFisica(null);
    }
    // Método para inserir
    @Override
    public void inserir(ClientePessoaFisica clientePessoaFisica) throws Exception{
        controleClientePessoaFisica.inserir(clientePessoaFisica);
    }
    // Método para atualizar
    @Override
    public void atualizar(ClientePessoaFisica clientePessoaFisica) throws Exception{
        controleClientePessoaFisica.atualizar(clientePessoaFisica);
    }
    // Método para remover
    @Override
    public void remover(ClientePessoaFisica clientePessoaFisica) throws Exception{
        controleClientePessoaFisica.remover(clientePessoaFisica);
    }
    // Método para listar todos
    @Override
    public List<ClientePessoaFisica> listaTodosPessoaFisicas() {
        return controleClientePessoaFisica.listaTodosPessoaFisicas();
    }
    // Método para listar todos por nome
    @Override
    public List<ClientePessoaFisica> listaTodosPessoaFisicasPorNome(String nome){
        return controleClientePessoaFisica.listaTodosPessoaFisicasPorNome(nome);
    }

}
