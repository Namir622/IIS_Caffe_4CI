import java.awt.*;
import javax.swing.*;

public class Panel_Principale extends JPanel{

    Panel_Principale(){
        //colore sfondo
        this.setBackground(Color.black);
        
        //Layout
        this.setLayout(new BorderLayout());

        //creaiamo istanze dei vari pannelli 
        Bottoni Panel_bottoni = new Bottoni();

        Panel_sud sud = new Panel_sud();
        sud.setPreferredSize(new Dimension(500, 80));
        
        Panel_nord nord = new Panel_nord();
        sud.setPreferredSize(new Dimension(500, 80));


        //aggiungiamo i pannelli
        this.add(Panel_bottoni, BorderLayout.CENTER);
        this.add(sud, BorderLayout.SOUTH);
        this.add(nord, BorderLayout.NORTH);

    }//costruttore
}//class
