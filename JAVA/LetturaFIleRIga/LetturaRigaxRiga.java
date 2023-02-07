
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetturaRigaxRiga{
    public static void main(String[] args) {
        
        //questo èe il percorso file del testo da leggere
        String filePath = "C:/Users/marco/OneDrive/Escritorio/4CI/JAVA/LetturaFIleRIga/testo.txt";

        try {

            //creare un contenuto file reader per leggere il file
            FileReader reader = new FileReader(filePath);
            BufferedReader buff = new BufferedReader(reader);

            //leggere riga per riga e stampare il contenuto
            String riga = buff.readLine();
            while (riga != null) {
              System.out.println(riga);
              riga = buff.readLine();
            }

            //chiusura del file
            buff.close();

        } catch (IOException e) {
            System.out.println("ERRORE!!!");
            e.printStackTrace();
            System.exit(1);
        }

    }//main
}//class