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

        //aggiungiamo i pannelli
        this.add(Panel_bottoni, BorderLayout.CENTER);
        this.add(sud, BorderLayout.SOUTH);

    }
}
