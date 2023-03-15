import javax.swing.*;
import java.awt.*;


public class Bottoni extends JPanel{

    public static Object[] buttons;

    Bottoni(){

        //Layout
        this.setLayout(new GridLayout(5, 3));

        this.setBackground(Color.black);


        String[] nomi = {"Pesca", "Mela", "Ananas", 
                         "Cocomero", "Kiwi", "Pera",
                         "Arancia", "Mandarino", "Banana",
                         "-------", "-------", "-------",
                         "Peso", "Aggiungi" ,"Cancella"};



        JButton[] buttons = new JButton[15];

        for(int i = 0; i < 15; i++) {

            buttons[i] = new JButton(nomi[i]);
            this.add(buttons[i]);

        }//for
        
        /*for (JButton button : buttons) {
            
            
        }//for*/

        //this.add(new JButton(nomi[i]));
    }
}
