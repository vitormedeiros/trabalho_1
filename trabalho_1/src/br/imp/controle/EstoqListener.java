package br.imp.controle;

import br.imp.modelo.CadProdutoModelo;
import br.imp.modelo.CadastroProdutoDao;
import br.imp.visao.CadastroProdutoJIF;
import br.imp.visao.EstoqueJIFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EstoqListener implements ActionListener {

    private EstoqueJIFrame frame;
    Log log;
    UltimoUsuarioLogin ultimoLogin = new UltimoUsuarioLogin();

    public EstoqListener(EstoqueJIFrame frame) {
        this.frame = frame;

    }

    public void actionPerformed(ActionEvent evento) {
       // String opcao;
        if ("pesquisar".equals(evento.getActionCommand())) {
            CadastroProdutoDao pesquisar = new CadastroProdutoDao();

            CadastroProdutoControl ct = new CadastroProdutoControl(frame);
            CadProdutoModelo retorno = ct.getStanceCadmodelo();
          
            try {
                //retorna uma nova instanci do produtosModelo para atualizar os campos
                retorno = pesquisar.getProduto(retorno, frame);
            } catch (Exceptions ex) {
                 new Exceptions("Erro ao pesquisar produtos" + ex);
            }
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
             
        }
        if ("limpar".equals(evento.getActionCommand())) {
            frame.LimparForm();
            frame.preencherTabela("select codigo, nome, marca, fornecedor, quantidade, qtd_critica, val_custo, val_unitario, descricao from produtos where codigo = '"+0+"'");
            //Grava log de navegação
            log = new Log(ultimoLogin.lerArquivo() + " limpou formulario no estoque");
        } 
        
    }
}
