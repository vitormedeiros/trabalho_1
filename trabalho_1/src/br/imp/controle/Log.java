package br.imp.controle;

import br.imp.modelo.DataEhora;
import java.io.BufferedWriter;
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
            pw.println(textoArquivo + dH.getDataFormatada() + " às " + dH.getHoraFormatada());
            bufferedWriter.flush();
            bufferedWriter.close();
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
        }
    }
}
