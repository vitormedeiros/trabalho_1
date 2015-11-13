package Controle;

public class Exceptions extends Exception {

    LogErro logErro;

    public Exceptions() {
        super("Erro");
        //  Grava o erro no log de erro
        logErro = new LogErro("Erro");
    }

    public Exceptions(String mensagem) {
        super(mensagem);
        //  Grava o erro no log de erro
        logErro = new LogErro(mensagem);
    }
}
