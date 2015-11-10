package businessClass;

import basicClasses.Endereco;
import classesData.EnderecoDAO;
import classesData.DAOFactory;
import java.util.List;


public class ControleEndereco {
    
    private final EnderecoDAO dao;

    public ControleEndereco(EnderecoDAO dao) {
        this.dao = DAOFactory.getEnderecoDAO();
    }
    // Método para inserir
    public void inserir(Endereco endereco) throws Exception{
        dao.inserir(endereco);
    }
    // Método para atualizar
    public void atualizar(Endereco endereco) throws Exception{
        dao.alterar(endereco);
    }
    // Método para remover
    public void remover(Endereco endereco) throws Exception{
        dao.remover(endereco);
    }
    // Método para listar por ID
    public List<Endereco> listarEnderecoPorId(int id)throws Exception{
        return dao.listarEnderecoPorId(id);
    }
}
