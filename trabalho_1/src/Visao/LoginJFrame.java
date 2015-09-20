package Visao;

import Controle.BotaoListener;
import Visao.jPrincipal;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class LoginJFrame extends javax.swing.JFrame {
    
    private BotaoListener listener = new BotaoListener(this);
    
    public LoginJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneltelalogin = new javax.swing.JPanel();
        jLabellogin = new javax.swing.JLabel();
        jLabelsenha = new javax.swing.JLabel();
        jTextFieldlogin = new javax.swing.JTextField();
        jPasswordFieldsenha = new javax.swing.JPasswordField();
        jButtonLogar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtoninformacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPaneltelalogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabellogin.setText("Login");

        jLabelsenha.setText("Senha");

        jPasswordFieldsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldsenhaActionPerformed(evt);
            }
        });
        jPasswordFieldsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldsenhaKeyPressed(evt);
            }
        });

        jButtonLogar.setText("Logar");
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneltelaloginLayout = new javax.swing.GroupLayout(jPaneltelalogin);
        jPaneltelalogin.setLayout(jPaneltelaloginLayout);
        jPaneltelaloginLayout.setHorizontalGroup(
            jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltelaloginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabellogin)
                    .addComponent(jLabelsenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneltelaloginLayout.createSequentialGroup()
                        .addComponent(jButtonLogar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPaneltelaloginLayout.createSequentialGroup()
                        .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldsenha, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTextFieldlogin))
                        .addGap(24, 24, 24))))
        );
        jPaneltelaloginLayout.setVerticalGroup(
            jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltelaloginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabellogin)
                    .addComponent(jTextFieldlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelsenha)
                    .addComponent(jPasswordFieldsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonLogar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setText("CiaSoftware direitos reservados ®");

        jButtoninformacoes.setText("Informações");
        jButtoninformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninformacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPaneltelalogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jButtoninformacoes)
                        .addContainerGap(294, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPaneltelalogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtoninformacoes))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(621, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Submete o usuário e senha pressionando a tecla Enter
    private void jPasswordFieldsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldsenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String usuariotxt = jTextFieldlogin.getText();
            String senhatxt = new String(jPasswordFieldsenha.getPassword());
            if ("".equals(usuariotxt)) {
                if ("".equals(senhatxt)) {
                   new jPrincipal().setVisible(true);
                    dispose();
                   setVisible(false); // Aqui temos que implementar o DISPOSE ainda!
                }
            } else {
                JOptionPane.showMessageDialog(null, "O Nome de usuário ou senha incorretos.");
            }
        }
    }//GEN-LAST:event_jPasswordFieldsenhaKeyPressed

    private void jPasswordFieldsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldsenhaActionPerformed

    private void jButtoninformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninformacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoninformacoesActionPerformed

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed
        listener.actionPerformed(evt);
    }//GEN-LAST:event_jButtonLogarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JButton jButtoninformacoes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabellogin;
    private javax.swing.JLabel jLabelsenha;
    private javax.swing.JPanel jPaneltelalogin;
    private javax.swing.JPasswordField jPasswordFieldsenha;
    private javax.swing.JTextField jTextFieldlogin;
    // End of variables declaration//GEN-END:variables
    
     public String getUsuario(){
        return jTextFieldlogin.getText();
    }
    
    public String getSenha(){
        return new String(jPasswordFieldsenha.getPassword());
    }
    
}
