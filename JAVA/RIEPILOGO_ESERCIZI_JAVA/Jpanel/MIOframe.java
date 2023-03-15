package RIEPILOGO_ESERCIZI_JAVA.Jpanel;

import java.awt.Color;
import javax.swing.*;


public class MIOframe extends JFrame {
    
    MIOframe(){
        this.setBounds(100, 100, 500, 400);

        //this.setLayout(null);

        this.getContentPane().setBackground(Color.red);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//chiude il programma alla chiusura della finestra
        }
}
