package businessClass;

import basicClasses.ClientePessoaFisica;
import classesData.ClientePessoaFisicaDAO;
import classesData.DAOFactory;
import java.util.List;

public class ControleClientePessoaFisica {

    private final ClientePessoaFisicaDAO dao;

    public ControleClientePessoaFisica(ClientePessoaFisicaDAO dao) {
        this.dao = DAOFactory.getClientePessoaFisicaDAO();
    }      
    // Método para inserir
    public void inserir(ClientePessoaFisica clientePessoaFisica) throws Exception {
        
        try {
            
            List<ClientePessoaFisica> lista = dao.listarTodos();            
            // Verificando CPF
            boolean verificarCpf = false;

            for (int i = 0; i < lista.size(); i++) {

                if (clientePessoaFisica.getCpf() == lista.get(i).getCpf()) {
                    verificarCpf = true;
                    break;
                }
            }
            // Verificando RG
            boolean verificarRg = false;

            for (int i = 0; i < lista.size(); i++) {

                if (clientePessoaFisica.getRg() == lista.get(i).getRg()) {
                    verificarRg = true;
                    break;
                }
            }
            // Mensagens da verificação
            if (verificarCpf == true) {
                throw new Exception("Já exite um CLIENTE com este CPF cadastrado na base de DADOS!");
            }

            if (verificarRg == true) {
                throw new Exception("Já exite um CLIENTE com este RG cadastrado na base de DADOS!");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }

        dao.inserir(clientePessoaFisica);

    }   
    // Método para atualizar
    public void atualizar(ClientePessoaFisica clientePessoaFisica) throws Exception{
        
        try {
            
            List<ClientePessoaFisica> lista = dao.listarTodos();           
            // Verificando CPF
            boolean verificarCpf = false;

            for (int i = 0; i < lista.size(); i++) {

                if (clientePessoaFisica.getCpf() == lista.get(i).getCpf()) {
                    verificarCpf = true;
                    break;
                }
            }
            // Verificando RG
            boolean verificarRg = false;

            for (int i = 0; i < lista.size(); i++) {

                if (clientePessoaFisica.getRg() == lista.get(i).getRg()) {
                    verificarRg = true;
                    break;
                }
            }
            // Mensagens da verificação
            if (verificarCpf == true) {
                throw new Exception("Já exite um CLIENTE com este CPF cadastrado na base de DADOS!");
            }

            if (verificarRg == true) {
                throw new Exception("Já exite um CLIENTE com este RG cadastrado na base de DADOS!");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        
        dao.alterar(clientePessoaFisica);
        
    }
    // Método para remover
    public void remover(ClientePessoaFisica clientePessoaFisica) throws Exception{
        dao.remover(clientePessoaFisica);
    }
    // Método para listar todos
    public List<ClientePessoaFisica> listaTodosPessoaFisicas(){
        return dao.listarTodos();
    }
    // Método para listar todos por nome
    public List<ClientePessoaFisica> listaTodosPessoaFisicasPorNome(String nome){
        return dao.listaTodosPessoaFisicas(nome);
    }
    
}
