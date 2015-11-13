package br.imp.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DataEhora {

    private String dataFormatada;
    private String horaFormatada;

    public String getDataFormatada() {
        pegarData();
        return dataFormatada;
    }

    public String getHoraFormatada() {
        pegarHora();
        return horaFormatada;
    }

    public void pegarData() {
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dataAtual = new java.util.Date();
        dataFormatada = data.format(dataAtual);

    }

    public void pegarHora() {
        DateFormat hora = new SimpleDateFormat("HH:mm");
        java.util.Date horaAtual = new java.util.Date();
        horaFormatada = hora.format(horaAtual);

    }

}
