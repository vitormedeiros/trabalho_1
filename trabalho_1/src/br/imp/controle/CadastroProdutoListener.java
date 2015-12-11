package br.imp.controle;

import br.imp.modelo.CadProdutoModelo;
import br.imp.modelo.CadastroProdutoDao;
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
public class CadastroProdutoListener implements ActionListener {

    Log lG;
    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();

    private CadastroProdutoJIF frame;

    public CadastroProdutoListener(CadastroProdutoJIF frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if ("limpar".equals(evento.getActionCommand())) {
            frame.limparForm();
            // salva log
            lG = new Log(ultimoLogin.lerArquivo() + " limpou formulario");

        }

        if ("gravar".equals(evento.getActionCommand())) {
            CadastroProdutoControl ct = new CadastroProdutoControl(frame);
            CadProdutoModelo retorno = ct.getStanceCadmodelo();
            CadastroProdutoDao incereBanco = new CadastroProdutoDao();
            try {
                incereBanco.insert(retorno);
                lG = new Log(ultimoLogin.lerArquivo() + " Cadastrou um produto");
            } catch (Exceptions ex) {
                 new Exceptions("Erro ao gravar registro" + ex);
            }
        }

        if ("excluir".equals(evento.getActionCommand())) {
            CadastroProdutoDao exclui = new CadastroProdutoDao();
            //valida codigo
            if (frame.getCodigo().length() == 0 || frame.getCodigo() == null) {
                JOptionPane.showMessageDialog(null, "Codigo invalido");
                return;
            } else {
                try {
                    exclui.delete(frame.getCodigo());
                    lG = new Log(ultimoLogin.lerArquivo() + " Excluiu um produto");
                } catch (Exceptions ex) {
                     new Exceptions("Erro ao excluir registro" + ex);
                }
            }

        }

        if ("alterar".equals(evento.getActionCommand())) {
            CadastroProdutoDao altera = new CadastroProdutoDao();

            CadastroProdutoControl ct = new CadastroProdutoControl(frame);
            CadProdutoModelo retorno = ct.getStanceCadmodelo();
            
            try {
                altera.atualizar(retorno);
                lG = new Log(ultimoLogin.lerArquivo() + " Alteropu um produto");
            } catch (Exceptions ex) {
                new Exceptions("Erro ao alterar registro" + ex);
            }
                    
        }
        
        if ("pesquisar".equals(evento.getActionCommand())) {
            CadastroProdutoDao pesquisar = new CadastroProdutoDao();

            CadastroProdutoControl ct = new CadastroProdutoControl(frame);
            CadProdutoModelo retorno = ct.getStanceCadmodelo();
            try {
                //retorna uma nova instanci do produtosModelo para atualizar os campos
                retorno = pesquisar.getProduto(retorno , null);
                lG = new Log(ultimoLogin.lerArquivo() + " pesquisou um produto");
            } catch (Exceptions ex) {
                new Exceptions("Erro ao pesquisar produto"+ ex);
            }
            CadastroProdutoJIF c = new CadastroProdutoJIF();
            //seta os valores nos campos
              c.setjTFCodigo(retorno.getCodigo(), frame);
              c.setjTFNome(retorno.getNome() , frame);
              c.setjTFMarca(retorno.getMarca(), frame);
              c.setjTFFornecedor(retorno.getFornecedor(), frame);
              c.setjTFQtd(retorno.getQtd(), frame);
              c.setjTFQtdCritica(retorno.getQtdCritica(), frame);
              c.setjTFCusto(retorno.getValorCusto(), frame);
              c.setjTFUnitario(retorno.getValorUnitario(), frame);
              c.setjTPDescricao(retorno.getDescricaoProd(), frame);
        }

    }

}
