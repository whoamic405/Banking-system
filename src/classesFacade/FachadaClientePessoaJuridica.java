package classesFacade;

import interfaceClasses.IFachadaClientePessoaJuridica;
import basicClasses.ClientePessoaJuridica;
import java.util.List;
import businessClass.ControleClientePessoaJuridica;

public class FachadaClientePessoaJuridica implements IFachadaClientePessoaJuridica{
    
    private final ControleClientePessoaJuridica controleClientePessoaJuridica;

    public FachadaClientePessoaJuridica() {
        this.controleClientePessoaJuridica = new ControleClientePessoaJuridica(null);
    }
    // Método para inserir
    @Override
    public void inserir(ClientePessoaJuridica clientePessoaJuridica) throws Exception{
        controleClientePessoaJuridica.inserir(clientePessoaJuridica);
    }
    // Método para atualizar
    @Override
    public void atualizar(ClientePessoaJuridica clientePessoaJuridica) throws Exception{
        controleClientePessoaJuridica.atualizar(clientePessoaJuridica);
    }
    // Remover Cliente Pessoa Juridica
    @Override
    public void remover(ClientePessoaJuridica clientePessoaJuridica){
        this.controleClientePessoaJuridica.remover(clientePessoaJuridica);
    }
    // Método para listar todos
    @Override
    public List<ClientePessoaJuridica> listaTodosPessoaJuridica(){
        return controleClientePessoaJuridica.listaTodosPessoaJuridica();
    }
    // Método para listar todos por nome
    @Override
    public List<ClientePessoaJuridica> listaTodosPessoaJuridicaPorNome(String nome){
        return controleClientePessoaJuridica.listaTodosPessoaJuridicaPorNome(nome);
    }
}
