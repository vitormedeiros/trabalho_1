package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Visao.LoginJFrame;
import Visao.jPrincipal;
import javax.swing.JOptionPane;

public class LoginListener implements ActionListener {

    private LoginJFrame frame;

    public LoginListener(LoginJFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent evento) {
        if ("entrar".equals(evento.getActionCommand())) {
            frame.getSenha();
            frame.getUsuario();
            new jPrincipal().setVisible(true);
            frame.dispose();
        } else {
            JOptionPane.showMessageDialog(frame, "teste");
        }
    }
}
