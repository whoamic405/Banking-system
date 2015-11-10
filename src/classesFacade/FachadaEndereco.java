package classesFacade;

import interfaceClasses.IFachadaEndereco;
import basicClasses.Endereco;
import businessClass.ControleEndereco;
import java.util.List;

public class FachadaEndereco implements IFachadaEndereco{
    
    private final ControleEndereco controleEndereco;

    public FachadaEndereco() {
        this.controleEndereco = new ControleEndereco(null);
    }
    // Método para inserir    
    @Override
    public void inserir(Endereco endereco) throws Exception{
        controleEndereco.inserir(endereco);
    }
    // Método para atualizar
    @Override
    public void atualizar(Endereco endereco) throws Exception{
        controleEndereco.atualizar(endereco);
    }
    // Método para remover
    @Override
    public void remover(Endereco endereco) throws Exception{
        controleEndereco.remover(endereco);
    }
    // Método para listar por ID
    @Override
    public List<Endereco> listarEnderecoPorId(int id)throws Exception{
        return controleEndereco.listarEnderecoPorId(id);
    }
}
