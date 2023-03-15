package logIn;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel_Input extends JPanel{

    static JButton Accept;
    static JButton Cancel;
    static JTextField Username;
    static JTextField Password;

    JPanel credenziali;
    JPanel bottoni;


    Panel_Input(){
        //definiamo il panello
        this.setPreferredSize(new Dimension(300, 200));
        this.setBackground(Color.ORANGE);
        this.setBorder(new LineBorder(Color.BLACK, 3));
        this.setLayout(new BorderLayout());
        
        JLabel T1 = new JLabel("Username:");


        //panello credenziali
        credenziali = new JPanel(new FlowLayout());
        credenziali.setPreferredSize(new Dimension(200, 70));
        credenziali.setBackground(Color.MAGENTA);
        credenziali.setBorder(new LineBorder(Color.BLACK, 3));
        //credenziali.setLayout(new GridLayout(2,2));


        JLabel T2 = new JLabel("Password:");

        Username = new JTextField("Inserire_Username");
        Password = new JTextField("Inserire_Password");

        //T1.add(Username); T2.add(Password);

        credenziali.add(T1); credenziali.add(Username); credenziali.add(T2); credenziali.add(Password);

        
        
        //panello bottoni
        bottoni = new JPanel();
        bottoni.setBackground(Color.MAGENTA);
        bottoni.setBorder(new LineBorder(Color.BLACK, 3));
        bottoni.setPreferredSize(new Dimension(200, 50));


        ImageIcon Img1 = new ImageIcon("logIn/Img/OK.png");
        ImageIcon Img2 = new ImageIcon("logIn/Img/NO.png");

        JLabel A = new JLabel(Img1);
        A.setText("Accetta");
        JLabel B = new JLabel(Img2);
        B.setText("Annulla");
        
        Accept = new JButton();
        Accept.add(A);

        Cancel = new JButton();
        Cancel.add(B);

        bottoni.add(Accept); bottoni.add(Cancel);        


        

        //aggiungiamo i due pannelli a quello principale
        this.add(credenziali, BorderLayout.NORTH);
        this.add(bottoni, BorderLayout.SOUTH);
    }
}
