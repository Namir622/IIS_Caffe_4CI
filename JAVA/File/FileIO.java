
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
  public static void main(String[] args) {
    // il percorso del file da leggere
    String filePath = "C:/Users/marco/OneDrive/Escritorio/4CI/JAVA/File/test.txt";

    // il testo da scrivere nel file
    String textToWrite = "Questo testo verra scritto.";

    try {
      // crea un oggetto FileReader per leggere il file
      FileReader reader = new FileReader(filePath);

      // leggi il file riga per riga e stampa il contenuto
      int c = reader.read();
      while (c != -1) {
        System.out.print((char) c);
        c = reader.read();
      }

      // crea un oggetto FileWriter per scrivere nel file
      FileWriter writer = new FileWriter(filePath);

      // scrivi il testo nel file
      writer.write(textToWrite);

      // chiudi i lettori/scrittori per salvare il file
      reader.close();
      writer.close();

    } catch (IOException e) {
      System.out.println("ERRORE!!!");
      e.printStackTrace();
      System.exit(1);
    }

  }// main
}// class
