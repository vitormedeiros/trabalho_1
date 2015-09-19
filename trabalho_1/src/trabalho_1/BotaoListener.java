
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import trabalho_1.LoginJFrame;

public class BotaoListener implements ActionListener {

    private LoginJFrame frame;

    public BotaoListener(LoginJFrame frame){
        this.frame = frame;
    }
    
    public void actionPerformed(ActionEvent evento) {
        if ("entrar".equals(evento.getActionCommand())) {
              frame.getSenha();
              frame.getUsuario();
        }
    }
    /*
     if (evento.getSource() == entrar) {
     JOptionPane.showMessageDialog(null, "O botão Entrar foi clicado");
     }
     String usuariotxt = jTextFieldlogin.getText();
     String senhatxt = jPasswordFieldsenha.getText();
     if ("admin".equals(usuariotxt)) {
     if ("admin".equals(senhatxt)) {
     new jPrincipal().setVisible(true);
     setVisible(false); // Aqui temos que implementar o DISPOSE ainda!
     }
     } else {
     JOptionPane.showMessageDialog(null, "O Nome de usuário ou senha incorretos.");
     }

     if (evento.getSource() == cancelar) {
     JOptionPane.showMessageDialog(null, "O botão Cancelar foi clicado");
     }
     if (evento.getSource() == informacao) {
     JOptionPane.showMessageDialog(null, "O botão Informação foi clicado");
     }*/

}
