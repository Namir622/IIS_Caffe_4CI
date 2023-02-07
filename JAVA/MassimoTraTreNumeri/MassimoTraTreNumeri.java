package MassimoTraTreNumeri;

//import delle classi
import java.util.Scanner;

public class MassimoTraTreNumeri {
        public static void main(String args[]){

        //dichiarazione variabili
        int a, b, c, massimo=0;

        Scanner tastiera = new Scanner(System.in);

        //Input
        System.out.print("\n Inserisci il primo numero: ");
        a = tastiera.nextInt();
        System.out.print("\n Inserisci il secondo numero: ");
        b = tastiera.nextInt();
        System.out.print("\n Inserisci il terzo numero: ");
        c = tastiera.nextInt();

        //elaborazione
        if (a>b) 
        {
            if (a>c) massimo = a; 
            else massimo = c;
        } else 
          {
            if (b>c)  massimo = b;
            else  massimo = c; 
          }

        //output
        System.out.print("/nIl massimo dei nuemri inseriti e': " +massimo);
        tastiera.close();
        }//main
}//class
