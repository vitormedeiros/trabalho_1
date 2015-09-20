package trabalho_1;

import Visao.LoginJFrame;

public class Trabalho_1 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });

    }

}
