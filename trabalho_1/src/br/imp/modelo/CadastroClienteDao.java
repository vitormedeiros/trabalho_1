package br.imp.modelo;

import br.imp.controle.Conexao;
import br.imp.visao.CadastroClienteJIF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroClienteDao {

public void delete(String codigo) {
        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "delete from clientes where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.execute();

            conn.commit();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"Codigo inesistente!");

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"Codigo inesistente!");
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"Codigo inesistente!");
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"Codigo inesistente!");
                }
            }
        }
    }

    public void insert(CadastroClienteModelo cliente) {
         Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "insert into clientes (codigo, nome, rg, cpf, telefone) "
                    + "values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getCod());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getCpf());
            ps.setString(5, cliente.getTelefone());
            ps.execute();

            conn.commit();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
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
    public void atualizar(CadastroClienteModelo cliente) {
        Connection conn = null;
        Conexao conex = new Conexao();
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "update clientes set codigo=?, nome=?, rg=?, cpf=?, telefone=? where codigo = " + cliente.getCod() + "";
            JOptionPane.showMessageDialog(null, cliente.getCod());
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getCod());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getCpf());
            ps.setString(5, cliente.getTelefone());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"ERRO: " + e.getMessage());

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

    
}
