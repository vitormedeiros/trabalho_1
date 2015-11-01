package Controle;

import Modelo.LoginControl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Visao.LoginJFrame;
import Visao.jPrincipal;
import javax.swing.JOptionPane;

public class LoginListener implements ActionListener {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    LoginControl lCtr = new LoginControl();
    private LoginJFrame frame;

    public LoginListener(LoginJFrame frame) {
        this.frame = frame;

    }

    public void Valida() throws Exceptions {
        String senha = lCtr.getSenha();
        String login = lCtr.getLogin();
        
        if(login.length() == 0){
            throw new Exceptions("Informar LOGIN!");
        }else if(senha.length() == 0){
            throw new Exceptions("Informar SENHA!");
        }else{
            new jPrincipal().setVisible(true);
            ultimoLogin.UltimoUsuarioLogin(frame.getUsuario());
            frame.dispose();
        }

    }

    public void actionPerformed(ActionEvent evento) {
        if ("entrar".equals(evento.getActionCommand())) {
            lCtr.setSenha(frame.getSenha());
            lCtr.setLogin(frame.getUsuario());
            
            try{
            Valida();
            }catch(Exceptions e){
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro " , JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(frame, "Usuario ou senha Incorretos !");
        }
    }

    public void GravaUltimoLogin() {

    }
}
