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
         CadastroCliente c = new CadastroCliente();
         c.setVisible(true);
           frame.getjDesktopPane1().add(c);
                //.setVisible(true);
           JOptionPane.showMessageDialog(null, "OII");
       }
   }
}
