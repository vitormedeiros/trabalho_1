package br.imp.modelo;

import br.imp.controle.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginDao {
    /**Implementar a funcionalidade para inserir uma pessoa no banco de dados*/
    public void insert(LoginModelo l) throws Exception {
        
    }
    Conexao conn = new Conexao();
    LoginModelo logMod = new LoginModelo();

    /**Implementar a funcionalidade para atualizar uma pessoa no banco de dados*/
    public void update(LoginModelo l) throws Exception {
    }

    /**Implementar a funcionalidade para excluir uma pessoa no banco de dados*/
    public void delete(LoginModelo l) throws Exception {
         Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from produtos where LOGIN = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, logMod.getLogin());
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

    /**Implementar a funcionalidade para verificar se a pessoa informa existe no banco de dados*/
    public boolean exists(LoginModelo l) throws Exception {
        return false;
    }

}
