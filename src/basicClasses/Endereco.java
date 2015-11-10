package basicClasses;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Endereco implements Serializable {

    // Atributos
    @Id
    @GeneratedValue
    @Column(name = "ID_ENDERECO")
    private int id;
    @Column(name = "CEP")
    private int cep;
    @Column(name = "RUA")
    private String rua;
    @Column(name = "NUMERO")
    private int numero;
    @Column(name = "COMPLEMENTO", length = 10)
    private String complemento;
    @Column(name = "BAIRRO", length = 30)
    private String bairro;
    @Column(name = "CIDADE", length = 50)
    private String cidade;
    @Column(name = "ESTADO", length = 2)
    private String estado;

    //Relação entre ENDEREÇO e CLIENTE 1 para 1
    @OneToOne(mappedBy = "endereco")
    @Cascade(CascadeType.ALL)
    private Cliente cliente;

    // Construtor vazio
    public Endereco() {
    }

    // Construtor com parâmetros
    public Endereco(int id, int cep, String rua, int numero, String complemento, String bairro, String cidade, String estado, Cliente cliente) {
        this.id = id;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cliente = cliente;
    }

    // Get's e Set's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
