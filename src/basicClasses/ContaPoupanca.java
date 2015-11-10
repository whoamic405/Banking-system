package basicClasses;

import java.util.Date;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "ID_CONTA")
public class ContaPoupanca extends Conta {

    //Atributos
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_DE_VENCIMENTO")
    private Date dataVencimento;

    // Construtor vazio
    public ContaPoupanca() {
    }

    // Construtor com parâmetros
    public ContaPoupanca(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    // Construtor com parâmetros
    public ContaPoupanca(int id, int numero, double saldo, Date dataAbertura, double limiteSaque, String status, String senha, Cliente cliente, Agencia agencia) {
        super(id, numero, saldo, dataAbertura, limiteSaque, status, senha, cliente, agencia);
    }

    // Construtor com parâmetros
    public ContaPoupanca(Date dataVencimento, int id, int numero, double saldo, Date dataAbertura, double limiteSaque, String status, String senha, Cliente cliente, Agencia agencia) {
        super(id, numero, saldo, dataAbertura, limiteSaque, status, senha, cliente, agencia);
        this.dataVencimento = dataVencimento;
    }

    // Get's e Set's
    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

}
