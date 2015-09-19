package trabalho_1;

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
        jButtoncancelar = new javax.swing.JButton();
        jButtonentrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelIcone = new javax.swing.JLabel();
        jButtoninformacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jButtoncancelar.setText("Cancelar");
        jButtoncancelar.addActionListener(listener);

        jButtonentrar.setText("Entrar");
        jButtonentrar.setActionCommand("entrar");
        /*
        jButtonentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonentrarActionPerformed(evt);
            }
        });
        */
        jButtonentrar.addActionListener(listener);

        javax.swing.GroupLayout jPaneltelaloginLayout = new javax.swing.GroupLayout(jPaneltelalogin);
        jPaneltelalogin.setLayout(jPaneltelaloginLayout);
        jPaneltelaloginLayout.setHorizontalGroup(
            jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltelaloginLayout.createSequentialGroup()
                .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPaneltelaloginLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButtoncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaneltelaloginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabellogin)
                            .addComponent(jLabelsenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldsenha)
                            .addComponent(jTextFieldlogin))))
                .addGap(24, 24, 24))
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
                .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtoncancelar)
                    .addComponent(jButtonentrar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setText("CiaSoftware direitos reservados ®");

        jLabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Tela de login.jpg"))); // NOI18N

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
                    .addComponent(jLabelIcone)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jButtoninformacoes)))
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPaneltelalogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIcone)
                    .addComponent(jPaneltelalogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            String senhatxt = jPasswordFieldsenha.getText();
            if ("admin".equals(usuariotxt)) {
                if ("admin".equals(senhatxt)) {
                    new jPrincipal().setVisible(true);
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

    private void jButtonentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonentrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonentrarActionPerformed

    private void jButtoninformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninformacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoninformacoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncancelar;
    private javax.swing.JButton jButtonentrar;
    private javax.swing.JButton jButtoninformacoes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIcone;
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
