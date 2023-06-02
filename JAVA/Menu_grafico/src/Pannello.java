import javax.swing.*;
import java.awt.*;


public class Pannello extends JPanel { 

    JTextArea Area;

    Pannello(){
         this.setBackground(Color.red);
         this.setLayout(new  BorderLayout());
    
         
         //Pannello file
         JPanel file = new JPanel();
         file.setBackground(Color.GREEN);
         file.setPreferredSize(new Dimension(100, 260));
         
         
         //Pannello bottoni
         JPanel bottoni = new JPanel();
         bottoni.setBackground(Color.BLUE);
         bottoni.setPreferredSize(new Dimension(500, 60));


         //TextArea
         Area = new JTextArea();
         Area.setPreferredSize(new Dimension(400, 440));


        this.add(file, BorderLayout.WEST);
        this.add(bottoni, BorderLayout.SOUTH);
        this.add(Area, BorderLayout.CENTER);
    }//costruttore
    
}//class
