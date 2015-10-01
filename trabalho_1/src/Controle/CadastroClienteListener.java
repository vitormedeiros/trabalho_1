package Controle;

import Visao.CadastroClienteJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CadastroClienteListener implements ActionListener {

    public CadastroClienteJIF frame;
    

    public CadastroClienteListener(CadastroClienteJIF frame) {
        this.frame = frame;
    }
    
     public void actionPerformed(ActionEvent evento) {
     
     
     if ("botaoNovo".equals(evento.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "entrou");
         
           
    /*buttonGroup1
    jButtoneditar
    jButtonexcluir;
    jButtonnovo;
    jButtonpesquisa;
    jButtonsair;
    jButtonsalvar;
    jLabelcod;
    jLabelcpf;
    jLabelnome;
    jLabelrg;
    jLabeltelefone;
    jPanel1;
    jPanel2;
    jPanel3;
    jPanel4;
    jRadioButtonstatusativo;
    jRadioButtonstatusinativo;
    jScrollPane1;
    jTextAreaendereco;
    jTextFieldcod;
    jTextFieldcpf;
    jTextFieldnome;
    jTextFieldrg;
    jTextFieldtelefone;*/
            
        }
     
     
     }
    
    
    
}
