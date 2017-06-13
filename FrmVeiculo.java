
package com.unipe.seguradora.visao;

import com.unipe.seguradora.modelo.Veiculo;
import com.unipe.seguradora.persistencia.VeiculoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FrmVeiculo extends javax.swing.JInternalFrame {

    public FrmVeiculo() {
        initComponents();
        
        readJTable();
        
        DefaultTableModel modelo = (DefaultTableModel) jTVeiculos.getModel();
        jTVeiculos.setRowSorter(new TableRowSorter(modelo));
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTVeiculos.getModel();
        modelo.setNumRows(0);
        VeiculoDAO pdao = new VeiculoDAO();

        for (Veiculo p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getPlaca(),
                p.getModelo(),
                p.getChassi(),
                p.getAno(),
                p.getFabricante()
            });
        }
    }
    
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTVeiculos.getModel();
        modelo.setNumRows(0);
        VeiculoDAO pdao = new VeiculoDAO();

        for (Veiculo p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getPlaca(),
                p.getModelo(),
                p.getChassi(),
                p.getAno(),
                p.getFabricante()
            });
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtChassi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVeiculos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_Salvar_ = new javax.swing.JButton();
        btn_Excluir_ = new javax.swing.JButton();
        btn_Editar_ = new javax.swing.JButton();
        btn_Incluir_ = new javax.swing.JButton();
        btn_Fechar_ = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_procurar_ = new javax.swing.JButton();
        txtBuscaDesc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_Fechar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_Incluir_ = new javax.swing.JMenuItem();
        menu_Excluir_ = new javax.swing.JMenuItem();
        menu_Editar_ = new javax.swing.JMenuItem();
        menu_Salvar_ = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Veiculos");
        setName("frmVeiculos"); // NOI18N
        setRequestFocusEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtChassi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Placa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Modelo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Chassi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ano");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fabricante");
        jLabel5.setToolTipText("");

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtFabricante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.activeCaption);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTVeiculos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTVeiculos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Placa", "Modelo", "Chassi", "Ano", "Fabricante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTVeiculosMouseClicked(evt);
            }
        });
        jTVeiculos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTVeiculosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTVeiculos);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_Salvar_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Salvar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/Actions-document-save-icon.png"))); // NOI18N
        btn_Salvar_.setText("Salvar");
        btn_Salvar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salvar_ActionPerformed(evt);
            }
        });

        btn_Excluir_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Excluir_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/document-delete-icon.png"))); // NOI18N
        btn_Excluir_.setText("Excluir");
        btn_Excluir_.setToolTipText("Aperte aqui para Excluir um Veículo.");
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

        btn_Incluir_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Incluir_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/Files-New-File-icon.png"))); // NOI18N
        btn_Incluir_.setText("Incluir");
        btn_Incluir_.setToolTipText("Aperte aqui para Cadastrar um Veículo.");
        btn_Incluir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Incluir_ActionPerformed(evt);
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
                .addComponent(btn_Incluir_, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Excluir_, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Editar_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Salvar_, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Fechar_, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Fechar_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Excluir_, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn_Incluir_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Editar_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Salvar_, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_procurar_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_procurar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unipe/seguradora/img/search-blue-icon.png"))); // NOI18N
        btn_procurar_.setText("Procurar");
        btn_procurar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procurar_ActionPerformed(evt);
            }
        });

        txtBuscaDesc.setBackground(new java.awt.Color(255, 255, 153));
        txtBuscaDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Busca:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtBuscaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_procurar_, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_procurar_, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        menu_Fechar.setText("Fechar");
        menu_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_FecharActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Fechar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(100, 50, 1034, 548);
    }// </editor-fold>//GEN-END:initComponents

    private void jTVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVeiculosMouseClicked

        if (jTVeiculos.getSelectedRow() != -1) {
            
            txtId.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 0).toString());
            txtPlaca.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 1).toString());
            txtModelo.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 2).toString());
            txtChassi.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 3).toString());
            txtAno.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 4).toString());
            txtFabricante.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jTVeiculosMouseClicked

    private void jTVeiculosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTVeiculosKeyReleased
 
        if (jTVeiculos.getSelectedRow() != -1) {

            txtId.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 0).toString());
            txtPlaca.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 1).toString());
            txtModelo.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 2).toString());
            txtChassi.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 3).toString());
            txtAno.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 4).toString());
            txtFabricante.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 5).toString());

        }
    }//GEN-LAST:event_jTVeiculosKeyReleased

    private void btn_Salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salvar_ActionPerformed
        menu_Salvar_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Salvar_ActionPerformed

    private void btn_Excluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Excluir_ActionPerformed
        menu_Excluir_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Excluir_ActionPerformed

    private void btn_Editar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Editar_ActionPerformed
        menu_Editar_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Editar_ActionPerformed

    private void btn_procurar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procurar_ActionPerformed
        readJTableForDesc(txtBuscaDesc.getText());
    }//GEN-LAST:event_btn_procurar_ActionPerformed

    private void menu_Excluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Excluir_ActionPerformed
        
        if (jTVeiculos.getSelectedRow() != -1) {

            Veiculo p = new Veiculo();
            VeiculoDAO dao = new VeiculoDAO();

            p.setId((int) jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 0));
            p.setPlaca(txtPlaca.getText());
            p.setModelo(txtModelo.getText());
            p.setChassi(txtChassi.getText());
            p.setAno(txtAno.getText());
            p.setFabricante(txtFabricante.getText());
            
            dao.delete(p);

            txtPlaca.setText("");
            txtModelo.setText("");
            txtChassi.setText("");
            txtAno.setText("");
            txtFabricante.setText("");

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um veículo para excluir.");
        }
    }//GEN-LAST:event_menu_Excluir_ActionPerformed

    private void menu_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_menu_FecharActionPerformed

    private void btn_Incluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Incluir_ActionPerformed
        menu_Incluir_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Incluir_ActionPerformed

    private void btn_Fechar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Fechar_ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_Fechar_ActionPerformed

    private void menu_Incluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Incluir_ActionPerformed
        
        txtPlaca.setText("");
        txtModelo.setText("");
        txtChassi.setText("");
        txtAno.setText("");
        txtFabricante.setText("");
        txtPlaca.requestFocus();
    }//GEN-LAST:event_menu_Incluir_ActionPerformed

    private void menu_Editar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Editar_ActionPerformed
        
        if (jTVeiculos.getSelectedRow() != -1) {

            Veiculo p = new Veiculo();
            VeiculoDAO dao = new VeiculoDAO();

            p.setId((int) jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 0));
            p.setPlaca(txtPlaca.getText());
            p.setModelo(txtModelo.getText());
            p.setChassi(txtChassi.getText());
            p.setAno(txtAno.getText());
            p.setFabricante(txtFabricante.getText());
            
            dao.update(p);

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um veículo para editar.");
        }
        
    }//GEN-LAST:event_menu_Editar_ActionPerformed

    private void menu_Salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Salvar_ActionPerformed
        
        Veiculo p = new Veiculo();
        VeiculoDAO dao = new VeiculoDAO();
  
        p.setPlaca(txtPlaca.getText());
        p.setModelo(txtModelo.getText());
        p.setChassi(txtChassi.getText());
        p.setAno(txtAno.getText());
        p.setFabricante(txtFabricante.getText());

        dao.create(p);

        readJTable();
        
    }//GEN-LAST:event_menu_Salvar_ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar_;
    private javax.swing.JButton btn_Excluir_;
    private javax.swing.JButton btn_Fechar_;
    private javax.swing.JButton btn_Incluir_;
    private javax.swing.JButton btn_Salvar_;
    private javax.swing.JButton btn_procurar_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVeiculos;
    private javax.swing.JMenuItem menu_Editar_;
    private javax.swing.JMenuItem menu_Excluir_;
    private javax.swing.JMenuItem menu_Fechar;
    private javax.swing.JMenuItem menu_Incluir_;
    private javax.swing.JMenuItem menu_Salvar_;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtBuscaDesc;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

}
