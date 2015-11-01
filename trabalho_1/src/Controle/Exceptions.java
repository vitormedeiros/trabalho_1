package Controle;

public class Exceptions  extends Exception{
    public Exceptions(){
        super("Erro");  
    }
    public Exceptions(String mensagem){
        super(mensagem);
    }
}
