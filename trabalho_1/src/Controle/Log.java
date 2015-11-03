package Controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Log {
     public Log(String textoArquivo) {
        FileWriter fileWriter = null;
     
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("Log.txt",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter (bufferedWriter);  
            pw.println(textoArquivo);
            bufferedWriter.flush();
            bufferedWriter.close();
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro " , JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    // lendo o arquivo e setando no campo de login do usuario
    
    /* public String lerArquivo(){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("LoginUltimoAcesso.dat");
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
            while (bufferedReader.ready()) {
                sb.append(bufferedReader.readLine());
            }
            return sb.toString();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro " , JOptionPane.ERROR_MESSAGE);
        } 
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro " , JOptionPane.ERROR_MESSAGE);
                }
            }
        return null;
     }*/
}
