package RIEPILOGO_ESERCIZI_JAVA.Jpanel;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class CheckBox extends JPanel{
    public CheckBox(){
        super();
        
        JCheckBox casella_1 = new JCheckBox("Java");
        JCheckBox casella_2 = new JCheckBox("C++");
        JCheckBox casella_3 = new JCheckBox("Python");


        add(casella_1); add(casella_2); add(casella_3);
    }
}
