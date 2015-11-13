package br.imp.controle;

import br.imp.modelo.DataEhora;
import br.imp.visao.CadastroClienteJIF;
import br.imp.visao.CadastroProdutoJIF;
import br.imp.visao.EstoqueJIFrame;
import br.imp.visao.SobreJInternalFrame;
import br.imp.visao.jPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrincipalListener implements ActionListener {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;

    public jPrincipal frame;

    public PrincipalListener(jPrincipal frame) {
        this.frame = frame;

    }

    public void abrirCadastroClientes() throws Exceptions {

        CadastroClienteJIF c = new CadastroClienteJIF();
        c.setVisible(true);
        frame.getjDesktopPane1().add(c);
    }

    public void abrirSorbe() throws Exceptions {
        SobreJInternalFrame c = new SobreJInternalFrame();
        c.setVisible(true);
        frame.getjDesktopPane1().add(c);
    }

    public void abrirCadastroProduto() throws Exceptions {
        CadastroProdutoJIF c = new CadastroProdutoJIF();
        c.setVisible(true);
        frame.getjDesktopPane1().add(c);
    }

    public void abrirEstoque() throws Exceptions {
        EstoqueJIFrame c = new EstoqueJIFrame();
        c.setVisible(true);
        frame.getjDesktopPane1().add(c);
    }

    public void actionPerformed(ActionEvent evento) {

        if ("cadastroCliente".equals(evento.getActionCommand())) {
            try {
                abrirCadastroClientes();
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("sobre".equals(evento.getActionCommand())) {
            try {
                abrirSorbe();
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("cadastroProduto".equals(evento.getActionCommand())) {
            try {
                abrirCadastroProduto();
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("estoque".equals(evento.getActionCommand())) {
            try {
                abrirEstoque();
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("sair".equals(evento.getActionCommand())) {
            // salva log
            log = new Log("Usuario " + ultimoLogin.lerArquivo() + " Saio do sistema no dia ");
            frame.dispose();
        }
    }

}
