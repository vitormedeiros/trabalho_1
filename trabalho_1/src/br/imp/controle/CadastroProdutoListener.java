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

        if ("limpar".equals(evento.getActionCommand())) {
            frame.limparForm();
            // salva log
            lG = new Log(ultimoLogin.lerArquivo() + " limpou formulario");

        }

        if ("gravar".equals(evento.getActionCommand())) {
            CadastroProdutoControl ct = new CadastroProdutoControl(frame);
            CadProdutoModelo retorno = ct.getStanceCadmodelo();
            CadastroProdutoDao incereBanco = new CadastroProdutoDao();
            JOptionPane.showMessageDialog(null, "descrição do prod: " + retorno.getDescricaoProd());
            incereBanco.insert(retorno);
        }

        if ("excluir".equals(evento.getActionCommand())) {
            CadastroProdutoDao exclui = new CadastroProdutoDao();
            //valida codigo
            if (frame.getCodigo().length() == 0 || frame.getCodigo() == null) {
                JOptionPane.showMessageDialog(null, "Codigo invalido");
                return;
            } else {
                exclui.delete(frame.getCodigo());
            }

        }

        if ("alterar".equals(evento.getActionCommand())) {
            CadastroProdutoDao altera = new CadastroProdutoDao();

            CadastroProdutoControl ct = new CadastroProdutoControl(frame);
            CadProdutoModelo retorno = ct.getStanceCadmodelo();
            
            altera.atualizar(retorno);
                    
        }
        
        if ("pesquisar".equals(evento.getActionCommand())) {
            CadastroProdutoDao pesquisar = new CadastroProdutoDao();

            CadastroProdutoControl ct = new CadastroProdutoControl(frame);
            CadProdutoModelo retorno = ct.getStanceCadmodelo();
            //retorna uma nova instanci do produtosModelo para atualizar os campos
            retorno = pesquisar.getProduto(retorno , null);
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
              /*JOptionPane.showMessageDialog(null,retorno.getCodigo()+ " \n "+ retorno.getNome()+ " \n "+ 
              retorno.getMarca() +" \n " +retorno.getFornecedor()+ " \n " +retorno.getQtd() +" \n " +retorno.getQtdCritica()
              +" \n "+ retorno.getValorCusto() +" \n "+ retorno.getValorUnitario() + " \n " +retorno.getDescricaoProd()
              );*/
        }

    }

}
