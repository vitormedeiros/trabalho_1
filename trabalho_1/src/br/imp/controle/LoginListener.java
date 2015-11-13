package br.imp.controle;

import br.imp.modelo.LoginModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.imp.visao.LoginJFrame;
import br.imp.visao.jPrincipal;
import javax.swing.JOptionPane;

public class LoginListener implements ActionListener {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    LoginModelo loginControl = new LoginModelo();
    private LoginJFrame frame;

    public LoginListener(LoginJFrame frame) {
        this.frame = frame;

    }

    public void validar() throws Exceptions {
        String senha = loginControl.getSenha();
        String login = loginControl.getLogin();

        if (login.length() == 0) {
            throw new Exceptions("Informar LOGIN!");
        } else if (senha.length() == 0) {
            throw new Exceptions("Informar SENHA!");
        } else {

            new jPrincipal().setVisible(true);

            //grava o ultimo login
            ultimoLogin.UltimoUsuarioLogin(frame.getUsuario());
            frame.dispose();
        }

    }

    public void actionPerformed(ActionEvent evento) {
        if ("entrar".equals(evento.getActionCommand())) {
            loginControl.setSenha(frame.getSenha());
            loginControl.setLogin(frame.getUsuario());

            try {
                validar();
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("sair".equals(evento.getActionCommand())) {
            frame.dispose();
        }
    }

}
