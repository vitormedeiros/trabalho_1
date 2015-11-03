package Controle;

import Modelo.DataEhora;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Log {

    DataEhora dH = new DataEhora();

    public Log(String textoArquivo) {
        FileWriter fileWriter = null;

        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("Log.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bufferedWriter);
            pw.println(textoArquivo + dH.getDataFormatada() + " �s " + dH.getHoraFormatada());
            bufferedWriter.flush();
            bufferedWriter.close();
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
        }
    }
}
