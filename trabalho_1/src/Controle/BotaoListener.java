package Controle;

/**/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Visao.LoginJFrame;
import Visao.LoginJFrame;
import javax.swing.JOptionPane;

public class BotaoListener implements ActionListener {

    private LoginJFrame frame;

    public BotaoListener(LoginJFrame frame){
        this.frame = frame;
    }
    
    public void actionPerformed(ActionEvent evento) {
        if ("entrar".equals(evento.getActionCommand())) {
              frame.getSenha();
              frame.getUsuario();
              JOptionPane.showMessageDialog(frame, "ola");
        }else{
             JOptionPane.showMessageDialog(frame, "Não entrou no if");
        }
    }
}

