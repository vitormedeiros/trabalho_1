/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Visao.CadastroProdutoJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CadastroProdutoListener implements ActionListener{
    
    private CadastroProdutoJIF frame;
    
    public CadastroProdutoListener(CadastroProdutoJIF frame) {
        this.frame = frame;
    }

    public void limparFormulario(){
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
       
        if("limpar".equals(evento.getActionCommand())){
            frame.LimparForm();
        }else {
            try {
                throw new Exceptions("Não foi possivel limpar o  formulario!");
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro " , JOptionPane.ERROR_MESSAGE);
            }
         
            
        }
    }

    
    
}
