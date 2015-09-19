
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Botao extends JFrame implements ActionListener {

   
	private JButton entrar, cancelar,informacao;
	
	public Botao (JButton entrar, JButton cancela,JButton informacao){
		this.entrar = entrar;
		this.cancelar = cancelar;
                this.informacao = informacao;
	}
	    public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == entrar)
				JOptionPane.showMessageDialog(null, "O botão entrar foi clicado");
			
		if(evento.getSource() == cancelar)
			JOptionPane.showMessageDialog(null, "O botão CANCELAr foi clicado");
                if(evento.getSource() == informacao)
			JOptionPane.showMessageDialog(null, "O botão informação foi clicado");
	}

}
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    /* private JButton cadastro = new JButton("Cadastro"),
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
*/

