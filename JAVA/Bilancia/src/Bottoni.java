import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bottoni extends JPanel implements ActionListener{


    JButton[] buttons;

    Bottoni(){

        //definiamo il pannello
        this.setLayout(new GridLayout(5, 3));

        this.setBackground(Color.black);

        //stringa con i nomi dei bottoni
        String[] nomi = {"Pesca", "Mela", "Ananas", 
                         "Cocomero", "Kiwi", "Pera",
                         "Arancini", "Durian", "Banana",
                         "-------", "-------", "-------",
                         "Peso", "Stampa" ,"Cancella"};



        buttons = new JButton[15];

        for(int i = 0; i < 15; i++) {

            buttons[i] = new JButton(nomi[i]);
            this.add(buttons[i]);

        }//for
        
        //modifichiamo tutti i bottni
        for(int i = 0; i < 15; i++) {

            buttons[i].setBackground(Color.DARK_GRAY);
            buttons[i].setForeground(Color.white);
            buttons[i].setFocusable(false);
            
        }//for

        //aggiu nta all action Listener di tutti i bottoni
        for (int i = 0; i < 15; i++) {
            buttons[i].addActionListener(this);
        }
    }//costruttore


    @Override
    public void actionPerformed(ActionEvent e) {        
        //i prezzi di tutti i prodotti
        String[] prezzo_kilo = {"1.5", "0.57", "1.49", "2", "2.55", "2.99", "2.7", "40", "1.1"};

        for (int i = 0; i < 9; i++) {

            //funzionamento di ogni pulsante dei prodotti
            if (e.getSource() == buttons[i] && i < 9) {

                Panel_sud.prezzo.setText(prezzo_kilo[i]);
                Panel_sud.peso.setEditable(false);
                Panel_sud.peso.setText("");

            }//if
        }//for

        //poter inserire il peso che si vuole comprare
        if (e.getSource() == buttons[12] && Panel_sud.prezzo.getText().length() != 0) {

            Panel_sud.peso.setEditable(true);

        }//if

        //stampa del prezzo 
        if (e.getSource() == buttons[13] && Panel_sud.peso.getText().length() != 0) {

            Float tmp_peso = Float.parseFloat(Panel_sud.peso.getText());
            Float tmp_prezzo = Float.parseFloat(Panel_sud.prezzo.getText());

            Float risultato = tmp_peso*tmp_prezzo;

            String stampa = Float.toString(risultato);

            Panel_nord.area.setText(stampa + "€");
                
                
        }else { 
            if (e.getSource() == buttons[13] && Panel_sud.peso.getText().length() == 0) {

                    JOptionPane.showMessageDialog(this,"NON è stato inserito il peso", "AAAAAAAAAAA!!!", JOptionPane.WARNING_MESSAGE); 
 
                }//if
        }//else

        //uscita dal programma
        if (e.getSource() == buttons[14]) {
            System.exit(0);
        }//if
       

    }//action performed 
}//class
