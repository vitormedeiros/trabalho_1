package trabalho_1;

public class Trabalho_1 {

    public static void main(String[] args) {
        Botao botoes = new Botao();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });

    }

}
