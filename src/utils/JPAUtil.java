package utils;

import basicClasses.Agencia;
import basicClasses.Gerente;
import classesData.AgenciaDAO;
import classesData.DAOFactory;
import classesData.GerenteDAO;
import org.hibernate.cfg.Configuration;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class JPAUtil {
    
    private static final Ejb3Configuration config = new Ejb3Configuration();

    public static void gerarTabelas() {
        config.configure("hibernate", null);
        Configuration hbmcfg = config.getHibernateConfiguration();
        SchemaExport schemaExport = new SchemaExport(hbmcfg);
        schemaExport.create(true, true);
        System.out.println("Tabelas criadas");
    }

    public static void main(String[] args) {

        gerarTabelas();

        GerenteDAO daoGerente = DAOFactory.getGerenteDAO();
        AgenciaDAO daoAgencia = DAOFactory.getAgenciaDAO();

        Agencia a = new Agencia();
        //Agencia a1 = new Agencia();
        Gerente g = new Gerente();
       // Gerente g1 = new Gerente();

        g.setNome("Romulo Santos");
        g.setLogin("senha");
        g.setSenha("123");
        
//        g1.setNome("Danilo Matias");
//        g1.setLogin("dani");
//        g1.setSenha("456");

        a.setNome("Imbiribeira");
        a.setNumero(00112233);
        a.setGerente(g);
        
//        a1.setNome("Baa Vista");
//        a1.setNumero(7412589);
//        a1.setGerente(g1);
        
                
        daoGerente.inserir(g);
       // daoGerente.inserir(g1);
        
        daoAgencia.inserir(a);
       // daoAgencia.inserir(a1);

    }
    
}
