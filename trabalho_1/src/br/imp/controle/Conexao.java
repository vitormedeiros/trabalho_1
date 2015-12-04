package br.imp.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {

    Connection conn = null;
    public Statement stm;//preparar e realizar pesquisas no banco de dados
    public ResultSet rs;//armasenar o rasultado de uma pesquisa pasada para o Statement

    public Connection getConnection() {

        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/impsoftwaredb", "sa", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao conectar no banco de dados");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "O driver não foi configurado corretametne");
        }

        return conn;
    }
    
    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO DE EXECUÇÃO SQL! \n ERRO " + ex.getMessage());
        }
    }
    
    public void desconecta(){// FECHA A CONEXÃO COM O BANCO DE DADOS   
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "DESCONECTADO COM SUCESSO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FECHAR A CONEXÃO! \n ERRO " + ex.getMessage());
        }
    }

   
}
