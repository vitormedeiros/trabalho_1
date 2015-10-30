
package Controle;

import Visao.EstoqueJIFrame;
import Visao.LoginJFrame;
import Visao.jPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EstoqListener implements ActionListener{
    private EstoqueJIFrame frame;

    public EstoqListener(EstoqueJIFrame frame) {
        this.frame = frame;
        
    }

    public void actionPerformed(ActionEvent evento) {
        if ("limparForm".equals(evento.getActionCommand())) {
            frame.LimparForm();
            JOptionPane.showMessageDialog(null, "entrou no **********");
            
        }else if("pesquisar".equals(evento.getActionCommand())){
        
        }else if("qtdProdutosEstoq".equals(evento.getActionCommand())){
        
        }else {
            JOptionPane.showMessageDialog(frame, "Usuario ou senha Incorretos !");
        }
    }
}
