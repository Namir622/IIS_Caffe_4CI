
import java.awt.Color;
import javax.swing.*;


public class MIOframe extends JFrame {
    
    MIOframe(){
        this.setBounds(400, 300, 700, 600);

        this.getContentPane().setBackground(Color.black);

        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//chiude il programma alla chiusura della finestra
        }
}
