package Visao;

import Controle.PrincipalListener;
import javax.swing.JDesktopPane;

public class jPrincipal extends javax.swing.JFrame {
    
public PrincipalListener listener = new PrincipalListener(this);

    public jPrincipal() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonCadastroCliente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonCadEstoque = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonInformacao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(539, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar1.setBackground(new java.awt.Color(153, 204, 255));
        jToolBar1.setRollover(true);

        jButtonCadastroCliente.setBackground(new java.awt.Color(153, 204, 255));
        jButtonCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user_group_new.png"))); // NOI18N
        jButtonCadastroCliente.setToolTipText("Cadastro de cliente");
        jButtonCadastroCliente.setActionCommand("cadastroCliente");

        /*
        jButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroClienteActionPerformed(evt);
            }
        });
        */
        jButtonCadastroCliente.addActionListener(listener);
        jToolBar1.add(jButtonCadastroCliente);

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setToolTipText("Estoque Teste");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButtonCadEstoque.setBackground(new java.awt.Color(153, 204, 255));
        jButtonCadEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/gnome_dev_media_cf.png"))); // NOI18N
        jButtonCadEstoque.setToolTipText("Cadastro de produtos");
        jButtonCadEstoque.setFocusable(false);
        jButtonCadEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCadEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCadEstoque.setActionCommand("cadastroProduto");
        jButtonCadEstoque.addActionListener(listener);
        /*
        jButtonCadEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEstoqueActionPerformed(evt);
            }
        });
        */
        jToolBar1.add(jButtonCadEstoque);

        jButtonEstoque.setBackground(new java.awt.Color(153, 204, 255));
        jButtonEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/versao.png"))); // NOI18N
        jButtonEstoque.setToolTipText("Estoque");
        jButtonEstoque.setFocusable(false);
        jButtonEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEstoque.setActionCommand("estoque");
        jButtonEstoque.addActionListener(listener);
        /*
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        */
        jToolBar1.add(jButtonEstoque);
        jToolBar1.add(jSeparator1);

        jButtonInformacao.setActionCommand("sobre");
        jButtonInformacao.addActionListener(listener);
        jButtonInformacao.setBackground(new java.awt.Color(153, 204, 255));
        jButtonInformacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/info.png"))); // NOI18N
        jButtonInformacao.setToolTipText("Informação");
        jButtonInformacao.setFocusable(false);
        jButtonInformacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInformacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        /*
        jButtonInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacaoActionPerformed(evt);
            }
        });
        */
        jToolBar1.add(jButtonInformacao);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/close2.png"))); // NOI18N
        jButton1.setToolTipText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroClienteActionPerformed
        
    }//GEN-LAST:event_jButtonCadastroClienteActionPerformed

    private void jButtonInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformacaoActionPerformed
        
    }//GEN-LAST:event_jButtonInformacaoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        
    }//GEN-LAST:event_jButtonEstoqueActionPerformed

    private void jButtonCadEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadEstoqueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jPrincipal().setVisible(true);
            }
        });
    }

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCadEstoque;
    private javax.swing.JButton jButtonCadastroCliente;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonInformacao;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
