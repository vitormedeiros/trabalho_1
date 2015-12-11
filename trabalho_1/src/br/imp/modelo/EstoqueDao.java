package br.imp.modelo;

import br.imp.controle.Conexao;
import br.imp.controle.Exceptions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EstoqueDao {
    Conexao conex = new Conexao();
    
   public CadProdutoModelo getProduto(CadProdutoModelo produto) throws Exceptions{
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao where codigo = 456789";
            ps = conn.prepareStatement(sql);
            //ps.setString(1, produto.getCodigo());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                CadProdutoModelo newProdModelo = new CadProdutoModelo();
                newProdModelo.setCodigo(rs.getString(1));
                newProdModelo.setMarca(rs.getString(2));
                newProdModelo.setFornecedor(rs.getString(3));
                newProdModelo.setQtd(rs.getInt(4));
                newProdModelo.setQtdCritica(rs.getInt(5));
                newProdModelo.setValorCusto(rs.getFloat(6));
                newProdModelo.setValorUnitario(rs.getFloat(7));
                newProdModelo.setDescricaoProd(rs.getString(8));
               
                return newProdModelo;
            }
        } catch(SQLException e) {
             throw new Exceptions("Não foi selecionar os produto!\n     Erro: " + e.getMessage());
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
        return null;

    }
}
