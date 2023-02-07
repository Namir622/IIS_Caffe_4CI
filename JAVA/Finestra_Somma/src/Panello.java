import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Panello extends JPanel implements ActionListener{
    JButton bottone;
    JTextField Numero_1;
    JTextField Numero_2;
    JLabel T5;
    double risultato;

    public Panello(){
        super();

        this.setLayout(null);
        this.setBackground(Color.yellow);

        //creiamo delle scritte da mettere sul pannello
        JLabel T1 = new JLabel("N.1");
        JLabel T2 = new JLabel("N.2");
        JLabel T3 = new JLabel("Inserisci i numeri da sommare:");
        JLabel T4  = new JLabel("Il risultato è:");
        T5 = new JLabel();

        T1.setBounds(80, 60, 20, 20);
        T2.setBounds(80, 80, 20, 20);
        T3.setBounds(70, 5, 200, 40);
        T4.setBounds(50, 180, 100, 50);
        T5.setBounds(125, 180, 200, 50);

        
        //creiamo gli spazzi per inserire i numeri e li inseriamo nel panel
        Numero_1 = new JTextField(10);
        Numero_2 = new JTextField(10);
        
        Numero_1.setBounds(105, 60, 90, 20);
        Numero_2.setBounds(105, 80, 90, 20);


        //creiamo il bottone e lo inseriamo nel panello
        bottone = new JButton("Somma!!!");

        bottone.setBounds(100,110, 100, 30);

        bottone.addActionListener(this);


        //andiamo ad aggiungere tutti gli elementi 
        add(Numero_1); add(Numero_2); 
        add(bottone);
        add(T1); add(T2); add(T3); add(T4); add(T5);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            if (e.getSource() == bottone) {
            
                //prendo i valori dal primo text field
                String strNumero_1 = Numero_1.getText();
                double N1 = Double.parseDouble(strNumero_1);
                //prendo i valori dal secondo text field
                String strNumero_2 = Numero_2.getText();
                double N2 = Double.parseDouble(strNumero_2);
    
                //sommo entrambi i valori 
                risultato = N1 + N2;
                String str = String.valueOf(risultato);
                T5.setText(str);
            }//if2
            
        } catch (Exception exc) {
            T5.setText("INSERISCI ENTRAMBI I NUMERI!!!");
        }//catch
        
    }//actionEvent
}//class
