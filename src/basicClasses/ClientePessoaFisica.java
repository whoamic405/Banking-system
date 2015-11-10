package basicClasses;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "ID_CLIENTE")
public class ClientePessoaFisica extends Cliente{
    
     // Atributos
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "RG")
    private String rg;

    // Construtor vazio
    public ClientePessoaFisica() {
    }

    // Construtor com parâmetros
    public ClientePessoaFisica(String cpf, String rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    // Construtor com parâmetros
    public ClientePessoaFisica(int id, String nome, String sexo, String telefone, String email, String tipo, Endereco endereco, Conta conta) {
        super(id, nome, sexo, telefone, email, tipo, endereco, conta);
    }
    // Construtor com parâmetros
    public ClientePessoaFisica(String cpf, String rg, int id, String nome, String sexo, String telefone, String email, String tipo, Endereco endereco, Conta conta) {
        super(id, nome, sexo, telefone, email, tipo, endereco, conta);
        this.cpf = cpf;
        this.rg = rg;
    }

    // Get's e Set's
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
