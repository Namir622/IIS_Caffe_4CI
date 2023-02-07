package MIO;

import java.awt.Color;
import javax.swing.*;


public class MIOframe extends JFrame {
    
    MIOframe(){
        this.setBounds(100, 100, 500, 500);

        this.getContentPane().setBackground(Color.red);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//chiude il programma alla chiusura della finestra
        }
}
