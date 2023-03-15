import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pannello extends JPanel implements ActionListener{
    Pannello(){
        this.setLayout(new GridLayout(4,4));
        this.setBackground(Color.yellow);

        JButton Numero1 = new JButton("1");
        JButton Numero2 = new JButton("2");
        JButton Numero3 = new JButton("3");
        JButton Numero4 = new JButton("4");
        JButton Numero5 = new JButton("5");
        JButton Numero6 = new JButton("6");
        JButton Numero7 = new JButton("7");
        JButton Numero8 = new JButton("8");
        JButton Numero9 = new JButton("9");
        JButton Numero0 = new JButton("0");
        JButton OperazioneMoltiplicazione = new JButton("X");
        JButton OperazioneDivisone = new JButton("/");
        JButton OperazioneSotrazzione = new JButton("-");
        JButton OperazioneSomma = new JButton("+");
        JButton OperazioneCancella = new JButton("Canc");
        JButton OperazioneRisultato = new JButton("=");

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

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
