import java.awt.Color;
import java.awt.Container;

public class Main {

    public static void main(String[] args) {

        //dichiariamo la variabile pannello
        Panello panel = new Panello();

        panel.setBounds(100, 50, 300, 250);
        panel.setBackground(Color.CYAN);

        //dichiariamo Il frame su qui lavoreremo
        MioJFrame finestra = new MioJFrame();

        finestra.setVisible(true);
        finestra.setLayout(null);


        //prendiamo il contentPain
        Container c = finestra.getContentPane();

        c.add(panel);
    }
}
