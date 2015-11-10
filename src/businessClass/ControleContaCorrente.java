package businessClass;

import basicClasses.ContaCorrente;
import classesData.ContaCorrenteDAO;
import classesData.DAOFactory;
import java.util.List;

public class ControleContaCorrente {

    private final ContaCorrenteDAO dao;

    public ControleContaCorrente(ContaCorrenteDAO dao) {
        this.dao = DAOFactory.getContaCorrenteDAO();
    }

    // Método para inserir
    public void inserir(ContaCorrente contaCorrente) throws Exception {

        try {

            List<ContaCorrente> lista = dao.listarTodos();

            boolean verificarNumero = false;

            for (int i = 0; i < lista.size(); i++) {

                if (contaCorrente.getNumero() == lista.get(i).getNumero()) {
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

        dao.inserir(contaCorrente);
    }
    // Método para atualizar
    public void atualizar(ContaCorrente contaCorrente) throws Exception {

        try {

            List<ContaCorrente> lista = dao.listarTodos();

            boolean verificarNumero = false;

            for (int i = 0; i < lista.size(); i++) {

                if (contaCorrente.getNumero() == lista.get(i).getNumero()) {
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

        dao.alterar(contaCorrente);

    }
    // Método para remover
    public void remover(ContaCorrente contaCorrente) throws Exception{
        dao.remover(contaCorrente);
    }
    // Método para listar todos
    public List<ContaCorrente> listarTodas(){
        return dao.listarTodos();
    }

}
