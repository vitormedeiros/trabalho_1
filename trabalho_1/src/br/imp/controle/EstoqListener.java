package br.imp.controle;

import br.imp.visao.EstoqueJIFrame;
import br.imp.visao.LoginJFrame;
import br.imp.visao.jPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EstoqListener implements ActionListener {

    private EstoqueJIFrame frame;
    Log log;
    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();

    public EstoqListener(EstoqueJIFrame frame) {
        this.frame = frame;

    }

    public void actionPerformed(ActionEvent evento) {
        if ("pesquisar".equals(evento.getActionCommand())) {
            //Grava log de navegação
            log = new Log(ultimoLogin.lerArquivo() + " perquisou produto no estoque");
        }
        if ("qtdProdutosEstoq".equals(evento.getActionCommand())) {
            //Grava log de navegação
            log = new Log(ultimoLogin.lerArquivo() + " perquisou quantidade produto no estoque");
        }

        if ("limpar".equals(evento.getActionCommand())) {
            frame.LimparForm();
            //Grava log de navegação
            log = new Log(ultimoLogin.lerArquivo() + " limpou formulario no estoque");
        } else {
            try {
                throw new Exceptions("Não foi possivel limpar o  formulario!");
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
