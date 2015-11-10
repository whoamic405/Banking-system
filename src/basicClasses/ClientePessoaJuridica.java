package basicClasses;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "ID_CLIENTE")
public class ClientePessoaJuridica extends Cliente {

    // Atributos
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;

    // Construtor vazio
    public ClientePessoaJuridica() {
    }

    // Construtor com parâmetros
    public ClientePessoaJuridica(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Construtor com parâmetros
    public ClientePessoaJuridica(int id, String nome, String sexo, String telefone, String email, String tipo, Endereco endereco, Conta conta) {
        super(id, nome, sexo, telefone, email, tipo, endereco, conta);
    }
    
    // Construtor com parâmetros
    public ClientePessoaJuridica(String cnpj, String razaoSocial, int id, String nome, String sexo, String telefone, String email, String tipo, Endereco endereco, Conta conta) {   
        super(id, nome, sexo, telefone, email, tipo, endereco, conta);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Get's e Set's
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
