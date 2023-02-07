import java.awt.Container;

import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        
        //creiamo gli elementi da inserire nella finestra
        Panello panel = new Panello();
        Bottone bottone = new Bottone();
        JLabel risultato = new JLabel("Il risultato è: ");


        //creazione finestra
        MioJframe finestra = new MioJframe();
        finestra.setVisible(true);
        finestra.setLayout(null);

        //prendiamo il contentPain
        Container c = finestra.getContentPane();

        panel.setBounds(150, 100, 200, 100);
        panel.add(bottone);
        panel.add(risultato);
        c.add(panel);


    }
}
