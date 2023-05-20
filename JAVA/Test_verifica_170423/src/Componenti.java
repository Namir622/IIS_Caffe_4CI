import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Componenti extends JFrame{

    JTextField coso;
    JButton read;
    JButton modifica;
    JButton write;



    Componenti(){
        this.setBounds(800, 400, 500, 400);
        this.setBackground(Color.red);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);


        //Pannello titolo
        JPanel titolo = new JPanel();
        titolo.setBackground(Color.yellow);
        titolo.setPreferredSize(new Dimension(500,25));
        JLabel str = new JLabel("Visualizatore e modificatore di file");
        titolo.add(str);
        this.add(titolo, BorderLayout.NORTH);



        //pannello visualizazione
        JPanel visualizatore = new JPanel();
        visualizatore.setBackground(Color.BLACK);
        coso = new JTextField();
        coso.setEditable(false);
        coso.setPreferredSize(new Dimension(500,200));
        visualizatore.add(coso);
        this.add(visualizatore, BorderLayout.CENTER);

        //Pannello bottoni
        JPanel bottoni = new JPanel();
        bottoni.setPreferredSize(new Dimension(500,40));
        bottoni.setBackground(Color.green);
        read = new JButton("READ");
        modifica = new JButton("MODIFICA");
        write = new JButton("WRITE");
        bottoni.add(read); bottoni.add(modifica); bottoni.add(write);
        this.add(bottoni, BorderLayout.SOUTH);


        this.setVisible(true);
    }//costruttore
}
