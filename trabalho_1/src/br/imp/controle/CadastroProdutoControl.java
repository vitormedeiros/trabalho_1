
package br.imp.controle;

import br.imp.modelo.CadProdutoModelo;
import br.imp.visao.CadastroProdutoJIF;

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
        cadModelo.setValorUnitario(frame.getValCusto());
        cadModelo.setDescricaoProd(frame.getjDescricao());

    }
    
    public CadProdutoModelo getStanceCadmodelo(){
        return cadModelo;
    }
   
}
