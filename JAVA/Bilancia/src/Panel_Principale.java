import java.awt.*;
import javax.swing.*;

public class Panel_Principale extends JPanel{

    Panel_Principale(){
        //colore sfondo
        this.setBackground(Color.black);
        
        //Layout
        this.setLayout(new BorderLayout());

        Bottoni Panel_bottoni = new Bottoni();

        this.add(Panel_bottoni, BorderLayout.CENTER);

    }
}
