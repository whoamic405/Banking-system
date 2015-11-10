package gui;

import basicClasses.ClientePessoaFisica;
import basicClasses.ClientePessoaJuridica;
import basicClasses.Endereco;

import classesFacade.FachadaClientePessoaFisica;
import classesFacade.FachadaClientePessoaJuridica;
import classesFacade.FachadaEndereco;
import interfaceClasses.IFachadaClientePessoaFisica;
import interfaceClasses.IFachadaClientePessoaJuridica;
import interfaceClasses.IFachadaEndereco;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ControleCliente extends javax.swing.JFrame {

    public ControleCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        jButtonAtualizarCli.setEnabled(false);
        jButtonAtualizarEnd.setEnabled(false);
        jButtonRemoverCli.setEnabled(false);
    }

    // Instanciando as Fachadas
    private final IFachadaClientePessoaFisica fachadaClientePessoaFisica = new FachadaClientePessoaFisica();
    private final IFachadaClientePessoaJuridica fachadaClientePessoaJuridica = new FachadaClientePessoaJuridica();
    private final IFachadaEndereco fachadaEndereco = new FachadaEndereco();
    private List<ClientePessoaFisica> listaClienteFisico;
    private List<ClientePessoaJuridica> listaClienteJuridico;
    private List<Endereco> listaEndereco;
    // Instanciando os objetos
    private final ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
    private final ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
    private final Endereco endereco = new Endereco();
    private int idEnd = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCnpj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel1Telefone = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jRadioButtonFisica = new javax.swing.JRadioButton();
        jRadioButtonJuridica = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabel1TipoSexo = new javax.swing.JLabel();
        jLabel1tTipoPessoa = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEndereco = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButton1Pesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabelNomeCli = new javax.swing.JLabel();
        jButtonRemoverCli = new javax.swing.JButton();
        jButtonAtualizarCli = new javax.swing.JButton();
        jButtonAtualizarEnd = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonCadastrarConta = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gerenciar Cliente");

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        jLabel1.setText("Tipo de Cliente");

        jLabelNome.setText("Nome");

        jLabelCep.setText("Cpf");

        jLabel2.setText("Rg");

        jLabel4.setText("Cnpj");

        jLabel5.setText("Razao social");

        jLabelEmail.setText("Email");

        jLabel1Telefone.setText("Telafone");

        jLabelSexo.setText("Sexo");

        buttonGroup1.add(jRadioButtonFisica);
        jRadioButtonFisica.setText("Fisico");
        jRadioButtonFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFisicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonJuridica);
        jRadioButtonJuridica.setText("Juridico");
        jRadioButtonJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonJuridicaActionPerformed(evt);
            }
        });

        jRadioButtonMasculino.setText("Masculino");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        jRadioButtonFeminino.setText("Feminino");
        jRadioButtonFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemininoActionPerformed(evt);
            }
        });

        jLabelEndereco.setText("Cep");

        jLabel3.setText("Rua");

        jLabelNumero.setText("Numero");

        jLabelComplemento.setText("Complemento");

        jLabelCidade.setText("Cidade");

        jLabelBairro.setText("Bairro");

        jLabelEstado.setText("Estado");

        jLabel1TipoSexo.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jLabel1TipoSexo.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1tTipoPessoa.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jLabel1tTipoPessoa.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1tTipoPessoa.setText("Selecione o tipo de");

        jLabel11.setText("Dados de Endereço");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(168, 168, 168))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel1Telefone)
                            .addGap(95, 95, 95)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCep)
                            .addComponent(jLabel5)
                            .addComponent(jLabelEmail)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelEndereco)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNumero)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabelBairro)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jTextFieldBairro))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEstado)
                                            .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNome)
                                    .addComponent(jLabel1tTipoPessoa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonFisica)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonJuridica))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonFeminino))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1TipoSexo))))
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldNome)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabelComplemento)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldRua)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldTelefone)))))
                        .addContainerGap())))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jLabel1)
                    .addComponent(jLabel1TipoSexo)
                    .addComponent(jLabel1tTipoPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jRadioButtonJuridica)
                    .addComponent(jRadioButtonFeminino)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFisica))
                .addGap(3, 3, 3)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelCep)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1Telefone)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jLabelComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Controle")));

        jTableEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEnderecoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEndereco);

        jLabel6.setText("Tabela Cliente");

        jLabel7.setText("Tabela Endereço");

        jButton1Pesquisar.setText("Pesquisar");
        jButton1Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1PesquisarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome:");

        jLabelNomeCli.setText("jLabel9");

        jButtonRemoverCli.setText("Remover");

        jButtonAtualizarCli.setText("Editar Dados do Cliente");
        jButtonAtualizarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarCliActionPerformed(evt);
            }
        });

        jButtonAtualizarEnd.setText("Editar Dados de Endereço");
        jButtonAtualizarEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarEndActionPerformed(evt);
            }
        });

        jButtonCadastrarConta.setText("Cadastrar Conta");
        jButtonCadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarContaActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar Cliente");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sans Serif", 0, 10)); // NOI18N
        jLabel10.setText("Projeto para conclução do 4º período do curso de Analise e Desenvolvimento de Sistemas");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(239, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAtualizarEnd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAtualizarCli)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRemoverCli))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNomeCli))
                            .addComponent(jSeparator2)
                            .addComponent(jButtonCadastrarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1Pesquisar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Pesquisar)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoverCli)
                    .addComponent(jButtonAtualizarCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelNomeCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtualizarEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastrarConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void listarClientePessoaFisica() {

        try {

            this.listaClienteFisico = fachadaClientePessoaFisica.listaTodosPessoaFisicas();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{
                "Id", "Nome", "Cpf", "Rg", "E-mail", "Sexo", "Telefone", "Tipo", "Id do Endereço"
            });
            for (int i = 0; i < listaClienteFisico.size(); i++) {
                modelo.addRow(new String[]{
                    this.listaClienteFisico.get(i).getId() + "", this.listaClienteFisico.get(i).getNome(), this.listaClienteFisico.get(i).getCpf(), this.listaClienteFisico.get(i).getRg() + "",
                    this.listaClienteFisico.get(i).getEmail(), this.listaClienteFisico.get(i).getSexo(), this.listaClienteFisico.get(i).getTelefone(), this.listaClienteFisico.get(i).getTipo(), this.listaClienteFisico.get(i).getEndereco().getId() + ""
                });
            }

            jTableClientes.setModel(modelo);

        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void listarClientePessoaFisicaPorNome(String nome) {

        try {

            this.listaClienteFisico = fachadaClientePessoaFisica.listaTodosPessoaFisicasPorNome(nome);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{
                "Id", "Nome", "Cpf", "Rg", "E-mail", "Sexo", "Telefone", "Tipo", "Id do Endereço"
            });
            for (int i = 0; i < listaClienteFisico.size(); i++) {
                modelo.addRow(new String[]{
                    this.listaClienteFisico.get(i).getId() + "", this.listaClienteFisico.get(i).getNome(), this.listaClienteFisico.get(i).getCpf(), this.listaClienteFisico.get(i).getRg() + "",
                    this.listaClienteFisico.get(i).getEmail(), this.listaClienteFisico.get(i).getSexo(), this.listaClienteFisico.get(i).getTelefone(), this.listaClienteFisico.get(i).getTipo(), this.listaClienteFisico.get(i).getEndereco().getId() + ""
                });
            }

            jTableClientes.setModel(modelo);

        } catch (Exception e) {
            e.getMessage();
        }

    }

    // Cliente pessoa Juridica
    public void listarClientePessoaJuridica() {

        try {

            this.listaClienteJuridico = fachadaClientePessoaJuridica.listaTodosPessoaJuridica();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{
                "Id", "Nome", "Cnpj", "Razao Social", "E-mail", "Sexo", "Telefone", "Tipo", "Id do Endereço"
            });
            for (int i = 0; i < listaClienteJuridico.size(); i++) {
                modelo.addRow(new String[]{
                    this.listaClienteJuridico.get(i).getId() + "", this.listaClienteJuridico.get(i).getNome(), this.listaClienteJuridico.get(i).getCnpj(), this.listaClienteJuridico.get(i).getRazaoSocial(),
                    this.listaClienteJuridico.get(i).getEmail(), this.listaClienteJuridico.get(i).getSexo(), this.listaClienteJuridico.get(i).getTelefone(), this.listaClienteJuridico.get(i).getTipo(), this.listaClienteJuridico.get(i).getEndereco().getId() + ""
                });
            }

            jTableClientes.setModel(modelo);

        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void listarClientePessoaJuridica(String nome) {

        try {

            this.listaClienteJuridico = fachadaClientePessoaJuridica.listaTodosPessoaJuridicaPorNome(nome);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{
                "Id", "Nome", "Cnpj", "Razao Social", "E-mail", "Sexo", "Telefone", "Tipo", "Id do Endereço"
            });
            for (int i = 0; i < listaClienteJuridico.size(); i++) {
                modelo.addRow(new String[]{
                    this.listaClienteJuridico.get(i).getId() + "", this.listaClienteJuridico.get(i).getNome(), this.listaClienteJuridico.get(i).getCnpj(), this.listaClienteJuridico.get(i).getRazaoSocial(),
                    this.listaClienteJuridico.get(i).getEmail(), this.listaClienteJuridico.get(i).getSexo(), this.listaClienteJuridico.get(i).getTelefone(), this.listaClienteJuridico.get(i).getTipo(), this.listaClienteJuridico.get(i).getEndereco().getId() + ""
                });
            }

            jTableClientes.setModel(modelo);

        } catch (Exception e) {
            e.getMessage();
        }

    }

    // Listar Endereço por ID
    public void listarEnderecoPorId(int id) {

        try {

            this.listaEndereco = fachadaEndereco.listarEnderecoPorId(id);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{
                "Id", "Cep", "Rua", "Numero", "Complemento", "bairro", "Cidade", "Estado"
            });
            for (int i = 0; i < listaEndereco.size(); i++) {
                modelo.addRow(new String[]{
                    this.listaEndereco.get(i).getId() + "", this.listaEndereco.get(i).getCep() + "", this.listaEndereco.get(i).getRua(), this.listaEndereco.get(i).getNumero() + "", this.listaEndereco.get(i).getComplemento(),
                    this.listaEndereco.get(i).getBairro(), this.listaEndereco.get(i).getCidade(), this.listaEndereco.get(i).getEstado()
                });
            }

            jTableEndereco.setModel(modelo);

        } catch (Exception ex) {
            ex.getMessage();
        }

    }


    private void jRadioButtonFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFisicaActionPerformed

        if (jRadioButtonFisica.isSelected()) {
            limparCampos();
            limparTabelas();
            listarClientePessoaFisica();
            jButtonRemoverCli.setEnabled(false);
            jRadioButtonJuridica.setSelected(false);
            jButtonAtualizarEnd.setEnabled(false);
            jTextFieldCnpj.setEnabled(false);
            jTextFieldRazaoSocial.setEnabled(false);
            jTextFieldCpf.setEnabled(true);
            jTextFieldRg.setEnabled(true);
            jLabel1tTipoPessoa.setText("");
            jLabel1TipoSexo.setText("Selecione o Sexo do cliente");
    }//GEN-LAST:event_jRadioButtonFisicaActionPerformed
    }
    private void jRadioButtonJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonJuridicaActionPerformed

        if (jRadioButtonJuridica.isSelected()) {
            limparCampos();
            limparTabelas();
            listarClientePessoaJuridica();
            jRadioButtonFisica.setSelected(false);
            jButtonRemoverCli.setEnabled(false);
            jButtonAtualizarEnd.setEnabled(false);
            jTextFieldRg.setEnabled(false);
            jTextFieldCpf.setEnabled(false);
            jTextFieldCnpj.setEnabled(true);
            jTextFieldRazaoSocial.setEnabled(true);
            jLabel1tTipoPessoa.setText("");
            jLabel1TipoSexo.setText("Selecione o Sexo do cliente");
    }//GEN-LAST:event_jRadioButtonJuridicaActionPerformed
    }
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        ControleCliente.this.dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    public void validarcamposPessoaFisica() {

        // Validando Campos
        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Nome não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNome.requestFocus();
            return;
        }
        if (jTextFieldCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cpf não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCpf.requestFocus();
            return;
        }
        if (jTextFieldRg.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Rg não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldRg.requestFocus();
            return;
        }
        if (jTextFieldTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Telefone não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldTelefone.requestFocus();
            return;
        }
        if (jTextFieldEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo E-mail não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldEmail.requestFocus();
            return;
        }
        if (jTextFieldCep.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cep não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCep.requestFocus();
            return;
        }
        if (jTextFieldRua.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O Rua Rua não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldRua.requestFocus();
            return;
        }
        if (jTextFieldNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Número não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNumero.requestFocus();
            return;
        }
        if (jTextFieldComplemento.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Complemento não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldComplemento.requestFocus();
            return;
        }
        if (jTextFieldCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cidade não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCidade.requestFocus();
            return;
        }
        if (jTextFieldBairro.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Bairro não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldBairro.requestFocus();
            return;
        }
        if (jTextFieldEstado.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Estado não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldEstado.requestFocus();
        }

    }

    public void validarcamposPessoaJuridica() {

        // Validando Campos
        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Nome não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNome.requestFocus();
            return;
        }
        if (jTextFieldCnpj.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cnpj não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCnpj.requestFocus();
            return;
        }
        if (jTextFieldRazaoSocial.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Razão Social não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldRazaoSocial.requestFocus();
            return;
        }
        if (jTextFieldTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Telefone não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldTelefone.requestFocus();
            return;
        }
        if (jTextFieldEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo E-mail não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldEmail.requestFocus();
            return;
        }
        if (jTextFieldCep.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cep não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCep.requestFocus();
            return;
        }
        if (jTextFieldRua.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O Rua Rua não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldRua.requestFocus();
            return;
        }
        if (jTextFieldNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Número não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNumero.requestFocus();
            return;
        }
        if (jTextFieldComplemento.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Complemento não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldComplemento.requestFocus();
            return;
        }
        if (jTextFieldCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cidade não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCidade.requestFocus();
            return;
        }
        if (jTextFieldBairro.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Bairro não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldBairro.requestFocus();
            return;
        }
        if (jTextFieldEstado.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Estado não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldEstado.requestFocus();
        }

    }

    public void validarCamposEndereco() {

        // Validando Campos
        if (jTextFieldCep.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cep não foi informado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCep.requestFocus();
        } else if (jTextFieldRua.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Rua não foi informado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldRua.requestFocus();
        } else if (jTextFieldNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Número não foi informado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNumero.requestFocus();
        } else if (jTextFieldComplemento.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Complemento não foi informado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldComplemento.requestFocus();
        } else if (jTextFieldBairro.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cidade não foi informado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldBairro.requestFocus();
        } else if (jTextFieldBairro.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Bairro não foi informado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldBairro.requestFocus();
        } else if (jTextFieldEstado.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Estado não foi informado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldEstado.requestFocus();
        }

    }

    public boolean validarRadio() throws Exception {

        // Validando jCheckBox Pessoa Fisica
        if (jRadioButtonFisica.isSelected()) {
            jRadioButtonJuridica.setSelected(false);
            return true;
        } // Validando jCheckBox Pessoa Juridica
        else if (jRadioButtonJuridica.isSelected()) {
            jRadioButtonFisica.setSelected(false);
            return true;
        }

        return false;
    }

    public void limparCampos() {
        jTextFieldBairro.setText("");
        jTextFieldCep.setText("");
        jTextFieldCidade.setText("");
        jTextFieldCnpj.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldCpf.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEstado.setText("");
        jTextFieldNome.setText("");
        jTextFieldNumero.setText("");
        jTextFieldRazaoSocial.setText("");
        jTextFieldRg.setText("");
        jTextFieldRua.setText("");
        jTextFieldTelefone.setText("");
        jLabelNomeCli.setText("");

        jTextFieldBairro.setEnabled(true);
        jTextFieldCep.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldCnpj.setEnabled(true);
        jTextFieldComplemento.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldEstado.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldRazaoSocial.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);

        jRadioButtonFisica.setSelected(false);
        jRadioButtonFeminino.setSelected(false);
        jRadioButtonJuridica.setSelected(false);
        jRadioButtonMasculino.setSelected(false);
    }

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        try {

            if (validarRadio() == false) {
                JOptionPane.showMessageDialog(rootPane, "Nenhum tipo de cliente foi selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {

                if (jRadioButtonFisica.isSelected()) {
                    // Validando campos
                    validarcamposPessoaFisica();
                    // Dados deo Endereço
                    endereco.setCep(Integer.parseInt(jTextFieldCep.getText()));
                    endereco.setRua(jTextFieldRua.getText());
                    endereco.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                    endereco.setComplemento(jTextFieldComplemento.getText());
                    endereco.setCidade(jTextFieldCidade.getText());
                    endereco.setBairro(jTextFieldBairro.getText());
                    endereco.setEstado(jTextFieldEstado.getText());

                    fachadaEndereco.inserir(endereco);

                    // Dados do cliente                
                    clientePessoaFisica.setNome(jTextFieldNome.getText());
                    if (jRadioButtonMasculino.isSelected()) {
                        clientePessoaFisica.setSexo("M");
                    } else if (jRadioButtonFeminino.isSelected()) {
                        clientePessoaFisica.setSexo("F");
                    }
                    clientePessoaFisica.setCpf(jTextFieldCpf.getText());
                    clientePessoaFisica.setRg(jTextFieldRg.getText());
                    clientePessoaFisica.setTelefone(jTextFieldTelefone.getText());
                    clientePessoaFisica.setEmail(jTextFieldEmail.getText());
                    clientePessoaFisica.setTipo("Pessoa Fisica");
                    clientePessoaFisica.setEndereco(endereco);

                    fachadaClientePessoaFisica.inserir(clientePessoaFisica);

                    ControleCliente.this.dispose();

                    int result = JOptionPane.showConfirmDialog(rootPane, "Cliente cadastrado com sucesso!\nDeseja cadastrar mais clientes?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);

                    if (result == JOptionPane.YES_OPTION) {

                        ControleCliente cadastrarCliente = new ControleCliente();
                        cadastrarCliente.setVisible(true);

                    } else {

                        Principal principal = new Principal();
                        principal.setVisible(true);

                    }

                } else if (jRadioButtonJuridica.isSelected()) {
                    // Validando campos
                    validarcamposPessoaJuridica();
                    // Dados deo Endereço
                    endereco.setCep(Integer.parseInt(jTextFieldCep.getText()));
                    endereco.setRua(jTextFieldRua.getText());
                    endereco.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                    endereco.setComplemento(jTextFieldComplemento.getText());
                    endereco.setCidade(jTextFieldCidade.getText());
                    endereco.setBairro(jTextFieldBairro.getText());
                    endereco.setEstado(jTextFieldEstado.getText());

                    fachadaEndereco.inserir(endereco);

                    // Dados do cliente                
                    clientePessoaJuridica.setNome(jTextFieldNome.getText());
                    if (jRadioButtonMasculino.isSelected()) {
                        clientePessoaJuridica.setSexo("M");
                    } else if (jRadioButtonFeminino.isSelected()) {
                        clientePessoaJuridica.setSexo("F");
                    }
                    clientePessoaJuridica.setCnpj(jTextFieldCnpj.getText());
                    clientePessoaJuridica.setRazaoSocial(jTextFieldRazaoSocial.getText());
                    clientePessoaJuridica.setTelefone(jTextFieldTelefone.getText());
                    clientePessoaJuridica.setEmail(jTextFieldEmail.getText());
                    clientePessoaJuridica.setTipo("Pessoa Juridica");
                    clientePessoaJuridica.setEndereco(endereco);

                    fachadaClientePessoaJuridica.inserir(clientePessoaJuridica);

                    ControleCliente.this.dispose();

                    int result = JOptionPane.showConfirmDialog(rootPane, "Cliente cadastrado com sucesso!\nDeseja cadastrar mais clientes?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);

                    if (result == JOptionPane.YES_OPTION) {

                        ControleCliente cadastrarCliente = new ControleCliente();
                        cadastrarCliente.setVisible(true);

                    } else {

                        Principal principal = new Principal();
                        principal.setVisible(true);

                    }

                }

            }

        } catch (Exception ex) {
            ex.getMessage();
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        if (jRadioButtonMasculino.isSelected()) {
            jRadioButtonFeminino.setSelected(false);
            jLabel1TipoSexo.setText("");
            jTextFieldNome.requestFocus();
        }
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void jRadioButtonFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemininoActionPerformed
        if (jRadioButtonFeminino.isSelected()) {
            jRadioButtonMasculino.setSelected(false);
            jLabel1TipoSexo.setText("");
            jTextFieldNome.requestFocus();
        }
    }//GEN-LAST:event_jRadioButtonFemininoActionPerformed

    private void jButton1PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1PesquisarActionPerformed

        if (jTextFieldPesquisa.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite o nome do cliente!", "Aviso", JOptionPane.ERROR_MESSAGE);
            jTextFieldPesquisa.requestFocus();
        } else {
            try {
                if (validarRadio() == false) {
                    JOptionPane.showMessageDialog(rootPane, "Nenhum tipo de cliente foi selecionado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        String nome = jTextFieldPesquisa.getText();

        if (jRadioButtonFisica.isSelected()) {
            this.listarClientePessoaFisicaPorNome(nome);
            jTextFieldPesquisa.setText("");
            jTextFieldPesquisa.requestFocus();

        } else if (jRadioButtonJuridica.isSelected()) {
            this.listarClientePessoaJuridica(nome);
            jTextFieldPesquisa.setText("");
            jTextFieldPesquisa.requestFocus();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione o tipo de pessoa a ser pesquisada!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1PesquisarActionPerformed

    private void jButtonAtualizarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarCliActionPerformed

        // Validando Campos
        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Nome não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNome.requestFocus();
            return;
        }
        if (jTextFieldCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Cpf não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCpf.requestFocus();
            return;
        }
        if (jTextFieldRg.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Rg não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldRg.requestFocus();
            return;
        }
        if (jTextFieldTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Telefone não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldTelefone.requestFocus();
            return;
        }
        if (jTextFieldEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo E-mail não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldEmail.requestFocus();
            return;
        }

        if (jRadioButtonFisica.isSelected()) {

            try {

                int valuer = jTableClientes.getSelectedRow();

                String id = jTableClientes.getValueAt(valuer, 8).toString();

                endereco.setId(Integer.parseInt(id));

                // Dados do cliente                
                clientePessoaFisica.setNome(jTextFieldNome.getText());
                if (jRadioButtonMasculino.isSelected()) {
                    clientePessoaFisica.setSexo("M");
                } else if (jRadioButtonFeminino.isSelected()) {
                    clientePessoaFisica.setSexo("F");
                }
                clientePessoaFisica.setCpf(jTextFieldCpf.getText());
                clientePessoaFisica.setRg(jTextFieldRg.getText());
                clientePessoaFisica.setTelefone(jTextFieldTelefone.getText());
                clientePessoaFisica.setEmail(jTextFieldEmail.getText());
                clientePessoaFisica.setTipo("Pessoa Fisica");
                clientePessoaFisica.setEndereco(endereco);

                fachadaClientePessoaFisica.atualizar(clientePessoaFisica);

                int result = JOptionPane.showConfirmDialog(rootPane, "Dados do Cliente atualizados com sucesso!\nDeseja realizar mais alguma operaçao?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

                if (result == JOptionPane.YES_OPTION) {

                    ControleCliente cadastrarCliente = new ControleCliente();
                    cadastrarCliente.setVisible(true);

                } else {

                    Principal principal = new Principal();
                    principal.setVisible(true);

                }

            } catch (Exception e) {
            }

        }

    }//GEN-LAST:event_jButtonAtualizarCliActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked

        jButtonCadastrar.setEnabled(false);
        jButtonAtualizarCli.setEnabled(true);
        jButtonAtualizarEnd.setEnabled(false);
        jButtonRemoverCli.setEnabled(true);
        jLabel1TipoSexo.setText("");

        try {

            if (jRadioButtonFisica.isSelected()) {

                limparCampos();
                jRadioButtonJuridica.setSelected(false);
                jTextFieldBairro.setEnabled(false);
                jTextFieldCep.setEnabled(false);
                jTextFieldComplemento.setEnabled(false);
                jTextFieldCidade.setEnabled(false);
                jTextFieldEstado.setEnabled(false);
                jTextFieldNumero.setEnabled(false);
                jTextFieldRua.setEnabled(false);
                jTextFieldCnpj.setEnabled(false);
                jTextFieldRazaoSocial.setEnabled(false);
                jRadioButtonFisica.setSelected(true);

                int valuer = jTableClientes.getSelectedRow();

                Object o = jTableClientes.getValueAt(valuer, 0).toString();

                String valor = o.toString();

                int id = Integer.parseInt(valor);

                idEnd = Integer.parseInt(jTableClientes.getValueAt(valuer, 8).toString());

                this.listarEnderecoPorId(idEnd);

                clientePessoaFisica.setId(id);
                jLabelNomeCli.setText("Endereço do Cliente: " + jTableClientes.getValueAt(valuer, 1).toString());
                jTextFieldNome.setText(jTableClientes.getValueAt(valuer, 1).toString());
                jTextFieldCpf.setText(jTableClientes.getValueAt(valuer, 2).toString());
                jTextFieldRg.setText(jTableClientes.getValueAt(valuer, 3).toString());
                jTextFieldEmail.setText(jTableClientes.getValueAt(valuer, 4).toString());
                switch (jTableClientes.getValueAt(valuer, 5).toString()) {
                    case "M":
                        jRadioButtonMasculino.setSelected(true);
                        jRadioButtonFeminino.setSelected(false);
                        break;
                    case "F":
                        jRadioButtonFeminino.setSelected(true);
                        jRadioButtonMasculino.setSelected(false);
                        break;
                }
                jTextFieldTelefone.setText(jTableClientes.getValueAt(valuer, 6).toString());

            }

            if (jRadioButtonJuridica.isSelected()) {

                limparCampos();
                jRadioButtonFisica.setSelected(false);
                jTextFieldBairro.setEnabled(false);
                jTextFieldCep.setEnabled(false);
                jTextFieldComplemento.setEnabled(false);
                jTextFieldCidade.setEnabled(false);
                jTextFieldEstado.setEnabled(false);
                jTextFieldNumero.setEnabled(false);
                jTextFieldRua.setEnabled(false);
                jTextFieldCpf.setEnabled(false);
                jTextFieldRg.setEnabled(false);
                jRadioButtonFisica.setSelected(false);

                int valuer = jTableClientes.getSelectedRow();

                Object o = jTableClientes.getValueAt(valuer, 0).toString();

                String valor = o.toString();

                int id = Integer.parseInt(valor);

                clientePessoaJuridica.setId(id);
                jTextFieldNome.setText(jTableClientes.getModel().getValueAt(valuer, 1).toString());
                jTextFieldCnpj.setText(jTableClientes.getValueAt(valuer, 2).toString());
                jTextFieldRazaoSocial.setText(jTableClientes.getValueAt(valuer, 3).toString());
                jTextFieldEmail.setText(jTableClientes.getValueAt(valuer, 4).toString());
                jTextFieldEmail.setText(null);
                switch (jTableEndereco.getValueAt(valuer, 5).toString()) {
                    case "M":
                        jRadioButtonMasculino.setSelected(true);
                        break;
                    case "F":
                        jRadioButtonFeminino.setSelected(true);
                        break;
                }
                jTextFieldTelefone.setText(jTableClientes.getValueAt(valuer, 6).toString());
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTableEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEnderecoMouseClicked

        limparCampos();
        jButtonAtualizarEnd.setEnabled(true);
        jButtonAtualizarCli.setEnabled(false);
        jButtonRemoverCli.setEnabled(false);
        jTextFieldBairro.setEditable(true);
        jTextFieldCep.setEditable(true);
        jTextFieldCidade.setEditable(true);
        jTextFieldRua.setEditable(true);
        jTextFieldComplemento.setEditable(true);
        jTextFieldNumero.setEditable(true);
        jTextFieldEstado.setEditable(true);
        jTextFieldCpf.setEnabled(false);
        jTextFieldEmail.setEnabled(false);

        jTextFieldNome.setEnabled(false);
        jTextFieldRazaoSocial.setEnabled(false);
        jTextFieldRg.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldCnpj.setEnabled(false);

        int values = jTableEndereco.getSelectedRow();

        idEnd = Integer.parseInt(jTableEndereco.getValueAt(values, 0).toString());

        jTextFieldCep.setText(jTableEndereco.getValueAt(values, 1).toString());
        jTextFieldRua.setText(jTableEndereco.getValueAt(values, 2).toString());
        jTextFieldNumero.setText(jTableEndereco.getValueAt(values, 3).toString());
        jTextFieldComplemento.setText(jTableEndereco.getValueAt(values, 4).toString());
        jTextFieldBairro.setText(jTableEndereco.getValueAt(values, 5).toString());
        jTextFieldCidade.setText(jTableEndereco.getValueAt(values, 6).toString());
        jTextFieldEstado.setText(jTableEndereco.getValueAt(values, 7).toString());

    }//GEN-LAST:event_jTableEnderecoMouseClicked

    private void jButtonAtualizarEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarEndActionPerformed

        try {

            // Validando campos
            validarCamposEndereco();
            // Dados deo Endereço
            endereco.setId(idEnd);
            endereco.setCep(Integer.parseInt(jTextFieldCep.getText()));
            endereco.setRua(jTextFieldRua.getText());
            endereco.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
            endereco.setComplemento(jTextFieldComplemento.getText());
            endereco.setCidade(jTextFieldCidade.getText());
            endereco.setBairro(jTextFieldBairro.getText());
            endereco.setEstado(jTextFieldEstado.getText());

            fachadaEndereco.atualizar(endereco);

            ControleCliente.this.dispose();

            int result = JOptionPane.showConfirmDialog(rootPane, "Dados do Endereço atualizados com sucesso!\nDeseja realizar mais alguma operaçao?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

            if (result == JOptionPane.YES_OPTION) {

                ControleCliente cadastrarCliente = new ControleCliente();
                cadastrarCliente.setVisible(true);

            } else {

                Principal principal = new Principal();
                principal.setVisible(true);

            }

        } catch (Exception ex) {
            ex.getMessage();
        }

    }//GEN-LAST:event_jButtonAtualizarEndActionPerformed

    private void jButtonCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarContaActionPerformed
        ControleCliente.this.dispose();
        ControleConta conta = new ControleConta();
        conta.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarContaActionPerformed

    // Metodo para limpar Tabela Endereço
    public void limparTabelas() {
        DefaultTableModel jtTableModel = (DefaultTableModel) jTableEndereco.getModel();
        jtTableModel.setNumRows(0);
        jtTableModel.setColumnCount(0);

        DefaultTableModel jtTableModel1 = (DefaultTableModel) jTableClientes.getModel();
        jtTableModel1.setNumRows(0);
        jtTableModel1.setColumnCount(0);

        jLabel1TipoSexo.setText("");
        jLabel1tTipoPessoa.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControleCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1Pesquisar;
    private javax.swing.JButton jButtonAtualizarCli;
    private javax.swing.JButton jButtonAtualizarEnd;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCadastrarConta;
    private javax.swing.JButton jButtonRemoverCli;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1Telefone;
    private javax.swing.JLabel jLabel1TipoSexo;
    private javax.swing.JLabel jLabel1tTipoPessoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeCli;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonFisica;
    private javax.swing.JRadioButton jRadioButtonJuridica;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableEndereco;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCnpj;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
