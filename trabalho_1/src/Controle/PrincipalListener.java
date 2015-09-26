package Controle;
import Visao.CadastroCliente;
import Visao.jPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class PrincipalListener implements ActionListener {
   // CadastroCliente cadastroCliente = new CadastroCliente();
    
   public jPrincipal frame;
   public PrincipalListener(jPrincipal frame) {
        this.frame = frame;
    }
   
   public void actionPerformed(ActionEvent evento) {
       if("cadastroCliente".equals(evento.getActionCommand())){
         new CadastroCliente().setVisible(true);
           JOptionPane.showMessageDialog(null, "OII");
       }
   }
}
