package br.imp.visao;

import br.imp.controle.CadastroProdutoListener;
import br.imp.controle.Log;
import br.imp.controle.UltimoUsuarioLogin;
import br.imp.modelo.CadProdutoModelo;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class CadastroProdutoJIF extends javax.swing.JInternalFrame {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    private CadastroProdutoListener listener = new CadastroProdutoListener(this);
    
  
    

    public CadastroProdutoJIF() {
        initComponents();
        //Log de navegação
        log = new Log("Usuario " + ultimoLogin.lerArquivo() + " entrou no Cadastro de Produto no dia ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTFNome = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTFQtd = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTFUnitario = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTFCusto = new javax.swing.JTextField();
        jBtGravar = new javax.swing.JButton();
        jTFCodigo = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jTFMarca = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTFFornecedor = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneDescricao = new javax.swing.JTextPane();
        jLabel44 = new javax.swing.JLabel();
        jTFQtdCritica = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("CadastroProduto");

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addGap(159, 159, 159))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        jTFNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel37.setText("Nome");

        jTFQtd.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel38.setText("Quantidade");

        jTFUnitario.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel39.setText("Valor unitario");

        jLabel40.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel40.setText("Valor Custo");

        jTFCusto.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jBtGravar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtGravar.setText("GRAVAR");
        jBtGravar.setActionCommand("gravar");
        jBtGravar.addActionListener(listener);
        /*
        jBtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGravarActionPerformed(evt);
            }
        });
        */

        jTFCodigo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel41.setText("Codigo");

        jBtnPesquisar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        /*
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });
        */
        jBtnPesquisar.setActionCommand("pesquisar");
        jBtnPesquisar.addActionListener(listener);

        jBtnAlterar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtnAlterar.setText("Alterar");
        /*
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });
        */
        jBtnAlterar.setActionCommand("alterar");
        jBtnAlterar.addActionListener(listener);

        jBtnLimpar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtnLimpar.setText("Limpar");
        jBtnLimpar.setActionCommand("limpar");
        jBtnLimpar.addActionListener(listener);
        /*
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });
        */

        jBtnExcluir.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtnExcluir.setText("EXCLUIR");
        /*
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });
        */
        jBtnExcluir.setActionCommand("excluir");
        jBtnExcluir.addActionListener(listener);

        jTFMarca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel42.setText("Marca");

        jTFFornecedor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel43.setText("Fornecedor");

        jTextPaneDescricao.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jTextPaneDescricao);

        jLabel44.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel44.setText("Descrição do produto");

        jTFQtdCritica.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel45.setText("Quantidade critica");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jTFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jTFQtdCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jBtnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnPesquisar)))
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtGravar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jLabel37)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFQtdCritica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel45))
                        .addGap(37, 37, 37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(jLabel39))
                            .addGap(37, 37, 37)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(160, 30, 978, 364);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGravarActionPerformed


    }//GEN-LAST:event_jBtGravarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed


    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed

    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed


    }//GEN-LAST:event_jBtnLimparActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed


    }//GEN-LAST:event_jBtnExcluirActionPerformed
    public void limparForm() {
        jTFNome.setText("");
        jTFQtd.setText("");
        jTFQtdCritica.setText("");
        jTFUnitario.setText("");
        jTFCusto.setText("");
        jTFCodigo.setText("");
        jTFMarca.setText("");
        jTFFornecedor.setText("");
        jTextPaneDescricao.setText("");
    }
    public String getCodigo() {
        if(jTFCodigo.getText().length() == 0 || jTFCodigo.getText() == null){
            return null;
        }else{
            return jTFCodigo.getText();
        }
    }

    public Float getValCusto() {
        if(jTFCusto.getText().length() == 0 || jTFCusto.getText() == null){
            return null;
        }else{
            return Float.parseFloat(jTFCusto.getText());
        }
    }

    public String getFornecedor() {
        if(jTFFornecedor.getText().length() == 0 || jTFFornecedor.getText() == null){
            return null;
        }else{
            return jTFFornecedor.getText();
        }
    }

    public String getMarca() {
        if(jTFMarca.getText().length() == 0 || jTFMarca.getText() == null){
            return null;
        }else{
            return jTFMarca.getText();
        }
    }

    public String getNome() {
        if(jTFNome.getText().length() == 0 || jTFNome.getText() == null){
            return null;
        }else{
            return jTFNome.getText();
        }
    }

    public int getQtd() {

         if(jTFQtd.getText().length() == 0 || jTFQtd.getText() == null){
            return 0;
        }else{
            return Integer.parseInt(jTFQtd.getText());
        }
    }

    public int getQtdCritica() {
        if(jTFQtdCritica.getText().length() == 0 || jTFQtdCritica.getText() == null){
            return 0;
        }else{
            return Integer.parseInt(jTFQtdCritica.getText());
        }
    }

    public Float getValUnitario() {
        if(jTFUnitario.getText().length() == 0 || jTFUnitario.getText() == null){
            return null;
        }else{
            return Float.parseFloat(jTFUnitario.getText());
        }
    }

    public String getjDescricao() {
        if(jTextPaneDescricao.getText().length() == 0 || jTextPaneDescricao.getText() == null){
            return null;
        }else{
            return jTextPaneDescricao.getText();
        }
    }

    public void setjTFCodigo(String recebido,CadastroProdutoJIF  classe) {
        classe.jTFCodigo.setText(recebido) ;
    }

    public void setjTFCusto(Float recebido,CadastroProdutoJIF  classe) {
        classe.jTFCusto.setText(String.valueOf(recebido));
    }

    public void setjTFFornecedor(String recebido, CadastroProdutoJIF  classe) {
        classe.jTFFornecedor.setText(recebido);
    }

    public void setjTFMarca(String recebido, CadastroProdutoJIF  classe) {
        classe.jTFMarca.setText(recebido);
    }

    public void setjTFNome(String recebido, CadastroProdutoJIF  classe) {
        classe.jTFNome.setText(recebido);
    }

    public void setjTFQtd(int recebido, CadastroProdutoJIF  classe) {
        classe.jTFQtd.setText(String.valueOf(recebido));
    }

    public void setjTFQtdCritica(int recebido, CadastroProdutoJIF  classe) {
        classe.jTFQtdCritica.setText(String.valueOf(recebido));
    }

    public void setjTFUnitario(Float recebido, CadastroProdutoJIF  classe) {
        classe.jTFUnitario.setText(String.valueOf(recebido));
    }

    public void setjTPDescricao(String recebido, CadastroProdutoJIF  classe) {
        classe.jTextPaneDescricao.setText(recebido);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtGravar;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCusto;
    private javax.swing.JTextField jTFFornecedor;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFQtd;
    private javax.swing.JTextField jTFQtdCritica;
    private javax.swing.JTextField jTFUnitario;
    private javax.swing.JTextPane jTextPaneDescricao;
    // End of variables declaration//GEN-END:variables
}
