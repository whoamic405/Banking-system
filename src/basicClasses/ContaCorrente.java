package basicClasses;

import java.util.Date;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "ID_CONTA")
public class ContaCorrente extends Conta{
    
    //Atributos
    @Column(name = "JUROS")
    private double juros;

    // Construtor vazio
    public ContaCorrente() {
    }

    // Construtor com parâmetros
    public ContaCorrente(double limiteSaque, double juros) {
        this.juros = juros;
    }

    // Construtor com parâmetros
    public ContaCorrente(int id, int numero, double saldo, Date dataAbertura, double limiteSaque, String status, String senha, Cliente cliente, Agencia agencia) {
        super(id, numero, saldo, dataAbertura, limiteSaque, status, senha, cliente, agencia);
    }
   
    // Construtor com parâmetros
    public ContaCorrente(double juros, int id, int numero, double saldo, Date dataAbertura, double limiteSaque, String status, String senha, Cliente cliente, Agencia agencia) {    
        super(id, numero, saldo, dataAbertura, limiteSaque, status, senha, cliente, agencia);
        this.juros = juros;
    }

    // Get's e Set's
    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
}
