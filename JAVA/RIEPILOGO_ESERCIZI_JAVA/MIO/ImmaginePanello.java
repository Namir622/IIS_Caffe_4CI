package MIO;

import java.awt.*;
import javax.swing.*;

public class ImmaginePanello extends JPanel {
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.setColor(Color.red); g.drawString("Esercizio",60,40);
        g.drawLine(60, 160, 400, 100);

        //linea blue
        g.setColor(Color.blue); g.drawLine(60, 180, 400, 120);

        //linea nera
        g.setColor(Color.black); g.drawLine(60, 200, 400, 140);

        //linea gialla
        g.setColor(Color.yellow); g.drawLine(60, 220, 400, 160);

        //colore settato di nuovo a blu per la stringa
        g.setColor(Color.blue); g.drawString("font di default",60,250);
        Font f1 = new Font("Times", Font.BOLD, 20);
        g.setFont(f1);
        g.drawString("Times New Roman bold e size: 20",60,280);
        } //func
        
}
