package logIn;

import java.awt.Color;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel_Sud extends JPanel{
    Panel_Sud(){
        this.setPreferredSize(new Dimension(200, 50));
        this.setBackground(Color.green);
        this.setBorder(new LineBorder(Color.BLACK, 3));
        this.setLayout((new FlowLayout(FlowLayout.RIGHT)));
        
        //creiamo gli oggietti per il panello
        JLabel titolo = new JLabel("Designed by AArico and made by M.L.Maccione");

        //aggiungiamo gli elementi al panello
        this.add(titolo);
    }
}
