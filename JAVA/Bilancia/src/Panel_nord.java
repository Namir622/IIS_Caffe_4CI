import java.awt.*;
import javax.swing.*;

public class Panel_nord extends JPanel{

    //dichiarazione elementi
    static JTextField area;
    static JLabel scritta;

    Panel_nord(){
        //definiamo il pannello
        this.setBackground(Color.red);
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //TextFiel e modifiche 
        area = new JTextField();
        area.setEditable(false);
        area.setPreferredSize(new Dimension(100, 20));
        area.setHorizontalAlignment(JTextField.CENTER);

        //Jlabel
        scritta = new JLabel("COSTO");
        scritta.setForeground(Color.white);

        //aggiungiamo gli elementi
        this.add(area); this.add(scritta);

    }
}
