package br.imp.controle;

import br.imp.modelo.CadProdutoModelo;
import br.imp.modelo.CadastroClienteDao;
import br.imp.modelo.CadastroClienteModelo;
import br.imp.modelo.CadastroProdutoDao;
import br.imp.visao.CadastroClienteJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CadastroClienteListener implements ActionListener {

    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();
    Log log;

    public CadastroClienteJIF frame;

    public CadastroClienteListener(CadastroClienteJIF frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent evento) {

        if ("botaoNovo".equals(evento.getActionCommand())) {
            frame.LimpaForm();
            frame.SetaEnable(true);
        }
        if ("botaoSair".equals(evento.getActionCommand())) {
            frame.Sair();
        }
        if ("botaoCancelar".equals(evento.getActionCommand())) {
            frame.SetaEnable(false);
        }
        if ("excluir".equals(evento.getActionCommand())) {
            CadastroClienteDao exclui = new CadastroClienteDao();
            //valida codigo
            if (frame.getCod().length() == 0 || frame.getCod() == null) {
                JOptionPane.showMessageDialog(null, "Codigo invalido");
                return;
            } else {
                exclui.delete(frame.getCod());
            }

        }
        if ("gravar".equals(evento.getActionCommand())) {
            frame.SetaEnable(false);
            CadastroClienteControle ct = new CadastroClienteControle(frame);
            CadastroClienteModelo retorno = ct.getStanceCadmodelo();
            CadastroClienteDao incereBanco = new CadastroClienteDao();
            incereBanco.insert(retorno);
        }
    }

}
