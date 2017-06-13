
package com.unipe.seguradora.visao;

import com.unipe.seguradora.modelo.Seguro;
import com.unipe.seguradora.persistencia.SeguroDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Brauner
 */
public class FrmSeguro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Seguros
     */
    public FrmSeguro() {
        initComponents();
        
        readJTable();
        
        DefaultTableModel modelo = (DefaultTableModel) jTSeguro.getModel();
        jTSeguro.setRowSorter(new TableRowSorter(modelo));
        
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTSeguro.getModel();
        modelo.setNumRows(0);
        SeguroDAO dao = new SeguroDAO();

        for (Seguro p : dao.read()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getValor(),
                p.getVigencia()
            });
        }
    }
    
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTSeguro.getModel();
        modelo.setNumRows(0);
        SeguroDAO dao = new SeguroDAO();

        for (Seguro p : dao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getValor(),
                p.getVigencia()
            });
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVigencia = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_Incluir_ = new javax.swing.JButton();
        btn_Excluir_ = new javax.swing.JButton();
        btn_Editar_ = new javax.swing.JButton();
        btn_Salvar_ = new javax.swing.JButton();
        btn_Fechar_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSeguro = new javax.swing.JTable();
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
        setTitle("Cadastro de Seguros");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.activeCaption);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Valor");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Vigência");

        txtVigencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 199, Short.MAX_VALUE))
                    .addComponent(txtDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
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
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Incluir_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btn_Excluir_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Editar_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Fechar_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Salvar_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTSeguro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTSeguro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTSeguro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Valor", "Vigencia/Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTSeguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSeguroMouseClicked(evt);
            }
        });
        jTSeguro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTSeguroKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTSeguro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void menu_Excluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Excluir_ActionPerformed
        
        if (jTSeguro.getSelectedRow() != -1) {

            Seguro p = new Seguro();
            SeguroDAO dao = new SeguroDAO();

            p.setId((int) jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 0));
            p.setDescricao(txtDescricao.getText());
            p.setValor(txtValor.getText());
            p.setVigencia(txtVigencia.getText());
                        
            dao.delete(p);

            txtId.setText("");
            txtDescricao.setText("");
            txtValor.setText("");
            txtVigencia.setText("");
            
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

    private void jTSeguroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSeguroMouseClicked
        
        if (jTSeguro.getSelectedRow() != -1) {
            
            txtId.setText(jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 0).toString());
            txtDescricao.setText(jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 1).toString());
            txtValor.setText(jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 2).toString());
            txtVigencia.setText(jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jTSeguroMouseClicked

    private void jTSeguroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSeguroKeyReleased
        
        if (jTSeguro.getSelectedRow() != -1) {

            txtId.setText(jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 0).toString());
            txtDescricao.setText(jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 1).toString());
            txtValor.setText(jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 2).toString());
            txtVigencia.setText(jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jTSeguroKeyReleased

    private void menu_Incluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Incluir_ActionPerformed
        
        txtId.setText("");
        txtDescricao.setText("");
        txtValor.setText("");
        txtVigencia.setText("");
        txtDescricao.requestFocus();
        
    }//GEN-LAST:event_menu_Incluir_ActionPerformed

    private void menu_Editar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Editar_ActionPerformed
        
        if (jTSeguro.getSelectedRow() != -1) {

            Seguro p = new Seguro();
            SeguroDAO dao = new SeguroDAO();

            p.setId((int) jTSeguro.getValueAt(jTSeguro.getSelectedRow(), 0));
            p.setDescricao(txtDescricao.getText());
            p.setValor(txtValor.getText());
            p.setVigencia(txtVigencia.getText());
            
            dao.update(p);

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro para editar.");
        }
    }//GEN-LAST:event_menu_Editar_ActionPerformed

    private void btn_Excluir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Excluir_ActionPerformed
        menu_Excluir_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Excluir_ActionPerformed

    private void menu_Salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Salvar_ActionPerformed
        
        Seguro p = new Seguro();
        SeguroDAO dao = new SeguroDAO();
  
        p.setDescricao(txtDescricao.getText());
        p.setValor(txtValor.getText());
        p.setVigencia(txtVigencia.getText());
        
        dao.create(p);

        readJTable();
        
    }//GEN-LAST:event_menu_Salvar_ActionPerformed

    private void btn_Editar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Editar_ActionPerformed
        menu_Editar_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Editar_ActionPerformed

    private void btn_Salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salvar_ActionPerformed
        menu_Salvar_ActionPerformed(evt);
    }//GEN-LAST:event_btn_Salvar_ActionPerformed

    private void btn_Fechar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Fechar_ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_Fechar_ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar_;
    private javax.swing.JButton btn_Excluir_;
    private javax.swing.JButton btn_Fechar_;
    private javax.swing.JButton btn_Incluir_;
    private javax.swing.JButton btn_Salvar_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTSeguro;
    private javax.swing.JMenuItem menu_Editar_;
    private javax.swing.JMenuItem menu_Excluir_;
    private javax.swing.JMenuItem menu_Incluir_;
    private javax.swing.JMenuItem menu_Salvar_;
    private javax.swing.JMenuItem menu_fechar;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtVigencia;
    // End of variables declaration//GEN-END:variables
}
