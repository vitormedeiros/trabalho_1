package br.imp.controle;

import br.imp.modelo.LoginDao;
import br.imp.modelo.LoginModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.imp.visao.LoginJFrame;
import br.imp.visao.jPrincipal;
import javax.swing.JOptionPane;

public class LoginListener implements ActionListener {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    LoginModelo loginModelo = new LoginModelo();
    private LoginJFrame frame;

    public LoginListener(LoginJFrame frame) {
        this.frame = frame;
    }

    public void validar() throws Exceptions{
        String senha = loginModelo.getSenha();
        String login = loginModelo.getLogin();

        if (login.length() == 0) {
            throw new Exceptions("Informar LOGIN!");
        } else if (senha.length() == 0) {
            throw new Exceptions("Informar SENHA!");
        } else {
            LoginDao validaBanco = new LoginDao();
            boolean condicao = validaBanco.exists(loginModelo);
            if(condicao == true){
                 
                ultimoLogin.UltimoUsuarioLogin(frame.getUsuario());
                frame.dispose();
                new jPrincipal().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"USUARIO OU SENHA INVALIDO");
            }
           
        }
    }

    public void actionPerformed(ActionEvent evento) {
        if ("entrar".equals(evento.getActionCommand())) {
            loginModelo.setSenha(frame.getSenha());
            loginModelo.setLogin(frame.getUsuario());

            try {
                validar();
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(), "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("sair".equals(evento.getActionCommand())) {
            frame.dispose();
        }
    }

}
