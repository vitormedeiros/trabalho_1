
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Botao extends JFrame implements ActionListener {

    private JButton cadastro = new JButton("Cadastro"),
            azul = new JButton("Azul"),
            amarelo = new JButton("Amarelo");

    public Botao() {

        cadastro.addActionListener(this);
        add(cadastro);

        azul.addActionListener(this);
        add(azul);

        amarelo.addActionListener(this);
        add(amarelo);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == cadastro) {
             
        }

        if (evento.getSource() == azul) {

        }

        if (evento.getSource() == amarelo) {

        }

        repaint();
    }

}
