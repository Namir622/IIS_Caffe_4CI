package RIEPILOGO_ESERCIZI_JAVA.Jpanel;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ComboButton extends JPanel{
    public ComboButton(){
        super();

        String[] lista = {"Roma", "Milano", "Catania", "Trieste" };
        JComboBox comboBox = new JComboBox(lista);
        comboBox.setSelectedIndex(2);
        add(comboBox);

    }
}
