package basicClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Conta implements Serializable {

    // Atributos
    @Id
    @GeneratedValue
    @Column(name = "ID_CONTA")
    private int id;
    @Column(name = "NUMERO")
    private int numero;
    @Column(name = "SALDO")
    private double saldo;
    @Column(name = "DATA_ABERTURA")
    @Temporal(TemporalType.DATE)
    private Date dataAbertura;
    @Column(name = "LIMITE_DE_SAQUE")
    private double limiteSaque;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "SENHA")
    private String senha;

    //Relação entre CONTA e CLIENTE 1 para 1
    @OneToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

    //Relação entre CONTA e AGENCIA 1 para *
    @ManyToOne
    @JoinColumn(name = "ID_AGENCIA", insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Agencia agencia;

    // Construtor vazio
    public Conta() {
    }

    // Construtor com parâmetros
    public Conta(int id, int numero, double saldo, Date dataAbertura, double limiteSaque, String status, String senha, Cliente cliente, Agencia agencia) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.limiteSaque = limiteSaque;
        this.status = status;
        this.senha = senha;
        this.cliente = cliente;
        this.agencia = agencia;
    }

    // Get's e Set's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

}
