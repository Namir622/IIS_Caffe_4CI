import java.awt.Color;
import javax.swing.JFrame;

public class MioJframe extends JFrame {
    
    MioJframe(){
        this.setBounds(500, 200, 500, 400);

        this.setTitle("Somma numeri");
        
        this.getContentPane().setBackground(Color.yellow);

        this.setResizable(false);

        this.setDefaultCloseOperation(MioJframe.EXIT_ON_CLOSE);
    }
}
