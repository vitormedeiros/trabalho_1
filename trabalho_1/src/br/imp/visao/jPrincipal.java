package br.imp.visao;

import br.imp.controle.Log;
import br.imp.controle.PrincipalListener;
import br.imp.controle.UltimoUsuarioLogin;
import javax.swing.JDesktopPane;

public class jPrincipal extends javax.swing.JFrame {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    public PrincipalListener listener = new PrincipalListener(this);

    public jPrincipal() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        //Log de navegação
        log = new Log("Usuario " + ultimoLogin.lerArquivo() + " entrou no sistema dia ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonCadastroCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonCadEstoque = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonEstoque = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonInformacao = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("ImpSoftware direitos reservados  ®");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel2.setText("Contato (48) 3433 - 3333");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
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
                .addContainerGap(504, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar1.setBackground(new java.awt.Color(153, 204, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonCadastroCliente.setBackground(new java.awt.Color(153, 204, 255));
        jButtonCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imp/icones/user_group_new.png"))); // NOI18N
        jButtonCadastroCliente.setToolTipText("Cadastro de cliente");
        /*
        jButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroClienteActionPerformed(evt);
            }
        });
        jButtonCadastroCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCadastroClienteKeyPressed(evt);
            }
        });
        */
        jButtonCadastroCliente.setActionCommand("cadastroCliente");
        jButtonCadastroCliente.addActionListener(listener);
        jToolBar1.add(jButtonCadastroCliente);

        jLabel4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel4.setForeground(new java.awt.Color(153, 204, 255));
        jLabel4.setText("jLabel4");
        jToolBar1.add(jLabel4);

        jButtonCadEstoque.setBackground(new java.awt.Color(153, 204, 255));
        jButtonCadEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imp/icones/gnome_dev_media_cf.png"))); // NOI18N
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

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setForeground(new java.awt.Color(153, 204, 255));
        jLabel5.setText("jLabel5");
        jToolBar1.add(jLabel5);

        jButtonEstoque.setBackground(new java.awt.Color(153, 204, 255));
        jButtonEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imp/icones/versao.png"))); // NOI18N
        jButtonEstoque.setToolTipText("Estoque");
        jButtonEstoque.setFocusable(false);
        jButtonEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        /*
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        */
        jToolBar1.add(jButtonEstoque);
        jButtonEstoque.setActionCommand("estoque");
        jButtonEstoque.addActionListener(listener);

        jLabel6.setBackground(new java.awt.Color(153, 204, 255));
        jLabel6.setForeground(new java.awt.Color(153, 204, 255));
        jLabel6.setText("jLabel6");
        jToolBar1.add(jLabel6);

        jButtonInformacao.setActionCommand("sobre");
        jButtonInformacao.addActionListener(listener);
        jButtonInformacao.setBackground(new java.awt.Color(153, 204, 255));
        jButtonInformacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imp/icones/info.png"))); // NOI18N
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

        jLabel7.setBackground(new java.awt.Color(153, 204, 255));
        jLabel7.setForeground(new java.awt.Color(153, 204, 255));
        jLabel7.setText("jLabel7");
        jToolBar1.add(jLabel7);

        jBtnSair.setBackground(new java.awt.Color(153, 204, 255));
        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imp/icones/close2.png"))); // NOI18N
        jBtnSair.setToolTipText("Fechar");
        jBtnSair.setActionCommand("sair");
        jBtnSair.addActionListener(listener);
        /*
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });
        */
        jToolBar1.add(jBtnSair);

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

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed

    }//GEN-LAST:event_jButtonEstoqueActionPerformed

    private void jButtonCadEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadEstoqueActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jButtonCadastroClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCadastroClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastroClienteKeyPressed

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
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jButtonCadEstoque;
    private javax.swing.JButton jButtonCadastroCliente;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonInformacao;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
