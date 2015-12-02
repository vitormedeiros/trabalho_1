package br.imp.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/impsoftwaredb", "sa", "");
            JOptionPane.showMessageDialog(null,"Conectado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Problemas ao conectar no banco de dados");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"O driver não foi configurado corretametne");
        }

        return conn;
    }
}
