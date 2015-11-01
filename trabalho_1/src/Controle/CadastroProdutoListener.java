/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Visao.CadastroProdutoJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    @Override
    public void actionPerformed(ActionEvent evento) {
       
        if("limpar".equals(evento.getActionCommand())){
            frame.LimparForm();
        }else {
            JOptionPane.showMessageDialog(frame, "Não foi possivel limpar o  formulario!");
        }
    }

    
    
}
