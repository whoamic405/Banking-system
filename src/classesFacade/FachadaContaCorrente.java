package classesFacade;

import interfaceClasses.IFachadaContaCorrente;
import basicClasses.ContaCorrente;
import java.util.List;
import businessClass.ControleContaCorrente;


public class FachadaContaCorrente implements IFachadaContaCorrente{
    
    private final ControleContaCorrente controleContaCorrente;

    public FachadaContaCorrente() {
        this.controleContaCorrente = new ControleContaCorrente(null);
    }
    // Método para inserir
    @Override
    public void inserir(ContaCorrente contaCorrente) throws Exception{
        controleContaCorrente.inserir(contaCorrente);
    }
    // Método para atualizar
    @Override
    public void atualizar(ContaCorrente contaCorrente) throws Exception{
        controleContaCorrente.atualizar(contaCorrente);
    }
    // Método para remover
    @Override
    public void remover(ContaCorrente contaCorrente) throws Exception{
        controleContaCorrente.remover(contaCorrente);
    }
    // Método para listar todos
    @Override
    public List<ContaCorrente> listarTodas(){
        return controleContaCorrente.listarTodas();
    }
    
}
