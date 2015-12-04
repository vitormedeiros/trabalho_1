
package br.imp.controle;

import br.imp.modelo.CadProdutoModelo;
import br.imp.visao.CadastroProdutoJIF;
import br.imp.visao.EstoqueJIFrame;

public class CadastroProdutoControl {
 
    private CadProdutoModelo cadModelo = new CadProdutoModelo();
    
    public  CadastroProdutoControl(CadastroProdutoJIF frame) {
        
        cadModelo.setCodigo(frame.getCodigo());
        cadModelo.setNome(frame.getNome());
        cadModelo.setMarca(frame.getMarca());
        cadModelo.setFornecedor(frame.getFornecedor());
        cadModelo.setQtd(frame.getQtd());
        cadModelo.setQtdCritica(frame.getQtdCritica());
        cadModelo.setValorCusto(frame.getValCusto());
        cadModelo.setValorUnitario(frame.getValUnitario());
        cadModelo.setDescricaoProd(frame.getjDescricao());

    }
    
    public  CadastroProdutoControl(EstoqueJIFrame frame) {
        
        cadModelo.setCodigo(frame.getCodigo());
        cadModelo.setNome(frame.getNome());
        cadModelo.setMarca(frame.getMarca());
        cadModelo.setFornecedor(frame.getFornecedor());
        cadModelo.setQtd(frame.getQtd());
        cadModelo.setQtdCritica(frame.getQtdCritica());
        cadModelo.setValorCusto(frame.getValCusto());
        cadModelo.setValorUnitario(frame.getValUnitario());
        cadModelo.setDescricaoProd(frame.getjDescricao());

    }

    
    
    public CadProdutoModelo getStanceCadmodelo(){
        return cadModelo;
    }
   
}
