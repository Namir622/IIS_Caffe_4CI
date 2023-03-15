package Jbutton;

import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;

    MyFrame(){
        button = new JButton("PREMIMI");
        button.setBounds(150, 100, 100, 50);
        button.addActionListener(this);
    
    
        this.setTitle("Pagina con bottone");
        this.setSize(400, 400);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
    }//costruttore

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            System.out.println("Mi hai premuto!!!");
        }
    }
}//class
