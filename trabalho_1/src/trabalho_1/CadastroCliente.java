/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_1;

/**
 *
 * @author comp1
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelcod = new javax.swing.JLabel();
        jTextFieldcod = new javax.swing.JTextField();
        jLabelnome = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jButtonprocurar = new javax.swing.JButton();
        jLabelrg = new javax.swing.JLabel();
        jTextFieldrg = new javax.swing.JTextField();
        jLabelcpf = new javax.swing.JLabel();
        jTextFieldcpf = new javax.swing.JTextField();
        jLabeltelefone = new javax.swing.JLabel();
        jTextFieldtelefone = new javax.swing.JTextField();
        jLabelendereco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaendereco = new javax.swing.JTextArea();
        jLabelstatus = new javax.swing.JLabel();
        jRadioButtonstatusativo = new javax.swing.JRadioButton();
        jRadioButtonstatusinativo = new javax.swing.JRadioButton();
        jButtonnovo = new javax.swing.JButton();
        jButtoneditar = new javax.swing.JButton();
        jButtonsalvar = new javax.swing.JButton();
        jButtonsair = new javax.swing.JButton();
        jButtonexcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelcod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelcod.setText("Cod.");

        jLabelnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelnome.setText("Nome");

        jButtonprocurar.setText("...");

        jLabelrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelrg.setText("RG");
        jLabelrg.setEnabled(false);

        jTextFieldrg.setEnabled(false);

        jLabelcpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelcpf.setText("CPF");
        jLabelcpf.setEnabled(false);

        jTextFieldcpf.setEnabled(false);

        jLabeltelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeltelefone.setText("Telefone");
        jLabeltelefone.setEnabled(false);

        jTextFieldtelefone.setEnabled(false);

        jLabelendereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelendereco.setText("Endereço");
        jLabelendereco.setEnabled(false);

        jTextAreaendereco.setColumns(20);
        jTextAreaendereco.setRows(5);
        jTextAreaendereco.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaendereco);

        jLabelstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelstatus.setText("Status");
        jLabelstatus.setEnabled(false);

        buttonGroup1.add(jRadioButtonstatusativo);
        jRadioButtonstatusativo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonstatusativo.setText("Ativo");
        jRadioButtonstatusativo.setEnabled(false);

        buttonGroup1.add(jRadioButtonstatusinativo);
        jRadioButtonstatusinativo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonstatusinativo.setText("Inativo");
        jRadioButtonstatusinativo.setEnabled(false);

        jButtonnovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonnovo.setText("Novo");
        jButtonnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnovoActionPerformed(evt);
            }
        });

        jButtoneditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtoneditar.setText("Editar");
        jButtoneditar.setEnabled(false);

        jButtonsalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonsalvar.setText("Salvar");
        jButtonsalvar.setEnabled(false);

        jButtonsair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonsair.setText("Sair");

        jButtonexcluir.setForeground(new java.awt.Color(255, 51, 51));
        jButtonexcluir.setText("Excluir");
        jButtonexcluir.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldrg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelrg)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelcod)
                                    .addComponent(jTextFieldcod, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelnome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButtonprocurar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelcpf)
                                            .addComponent(jTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelendereco)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabeltelefone)
                                    .addComponent(jRadioButtonstatusinativo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelstatus)
                                        .addComponent(jRadioButtonstatusativo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonexcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonnovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtoneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButtonsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonsair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcod)
                    .addComponent(jLabelnome))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonprocurar))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelrg)
                    .addComponent(jLabelcpf)
                    .addComponent(jLabeltelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelendereco)
                    .addComponent(jLabelstatus))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jRadioButtonstatusativo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonstatusinativo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonsair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(663, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnovoActionPerformed
        
    }//GEN-LAST:event_jButtonnovoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtoneditar;
    private javax.swing.JButton jButtonexcluir;
    private javax.swing.JButton jButtonnovo;
    private javax.swing.JButton jButtonprocurar;
    private javax.swing.JButton jButtonsair;
    private javax.swing.JButton jButtonsalvar;
    private javax.swing.JLabel jLabelcod;
    private javax.swing.JLabel jLabelcpf;
    private javax.swing.JLabel jLabelendereco;
    private javax.swing.JLabel jLabelnome;
    private javax.swing.JLabel jLabelrg;
    private javax.swing.JLabel jLabelstatus;
    private javax.swing.JLabel jLabeltelefone;
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
}
