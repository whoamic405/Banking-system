package basicClasses;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente implements Serializable {

    // Atributos
    @Id
    @GeneratedValue
    @Column(name = "ID_CLIENTE")
    private int id;
    @Column(name = "NOME", length = 50)
    private String nome;
    @Column(name = "SEXO", length = 1)
    private String sexo;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "E_MAIL", length = 20)
    private String email;
    @Column(name = "TIPO")
    private String tipo;

    // Relação entre CLIENTE e ENDEREÇO 1 para 1
    @OneToOne
    @JoinColumn(name = "ID_ENDERECO")
    private Endereco endereco;

    // Relação entre CLIENTE e CONTA 1 para 1
    @OneToOne(mappedBy = "cliente")
    @Cascade(CascadeType.ALL)
    private Conta conta;

    // Construtor vazio
    public Cliente() {
    }

    // Construtor com parâmetros

    public Cliente(int id, String nome, String sexo, String telefone, String email, String tipo, Endereco endereco, Conta conta) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
        this.endereco = endereco;
        this.conta = conta;
    }
    

    // Get's e Set's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
