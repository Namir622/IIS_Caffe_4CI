package MIO;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        
        //primo frame 
        MIOframe frame = new MIOframe();

        Container c = frame.getContentPane();

        //creazione primo panello e relativo disegno
        MioPannello pannello = new MioPannello();


        //secondo frame
        MIOframe frame_2 = new MIOframe();
        frame_2.setLocation(600, 100);;
        Container c_2 = frame_2.getContentPane();
        

        ImmaginePanello Immagine = new ImmaginePanello();



        
        c.add(pannello);
        c_2.add(Immagine);

        frame.setVisible(true);
        frame_2.setVisible(true);
    }
}
