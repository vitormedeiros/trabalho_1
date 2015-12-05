package br.imp.visao;

import br.imp.controle.CadastroClienteListener;
import br.imp.controle.Log;
import br.imp.controle.UltimoUsuarioLogin;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
        jPanel1 = new javax.swing.JPanel();
        jButtonnovo = new javax.swing.JButton();
        jButtoneditar = new javax.swing.JButton();
        jBtnGravar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaendereco = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabelcod = new javax.swing.JLabel();
        jTextFieldcod = new javax.swing.JTextField();
        jTextFieldnome = new javax.swing.JTextField();
        jLabelnome = new javax.swing.JLabel();
        jTextFieldrg = new javax.swing.JTextField();
        jLabelrg = new javax.swing.JLabel();
        jTextFieldcpf = new javax.swing.JTextField();
        jTextFieldtelefone = new javax.swing.JTextField();
        jLabeltelefone = new javax.swing.JLabel();
        jLabelcpf = new javax.swing.JLabel();

        setClosable(true);
        setTitle("CadastroCliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonnovo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jButtonnovo.setText("Novo");
        /*
        jButtonnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnovoActionPerformed(evt);
            }
        });
        */

        jButtoneditar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jButtoneditar.setText("Editar");
        jButtoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditarActionPerformed(evt);
            }
        });

        jBtnGravar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtnGravar.setText("Gravar");
        jBtnGravar.setActionCommand("gravar");
        jBtnGravar.addActionListener(listener);

        jBtnExcluir.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtnExcluir.setForeground(new java.awt.Color(255, 0, 51));
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.setActionCommand("excluir");
        jBtnExcluir.addActionListener(listener);
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        jTextAreaendereco.setColumns(20);
        jTextAreaendereco.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextAreaendereco.setRows(5);
        jScrollPane1.setViewportView(jTextAreaendereco);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        jLabelcod.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelcod.setText("Cod.");

        jTextFieldcod.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldcod.setPreferredSize(new java.awt.Dimension(6, 26));

        jTextFieldnome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabelnome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelnome.setText("Nome");

        jTextFieldrg.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldrg.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabelrg.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelrg.setText("RG");

        jTextFieldtelefone.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabeltelefone.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabeltelefone.setText("Telefone");

        jLabelcpf.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelcpf.setText("CPF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelrg)
                .addGap(150, 150, 150)
                .addComponent(jLabelcpf)
                .addGap(239, 239, 239)
                .addComponent(jLabeltelefone)
                .addGap(131, 131, 131))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldcod, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelcod))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnome)
                            .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldrg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnome)
                    .addComponent(jLabelcod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelrg)
                    .addComponent(jLabelcpf)
                    .addComponent(jLabeltelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldcpf)
                    .addComponent(jTextFieldtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonnovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtoneditar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnGravar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtoneditar)
                    .addComponent(jButtonnovo)
                    .addComponent(jBtnGravar)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonnovo.setActionCommand("botaoNovo");
        jButtonnovo.addActionListener(listener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(175, 5, 673, 429);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnovoActionPerformed

    }//GEN-LAST:event_jButtonnovoActionPerformed

    private void jButtoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoneditarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    public String getEndereco() {
        String conteudo = jTextAreaendereco.getText();
        if(conteudo.length() != 0 || conteudo != null ){
            return conteudo;
        }else{
            return conteudo="";
        }
        
    }

    public void setEndereco(String dado , CadastroClienteJIF stance) {
        stance.jTextAreaendereco.setText(dado);
    }

    public String getCod() {
        String conteudo = jTextFieldcod.getText();
        if(conteudo.length() != 0 || conteudo != null ){
            return conteudo;
        }else{
            return conteudo="";
        }
    }

    public void setCod(String dado , CadastroClienteJIF stance) {
         stance.jTextFieldcod.setText(dado);
        
    }

    public String getCpf() {
        String conteudo = jTextFieldcpf.getText();
        if(conteudo.length() != 0 || conteudo != null ){
            return conteudo;
        }else{
            return conteudo="";
        }

        
    }

    public void setCpf(String dado , CadastroClienteJIF stance) {
        stance.jTextFieldcpf.setText(dado);
    }

    public String getNome() {
        String conteudo = jTextFieldnome.getText();
        if(conteudo.length() != 0 || conteudo != null ){
            return conteudo;
        }else{
            return conteudo="";
        }

    }

    public void setNome(String dado , CadastroClienteJIF stance) {
        stance.jTextFieldnome.setText(dado);
    }

    public String getRg() {
        String conteudo = jTextFieldrg.getText();
        if(conteudo.length() != 0 || conteudo != null ){
            return conteudo;
        }else{
            return conteudo="";
        }
    }

    public void setRg(String dado , CadastroClienteJIF stance) {
        stance.jTextFieldrg.setText(dado);
    }

    public String getTelefone() {
        String conteudo = jTextFieldtelefone.getText();
        if(conteudo.length() != 0 || conteudo != null ){
            return conteudo;
        }else{
            return conteudo="";
        }
    }

    public void setTelefone(String dado , CadastroClienteJIF stance) {
        stance.jTextFieldtelefone.setText(dado);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnGravar;
    private javax.swing.JButton jButtoneditar;
    private javax.swing.JButton jButtonnovo;
    private javax.swing.JLabel jLabelcod;
    private javax.swing.JLabel jLabelcpf;
    private javax.swing.JLabel jLabelnome;
    private javax.swing.JLabel jLabelrg;
    private javax.swing.JLabel jLabeltelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaendereco;
    private javax.swing.JTextField jTextFieldcod;
    private javax.swing.JTextField jTextFieldcpf;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldrg;
    private javax.swing.JTextField jTextFieldtelefone;
    // End of variables declaration//GEN-END:variables
public void SetaEnable(boolean cond) {
     
        jButtoneditar.setEnabled(cond);
        jBtnExcluir.setEnabled(cond);
        // jButtonpesquisa.setEnabled(cond);
      
       
        // jLabelcod.setEnabled(cond);
        jLabelcpf.setEnabled(cond);
        jLabelnome.setEnabled(cond);
        jLabelrg.setEnabled(cond);
        jLabeltelefone.setEnabled(cond);
        jPanel1.setEnabled(cond);
        jPanel2.setEnabled(cond);
        jPanel3.setEnabled(cond);
     
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
