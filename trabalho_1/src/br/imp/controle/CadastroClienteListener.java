package br.imp.controle;

import br.imp.visao.CadastroClienteJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroClienteListener implements ActionListener {
    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    
    public CadastroClienteJIF frame;

    public CadastroClienteListener(CadastroClienteJIF frame) {
        this.frame = frame;
    }


    public void actionPerformed(ActionEvent evento) {

        if ("botaoNovo".equals(evento.getActionCommand())) {
            frame.LimpaForm();
            frame.SetaEnable(true);
        }
        if ("botaoSair".equals(evento.getActionCommand())) {
            frame.Sair();
        }
        if ("botaoCancelar".equals(evento.getActionCommand())) {
            frame.SetaEnable(false);
        }
    }

}
