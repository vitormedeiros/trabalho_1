package br.imp.visao;

import br.imp.controle.Conexao;
import br.imp.controle.EstoqListener;
import br.imp.controle.Log;
import br.imp.controle.UltimoUsuarioLogin;
import br.imp.modelo.ModeloTabela;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class EstoqueJIFrame extends javax.swing.JInternalFrame {
    ModeloTabela modTable = new ModeloTabela();
    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    public EstoqListener listener = new EstoqListener(this);
    Conexao con = new Conexao();

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
        jPanelPesquisa2 = new javax.swing.JPanel();
        jRBCodigo = new javax.swing.JRadioButton();
        jRBNome = new javax.swing.JRadioButton();
        jRBMarca = new javax.swing.JRadioButton();
        jRBFornecedor = new javax.swing.JRadioButton();
        jRBQuantidade = new javax.swing.JRadioButton();
        jRBValUnitario = new javax.swing.JRadioButton();
        jRBQtdCritica = new javax.swing.JRadioButton();

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
        jBtnPesquisar.setActionCommand("pesquisar");
        jBtnPesquisar.addActionListener(listener);

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
                .addContainerGap(25, Short.MAX_VALUE))
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

        jPanelPesquisa2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPesquisa2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perquisar por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        jRBCodigo.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBCodigo);
        jRBCodigo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBCodigo.setSelected(true);
        jRBCodigo.setText("Codigo");
        jRBCodigo.setActionCommand("codigo");
        jRBCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBCodigoMouseClicked(evt);
            }
        });
        jRBCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCodigoActionPerformed(evt);
            }
        });

        jRBNome.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBNome);
        jRBNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBNome.setText("Nome");
        jRBNome.setActionCommand("nome");
        jRBNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBNomeMouseClicked(evt);
            }
        });

        jRBMarca.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBMarca);
        jRBMarca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBMarca.setText("Marca");
        jRBMarca.setActionCommand("marca");
        jRBMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBMarcaMouseClicked(evt);
            }
        });

        jRBFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBFornecedor);
        jRBFornecedor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBFornecedor.setText("Fornecedor");
        jRBFornecedor.setActionCommand("fornecedor");
        jRBFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBFornecedorMouseClicked(evt);
            }
        });

        jRBQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBQuantidade);
        jRBQuantidade.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBQuantidade.setText("Quantidade");
        jRBQuantidade.setActionCommand("quantidade");
        jRBQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBQuantidadeMouseClicked(evt);
            }
        });

        jRBValUnitario.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBValUnitario);
        jRBValUnitario.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBValUnitario.setText("Valor Unitario");
        jRBValUnitario.setActionCommand("valorUnitario");
        jRBValUnitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBValUnitarioMouseClicked(evt);
            }
        });
        jRBValUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBValUnitarioActionPerformed(evt);
            }
        });

        jRBQtdCritica.setBackground(new java.awt.Color(255, 255, 255));
        btnGPesquisa.add(jRBQtdCritica);
        jRBQtdCritica.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRBQtdCritica.setText("Quantidade Critica");
        jRBQtdCritica.setActionCommand("qtdCritica");
        jRBQtdCritica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBQtdCriticaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisa2Layout = new javax.swing.GroupLayout(jPanelPesquisa2);
        jPanelPesquisa2.setLayout(jPanelPesquisa2Layout);
        jPanelPesquisa2Layout.setHorizontalGroup(
            jPanelPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisa2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jRBCodigo)
                .addGap(18, 18, 18)
                .addComponent(jRBNome)
                .addGap(18, 18, 18)
                .addComponent(jRBMarca)
                .addGap(18, 18, 18)
                .addComponent(jRBFornecedor)
                .addGap(18, 18, 18)
                .addComponent(jRBQuantidade)
                .addGap(18, 18, 18)
                .addComponent(jRBQtdCritica)
                .addGap(18, 18, 18)
                .addComponent(jRBValUnitario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPesquisa2Layout.setVerticalGroup(
            jPanelPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisa2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanelPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBCodigo)
                    .addComponent(jRBNome)
                    .addComponent(jRBMarca)
                    .addComponent(jRBFornecedor)
                    .addComponent(jRBQuantidade)
                    .addComponent(jRBValUnitario)
                    .addComponent(jRBQtdCritica))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPesquisa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanelPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jRBCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBCodigoMouseClicked
        jTFCodigo.setBackground(Color.lightGray);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);

    }//GEN-LAST:event_jRBCodigoMouseClicked

    private void jRBCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBCodigoActionPerformed

    private void jRBNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBNomeMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.lightGray);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRBNomeMouseClicked

    private void jRBMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBMarcaMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.lightGray);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRBMarcaMouseClicked

    private void jRBFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBFornecedorMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.lightGray);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRBFornecedorMouseClicked

    private void jRBQuantidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBQuantidadeMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.lightGray);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRBQuantidadeMouseClicked

    private void jRBValUnitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBValUnitarioMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.white);
        jTFUnitario.setBackground(Color.lightGray);
    }//GEN-LAST:event_jRBValUnitarioMouseClicked

    private void jRBValUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBValUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBValUnitarioActionPerformed

    private void jRBQtdCriticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBQtdCriticaMouseClicked
        jTFCodigo.setBackground(Color.white);
        jTFNome.setBackground(Color.white);
        jTFMarca.setBackground(Color.white);
        jTFFornecedor.setBackground(Color.white);
        jTFQtd.setBackground(Color.white);
        jTFQtdCritica.setBackground(Color.lightGray);
        jTFUnitario.setBackground(Color.white);
    }//GEN-LAST:event_jRBQtdCriticaMouseClicked
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
    
    public String getOpcao(){
        String opcao = btnGPesquisa.getSelection().getActionCommand();
        return opcao;
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

    public void setjTFCodigo(String recebido,EstoqueJIFrame  classe) {
        classe.jTFCodigo.setText(recebido) ;
    }

    public void setjTFCusto(Float recebido,EstoqueJIFrame  classe) {
        classe.jTFCusto.setText(String.valueOf(recebido));
    }

    public void setjTFFornecedor(String recebido, EstoqueJIFrame  classe) {
        classe.jTFFornecedor.setText(recebido);
    }

    public void setjTFMarca(String recebido, EstoqueJIFrame  classe) {
        classe.jTFMarca.setText(recebido);
    }

    public void setjTFNome(String recebido, EstoqueJIFrame  classe) {
        classe.jTFNome.setText(recebido);
    }

    public void setjTFQtd(int recebido, EstoqueJIFrame  classe) {
        classe.jTFQtd.setText(String.valueOf(recebido));
    }

    public void setjTFQtdCritica(int recebido, EstoqueJIFrame  classe) {
        classe.jTFQtdCritica.setText(String.valueOf(recebido));
    }

    public void setjTFUnitario(Float recebido, EstoqueJIFrame  classe) {
        classe.jTFUnitario.setText(String.valueOf(recebido));
    }

    public void setjTPDescricao(String recebido, EstoqueJIFrame  classe) {
        classe.jTextPaneDescricao.setText(recebido);
    }
    public void preencherTabela(String SQL) {
        con.getConnection();
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"CODIGO", "NOME", "QUANTIDADE", "PREÇO CUSTO", "PREÇO VENDA", "MARCA", "FORNECEDOR", "DESCR."};

        con.executaSQL(SQL);
        try {
            con.rs.first();
            do {
                dados.add(new Object[]{con.rs.getString("codigo"), con.rs.getString("nome"), con.rs.getInt("quantidade"), con.rs.getFloat("val_custo"),
                    con.rs.getFloat("val_unitario"), con.rs.getString("marca"), con.rs.getString("fornecedor"), con.rs.getString("descricao")});
            } while (con.rs.next());// Em quanto tiver dados

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane, "ERRO AO PREENCHER O ARRAYLIST! \n ERRO " + ex);
        }

        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        //logo abaixo é setado as configuraçoes visuais da tabela
        jTableProdutos.setModel(modelo);
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableProdutos.getColumnModel().getColumn(0).setResizable(true);
        jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTableProdutos.getColumnModel().getColumn(1).setResizable(true);
        jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTableProdutos.getColumnModel().getColumn(2).setResizable(true);
        jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTableProdutos.getColumnModel().getColumn(3).setResizable(true);
        jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(35);
        jTableProdutos.getColumnModel().getColumn(4).setResizable(true);
        jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(35);
        jTableProdutos.getColumnModel().getColumn(4).setResizable(true);
        jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTableProdutos.getColumnModel().getColumn(4).setResizable(true);
        jTableProdutos.getTableHeader().setReorderingAllowed(false);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        con.desconecta(); // desconecta a conexão com o banco de dados
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
    private javax.swing.JPanel jPanelPesquisa1;
    private javax.swing.JPanel jPanelPesquisa2;
    private javax.swing.JRadioButton jRBCodigo;
    private javax.swing.JRadioButton jRBFornecedor;
    private javax.swing.JRadioButton jRBMarca;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JRadioButton jRBQtdCritica;
    private javax.swing.JRadioButton jRBQuantidade;
    private javax.swing.JRadioButton jRBValUnitario;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
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
