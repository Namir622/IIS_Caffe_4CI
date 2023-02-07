import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Panello extends JPanel implements ActionListener{

    JLabel NUMERO; 
    JButton incrementa;
    JButton decrementa;


    Panello(){
        super();

        this.setLayout(null);

        //definiamo il JLabel
        NUMERO = new JLabel("0", SwingConstants.CENTER);

        NUMERO.setFont(new Font("Serif", Font.BOLD, 30));
        NUMERO.setBackground(Color.CYAN);
        NUMERO.setForeground(Color.white);
        NUMERO.setOpaque(true);
        NUMERO.setBounds(125, 100, 50, 30);

        //definiamo i pulsanti per incrementare e decrementare
        incrementa = new JButton("Incrementa");
        decrementa = new JButton("Decrementa");

        incrementa.setBounds(172, 170, 105, 30);
        decrementa.setBounds(22, 170, 105, 30);

        incrementa.addActionListener(this);
        decrementa.addActionListener(this);



        //aggiungiamo tutti i componenti
        add(NUMERO);

        add(incrementa); add(decrementa);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //dichiariamo le variabili di appogio
        String str;
        int risultato;

        //primo caso
        if (e.getSource()==incrementa) {
            
            //trasformiamo in un numero
            str = NUMERO.getText();
            risultato = Integer.parseInt(str);

            //calcolo
            risultato++;

            //trasformiamo in una stringa
            str = String.valueOf(risultato);
            NUMERO.setText(str);

        }else if (e.getSource()==decrementa) {

                //trasformiamo in un numero
                str = NUMERO.getText();
                risultato = Integer.parseInt(str);

                //calcolo
                risultato--;

                //trasformiamo in una stringa
                str = String.valueOf(risultato);
                NUMERO.setText(str);
                
        }     
    }
    
}
