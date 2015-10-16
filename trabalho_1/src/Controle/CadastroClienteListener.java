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
        //CadastroClienteJIF c = new CadastroClienteJIF();

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
