
import javax.swing.*;
import java.awt.event.*;

public class Year extends JPanel implements ActionListener{
    //dichiarazione variabili
    Double lira=1936.27;
    Double conv;
    Double soldi;
    String setlire;
    JTextField euro;
    JTextField lire;
    JLabel r1;
    JLabel r2;
    JButton premi;

    Year(){
        //elaborazione
        this.setLayout(null);
        euro=new JTextField();
        euro.setBounds(180,92,100,30);
        lire=new JTextField();
        lire.setBounds(155,233,100,30);
        premi=new JButton("Converti");
        premi.setBounds(0,150,400,50);
        premi.addActionListener(this);
        r1=new JLabel();
        r2=new JLabel();
        r1.setText("Inserire euro:");
        r1.setBounds(100,80,100,50);
        r2.setText("Lire:");
        r2.setBounds(120,220,40,50);
        add(euro);
        add(lire);
        add(premi);
        add(r1);
        add(r2);
    }
    
    public void actionPerformed(ActionEvent l) {
        try{
       if(l.getSource()==premi){
        //convertimento da euro a lire
        conv=Double.parseDouble(euro.getText());
        soldi=conv*lira;
        String testo = String.valueOf(soldi).toString();
        lire.setText(testo);
       }
        }catch(Exception e){
            System.out.println("euro un numero");
    }
    }
}