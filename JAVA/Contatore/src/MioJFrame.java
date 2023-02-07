import java.awt.Color;

import javax.swing.JFrame;

public class MioJFrame extends JFrame{
    
    MioJFrame(){
        this.setTitle("Finestra contatore");

        this.getContentPane().setBackground(Color.CYAN);

        this.setBounds(500, 200, 500, 400);

        this.setResizable(false);

        this.setDefaultCloseOperation(MioJFrame.EXIT_ON_CLOSE);
    }
}
