import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Interfaccia_grafica {
    public static void main(String[] args) {

        JPanel panelloRosso = new JPanel();
        panelloRosso.setBackground(Color.RED);
        panelloRosso.setBounds(0,0,100,100);

        JPanel panelloVerde = new JPanel();
        panelloRosso.setBackground(Color.green);
        panelloRosso.setBounds(250,250,100,100);




        JFrame frame = new JFrame();
        frame.getContentPane();
        frame.setBounds(0,0,500,500);




        frame.add(panelloRosso);
        frame.add(panelloVerde);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
