import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Bottoni extends JPanel implements ActionListener{

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
        
        for(int i = 0; i < 15; i++) {

            buttons[i].setBackground(Color.DARK_GRAY);
            buttons[i].setForeground(Color.white);
            buttons[i].setFocusable(false);
            
        }//for

        
        for (int i = 0; i < 15; i++) {
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        



        
    }
}
