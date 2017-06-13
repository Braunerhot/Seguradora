
package com.unipe.seguradora.visao;

import com.unipe.seguradora.modelo.Cliente;
import com.unipe.seguradora.persistencia.ClienteDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FrmCliente extends javax.swing.JInternalFrame {

    public FrmCliente() {
        
        initComponents();
        
        readJTable();
        
        DefaultTableModel modelo = (DefaultTableModel) jTCliente.getModel();
        jTCliente.setRowSorter(new TableRowSorter(modelo));
        
    }

        public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTCliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO dao = new ClienteDAO();

        for (Cliente p : dao.read()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getMatricula(),
                p.getNome(),
                p.getIdentidade(),
                p.getCpf(),
                p.getEstado_civil(),
                p.getSexo(),
                p.getSituacao(),
                p.getData_nascimento(),
                p.getData_matricula(),
                p.getProfissao(),
                p.getEmail(),
                p.getTelefone(),
                p.getEndereco(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getCep(),
                p.getText()
            });
        }
    }
    

    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_Incluir_ = new javax.swing.JButton();
        btn_Excluir_ = new javax.swing.JButton();
        btn_Editar_ = new javax.swing.JButton();
        btn_Salvar_ = new javax.swing.JButton();
        btn_Fechar_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdentidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSituacao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEstado_civil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCliente = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        txtDataMat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtProfissao = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_fechar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_Incluir_ = new javax.swing.JMenuItem();
        menu_Excluir_ = new javax.swing.JMenuItem();
        menu_Editar_ = new javax.swing.JMenuItem();
        menu_Salvar_ = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btn_Incluir_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Incluir_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/Files-New-File-icon.png"))); // NOI18N
        btn_Incluir_.setText("Incluir");
        btn_Incluir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Incluir_ActionPerformed(evt);
            }
        });

        btn_Excluir_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Excluir_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/document-delete-icon.png"))); // NOI18N
        btn_Excluir_.setText("Excluir");
        btn_Excluir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Excluir_ActionPerformed(evt);
            }
        });

        btn_Editar_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Editar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/Other-Update-Metro-icon.png"))); // NOI18N
        btn_Editar_.setText("Editar");
        btn_Editar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Editar_ActionPerformed(evt);
            }
        });

        btn_Salvar_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Salvar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/Actions-document-save-icon.png"))); // NOI18N
        btn_Salvar_.setText("Salvar");
        btn_Salvar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salvar_ActionPerformed(evt);
            }
        });

        btn_Fechar_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Fechar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/window-next-icon.png"))); // NOI18N
        btn_Fechar_.setText("Fechar");
        btn_Fechar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Fechar_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Incluir_)
                .addGap(11, 11, 11)
                .addComponent(btn_Excluir_)
                .addGap(11, 11, 11)
                .addComponent(btn_Editar_, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Salvar_, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Fechar_, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Incluir_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btn_Excluir_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Editar_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Fechar_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Salvar_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.activeCaption);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("CPF");

        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Identidade");

        txtIdentidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Situação");

        txtSituacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSituacaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Rua");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Bairro");

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Cidade");

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Matricula");

        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Estado Civil");

        txtSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Sexo");

        txtEstado_civil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Matricula", "Nome", "Identidade", "CPF", "Estado Civil", "Sexo", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClienteMouseClicked(evt);
            }
        });
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTCliente);
        if (jTCliente.getColumnModel().getColumnCount() > 0) {
            jTCliente.getColumnModel().getColumn(1).setResizable(false);
            jTCliente.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Data Nasc.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Telefone");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Data Mat.");

        txtDataNasc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtDataMat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Profissão");

        txtProfissao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("E-mail");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Estado");

        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("CEP");

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Observações");

        txtObservacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBairro)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataMat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIdentidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                    .addComponent(txtProfissao)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtDataMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        menu_fechar.setText("Fechar");
        menu_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_fecharActionPerformed(evt);
            }
        });
        jMenu1.add(menu_fechar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operações");

        menu_Incluir_.setText("Incluir");
        menu_Incluir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Incluir_ActionPerformed(evt);
            }
        });
        jMenu2.add(menu_Incluir_);

        menu_Excluir_.setText("Excluir");
        menu_Excluir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Excluir_ActionPerformed(evt);
            }
        });
        jMenu2.add(menu_Excluir_);

        menu_Editar_.setText("Editar");
        menu_Editar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Editar_ActionPerformed(evt);
            }
        });
        jMenu2.add(menu_Editar_);

        menu_Salvar_.setText("Salvar");
        menu_Salvar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Salvar_ActionPerformed(evt);
            }
        });
        jMenu2.add(menu_Salvar_);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSituacaoActionPerformed
        
    }//GEN-LAST:event_txtSituacaoActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        
    }//GEN-LAST:event_txtBairroActionPerformed

    private void menu_Excluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Excluir_ActionPerformed
        
        if (jTCliente.getSelectedRow() != -1) {

            Cliente p = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            p.setId((int) jTCliente.getValueAt(jTCliente.getSelectedRow(), 0));
            p.setMatricula(txtMatricula.getText());
            p.setNome(txtNome.getText());
            p.setIdentidade(txtIdentidade.getText());
            p.setCpf(txtCpf.getText());
            p.setEstado_civil(txtEstado_civil.getText());
            p.setSexo(txtSexo.getText());
            p.setSituacao(txtSituacao.getText());
            p.setData_nascimento(txtDataNasc.getText());
            p.setData_matricula(txtDataMat.getText());
            p.setProfissao(txtProfissao.getText());
            p.setEmail(txtEmail.getText());
            p.setTelefone(txtTelefone.getText());
            p.setEndereco(txtEndereco.getText());
            p.setBairro(txtBairro.getText());
            p.setCidade(txtCidade.getText());
            p.setTelefone(txtEstado.getText());
            p.setTelefone(txtCep.getText());
            p.setTelefone(txtObservacao.getText());
                        
            dao.delete(p);

            txtId.setText("");
            txtMatricula.setText("");
            txtNome.setText("");
            txtIdentidade.setText("");
            txtCpf.setText("");
            txtEstado_civil.setText("");
            txtSexo.setText("");
            txtSituacao.setText("");
            txtDataNasc.setText("");
            txtDataMat.setText("");
            txtProfissao.setText("");
            txtEmail.setText("");
            txtTelefone.setText("");
            txtEndereco.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            txtEstado.setText("");
            txtCep.setText("");
            txtObservacao.setText("");
            
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir.");
        }
        
    }//GEN-LAST:event_menu_Excluir_ActionPerformed

    private void menu_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_menu_fecharActionPerformed

    private void btn_Incluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Incluir_ActionPerformed
        menu_Incluir_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Incluir_ActionPerformed

    private void btn_Excluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Excluir_ActionPerformed
        menu_Excluir_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Excluir_ActionPerformed

    private void btn_Editar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Editar_ActionPerformed
        menu_Editar_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Editar_ActionPerformed

    private void btn_Salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salvar_ActionPerformed
        menu_Salvar_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Salvar_ActionPerformed

    private void btn_Fechar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Fechar_ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_Fechar_ActionPerformed

    private void menu_Incluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Incluir_ActionPerformed
        
        txtId.setText("");
        txtMatricula.setText("");
        txtNome.setText("");
        txtIdentidade.setText("");
        txtCpf.setText("");
        txtEstado_civil.setText("");
        txtSexo.setText("");
        txtSituacao.setText("");
        txtDataNasc.setText("");
        txtDataMat.setText("");
        txtProfissao.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtCep.setText("");
        txtObservacao.setText("");
        
        txtMatricula.requestFocus();
    }//GEN-LAST:event_menu_Incluir_ActionPerformed

    private void menu_Salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Salvar_ActionPerformed
        
        Cliente p = new Cliente();
        ClienteDAO dao = new ClienteDAO();
  
        p.setMatricula(txtMatricula.getText());
        p.setNome(txtNome.getText());
        p.setIdentidade(txtIdentidade.getText());
        p.setCpf(txtCpf.getText());
        p.setEstado_civil(txtEstado_civil.getText());
        p.setSexo(txtSexo.getText());
        p.setSituacao(txtSituacao.getText());
        p.setData_nascimento(txtDataNasc.getText());
        p.setData_matricula(txtDataMat.getText());
        p.setProfissao(txtProfissao.getText());
        p.setEmail(txtEmail.getText());
        p.setTelefone(txtTelefone.getText());
        p.setEndereco(txtEndereco.getText());
        p.setBairro(txtBairro.getText());
        p.setCidade(txtCidade.getText());
        p.setEstado(txtEstado.getText());
        p.setCep(txtCep.getText());
        p.setText(txtObservacao.getText());
        
        dao.create(p);

        readJTable();
        
    }//GEN-LAST:event_menu_Salvar_ActionPerformed

    private void menu_Editar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Editar_ActionPerformed
        
        if (jTCliente.getSelectedRow() != -1) {

            Cliente p = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            p.setId((int) jTCliente.getValueAt(jTCliente.getSelectedRow(), 0));
            p.setMatricula(txtMatricula.getText());
            p.setNome(txtNome.getText());
            p.setIdentidade(txtIdentidade.getText());
            p.setCpf(txtCpf.getText());
            p.setEstado_civil(txtEstado_civil.getText());
            p.setSexo(txtSexo.getText());
            p.setSituacao(txtSituacao.getText());
            p.setData_nascimento(txtDataNasc.getText());
            p.setData_matricula(txtDataMat.getText());
            p.setProfissao(txtProfissao.getText());
            p.setEmail(txtEmail.getText());
            p.setTelefone(txtTelefone.getText());
            p.setEndereco(txtEndereco.getText());
            p.setBairro(txtBairro.getText());
            p.setCidade(txtCidade.getText());
            p.setEstado(txtEstado.getText());
            p.setCep(txtCep.getText());
            p.setText(txtObservacao.getText());
            
            dao.update(p);

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro para editar.");
        }
        
    }//GEN-LAST:event_menu_Editar_ActionPerformed

    private void jTClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClienteKeyReleased
        
        if (jTCliente.getSelectedRow() != -1) {

            txtId.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 0).toString());
            txtMatricula.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 1).toString());
            txtNome.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 2).toString());
            txtIdentidade.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 3).toString());
            txtCpf.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 4).toString());
            txtEstado_civil.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 5).toString());
            txtSexo.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 6).toString());
            txtSituacao.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 7).toString());
            txtDataNasc.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 8).toString());
            txtDataMat.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 9).toString());
            txtProfissao.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 10).toString());
            txtEmail.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 11).toString());
            txtTelefone.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 12).toString());
            txtEndereco.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 13).toString());
            txtBairro.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 14).toString());
            txtCidade.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 15).toString());
            txtEstado.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 16).toString());
            txtCep.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 17).toString());
            txtObservacao.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 18).toString());
            
        }
        
    }//GEN-LAST:event_jTClienteKeyReleased

    private void jTClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClienteMouseClicked
        
        if (jTCliente.getSelectedRow() != -1) {
            
            txtId.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 0).toString());
            txtMatricula.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 1).toString());
            txtNome.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 2).toString());
            txtIdentidade.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 3).toString());
            txtCpf.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 4).toString());
            txtEstado_civil.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 5).toString());
            txtSexo.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 6).toString());
            txtSituacao.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 7).toString());
            txtDataNasc.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 8).toString());
            txtDataMat.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 9).toString());
            txtProfissao.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 10).toString());
            txtEmail.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 11).toString());
            txtTelefone.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 12).toString());
            txtEndereco.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 13).toString());
            txtBairro.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 14).toString());
            txtCidade.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 15).toString());
            txtEstado.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 16).toString());
            txtCep.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 17).toString());
            txtObservacao.setText(jTCliente.getValueAt(jTCliente.getSelectedRow(), 18).toString());
            
        }
        
    }//GEN-LAST:event_jTClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar_;
    private javax.swing.JButton btn_Excluir_;
    private javax.swing.JButton btn_Fechar_;
    private javax.swing.JButton btn_Incluir_;
    private javax.swing.JButton btn_Salvar_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCliente;
    private javax.swing.JMenuItem menu_Editar_;
    private javax.swing.JMenuItem menu_Excluir_;
    private javax.swing.JMenuItem menu_Incluir_;
    private javax.swing.JMenuItem menu_Salvar_;
    private javax.swing.JMenuItem menu_fechar;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataMat;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstado_civil;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdentidade;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtProfissao;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSituacao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
