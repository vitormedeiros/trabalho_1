package br.imp.visao;

import br.imp.controle.CadastroClienteListener;
import br.imp.controle.Log;
import br.imp.controle.UltimoUsuarioLogin;
import javax.swing.JOptionPane;

public class CadastroClienteJIF extends javax.swing.JInternalFrame {
    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    
    
    public CadastroClienteListener listener = new CadastroClienteListener(this);

    public CadastroClienteJIF() {
        initComponents();
        SetaEnable(false);
        LimpaForm();
        //Log de navegação
        log = new Log("Usuario " + ultimoLogin.lerArquivo() + " entrou no Cadastro de Cliente no dia ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonsalvar = new javax.swing.JButton();
        jButtoncancelar = new javax.swing.JButton();
        jButtonnovo = new javax.swing.JButton();
        jButtoneditar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonstatusativo = new javax.swing.JRadioButton();
        jRadioButtonstatusinativo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelcod = new javax.swing.JLabel();
        jTextFieldcod = new javax.swing.JTextField();
        jTextFieldnome = new javax.swing.JTextField();
        jLabelnome = new javax.swing.JLabel();
        jButtonpesquisa = new javax.swing.JButton();
        jButtonsair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaendereco = new javax.swing.JTextArea();
        jButtonexcluir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelrg = new javax.swing.JLabel();
        jLabelcpf = new javax.swing.JLabel();
        jLabeltelefone = new javax.swing.JLabel();
        jTextFieldrg = new javax.swing.JTextField();
        jTextFieldcpf = new javax.swing.JTextField();
        jTextFieldtelefone = new javax.swing.JTextField();

        setClosable(true);
        setTitle("CadastroCliente");

        jButtonsalvar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButtonsalvar.setText("Salvar");

        jButtoncancelar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButtoncancelar.setText("Cancelar");
        jButtoncancelar.setActionCommand("botaoCancelar");

        jButtonnovo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButtonnovo.setText("Novo");
        jButtonnovo.setActionCommand("botaoNovo");
        /*
        jButtonnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnovoActionPerformed(evt);
            }
        });
        */

        jButtoneditar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButtoneditar.setText("Editar");
        jButtoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N
        jPanel4.setEnabled(false);

        buttonGroup1.add(jRadioButtonstatusativo);
        jRadioButtonstatusativo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRadioButtonstatusativo.setText("Ativo");

        buttonGroup1.add(jRadioButtonstatusinativo);
        jRadioButtonstatusinativo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRadioButtonstatusinativo.setText("Inativo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonstatusinativo)
                    .addComponent(jRadioButtonstatusativo))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonstatusativo)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonstatusinativo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelcod.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelcod.setText("Cod.");

        jLabelnome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelnome.setText("Nome");
        jLabelnome.setEnabled(false);

        jButtonpesquisa.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldcod, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelcod))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelnome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldnome)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnome)
                    .addComponent(jLabelcod))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonpesquisa))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jButtonsair.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButtonsair.setText("Sair");
        jButtonsair.setActionCommand("botaoSair");
        /*
        jButtonsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsairActionPerformed(evt);
            }
        });
        */
        jButtonsair.addActionListener(listener);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N
        jPanel3.setEnabled(false);

        jTextAreaendereco.setColumns(20);
        jTextAreaendereco.setRows(5);
        jTextAreaendereco.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaendereco);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButtonexcluir.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jButtonexcluir.setForeground(new java.awt.Color(255, 0, 51));
        jButtonexcluir.setText("Excluir");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setEnabled(false);

        jLabelrg.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelrg.setText("RG");
        jLabelrg.setEnabled(false);

        jLabelcpf.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelcpf.setText("CPF");
        jLabelcpf.setEnabled(false);

        jLabeltelefone.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabeltelefone.setText("Telefone");
        jLabeltelefone.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelrg)
                    .addComponent(jTextFieldrg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelcpf))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeltelefone)
                    .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelrg)
                    .addComponent(jLabelcpf)
                    .addComponent(jLabeltelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonnovo)
                        .addGap(40, 40, 40)
                        .addComponent(jButtoneditar)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonsalvar)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonsair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtoncancelar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonexcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtoneditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonnovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonsalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonsair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtoncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );

        jButtoncancelar.addActionListener(listener);
        jButtonnovo.addActionListener(listener);

        setBounds(175, 5, 659, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnovoActionPerformed

    }//GEN-LAST:event_jButtonnovoActionPerformed

    private void jButtoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoneditarActionPerformed

    private void jButtonsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsairActionPerformed

    }//GEN-LAST:event_jButtonsairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtoncancelar;
    private javax.swing.JButton jButtoneditar;
    private javax.swing.JButton jButtonexcluir;
    private javax.swing.JButton jButtonnovo;
    private javax.swing.JButton jButtonpesquisa;
    private javax.swing.JButton jButtonsair;
    private javax.swing.JButton jButtonsalvar;
    private javax.swing.JLabel jLabelcod;
    private javax.swing.JLabel jLabelcpf;
    private javax.swing.JLabel jLabelnome;
    private javax.swing.JLabel jLabelrg;
    private javax.swing.JLabel jLabeltelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonstatusativo;
    private javax.swing.JRadioButton jRadioButtonstatusinativo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaendereco;
    private javax.swing.JTextField jTextFieldcod;
    private javax.swing.JTextField jTextFieldcpf;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldrg;
    private javax.swing.JTextField jTextFieldtelefone;
    // End of variables declaration//GEN-END:variables
public void SetaEnable(boolean cond) {
        jButtoncancelar.setEnabled(cond);
        jButtoneditar.setEnabled(cond);
        jButtonexcluir.setEnabled(cond);
        // jButtonpesquisa.setEnabled(cond);
        jButtonsair.setEnabled(cond);
        jButtonsalvar.setEnabled(cond);
        // jLabelcod.setEnabled(cond);
        jLabelcpf.setEnabled(cond);
        jLabelnome.setEnabled(cond);
        jLabelrg.setEnabled(cond);
        jLabeltelefone.setEnabled(cond);
        jPanel1.setEnabled(cond);
        jPanel2.setEnabled(cond);
        jPanel3.setEnabled(cond);
        jPanel4.setEnabled(cond);
        jRadioButtonstatusativo.setEnabled(cond);
        jRadioButtonstatusinativo.setEnabled(cond);
        jScrollPane1.setEnabled(cond);
        jTextAreaendereco.setEnabled(cond);
        //jTextFieldcod.setEnabled(cond);
        jTextFieldcpf.setEnabled(cond);
        jTextFieldnome.setEnabled(cond);
        jTextFieldrg.setEnabled(cond);
        jTextFieldtelefone.setEnabled(cond);

    }

    public void LimpaForm() {
        jTextAreaendereco.setText(" ");
        jTextFieldcod.setText(" ");
        jTextFieldcpf.setText(" ");
        jTextFieldnome.setText(" ");
        jTextFieldrg.setText(" ");
        jTextFieldtelefone.setText(" ");

    }

    public void Sair() {
        dispose();

    }

}
