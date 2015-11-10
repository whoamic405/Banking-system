package gui;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import basicClasses.ContaCorrente;
import basicClasses.ContaPoupanca;
import basicClasses.Agencia;
import basicClasses.Cliente;
import classesFacade.FachadaAgencia;
import classesFacade.FachadaCliente;
import classesFacade.FachadaContaCorrente;
import classesFacade.FachadaContaPoupanca;
import interfaceClasses.IFachadaAgencia;
import interfaceClasses.IFachadaCliente;
import interfaceClasses.IFachadaContaCorrente;
import interfaceClasses.IFachadaContaPoupanca;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public final class ControleConta extends javax.swing.JFrame {

    public ControleConta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listarAgencia();
        this.listarClientes();
        jButtonAtualizarConta.setEnabled(false);
    }

    private final IFachadaCliente fachadaCliente = new FachadaCliente();
    private final IFachadaAgencia fachadaAgencia = new FachadaAgencia();
    private final IFachadaContaCorrente fachadaContaCorrente = new FachadaContaCorrente();
    private final IFachadaContaPoupanca fachadaContaPoupanca = new FachadaContaPoupanca();

    private List<ContaCorrente> listaContaCorrete;
    private List<ContaPoupanca> listaContaPoupaca;

    private final ContaCorrente contaCorrente = new ContaCorrente();
    private final ContaPoupanca contaPoupanca = new ContaPoupanca();
    private final Cliente cliente = new Cliente();
    private final Agencia agencia = new Agencia();
    private int idConta;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButtonCorrente = new javax.swing.JRadioButton();
        jRadioButtonPoupanca = new javax.swing.JRadioButton();
        jComboBoxCliente = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumeroConta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldLimiteSaque = new javax.swing.JTextField();
        jTextFieldJuros = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldVencimento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButtonAtualizarConta = new javax.swing.JButton();
        jComboBoxAgencia = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controle de Contas");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle Conta"));

        jRadioButtonCorrente.setText("Corrente");
        jRadioButtonCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCorrenteActionPerformed(evt);
            }
        });

        jRadioButtonPoupanca.setText("Poupança");
        jRadioButtonPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPoupancaActionPerformed(evt);
            }
        });

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar" }));
        jComboBoxCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxClienteItemStateChanged(evt);
            }
        });

        jLabel16.setText("Cliente");

        jLabel7.setText("Número");

        jLabel13.setText("Senha");

        jLabel8.setText("Saldo");

        jLabel10.setText("Limite de Saque");

        jLabel14.setText("Juros");

        jLabel15.setText("Vencimento");

        jLabel11.setText("Status");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jTableContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableContas);

        jLabel1.setText("Tabela Conta");

        jLabel2.setText("Agencia");

        jButtonAtualizarConta.setText("Editar Dados da Conta");
        jButtonAtualizarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarContaActionPerformed(evt);
            }
        });

        jComboBoxAgencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar" }));
        jComboBoxAgencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAgenciaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAtualizarConta)
                                .addGap(36, 36, 36)
                                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(164, 164, 164))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldSaldo)
                                                .addGap(12, 12, 12)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jTextFieldJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldSenha)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(0, 66, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButtonCorrente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButtonPoupanca))
                                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jComboBoxAgencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldLimiteSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextFieldVencimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15)))
                            .addComponent(jSeparator1)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCorrente)
                    .addComponent(jRadioButtonPoupanca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLimiteSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonAtualizarConta))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void listarClientes() {

        // Obtendo lista de Agencia
        List<Cliente> lista = fachadaCliente.listaTodosClientes();

        for (Cliente ListaClientes : lista) {
            jComboBoxCliente.addItem(ListaClientes.getNome());
        }
    }

    public void listarAgencia() {

        // Obtendo lista de Agencia
        List<Agencia> lista = fachadaAgencia.listaAgencia();

        for (Agencia ListaAgencia : lista) {
            jComboBoxAgencia.addItem(ListaAgencia.getNome());
        }
    }

    // Listar Conta Corrente
    public void listarContaCorrente() {

        try {

            this.listaContaCorrete = fachadaContaCorrente.listarTodas();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{
                "Id", "Data de Abertura", "Limite de Saque", "Numero", "Saldo", "Senha", "Status", "Juros", "Cliente", "Agencia"
            });
            for (int i = 0; i < listaContaCorrete.size(); i++) {

                modelo.addRow(new String[]{
                    this.listaContaCorrete.get(i).getId() + "", this.listaContaCorrete.get(i).getDataAbertura() + "", this.listaContaCorrete.get(i).getLimiteSaque() + "",
                    this.listaContaCorrete.get(i).getNumero() + "", this.listaContaCorrete.get(i).getSaldo() + "", this.listaContaCorrete.get(i).getSenha(),
                    this.listaContaCorrete.get(i).getStatus(), this.listaContaCorrete.get(i).getJuros() + "", this.listaContaCorrete.get(i).getCliente().getNome(),
                    this.listaContaCorrete.get(i).getAgencia().getNome()
                });

            }

            jTableContas.setModel(modelo);

        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    // Listar Conta Poupança

    public void listarContaPoupanca() {

        try {

            this.listaContaPoupaca = fachadaContaPoupanca.listarTodas();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{
                "Id", "Data de Abertura", "Limite de Saque", "Numero", "Saldo", "Senha", "Status", "Vencimento", "Cliente", "Agencia"
            });
            for (int i = 0; i < listaContaPoupaca.size(); i++) {

                modelo.addRow(new String[]{
                    this.listaContaPoupaca.get(i).getId() + "", this.listaContaPoupaca.get(i).getDataAbertura() + "", this.listaContaPoupaca.get(i).getLimiteSaque() + "",
                    this.listaContaPoupaca.get(i).getNumero() + "", this.listaContaPoupaca.get(i).getSaldo() + "", this.listaContaPoupaca.get(i).getSenha(),
                    this.listaContaPoupaca.get(i).getStatus(), this.listaContaPoupaca.get(i).getDataVencimento() + "", this.listaContaPoupaca.get(i).getCliente().getNome(),
                    this.listaContaPoupaca.get(i).getAgencia().getNome()
                });

            }

            jTableContas.setModel(modelo);

        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void limparCapos() {
        jTextFieldJuros.setText("");
        jTextFieldLimiteSaque.setText("");
        jTextFieldNumeroConta.setText("");
        jTextFieldSaldo.setText("");
        jTextFieldSenha.setText("");
        jTextFieldStatus.setText("");
        jTextFieldVencimento.setText("");
    }


    private void jRadioButtonCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCorrenteActionPerformed

        if (jRadioButtonCorrente.isSelected()) {
            limparCapos();
            listarContaCorrente();
            jRadioButtonPoupanca.setSelected(false);
            jTextFieldVencimento.setEnabled(false);
            jTextFieldJuros.setEnabled(true);

        }
    }//GEN-LAST:event_jRadioButtonCorrenteActionPerformed

    private void jRadioButtonPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPoupancaActionPerformed

        if (jRadioButtonPoupanca.isSelected()) {
            limparCapos();
            listarContaPoupanca();
            jRadioButtonCorrente.setSelected(false);
            jTextFieldVencimento.setEnabled(true);
            jTextFieldJuros.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButtonPoupancaActionPerformed

    public boolean validarRadio() throws Exception {

        // Validando jCheckBox Pessoa Fisica
        if (jRadioButtonCorrente.isSelected()) {
            jRadioButtonPoupanca.setSelected(false);
            return true;
        } // Validando jCheckBox Pessoa Juridica
        else if (jRadioButtonPoupanca.isSelected()) {
            jRadioButtonCorrente.setSelected(false);
            return true;
        }

        return false;
    }

    public void validarContacorrente() {

        // Validando Campos
        if (jTextFieldNumeroConta.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Número da Conta não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNumeroConta.requestFocus();
            return;
        }
        if (jTextFieldSaldo.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Saldo não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldSaldo.requestFocus();
            return;
        }
        if (jTextFieldLimiteSaque.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Limite de Saque não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldLimiteSaque.requestFocus();
            return;
        }
        if (jTextFieldStatus.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Status não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldStatus.requestFocus();
            return;
        }
        if (jTextFieldSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Senha não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldSenha.requestFocus();
            return;
        }
        if (jTextFieldJuros.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Juros não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldJuros.requestFocus();
        }
        if (cliente.getId() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Cliente nao informada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jComboBoxCliente.requestFocus();
        }
        if (agencia.getId() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Agencia nao informada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jComboBoxAgencia.requestFocus();
        }

    }

    public void validaContaPoupanca() {

        // Validando Campos
        if (jTextFieldNumeroConta.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Número da Conta não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldNumeroConta.requestFocus();
            return;
        }
        if (jTextFieldSaldo.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Saldo não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldSaldo.requestFocus();
            return;
        }
        if (jTextFieldLimiteSaque.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Limite de Saque não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldLimiteSaque.requestFocus();
            return;
        }
        if (jTextFieldStatus.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Status não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldStatus.requestFocus();
            return;
        }
        if (jTextFieldSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Senha não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldSenha.requestFocus();
            return;
        }
        if (jTextFieldVencimento.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo Data de Vencimento não foi preenchido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldVencimento.requestFocus();
            //return;
        }
        if (cliente.getId() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Cliente nao informada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jComboBoxCliente.requestFocus();
        }
        if (agencia.getId() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Agencia não informada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jComboBoxAgencia.requestFocus();
        }
    }

    private void jComboBoxClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClienteItemStateChanged
        cliente.setId(jComboBoxCliente.getSelectedIndex());
    }//GEN-LAST:event_jComboBoxClienteItemStateChanged

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        try {

            if (validarRadio() == false) {
                JOptionPane.showMessageDialog(rootPane, "Nenhum tipo de Conta foi selecionado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }

            if (jRadioButtonCorrente.isSelected()) {

                // Validando campos
                validarContacorrente();
                // Dados da conta  
                contaCorrente.setCliente(cliente);
                contaCorrente.setAgencia(agencia);
                contaCorrente.setNumero(Integer.parseInt(jTextFieldNumeroConta.getText()));
                contaCorrente.setSaldo(Double.parseDouble(jTextFieldSaldo.getText()));
                Date date = new Date();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                format.format(date.getTime());
                contaCorrente.setDataAbertura(date);
                contaCorrente.setLimiteSaque(Double.parseDouble(jTextFieldLimiteSaque.getText()));
                contaCorrente.setStatus(jTextFieldStatus.getText());
                contaCorrente.setSenha(jTextFieldSenha.getText());
                contaCorrente.setJuros(Double.parseDouble(jTextFieldJuros.getText()));

                fachadaContaCorrente.inserir(contaCorrente);

                ControleConta.this.dispose();

                int result = JOptionPane.showConfirmDialog(rootPane, "Conta cadastrada com sucesso!\nDeseja realizar mais alguma operaçao?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

                if (result == JOptionPane.YES_OPTION) {

                    ControleConta controleConta = new ControleConta();
                    controleConta.setVisible(true);

                } else {

                    Principal principal = new Principal();
                    principal.setVisible(true);

                }

            } else if (jRadioButtonPoupanca.isSelected()) {

                if (validarRadio() == false) {
                    JOptionPane.showMessageDialog(rootPane, "Nenhum tipo de Conta foi selecionado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }

                // Validando campos
                validaContaPoupanca();
                // Dados da conta
                contaPoupanca.setCliente(cliente);
                contaPoupanca.setAgencia(agencia);
                contaPoupanca.setNumero(Integer.parseInt(jTextFieldNumeroConta.getText()));
                contaPoupanca.setSaldo(Double.parseDouble(jTextFieldSaldo.getText()));
                Date date = new Date();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                format.format(date.getTime());
                contaPoupanca.setDataAbertura(date);
                contaPoupanca.setLimiteSaque(Double.parseDouble(jTextFieldLimiteSaque.getText()));
                contaPoupanca.setStatus(jTextFieldStatus.getText());
                contaPoupanca.setSenha(jTextFieldSenha.getText());
                // Convertendo jTextFieldVencimento para formato Calendar
                SimpleDateFormat dateVencimento = new SimpleDateFormat("dd/MM/yyyy");
                contaPoupanca.setDataVencimento(dateVencimento.parse(jTextFieldVencimento.getText()));

                fachadaContaPoupanca.inserir(contaPoupanca);

                int result = JOptionPane.showConfirmDialog(rootPane, "Conta cadastrada com sucesso!\nDeseja realizar mais alguma operaçao?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

                if (result == JOptionPane.YES_OPTION) {

                    ControleConta controleConta = new ControleConta();
                    controleConta.setVisible(true);

                } else {

                    Principal principal = new Principal();
                    principal.setVisible(true);

                }

            }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
    catch (Exception ex) {
            ex.getMessage();
        }

    }
    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        ControleConta.this.dispose();
        Principal principal = new Principal();
        principal.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxAgenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAgenciaItemStateChanged
        agencia.setId(jComboBoxAgencia.getSelectedIndex());
    }//GEN-LAST:event_jComboBoxAgenciaItemStateChanged

    private void jTableContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContasMouseClicked

        jButtonCadastrar.setEnabled(false);
        jButtonAtualizarConta.setEnabled(true);

        int values = jTableContas.getSelectedRow();

        if (jRadioButtonCorrente.isSelected()) {
            idConta = Integer.parseInt(jTableContas.getValueAt(values, 0).toString());
            jTextFieldNumeroConta.setText(jTableContas.getValueAt(values, 3).toString());
            jTextFieldSaldo.setText(jTableContas.getValueAt(values, 4).toString());
            jTextFieldJuros.setText(jTableContas.getValueAt(values, 7).toString());
            jTextFieldSenha.setText(jTableContas.getValueAt(values, 5).toString());
            jTextFieldLimiteSaque.setText(jTableContas.getValueAt(values, 2).toString());
            jTextFieldStatus.setText(jTableContas.getValueAt(values, 6).toString());
            jComboBoxCliente.setSelectedItem(jTableContas.getValueAt(values, 8).toString());
            jComboBoxAgencia.setSelectedItem(jTableContas.getValueAt(values, 9).toString());

        } else if (jRadioButtonPoupanca.isSelected()) {
            idConta = Integer.parseInt(jTableContas.getValueAt(values, 0).toString());
            jTextFieldNumeroConta.setText(jTableContas.getValueAt(values, 3).toString());
            jTextFieldSaldo.setText(jTableContas.getValueAt(values, 4).toString());
            jTextFieldVencimento.setText(jTableContas.getValueAt(values, 7).toString());
            jTextFieldSenha.setText(jTableContas.getValueAt(values, 5).toString());
            jTextFieldLimiteSaque.setText(jTableContas.getValueAt(values, 2).toString());
            jTextFieldStatus.setText(jTableContas.getValueAt(values, 6).toString());
            jComboBoxCliente.setSelectedItem(jTableContas.getValueAt(values, 8).toString());
            jComboBoxAgencia.setSelectedItem(jTableContas.getValueAt(values, 9).toString());
        }


    }//GEN-LAST:event_jTableContasMouseClicked

    private void jButtonAtualizarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarContaActionPerformed

        try {

            if (validarRadio() == false) {
                JOptionPane.showMessageDialog(rootPane, "Nenhum tipo de Conta foi selecionado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }

            if (jRadioButtonCorrente.isSelected()) {

                int valuer = jTableContas.getSelectedRow();

                // Validando campos
                validarContacorrente();
                // Dados da conta  
                contaCorrente.setId(idConta);
                contaCorrente.setCliente(cliente);
                contaCorrente.setAgencia(agencia);
                contaCorrente.setNumero(Integer.parseInt(jTextFieldNumeroConta.getText()));
                contaCorrente.setSaldo(Double.parseDouble(jTextFieldSaldo.getText()));

                Date date = new Date();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                format.format(date.getTime());
                contaCorrente.setDataAbertura(date);
                contaCorrente.setLimiteSaque(Double.parseDouble(jTextFieldLimiteSaque.getText()));
                contaCorrente.setStatus(jTextFieldStatus.getText());
                contaCorrente.setSenha(jTextFieldSenha.getText());
                contaCorrente.setJuros(Double.parseDouble(jTextFieldJuros.getText()));

                fachadaContaCorrente.atualizar(contaCorrente);

                ControleConta.this.dispose();

                int result = JOptionPane.showConfirmDialog(rootPane, "Dados da Conta Atualizados com sucesso!\nDeseja realizar mais alguma operaçao?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

                if (result == JOptionPane.YES_OPTION) {

                    ControleConta controleConta = new ControleConta();
                    controleConta.setVisible(true);

                } else {

                    Principal principal = new Principal();
                    principal.setVisible(true);

                }

            } else if (jRadioButtonPoupanca.isSelected()) {

                if (validarRadio() == false) {
                    JOptionPane.showMessageDialog(rootPane, "Nenhum tipo de Conta foi selecionado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }

                // Validando campos
                validaContaPoupanca();
                // Dados da conta
                contaPoupanca.setId(idConta);
                contaPoupanca.setCliente(cliente);
                contaPoupanca.setAgencia(agencia);
                contaPoupanca.setNumero(Integer.parseInt(jTextFieldNumeroConta.getText()));
                contaPoupanca.setSaldo(Double.parseDouble(jTextFieldSaldo.getText()));
                Date date = new Date();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                format.format(date.getTime());
                contaPoupanca.setDataAbertura(date);
                contaPoupanca.setLimiteSaque(Double.parseDouble(jTextFieldLimiteSaque.getText()));
                contaPoupanca.setStatus(jTextFieldStatus.getText());
                contaPoupanca.setSenha(jTextFieldSenha.getText());
                // Convertendo jTextFieldVencimento para formato Date
                SimpleDateFormat dateVencimento = new SimpleDateFormat("dd/MM/yyyy");
                contaPoupanca.setDataVencimento(dateVencimento.parse(jTextFieldVencimento.getText()));

                fachadaContaPoupanca.atualizar(contaPoupanca);

                ControleConta.this.dispose();

                int result = JOptionPane.showConfirmDialog(rootPane, "Dados da Conta Atualizados com sucesso!\nDeseja realizar mais alguma operaçao?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

                if (result == JOptionPane.YES_OPTION) {

                    ControleConta controleConta = new ControleConta();
                    controleConta.setVisible(true);

                } else {

                    Principal principal = new Principal();
                    principal.setVisible(true);

                }

            }
        } catch (Exception ex) {
            ex.getMessage();
        }

    }//GEN-LAST:event_jButtonAtualizarContaActionPerformed

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
            java.util.logging.Logger.getLogger(ControleConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarConta;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox jComboBoxAgencia;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonCorrente;
    private javax.swing.JRadioButton jRadioButtonPoupanca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableContas;
    private javax.swing.JTextField jTextFieldJuros;
    private javax.swing.JTextField jTextFieldLimiteSaque;
    private javax.swing.JTextField jTextFieldNumeroConta;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldVencimento;
    // End of variables declaration//GEN-END:variables
}
