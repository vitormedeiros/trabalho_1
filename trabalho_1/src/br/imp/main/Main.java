package br.imp.main;

import br.imp.controle.Exceptions;
import br.imp.visao.LoginJFrame;

public class Main {

    public static void main(String[] args) throws Exceptions {
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
    }

}
