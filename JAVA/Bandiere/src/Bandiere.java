
import java.awt.*;
import javax.swing.*;

//bandiere 150x225

public class Bandiere extends JPanel{
    
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        //bandiera italiana
        g.setColor(Color.green);
        g.fillRect(10, 10, 75, 150);
        g.setColor(Color.white);
        g.fillRect(75, 10, 75, 150);
        g.setColor(Color.red);
        g.fillRect(150, 10, 75, 150);


        
    }

}
