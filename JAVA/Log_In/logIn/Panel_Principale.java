package logIn;

import java.awt.*;
import javax.swing.*;

public class Panel_Principale extends JPanel{
    Panel_Principale(){

        //definiamo il pannello
        //this.setPreferredSize(new Dimension(500, 300));
        this.setLayout(new BorderLayout(5,5));
        this.setBackground(Color.red);


        //creiamo le istanze degli altri pannelli
        Pannello_titolo Titolo = new Pannello_titolo();
        Panel_Sud Firma = new Panel_Sud();
        Panel_img Immagine = new Panel_img();
        Panel_Input input = new Panel_Input();


        //aggiungiamo tutti gli elementi al panello principale
        this.add(Titolo, BorderLayout.NORTH);
        this.add(Firma, BorderLayout.SOUTH);
        this.add(Immagine, BorderLayout.WEST);
        this.add(input, BorderLayout.CENTER);

    }
}
