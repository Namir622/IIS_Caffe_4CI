import java.awt.Color;
import java.awt.Container;

public class Main {
    public static void main(String[] args) {

        //dichiaro il panello con le bandiere
        Bandiere panello = new Bandiere();

        panello.setBackground(Color.black);

        panello.setBounds(150, 100, 400, 400);


        //dichiaro il frame
        MIOframe finestra = new MIOframe();
        finestra.setVisible(true);
        finestra.setLayout(null);

        //prendo il content pane
        Container c = finestra.getContentPane();

        c.add(panello);

        
    }
}
