package logIn;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Panel_img extends JPanel{
    Panel_img(){

        //definiamo il panello
        
        this.setBackground(Color.blue);
        this.setPreferredSize(new Dimension(200, 200));
        this.setBorder(new LineBorder(Color.black, 3));

        //creiamo l'immagine e nla mettiamo in un label
        ImageIcon foto = new ImageIcon("logIn/Img/database.png");
        JLabel immagine = new JLabel(foto);

        //aggiungiamo al panello
        this.add(immagine);
    }        

}
