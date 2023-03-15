package logIn;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Pannello_titolo extends JPanel{
    Pannello_titolo(){


        //definiamo il panello
        this.setPreferredSize(new Dimension(200, 50));
        this.setBackground(Color.CYAN);
        this.setBorder(new LineBorder(Color.BLACK, 3));

        Font F1 = new Font("papyrus", Font.BOLD, 24);
        
        //creiamo gli oggietti per il panello
        JLabel titolo = new JLabel("Log_In Database");

        titolo.setFont(F1);
        
        //aggiungiamo gli elementi al panello
        this.add(titolo);
    }
}
