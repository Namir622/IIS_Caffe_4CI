import java.awt.*;
import javax.swing.*;

public class Panel_sud extends JPanel{

    //dichiarazione  elementi pannello
    static JTextField peso;
    static JTextField prezzo;
    JLabel P1;
    JLabel P2;

    Panel_sud(){
        //definiamo il pannello
        this.setBackground(Color.black);
        this.setLayout(new FlowLayout( FlowLayout.LEFT));
        this.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        //textfiel peso
        peso = new JTextField();
        peso.setEditable(false);
        peso.setPreferredSize(new Dimension(100, 20));
        peso.setHorizontalAlignment(JTextField.CENTER);
        
        //textField prezzo
        prezzo = new JTextField();
        prezzo.setEditable(false);
        prezzo.setPreferredSize(new Dimension(100, 20));
        prezzo.setHorizontalAlignment(JTextField.CENTER);

        //JLabel del pannello
        P1 = new JLabel("PESO");
        P1.setForeground(Color.white);
        
        P2 = new JLabel("Euro/Kg");
        P2.setForeground(Color.white);

        //aggiungiamo gli elemnti al pannello
        this.add(peso); this.add(P1); this.add(prezzo); this.add(P2);
        
    }//costruttore
    
}//class
