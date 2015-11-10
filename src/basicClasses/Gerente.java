package basicClasses;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Gerente implements Serializable {

    // Atributos
    @Id
    @GeneratedValue
    @Column(name = "ID_GERENTE")
    private int id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "SENHA")
    private String senha;

    //Relação entre GERENTE e AGENCIA 1 para 1
    @OneToOne(mappedBy = "gerente")
    @Cascade(CascadeType.ALL)
    private Agencia agencia;

    // Construtor vazio
    public Gerente() {
    }

    // Construtor com parâmetros
    public Gerente(int id, String nome, String login, String senha, Agencia agencia) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.agencia = agencia;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

}
