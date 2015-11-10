package basicClasses;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Agencia implements Serializable {

    // Atributos
    @Id
    @GeneratedValue
    @Column(name = "ID_AGENCIA")
    private int id;
    @Column(name = "NUMERO")
    private int numero;
    @Column(name = "NOME", length = 30)
    private String nome;

    //Relação entre AGENCIA e CONTA * para 1
    @OneToMany(mappedBy = "agencia", fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private List<Conta> contas;

    //Relação entre AGENCIA e GERENTE 1 para 1
    @OneToOne
    @JoinColumn(name = "ID_GERENTE")
    private Gerente gerente;

    // Construtor vazio
    public Agencia() {
    }

    // Construtor com parâmetros
    public Agencia(int id, int numero, String nome, List<Conta> contas, Gerente gerente) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.contas = contas;
        this.gerente = gerente;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

}
