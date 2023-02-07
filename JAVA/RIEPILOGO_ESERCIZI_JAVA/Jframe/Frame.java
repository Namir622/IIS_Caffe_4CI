package Jframe;

import javax.swing.*;
import java.awt.Color;



public class Frame {
    
    public static void main(String[] args) {

        //istanza oggetto finestra
        JFrame finestra = new JFrame("Prima finestra");

        //Definire dimenzione e punto di apertura
        finestra.setBounds(250,250,500,400);

        //aggiungere un immagine nell'icona
        ImageIcon miaIcona = new ImageIcon("Jframe/lettera.png");
        finestra.setIconImage(miaIcona.getImage());

        //cambiare lo sfondo
        finestra.getContentPane().setBackground(new Color(0,255,0));
        

        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//chiude il programma alla chiusura della finestra
        finestra.setVisible(true);//rende visibile il frame
    }
}
