package br.imp.modelo;

import br.imp.controle.Conexao;
import br.imp.controle.Exceptions;
import br.imp.visao.EstoqueJIFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroProdutoDao {

    public void delete(String codigo) {
        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "delete from produtos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Codigo inesistente!");

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Codigo inesistente!");
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Codigo inesistente!");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Codigo inesistente!");
                }
            }
        }
    }

    public void insert(CadProdutoModelo produto) {
        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "insert into produtos (codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao) "
                    + "values(?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getCodigo());
            ps.setString(2, produto.getNome());
            ps.setString(3, produto.getMarca());
            ps.setString(4, produto.getFornecedor());
            ps.setInt(5, produto.getQtd());
            ps.setInt(6, produto.getQtdCritica());
            ps.setFloat(7, produto.getValorCusto());
            ps.setFloat(8, produto.getValorUnitario());
            ps.setString(9, produto.getDescricaoProd());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void atualizar(CadProdutoModelo produto) {
        Connection conn = null;
        Conexao conex = new Conexao();
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "update produtos set  nome=?, marca=?, fornecedor=?, quantidade=?, qtd_critica=?, val_custo=?, val_unitario=?, descricao=? where codigo = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getMarca());
            ps.setString(3, produto.getFornecedor());
            ps.setInt(4, produto.getQtd());
            ps.setInt(5, produto.getQtdCritica());
            ps.setFloat(6, produto.getValorCusto());
            ps.setFloat(7, produto.getValorUnitario());
            ps.setString(8, produto.getDescricaoProd());
            ps.setString(9, produto.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public CadProdutoModelo getProduto(CadProdutoModelo produto, EstoqueJIFrame instance) {
        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = null;
        try {
        switch (instance.getOpcao()) {
            case "codigo": 
               sql = "select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao from produtos where codigo = '" + produto.getCodigo() + "'";
            break;
                
            case "nome":
                sql = "select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao from produtos where nome = '" + produto.getNome()+ "'";
            break;
            case "marca":
                sql = "select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao from produtos where marca = '" + produto.getMarca()+ "'";
            break;
            case "fornecedor":
               sql = "select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao from produtos where fornecedor = '" + produto.getFornecedor()+ "'"; 
            break;
            case "quantidade":
                sql = "select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao from produtos where quantidade = " + produto.getQtd()+ "";
            break;
            case "qtdCritica":
                sql = "select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao from produtos where qtd_critica = " + produto.getQtdCritica()+ "";
            break;
            case "valorUnitario": 
                sql = "select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao from produtos where val_unitario = " + produto.getValorUnitario()+ "";
            break;
            default: JOptionPane.showMessageDialog(null, "Opção invalida!");
        }

        
            conn = conex.getConnection();
            
            //Preenche tabela
            instance.preencherTabela(sql);
            ps = conn.prepareStatement(sql);
            //ps.setString(1, produto.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                CadProdutoModelo newProdModelo = new CadProdutoModelo();
                newProdModelo.setCodigo(rs.getString(1));
                newProdModelo.setNome(rs.getString(2));
                newProdModelo.setMarca(rs.getString(3));
                newProdModelo.setFornecedor(rs.getString(4));
                newProdModelo.setQtd(rs.getInt(5));
                newProdModelo.setQtdCritica(rs.getInt(6));
                newProdModelo.setValorCusto(rs.getFloat(7));
                newProdModelo.setValorUnitario(rs.getFloat(8));
                newProdModelo.setDescricaoProd(rs.getString(9));

                return newProdModelo;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
        }
        return null;

    }
}
