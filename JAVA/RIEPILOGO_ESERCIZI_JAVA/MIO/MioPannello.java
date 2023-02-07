package MIO;

import javax.swing.*;
import java.awt.*;

public class MioPannello extends JPanel{
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.setColor(Color.red);
        // white, gray, red, green, yellow, pink, etc.
        g.fillRect(20,20, 120,80);
        g.setColor(Color.blue);
        g.drawRect(30,30, 100,60);
        g.setColor(Color.black);
        g.drawString("Super Ciccio",50,60);

        
        } //func
        
}
