package br.imp.modelo;

import br.imp.controle.Conexao;
import br.imp.controle.Exceptions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDao {

    Conexao conn = new Conexao();
    LoginModelo logMod = new LoginModelo();

    public void delete(LoginModelo l) throws Exception {
        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "delete from produtos where LOGIN = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, logMod.getLogin());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void insert(LoginModelo login) throws Exception {
         Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "insert into LOGIN (ID_LOGION, LOGIN, SENHA) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, login.getCodigo());
            ps.setString(2, login.getLogin());
            ps.setString(3, login.getSenha());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(LoginModelo login) {
        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "update LOGIN set LOGIN = ?, SENHA = ? where ID_LOGIN = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getLogin());
            ps.setString(2, login.getSenha());
            ps.setInt(2, login.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public boolean exists(LoginModelo login) throws Exceptions {
        boolean condicao = false;
        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = conex.getConnection();
            String sql = "select nome_acesso from login_user where senha = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getSenha());
            ResultSet rs = ps.executeQuery();
            rs.next();
            String nome = rs.getString(1);
            condicao = true;

        } catch (SQLException e) {
            condicao = false;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"USUARIO OU SENHA INVALIDO");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"USUARIO OU SENHA INVALIDO");
                }
            }
        }
        return condicao;

    }

}
