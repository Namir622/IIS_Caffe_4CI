package RIEPILOGO_ESERCIZI_JAVA.Jpanel;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton extends JPanel{
    public RadioButton(){
        super();

        JRadioButton scelta_1 = new JRadioButton("Linux");
        JRadioButton scelta_2 = new JRadioButton("Windows");
        JRadioButton scelta_3 = new JRadioButton("Macintosh");
        ButtonGroup gruppo_1 = new ButtonGroup();

        gruppo_1.add(scelta_1);
        gruppo_1.add(scelta_2);
        gruppo_1.add(scelta_3);

        add(scelta_1); add(scelta_2); add(scelta_3);
    }
}
