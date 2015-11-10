package businessClass;

import basicClasses.ClientePessoaJuridica;
import classesData.ClientePessoaJuridicaDAO;
import classesData.DAOFactory;
import java.util.List;

public class ControleClientePessoaJuridica {
    
    private final ClientePessoaJuridicaDAO dao;

    public ControleClientePessoaJuridica(ClientePessoaJuridicaDAO dao) {
        this.dao = DAOFactory.getClientePessoaJuridicaDAO();
    }
    
    // Método para inserir
    public void inserir(ClientePessoaJuridica clientePessoaJuridica) throws Exception{
        
        try {
            
            List<ClientePessoaJuridica> lista = dao.listarTodos();            
            // Verificando CNPJ
            boolean verificarCnpj = false;

            for (int i = 0; i < lista.size(); i++) {

                if (clientePessoaJuridica.getCnpj() == lista.get(i).getCnpj()) {
                    verificarCnpj = true;
                    break;
                }
            }
            // Verificando Razão Social
            boolean verificarRazãoSocial = false;

            for (int i = 0; i < lista.size(); i++) {

                if (clientePessoaJuridica.getRazaoSocial().equals(lista.get(i).getRazaoSocial())) {
                    verificarRazãoSocial = true;
                    break;
                }
            }
            // Mensagens da verificação
            if (verificarCnpj == true) {
                throw new Exception("Já exite um CLIENTE com este CPF cadastrado na base de DADOS!");
            }

            if (verificarRazãoSocial == true) {
                throw new Exception("Já exite um CLIENTE com este RG cadastrado na base de DADOS!");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }

        dao.inserir(clientePessoaJuridica);
    }
    // Método para atualizar
    public void atualizar(ClientePessoaJuridica clientePessoaJuridica) throws Exception{
        
        try {
            
            List<ClientePessoaJuridica> lista = dao.listarTodos();            
            // Verificando CNPJ
            boolean verificarCnpj = false;

            for (int i = 0; i < lista.size(); i++) {

                if (clientePessoaJuridica.getCnpj() == lista.get(i).getCnpj()) {
                    verificarCnpj = true;
                    break;
                }
            }
            // Verificando Razão Social
            boolean verificarRazãoSocial = false;

            for (int i = 0; i < lista.size(); i++) {

                if (clientePessoaJuridica.getRazaoSocial().equals(lista.get(i).getRazaoSocial())) {
                    verificarRazãoSocial = true;
                    break;
                }
            }
            // Mensagens da verificação
            if (verificarCnpj == true) {
                throw new Exception("Já exite um CLIENTE com este CPF cadastrado na base de DADOS!");
            }

            if (verificarRazãoSocial == true) {
                throw new Exception("Já exite um CLIENTE com este RG cadastrado na base de DADOS!");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        
        dao.alterar(clientePessoaJuridica);
        
    }
    // Método para listar todos
    public List<ClientePessoaJuridica> listaTodosPessoaJuridica(){
        return dao.listarTodos();
    }
    // Método para listar todos por nome
    public List<ClientePessoaJuridica> listaTodosPessoaJuridicaPorNome(String nome){
        return dao.listaTodosPessoaJuridicaPorNome(nome);
    }
    
}
