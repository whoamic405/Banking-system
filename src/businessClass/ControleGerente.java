package businessClass;

import basicClasses.Gerente;
import classesData.GerenteDAO;
import classesData.DAOFactory;
import java.util.List;
import javax.swing.JOptionPane;

public class ControleGerente {

    private final GerenteDAO dao;

    public ControleGerente(GerenteDAO dao) {
        this.dao = DAOFactory.getGerenteDAO();
    }
    // Inserir Gerente

    public void autenticar(Gerente g, boolean verdadeiro) throws Exception {

        List<Gerente> gerentes = this.listarTodos();

        // Verificando

        verdadeiro = false;
        
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getLogin().equals(g.getLogin()) && gerentes.get(i).getSenha().equals(g.getSenha())) {
                verdadeiro = true;
                JOptionPane.showMessageDialog(null, "Autenticaçao realizada com sucesso!",
                        "Mesagem de confirmaçao",JOptionPane.INFORMATION_MESSAGE);
            }else{
                verdadeiro = false;
                JOptionPane.showMessageDialog(null, "Login ou Senha inválidos!", "Aviso", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
            }
        }

        dao.autenticar(g);
    }

    // Atualizar Gerente
    public void atualizarGerente(Gerente gerente) throws Exception {

        // Validações
        if (gerente.getNome().equals("") || gerente.getNome() == null) {
            throw new Exception("Nome não informado!");
        }
        if (gerente.getNome().length() < 4) {
            throw new Exception("Nome inválida! Número de caracteres à baixo do esperado.");
        }
        if (gerente.getLogin().equals("") || gerente.getLogin() == null) {
            throw new Exception("Login não informado!");
        }
        if (gerente.getLogin().length() <= 3) {
            throw new Exception("Login inválida! Seu LOGIN deve ser superior há 3(três) caracteres.");
        }
        if (gerente.getSenha().equals("") || gerente.getSenha() == null) {
            throw new Exception("Senha não informada!");
        }
        if (gerente.getSenha().length() <= 3) {
            throw new Exception("Senha inválida! Sua SENHA deve ser superior há 3(três) caracteres.");
        }
        // Atualizar
        dao.alterar(gerente);
    }

    // Lista todos
    public List<Gerente> listarTodos() {
        // Listar
        return dao.listarTodos();
    }

}
