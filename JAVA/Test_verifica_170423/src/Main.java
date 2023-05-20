import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main implements ActionListener{

    Componenti componenti;

    Main(){

        componenti = new Componenti();

        componenti.read.addActionListener(this);
        componenti.modifica.addActionListener(this);
        componenti.write.addActionListener(this);
        
    }//costruttore


    public static void main(String[] args)  {

        new Main();
        

    }//main 







    @Override
    public void actionPerformed(ActionEvent e) {
       try {

            FileReader lettura = new FileReader("info.txt");
            BufferedReader buffer = new BufferedReader(lettura);
            String str = new String();

            if (e.getSource() == componenti.read) {

                str = buffer.readLine();

                componenti.coso.setText(str);

                
            }//if





       } catch (Exception e1) {
        // TODO: handle exception
       }//catch
       
       
       
       
       
        
    }//actionPerformed


}//class
