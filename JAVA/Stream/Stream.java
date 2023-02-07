package Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stream {
    public static void main(String[] args) {

        //dichiarazione variabili
        int nintero;
        float nfloat;
        double ndouble;
        short nshort;
        long nlong;
        boolean nboolean;
        char nchar;
        byte nbyte;
        String nString, stringa;
        
        //input
        try {
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader tastiera = new BufferedReader(input);

            System.out.print("Insetrisci un numero intero: ");
            nintero = Integer.parseInt(tastiera.readLine());

            System.out.print("Insetrisci un numero con la virgola(float): ");
            nfloat = Float.parseFloat(tastiera.readLine());

            System.out.print("Insetrisci un numero con la virgola(double): ");
            ndouble = Double.parseDouble(tastiera.readLine());

            System.out.print("Insetrisci un numero short: ");
            nshort = Short.parseShort(tastiera.readLine());

            System.out.print("Insetrisci un numero long: ");
            nlong = Long.parseLong(tastiera.readLine());

            System.out.print("Insetrisci un numero boolean: ");
            nboolean = Boolean.parseBoolean(tastiera.readLine());

            System.out.print("Insetrisci un numero byte: ");
            nbyte = Byte.parseByte(tastiera.readLine());

            System.out.print("Insetrisci un numero char: ");
            stringa = tastiera.readLine();
            nchar = stringa.charAt(0);

            System.out.print("Insetrisci una stringa: ");
            nString = tastiera.readLine();



            System.out.println("============================");
            System.out.print("Variabile intero: " + nintero + "\n");
            System.out.print("Variabile float: " + nfloat + "\n");
            System.out.print("Variabile double: " + ndouble + "\n");
            System.out.print("Variabile short: " + nshort + "\n");
            System.out.print("Variabile long: " + nlong + "\n");
            System.out.print("Variabile boolean: " + nboolean + "\n");
            System.out.print("Variabile byte: " + nbyte + "\n");
            System.out.print("Variabile char: " + nchar + "\n");
            System.out.print("Variabile String: " + nString + "\n");

        } catch (IOException e) {
            System.out.println("ERRORE!!!");
            
        } catch(NumberFormatException e){
            System.out.println("Inserisci Un valore corretto...");
        }

        /*e.printStackTrace();
        System.exit(1);*/
    }//main
}//class