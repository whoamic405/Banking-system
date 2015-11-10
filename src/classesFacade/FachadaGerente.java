package classesFacade;

import interfaceClasses.IFachadaGerente;
import basicClasses.Gerente;
import java.util.List;
import businessClass.ControleGerente;

public class FachadaGerente implements IFachadaGerente{
    
    private final ControleGerente controleGerente;
    
    public FachadaGerente() {
        this.controleGerente = new ControleGerente(null);
    }
    
    // Gerente
    @Override
    public void autenticar(Gerente g, boolean verdadeiro) throws Exception{
          controleGerente.autenticar(g,verdadeiro);
    }

    @Override
    public void atualizarGerente(Gerente gerente) throws Exception {
        controleGerente.atualizarGerente(gerente);
    }
    
    @Override
    public List<Gerente> listarTodos() {
        return controleGerente.listarTodos();
    }
    
}
