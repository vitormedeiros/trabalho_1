package trabalho_1;

import Visao.jPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        jButtonentrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
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
        });
        jButtoncancelar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        jButtoninformacao.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Desenvolvido por: qwerty");
            }
        });

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtoninformacao = new javax.swing.JButton();
        jLabelIcone = new javax.swing.JLabel();

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

        jButtonentrar.setText("Entrar");
        jButtonentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonentrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneltelaloginLayout = new javax.swing.GroupLayout(jPaneltelalogin);
        jPaneltelalogin.setLayout(jPaneltelaloginLayout);
        jPaneltelaloginLayout.setHorizontalGroup(
            jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltelaloginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabellogin)
                    .addComponent(jLabelsenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaneltelaloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldsenha)
                    .addComponent(jTextFieldlogin))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltelaloginLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButtoncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho_1/Tela de login.jpg"))); // NOI18N

        jLabel2.setText("CiaSoftware direitos reservados ®");

        jButtoninformacao.setText("Informação");

        jLabelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Tela de login.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIcone)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(jButtoninformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(283, Short.MAX_VALUE))
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
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtoninformacao))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(621, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonentrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonentrarActionPerformed
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncancelar;
    private javax.swing.JButton jButtonentrar;
    private javax.swing.JButton jButtoninformacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIcone;
    private javax.swing.JLabel jLabellogin;
    private javax.swing.JLabel jLabelsenha;
    private javax.swing.JPanel jPaneltelalogin;
    private javax.swing.JPasswordField jPasswordFieldsenha;
    private javax.swing.JTextField jTextFieldlogin;
    // End of variables declaration//GEN-END:variables

}
