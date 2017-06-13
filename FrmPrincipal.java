
package com.unipe.seguradora.visao;

import com.unipe.seguradora.persistencia.ConectaBD;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class FrmPrincipal extends javax.swing.JFrame {
    
    Connection con = ConectaBD.getConnection();

    public FrmPrincipal() {
       initComponents();
       //FrmLogin tela = new FrmLogin();
       //painel_principal.add(tela);
       //tela.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_func = new javax.swing.JMenu();
        menu_veiculos = new javax.swing.JMenuItem();
        menu_clientes = new javax.swing.JMenuItem();
        menu_seguros = new javax.swing.JMenuItem();
        menu_Registros = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menu_lista_veiculo_ = new javax.swing.JMenuItem();
        menu_lista_cliente_ = new javax.swing.JMenuItem();
        menu_lista_seguro_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Seguradora de Veiculos");

        painel_principal.setBackground(java.awt.SystemColor.activeCaption);
        painel_principal.setForeground(java.awt.SystemColor.activeCaption);

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1233, Short.MAX_VALUE)
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jMenu_func.setText("Cadastros");

        menu_veiculos.setText("Veículos");
        menu_veiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_veiculosActionPerformed(evt);
            }
        });
        jMenu_func.add(menu_veiculos);

        menu_clientes.setText("Clientes");
        menu_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clientesActionPerformed(evt);
            }
        });
        jMenu_func.add(menu_clientes);

        menu_seguros.setText("Seguros");
        menu_seguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_segurosActionPerformed(evt);
            }
        });
        jMenu_func.add(menu_seguros);

        menu_Registros.setText("Registros");
        menu_Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_RegistrosActionPerformed(evt);
            }
        });
        jMenu_func.add(menu_Registros);

        menu_sair.setText("Sair");
        menu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sairActionPerformed(evt);
            }
        });
        jMenu_func.add(menu_sair);

        jMenuBar1.add(jMenu_func);

        jMenu1.setText("Relatórios");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menu_lista_veiculo_.setText("Lista de Veículos");
        menu_lista_veiculo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_lista_veiculo_ActionPerformed(evt);
            }
        });
        jMenu1.add(menu_lista_veiculo_);

        menu_lista_cliente_.setText("Lista de Clientes");
        menu_lista_cliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_lista_cliente_ActionPerformed(evt);
            }
        });
        jMenu1.add(menu_lista_cliente_);

        menu_lista_seguro_.setText("Lista de Seguros");
        menu_lista_seguro_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_lista_seguro_ActionPerformed(evt);
            }
        });
        jMenu1.add(menu_lista_seguro_);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_veiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_veiculosActionPerformed
        
        FrmVeiculo tela = new FrmVeiculo();
        painel_principal.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_menu_veiculosActionPerformed

    private void menu_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clientesActionPerformed
        
        FrmCliente tela = new FrmCliente();
        painel_principal.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_menu_clientesActionPerformed

    private void menu_segurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_segurosActionPerformed
        
        FrmSeguro tela = new FrmSeguro();
        painel_principal.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_menu_segurosActionPerformed

    private void menu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_sairActionPerformed

    private void menu_RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_RegistrosActionPerformed
        
        FrmRegistro tela = new FrmRegistro();
        painel_principal.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menu_RegistrosActionPerformed

    private void menu_lista_veiculo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_lista_veiculo_ActionPerformed
         
        String src = "veiculos.jasper";
        
        JasperPrint jp = null;
        
        try {
            jp = JasperFillManager.fillReport(src, null, con);
        } catch (JRException ex) {
            System.err.println("Erro ao abrir relatório."+ex);
        }
        
        JasperViewer view = new JasperViewer(jp,false);
        
        view.setVisible(true);
        view.setTitle("Lista de Veículos - Kit Kar");
        
    }//GEN-LAST:event_menu_lista_veiculo_ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menu_lista_cliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_lista_cliente_ActionPerformed
           
        String src = "clientes.jasper";
        
        JasperPrint jp = null;
        
        try {
            jp = JasperFillManager.fillReport(src, null, con);
        } catch (JRException ex) {
            System.err.println("Erro ao abrir relatório."+ex);
        }
        
        JasperViewer view = new JasperViewer(jp,false);
        
        view.setVisible(true);
        view.setTitle("Lista de Clientes - Kit Kar");
    }//GEN-LAST:event_menu_lista_cliente_ActionPerformed

    
    
    private void menu_lista_seguro_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_lista_seguro_ActionPerformed
               
        String src = "seguros.jasper";
        
        JasperPrint jp = null;
        
        try {
            jp = JasperFillManager.fillReport(src, null, con);
        } catch (JRException ex) {
            System.err.println("Erro ao abrir relatório."+ex);
        }
        
        JasperViewer view = new JasperViewer(jp,false);
        
        view.setVisible(true);
        view.setTitle("Lista de Seguros - Kit Kar");
        
    }//GEN-LAST:event_menu_lista_seguro_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_func;
    private javax.swing.JMenuItem menu_Registros;
    private javax.swing.JMenuItem menu_clientes;
    private javax.swing.JMenuItem menu_lista_cliente_;
    private javax.swing.JMenuItem menu_lista_seguro_;
    private javax.swing.JMenuItem menu_lista_veiculo_;
    private javax.swing.JMenuItem menu_sair;
    private javax.swing.JMenuItem menu_seguros;
    private javax.swing.JMenuItem menu_veiculos;
    private javax.swing.JDesktopPane painel_principal;
    // End of variables declaration//GEN-END:variables

}
