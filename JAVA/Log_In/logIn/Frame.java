package logIn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Frame extends JFrame implements ActionListener{

    Frame(){
        //definiam,o il frame
        this.setTitle("LogIn Database");
        this.setBounds(500, 500, 470,300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //creiamo l'istanza del pannello principale
        Panel_Principale principale = new Panel_Principale();

        //aggiungiamo il panello principale al frame
        this.add(principale);

        Panel_Input.Accept.addActionListener(this);
        Panel_Input.Cancel.addActionListener(this);

        this.setVisible(true);
    }




    public static void main(String[] args) {
        new Frame();

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        
            boolean i = true;
            boolean j = true;
            try (FileReader r = new FileReader("logIn/credenziali.txt")) {
                BufferedReader reader = new BufferedReader(r);

                if (e.getSource() == Panel_Input.Accept){
                    String t1 = Panel_Input.Username.getText();
                    String t3 = Panel_Input.Password.getText();
                    while (i != false){
                        String s = reader.readLine();
                        String s2 = reader.readLine();
                        String s3 = reader.readLine();
                        if (s2 == null){
                            i = false;

                            if (j == true){

                                JOptionPane.showMessageDialog(null, "Accesso fallito", "ERRORE", JOptionPane.WARNING_MESSAGE);

                            }

                        }else{
                            s = s.trim();
                            s = s.toLowerCase();
                            String t2 = t1.toLowerCase();

                            if (s.equals(t2) && s2.equals(t3)){
                                
                                JOptionPane.showMessageDialog(null, "Accesso eseguito");

                                j = false;
                            }
                        }
                    }
                }else {
                    
                    System.exit(0);  

                }
            } catch (HeadlessException | IOException e1) {
                e1.printStackTrace();
            }
        
    }//actionlistener
    
}//class
