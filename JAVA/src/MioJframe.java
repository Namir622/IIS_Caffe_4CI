import java.awt.Color;
import javax.swing.JFrame;

public class MioJframe extends JFrame {
    
    MioJframe(){
        this.setBounds(100, 100, 500, 400);

        this.setTitle("Somma numeri");
        
        this.getContentPane().setBackground(Color.red);

        this.setDefaultCloseOperation(MioJframe.EXIT_ON_CLOSE);
    }
}
