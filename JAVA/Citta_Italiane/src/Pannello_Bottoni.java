import javax.swing.*;
import java.awt.*;

public class Pannello_Bottoni extends JPanel{

    Pannello_Bottoni(){

        JRadioButton b1 = new JRadioButton("Roma");
        JRadioButton b2 = new JRadioButton("Napoli");
        JRadioButton b3 = new JRadioButton("Palermo");
        JRadioButton b4 = new JRadioButton("Pisa");
        JRadioButton b5 = new JRadioButton("Catania");

        ButtonGroup citta = new ButtonGroup();

        citta.add(b1); citta.add(b2); citta.add(b3); citta.add(b4); citta.add(b5);

        //this.setLayout(new GridLayout(5,1));

        this.setLayout(new GridLayout(5,1));
        
         /*add(b1);
         add(b2);
         add(b3);
         add(b4);
         add(b5);*/

        this.add(b1); this.add(b2); this.add(b3); this.add(b4); this.add(b5);

        this.setBounds(10, 10, 150, 300);
        }

}
