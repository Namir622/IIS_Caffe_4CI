package RIEPILOGO_ESERCIZI_JAVA.Jpanel;

import java.awt.*;



public class Main {
    public static void main(String[] args) {
        
        

        //pannello 
        ImmaginePanello pannello = new ImmaginePanello();

        //creazione bottone 
        Button bottone = new Button();

        //zona di testo
        TextField testo = new TextField();
        
        //check box
        CheckBox scatola = new CheckBox();

        //RadioButton
        RadioButton cerchio = new RadioButton();

        //ComboBox
        ComboButton combo = new ComboButton();



        
        //crezione della finestra
        MIOframe finestra = new MIOframe();

        Container c = finestra.getContentPane();        





        //incolliamo tutto nel content Pane
        
        c.add(pannello);
        pannello.add(testo);
        pannello.add(bottone);
        pannello.add(scatola);
        pannello.add(cerchio);
        pannello.add(combo);
        
        

        //rendiamo visibile la finestra
        finestra.setVisible(true);
    }
}
