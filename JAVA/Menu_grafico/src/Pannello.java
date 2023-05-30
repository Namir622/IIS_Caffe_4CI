import javax.swing.*;
import javax.swing.JMenuBar;
import java.awt.*;


public class Pannello extends JPanel { 

    JTextArea Area;

    Pannello(){
         this.setBackground(Color.red);
         this.setLayout(new  BorderLayout());


         JMenuBar bar = new JMenuBar();
         JMenu menu = new JMenu("Lista");
         bar.add(menu);
         JMenuItem T1 = new JMenuItem("File 1", ABORT);
         JMenuItem T2 = new JMenuItem("File 2", ABORT);
         JMenuItem T3 = new JMenuItem("File 3", ABORT);
         menu.add(T1);menu.add(T2);menu.add(T3);
        

         //Pannello menu
         JPanel nord = new JPanel();
         nord.setBackground(Color.yellow);
         nord.setPreferredSize(new Dimension(500, 50));
         nord.add(bar);
         
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




        this.add(nord, BorderLayout.NORTH);
        this.add(file, BorderLayout.WEST);
        this.add(bottoni, BorderLayout.SOUTH);
        this.add(Area, BorderLayout.CENTER);
    }//costruttore
    
}//class
