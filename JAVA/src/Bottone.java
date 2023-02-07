import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Bottone extends JPanel implements ActionListener{
    JButton bottone;

    public Bottone(){
        super();

        //impostiamo il colore di sfondo
        this.setBackground(Color.red);
        
        //creiamo l'oggetto JButton
        bottone = new JButton("Somma!!!");


        //lo andiamo ad aggiungere
        add(bottone);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bottone) {
                    // TODO Auto-generated method stub
            
        }        
    }
}
