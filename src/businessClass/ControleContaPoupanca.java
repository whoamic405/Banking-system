package businessClass;

import basicClasses.ContaPoupanca;
import classesData.ContaPoupancaDAO;
import classesData.DAOFactory;
import java.util.List;

public class ControleContaPoupanca {
    
    private final ContaPoupancaDAO dao;

    public ControleContaPoupanca(ContaPoupancaDAO dao) {
        this.dao = DAOFactory.getContaPoupancaDAO();
    }
    
    // Método para inserir
    public void inserir(ContaPoupanca contaPoupanca) throws Exception{
        
        try {

            List<ContaPoupanca> lista = dao.listarTodos();

            boolean verificarNumero = false;

            for (int i = 0; i < lista.size(); i++) {

                if (contaPoupanca.getNumero() == lista.get(i).getNumero()) {
                    verificarNumero = true;
                    break;
                }
            }

            if (verificarNumero == true) {
                throw new Exception("Já existe uma CONTA com o Número informado na base de DADOS!");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }

        dao.inserir(contaPoupanca);
        
    }
    // Método para atualizar
    public void atualizar(ContaPoupanca contaPoupanca) throws Exception{
        
        try {

            List<ContaPoupanca> lista = dao.listarTodos();

            boolean verificarNumero = false;

            for (int i = 0; i < lista.size(); i++) {

                if (contaPoupanca.getNumero() == lista.get(i).getNumero()) {
                    verificarNumero = true;
                    break;
                }
            }

            if (verificarNumero == true) {
                throw new Exception("Já existe uma CONTA com o Número informado na base de DADOS!");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        
        dao.alterar(contaPoupanca);
        
    }
    // Método para remover
    public void remover(ContaPoupanca contaPoupanca) throws Exception{
        dao.remover(contaPoupanca);
    }
    // Método para listar todos
    public List<ContaPoupanca> listarTodas(){
        return dao.listarTodos();
    }
        
}
