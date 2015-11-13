package br.imp.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class DataEhora {

    private String dataFormatada;
    private String horaFormatada;

    public String getDataFormatada() {
        PegarData();
        return dataFormatada;
    }

    public String getHoraFormatada() {
        PegarHora();
        return horaFormatada;
    }

    public void PegarData() {
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dataAtual = new java.util.Date();
        dataFormatada = data.format(dataAtual);

    }

    public void PegarHora() {
        DateFormat hora = new SimpleDateFormat("HH:mm");
        java.util.Date horaAtual = new java.util.Date();
        horaFormatada = hora.format(horaAtual);

    }

}
