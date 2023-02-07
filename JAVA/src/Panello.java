import java.awt.Color;

//import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panello extends JPanel{
    public Panello(){
        super();
        this.setBackground(Color.red);

        //creiamo il bottone
        //JButton bottone = new JButton("Somma!!!");

        //creiamo gli spazzi per inserire i numeri
        JTextField Numero_1 = new JTextField(10);
        JTextField Numero_2 = new JTextField(10);


        //andiamo ad aggiungere tutti gli elementi 
        add(Numero_1); add(Numero_2); 
        //add(bottone);
    }
}
