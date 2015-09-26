package Controle;

import Visao.CadastroClienteJIF;
import Visao.CadastroProdutoJIF;
import Visao.EstoqueJIF;
import Visao.SobreJInternalFrame;
import Visao.jPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalListener implements ActionListener {
    // CadastroCliente cadastroCliente = new CadastroCliente();

    public jPrincipal frame;

    public PrincipalListener(jPrincipal frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent evento) {

        if ("cadastroCliente".equals(evento.getActionCommand())) {
            CadastroClienteJIF c = new CadastroClienteJIF();
            c.setVisible(true);
            frame.getjDesktopPane1().add(c);
        } else if ("sobre".equals(evento.getActionCommand())) {
            SobreJInternalFrame c = new SobreJInternalFrame();
            c.setVisible(true);
            frame.getjDesktopPane1().add(c);
        } else if ("cadastroProduto".equals(evento.getActionCommand())) {
            CadastroProdutoJIF c = new CadastroProdutoJIF();
            c.setVisible(true);
            frame.getjDesktopPane1().add(c);
        } else if ("estoque".equals(evento.getActionCommand())) {
            EstoqueJIF c = new EstoqueJIF();
            c.setVisible(true);
            frame.getjDesktopPane1().add(c);
        }
    }
}
