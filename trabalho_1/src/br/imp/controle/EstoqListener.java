package br.imp.controle;

import br.imp.modelo.CadProdutoModelo;
import br.imp.modelo.CadastroProdutoDao;
import br.imp.visao.CadastroProdutoJIF;
import br.imp.visao.EstoqueJIFrame;
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
            CadastroProdutoDao pesquisar = new CadastroProdutoDao();

            CadastroProdutoControl ct = new CadastroProdutoControl(frame);
            CadProdutoModelo retorno = ct.getStanceCadmodelo();
            //retorna uma nova instanci do produtosModelo para atualizar os campos
            retorno = pesquisar.getProduto(retorno, frame);
            EstoqueJIFrame c = new EstoqueJIFrame();
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
              
              
               log = new Log(ultimoLogin.lerArquivo() + " perquisou produto no estoque");
              /*JOptionPane.showMessageDialog(null,retorno.getCodigo()+ " \n "+ retorno.getNome()+ " \n "+ 
              retorno.getMarca() +" \n " +retorno.getFornecedor()+ " \n " +retorno.getQtd() +" \n " +retorno.getQtdCritica()
              +" \n "+ retorno.getValorCusto() +" \n "+ retorno.getValorUnitario() + " \n " +retorno.getDescricaoProd()
              );*/
        }

    
        
        if ("qtdProdutosEstoq".equals(evento.getActionCommand())) {
            //Grava log de navegação
            log = new Log(ultimoLogin.lerArquivo() + " perquisou quantidade produto no estoque");
        }

        if ("limpar".equals(evento.getActionCommand())) {
            frame.LimparForm();
            //Grava log de navegação
            log = new Log(ultimoLogin.lerArquivo() + " limpou formulario no estoque");
        } 
        
    }
}
