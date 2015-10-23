
package Controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class UltimoUsuarioLogin {
// gravando arquivo
    public void UltimoUsuarioLogin(String textoArquivo) {
        FileWriter fileWriter = null;
     
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("LoginUltimoAcesso.dat",false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textoArquivo);
            bufferedWriter.flush();  
        } catch (IOException ex) {
            //falta criar o arquivo log para mandar as 
            //informações se esta gravando ou não o ultimo usuario
        } 
    }
    
    // lendo o arquivo e setando no campo de login do usuario
    
     public String lerArquivo() {
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
        } catch (IOException ex) {
        } 
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                }
            }
        return null;
     }
        
}

