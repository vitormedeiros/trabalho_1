package br.imp.controle;

import br.imp.modelo.CadProdutoModelo;
import br.imp.modelo.CadastroProdutoDao;
import br.imp.visao.CadastroProdutoJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CadastroProdutoListener implements ActionListener {

    Log lG;
    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();

    private CadastroProdutoJIF frame;

    public CadastroProdutoListener(CadastroProdutoJIF frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

       /* if ("limpar".equals(evento.getActionCommand())) {
            frame.limparForm();
            // salva log
            lG = new Log(ultimoLogin.lerArquivo() + " limpou formulario");

        } else {
            try {
                throw new Exceptions("Não foi possivel limpar o  formulario!");
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }*/
        
        if ("gravar".equals(evento.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "evento correto");
                    CadastroProdutoControl ct = new CadastroProdutoControl(frame);
                    CadProdutoModelo retorno = ct.getStanceCadmodelo();
                    CadastroProdutoDao incereBanco = new CadastroProdutoDao();
                    JOptionPane.showMessageDialog(null,"descrição do prod: " + retorno.getDescricaoProd() );
                    incereBanco.insert(retorno);
        } else {
            try {
                throw new Exceptions("Não foi possivel gravar!");
            } catch (Exceptions e) {
                JOptionPane.showMessageDialog(null, "Erro : " + e, "Erro ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
