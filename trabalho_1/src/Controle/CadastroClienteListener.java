package Controle;

import Visao.CadastroClienteJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroClienteListener implements ActionListener {

    public CadastroClienteJIF frame;

    public CadastroClienteListener(CadastroClienteJIF frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent evento) {
        CadastroClienteJIF c = new CadastroClienteJIF();

        if ("botaoNovo".equals(evento.getActionCommand())) {

            c.LimpaForm();
        }
        if ("botaoSair".equals(evento.getActionCommand())) {
            c.Sair();
         }
    }

}
