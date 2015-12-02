package br.imp.modelo;

import java.math.BigDecimal;


public class CadProdutoModelo {
    private String codigo;
    private String nome;    
    private String marca;    
    private String fornecedor;    
    private int qtd;
    private int qtdCritica;
    private Float valorCusto;
    private Float valorUnitario;
    private String descricaoProd;
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtdCritica() {
        return qtdCritica;
    }

    public void setQtdCritica(int qtdCritica) {
        this.qtdCritica = qtdCritica;
    }

    public Float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public void setDescricaoProd(String descricaoProd) {
        this.descricaoProd = descricaoProd;
    }
   
    
}
