import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {

        MioFrame finestra = new MioFrame();



        Container c = finestra.getContentPane();

        c.setBackground(Color.yellow);

        

        Pannello_Bottoni bottoni = new Pannello_Bottoni();








        c.add(bottoni);
    }
}
