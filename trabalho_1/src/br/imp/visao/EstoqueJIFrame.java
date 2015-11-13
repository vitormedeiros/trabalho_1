package br.imp.visao;

import br.imp.controle.EstoqListener;
import br.imp.controle.Log;
import br.imp.controle.UltimoUsuarioLogin;
import java.awt.Color;

public class EstoqueJIFrame extends javax.swing.JInternalFrame {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    public EstoqListener listener = new EstoqListener(this);

    public EstoqueJIFrame() {
        initComponents();
        //Log de navegação
        log = new Log("Usuario " + ultimoLogin.lerArquivo() + " entrou no Estoque de Produtos no dia ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGPesquisa = new javax.swing.ButtonGroup();
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
        jTFCodigo = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jTFMarca = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTFFornecedor = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneDescricao = new javax.swing.JTextPane();
        jLabel44 = new javax.swing.JLabel();
        jBtnQtdProdutosEstoque = new javax.swing.JButton();
        jTFQtdCritica = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jPanelPesquisa = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRBtnQtd = new javax.swing.JRadioButton();
        jRBtnValUnitario = new javax.swing.JRadioButton();
        jRBtnQtdCritica = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Estoque");
        setToolTipText("Estoque");

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Estoque");

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
        jBtnLimpar.setActionCommand("pesquisar");
        jBtnLimpar.addActionListener(listener);

        jBtnLimpar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtnLimpar.setText("Limpar");
        /*
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });
        */
        jBtnLimpar.setActionCommand("limpar");
        jBtnLimpar.addActionListener(listener);

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

        jBtnQtdProdutosEstoque.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jBtnQtdProdutosEstoque.setText("Qtd produtos estoque");
        /*
        jBtnQtdProdutosEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnQtdProdutosEstoqueActionPerformed(evt);
            }
        });
        */
        jBtnLimpar.setActionCommand("qtdProdutosEstoq");
        jBtnLimpar.addActionListener(listener);

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
                        .addComponent(jBtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnQtdProdutosEstoque))
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
                            .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jTFQtdCritica, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jTFUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel38)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTFQtdCritica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnQtdProdutosEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jPanelPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perquisar por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Codigo");
        jRadioButton1.setActionCommand("codigo");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRadioButton2.setText("Nome");
        jRadioButton2.setActionCommand("nome");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRadioButton3.setText("Marca");
        jRadioButton3.setActionCommand("marca");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRadioButton4.setText("Fornecedor");
        jRadioButton4.setActionCommand("fornecedor");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });

        jRBtnQtd.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBtnQtd);
        jRBtnQtd.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBtnQtd.setText("Quantidade");
        jRBtnQtd.setActionCommand("quantidade");
        jRBtnQtd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBtnQtdMouseClicked(evt);
            }
        });

        jRBtnValUnitario.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBtnValUnitario);
        jRBtnValUnitario.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBtnValUnitario.setText("Valor Unitario");
        jRBtnValUnitario.setActionCommand("valorUnitario");
        jRBtnValUnitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBtnValUnitarioMouseClicked(evt);
            }
        });
        jRBtnValUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnValUnitarioActionPerformed(evt);
            }
        });

        jRBtnQtdCritica.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBtnQtdCritica);
        jRBtnQtdCritica.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBtnQtdCritica.setText("Quantidade Critica");
        jRBtnQtdCritica.setActionCommand("qtdCritica");
        jRBtnQtdCritica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBtnQtdCriticaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRBtnQtd)
                .addGap(18, 18, 18)
                .addComponent(jRBtnQtdCritica)
                .addGap(18, 18, 18)
                .addComponent(jRBtnValUnitario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRBtnQtd)
                    .addComponent(jRBtnValUnitario)
                    .addComponent(jRBtnQtdCritica))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanelPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(435, 435, 435))
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        setBounds(220, 3, 986, 724);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed


    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed

        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);

    }//GEN-LAST:event_jBtnLimparActionPerformed

    private void jBtnQtdProdutosEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnQtdProdutosEstoqueActionPerformed

    }//GEN-LAST:event_jBtnQtdProdutosEstoqueActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked

    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        jTFCodigo.setBackground(Color.lightGray);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);

    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.lightGray);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.lightGray);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.lightGray);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jRBtnQtdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBtnQtdMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.lightGray);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRBtnQtdMouseClicked

    private void jRBtnValUnitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBtnValUnitarioMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.lightGray);
    }//GEN-LAST:event_jRBtnValUnitarioMouseClicked

    private void jRBtnValUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnValUnitarioActionPerformed

    }//GEN-LAST:event_jRBtnValUnitarioActionPerformed

    private void jRBtnQtdCriticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBtnQtdCriticaMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.lightGray);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRBtnQtdCriticaMouseClicked
    public void LimparForm() {
        jTFNome.setText("");
        jTFQtd.setText("");
        jTFUnitario.setText("");
        jTFCusto.setText("");
        jTFCodigo.setText("");
        jTFMarca.setText("");
        jTFFornecedor.setText("");
        jTextPaneDescricao.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGPesquisa;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jBtnQtdProdutosEstoque;
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
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JRadioButton jRBtnQtd;
    private javax.swing.JRadioButton jRBtnQtdCritica;
    private javax.swing.JRadioButton jRBtnValUnitario;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCusto;
    private javax.swing.JTextField jTFFornecedor;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFQtd;
    private javax.swing.JTextField jTFQtdCritica;
    private javax.swing.JTextField jTFUnitario;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextPane jTextPaneDescricao;
    // End of variables declaration//GEN-END:variables

}
