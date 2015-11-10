package classesFacade;

import interfaceClasses.IFachadaContaPoupanca;
import basicClasses.ContaPoupanca;
import java.util.List;
import businessClass.ControleContaPoupanca;

public class FachadaContaPoupanca implements IFachadaContaPoupanca{
    
    private final ControleContaPoupanca controleContaPoupaca;

    public FachadaContaPoupanca() {
        this.controleContaPoupaca = new ControleContaPoupanca(null);
    }
    // Método para inserir
    @Override
    public void inserir(ContaPoupanca contaPoupanca) throws Exception{
        controleContaPoupaca.inserir(contaPoupanca);
    }
    // Método para atualizar
    @Override
    public void atualizar(ContaPoupanca contaPoupanca) throws Exception{
        controleContaPoupaca.atualizar(contaPoupanca);
    }
    // Método para remover
    @Override
    public void remover(ContaPoupanca contaPoupanca) throws Exception{
        controleContaPoupaca.remover(contaPoupanca);
    }
    // Método para listar todos
    @Override
    public List<ContaPoupanca> listarTodas(){
        return controleContaPoupaca.listarTodas();
    }
}
