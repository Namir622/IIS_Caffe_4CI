import java.awt.Container;

public class Main {
    public static void main(String[] args) {
        
        //creiamo gli elementi da inserire nella finestra
        Panello panel = new Panello();
        
        //creazione finestra
        MioJframe finestra = new MioJframe();
        finestra.setVisible(true);
        finestra.setLayout(null);

        //prendiamo il contentPain
        Container c = finestra.getContentPane();

        panel.setBounds(100, 50, 300, 250);
        c.add(panel);


    }//main
}//class
