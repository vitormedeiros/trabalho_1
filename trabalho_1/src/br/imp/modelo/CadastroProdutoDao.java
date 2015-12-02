
package br.imp.modelo;

import br.imp.controle.Conexao;
import br.imp.controle.Exceptions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroProdutoDao {
    public void delete(CadProdutoModelo produto) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from produtos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getCodigo());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void insert(CadProdutoModelo produto) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
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
            ps.setString(9,  produto.getDescricaoProd());
            ps.execute();

            conn.commit();

        } catch(SQLException e) {

            JOptionPane.showMessageDialog(null,"erro " + e.getMessage());
            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }
        }
    }

 /*  public void update(Produto produto) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update produtos set descricao = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getDescricao());
            ps.setInt(2, produto.getCodigo());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }



    public List<Produto> getAll() {
        List<Produto> lista = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, descricao from produtos";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo = rs.getInt(1);
                String descricao = rs.getString(2);
                Produto p = new Produto();
                p.setCodigo(codigo);
                p.setDescricao(descricao);
                lista.add(p);
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public Produto getProduto(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, descricao from produtos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Integer cod = rs.getInt(1);
                String descricao = rs.getString(2);
                Produto p = new Produto();
                p.setCodigo(cod);
                p.setDescricao(descricao);
                return p;
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }*/
}
