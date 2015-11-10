package classesData;

import javax.persistence.*;

public abstract class DAOFactory {

    private static EntityManager manager;
    private static final EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("hibernate");
        if (manager == null || !manager.isOpen()) {
            manager = factory.createEntityManager();
        }
    }

    // Agencia
    public static AgenciaDAO getAgenciaDAO() {
        AgenciaDAO daoAgencia = new AgenciaDAO(manager);
        return daoAgencia;
    }

    // Cliente
    public static ClienteDAO getDAOCliente() {
        ClienteDAO daoCliente = new ClienteDAO(manager);
        return daoCliente;
    }

    // Cliente Pessoa Física
    public static ClientePessoaFisicaDAO getClientePessoaFisicaDAO() {
        ClientePessoaFisicaDAO daoClientePessoaFisica = new ClientePessoaFisicaDAO(manager);
        return daoClientePessoaFisica;
    }

    // Cliente Pessoa Juridica
    public static ClientePessoaJuridicaDAO getClientePessoaJuridicaDAO() {
        ClientePessoaJuridicaDAO daoClientePessoaJuridica = new ClientePessoaJuridicaDAO(manager);
        return daoClientePessoaJuridica;
    }

    // Conta
    public static ContaDAO getContaDAO() {
        ContaDAO daoConta = new ContaDAO(manager);
        return daoConta;
    }

    // Conta Corrente
    public static ContaCorrenteDAO getContaCorrenteDAO() {
        ContaCorrenteDAO daoContaCorrente = new ContaCorrenteDAO(manager);
        return daoContaCorrente;
    }

    // Conta Poupança
    public static ContaPoupancaDAO getContaPoupancaDAO() {
        ContaPoupancaDAO daoContaPoupanca = new ContaPoupancaDAO(manager);
        return daoContaPoupanca;
    }

    // Endereço
    public static EnderecoDAO getEnderecoDAO() {
        EnderecoDAO daoEndereco = new EnderecoDAO(manager);
        return daoEndereco;
    }

    // Gerente
    public static GerenteDAO getGerenteDAO() {
        GerenteDAO daoGerente = new GerenteDAO(manager);
        return daoGerente;
    }

}
