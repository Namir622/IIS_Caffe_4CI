import javax.swing.*;
import java.awt.*;

public class Pannello extends JPanel implements ActionListener{
    Pannello(){
        this.setLayout(new GridLayout(4,4));
        this.setBackground(Color.yellow);

        JButton Numero1 = new JButton();
        JButton Numero2 = new JButton();
        JButton Numero3 = new JButton();
        JButton Numero4 = new JButton();
        JButton Numero5 = new JButton();
        JButton Numero6 = new JButton();
        JButton Numero7 = new JButton();
        JButton Numero8 = new JButton();
        JButton Numero9 = new JButton();
        JButton Numero0 = new JButton();
        JButton OperazioneMoltiplicazione = new JButton();
        JButton OperazioneDivisone = new JButton();
        JButton OperazioneSotrazzione = new JButton();
        JButton OperazioneSomma = new JButton();
        JButton OperazioneCancella = new JButton();
        JButton OperazioneRisultato = new JButton();

        this.add(Numero1);
        this.add(Numero2);
        this.add(Numero3);
        this.add(Numero4);
        this.add(Numero5);
        this.add(Numero6);
        this.add(Numero7);
        this.add(Numero8);
        this.add(Numero9);
        this.add(OperazioneMoltiplicazione);
        this.add(OperazioneDivisone);
        this.add(OperazioneSotrazzione);
        this.add(OperazioneSomma);
        this.add(OperazioneCancella);
        this.add(OperazioneRisultato);
        this.add(Numero0);


    }
}
