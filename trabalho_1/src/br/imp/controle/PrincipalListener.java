package br.imp.controle;

import br.imp.visao.CadastroClienteJIF;
import br.imp.visao.CadastroProdutoJIF;
import br.imp.visao.EstoqueJIFrame;
import br.imp.visao.SobreJInternalFrame;
import br.imp.visao.jPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class PrincipalListener implements ActionListener {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;
    Boolean cadCliAberta = false;
    Boolean cadProdAberta = false;
    Boolean sobreAberta = false;
    Boolean estoqueAberta = false;
    public jPrincipal frame;

    public PrincipalListener(jPrincipal frame) {
        this.frame = frame;

    }

    public void abrirCadastroClientes(CadastroClienteJIF c, Boolean abreFecha) throws Exceptions {

        c.setVisible(abreFecha);
        if (abreFecha == false) {
            c.dispose();
        }
        frame.getjDesktopPane1().add(c);
    }

    public void abrirSorbe(SobreJInternalFrame c, Boolean abreFecha) throws Exceptions {

        c.setVisible(abreFecha);
        if (abreFecha == false) {
            c.dispose();
        }
        frame.getjDesktopPane1().add(c);
    }

    public void abrirCadastroProduto(CadastroProdutoJIF c, Boolean abreFecha) throws Exceptions {

        c.setVisible(abreFecha);
        if (abreFecha == false) {
            c.dispose();
        }
        frame.getjDesktopPane1().add(c);
    }

    public void abrirEstoque(EstoqueJIFrame c, Boolean abreFecha) throws Exceptions {

        c.setVisible(abreFecha);
        if (abreFecha == false) {
            c.dispose();
        }
        frame.getjDesktopPane1().add(c);
    }

    public void actionPerformed(ActionEvent evento) {
        CadastroClienteJIF cadCli = new CadastroClienteJIF();
        SobreJInternalFrame sobre = new SobreJInternalFrame();
        CadastroProdutoJIF cadPod = new CadastroProdutoJIF();
        EstoqueJIFrame estoq = new EstoqueJIFrame();
        if ("cadastroCliente".equals(evento.getActionCommand())) {
           
                try {
                    abrirCadastroClientes(cadCli, true);
                } catch (Exceptions e) {
                    JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
                }
              
            
        }

        if ("sobre".equals(evento.getActionCommand())) {
            try {
                abrirSorbe(sobre, true);
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("cadastroProduto".equals(evento.getActionCommand())) {
            try {
                abrirCadastroProduto(cadPod, true);
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }

        if ("estoque".equals(evento.getActionCommand())) {
            try {
                abrirEstoque(estoq, true);
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
