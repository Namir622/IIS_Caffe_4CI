import javax.swing.*;
import java.awt.*;

public class Principale {
    public static void main(String[] args) {

        //defianiamo la finestra
        JFrame finestra = new JFrame("Calcolatrice");
        finestra.setBounds(300, 150, 300, 500);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setVisible(true);
        //finestra.setLayout(new BorderLayout());
        
        Container c = finestra.getContentPane();
        //c.setLayout(new BorderLayout());
        c.setBackground(Color.red);
        
        Pannello coso = new Pannello();

        c.add(coso, BorderLayout.CENTER);

    }
}
