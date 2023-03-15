package RIEPILOGO_ESERCIZI_JAVA.Jpanel;

import javax.swing.*;

public class Button extends JPanel{

    public Button(){

        super();

        JButton pulsante_1 = new JButton("OK");
        JButton pulsante_2 = new JButton("ANNULLA");

        add(pulsante_1); add(pulsante_2);

    }
}
