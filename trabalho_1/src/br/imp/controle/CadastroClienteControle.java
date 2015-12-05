package br.imp.controle;

import br.imp.modelo.CadProdutoModelo;
import br.imp.modelo.CadastroClienteModelo;
import br.imp.visao.CadastroClienteJIF;

public class CadastroClienteControle {
    
  private CadastroClienteModelo cadModelo = new CadastroClienteModelo();
    
    public  CadastroClienteControle(CadastroClienteJIF frame) {
        
        cadModelo.setCod(frame.getCod());
        cadModelo.setNome(frame.getNome());
        cadModelo.setRg(frame.getRg());
        cadModelo.setCpf(frame.getCpf());
        cadModelo.setTelefone(frame.getTelefone());
        cadModelo.setEndereco(frame.getEndereco());
    }
    
    
    public CadastroClienteModelo getStanceCadmodelo(){
        return cadModelo;
    }  
    
    
    
}
