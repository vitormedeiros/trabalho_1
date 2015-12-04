    package br.imp.modelo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(){
     
    }
    
    public Object getConteudoLinha(int line){
        return linhas.get(line);
    }
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }
    public ArrayList getLinhas(){
        return linhas;
    }
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    public String[] getColunas(){
        return colunas;
    }
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    public int getColumnCount(){
        return colunas.length; //retorna a quantidade de elementos no vetor de String
    }
    public int getRowCount(){
        return linhas.size(); //retorna a quantidade de elementos que tem no array
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[]) getLinhas().get(numLin);
        return linha[numCol];
    }
}
