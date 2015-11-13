/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.imp.controle;

import br.imp.modelo.LoginModelo;
import br.imp.visao.CadastroProdutoJIF;
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
    
    Log lG;
    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    
    private CadastroProdutoJIF frame;
    
    public CadastroProdutoListener(CadastroProdutoJIF frame) {
        this.frame = frame;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
       
        if("limpar".equals(evento.getActionCommand())){
            frame.LimparForm();
            // salva log
            lG = new Log(ultimoLogin.lerArquivo() + " limpou formulario");
            
        }else {
            try {
                throw new Exceptions("Não foi possivel limpar o  formulario!");
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro " , JOptionPane.ERROR_MESSAGE);
            } 
        }
    }

    
    
}
