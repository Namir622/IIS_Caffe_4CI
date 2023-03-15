package RIEPILOGO_ESERCIZI_JAVA.Jpanel;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField extends JPanel{
    public TextField(){
        super();

        JTextField zona_1 = new JTextField(20);
        JTextField zona_2 = new JTextField(20);


        add(zona_1); add(zona_2);

    }//costruttore
}//class
