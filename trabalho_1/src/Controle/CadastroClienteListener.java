package Controle;

import Visao.CadastroClienteJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CadastroClienteListener implements ActionListener {

    public CadastroClienteJIF frame;
     

    public CadastroClienteListener(CadastroClienteJIF frame) {
        this.frame = frame;
    }
    
     public void actionPerformed(ActionEvent evento) {
     
     
     if ("botaoNovo".equals(evento.getActionCommand())) {
        
         CadastroClienteJIF c = new CadastroClienteJIF(); 
         c.SetaEnable();
           }
     }
    
    
    
}
