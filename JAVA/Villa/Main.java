package Villa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //dichiaraqzione variabili
        final double valoreAllogio = 2000.0;
        final double valoreGiardino = 700.0;
        final double costoAcqua = 15.5;

        int codice;
        int numPersone;
        double metriquadri;
        double metriquadriGiardino;
        Alloggio A1;
        Villa V1;

        Scanner tastiera = new Scanner(System.in);

        String Info;
        int i;

        do {
            System.out.println();
            System.out.println("=============================================================");
            System.out.print("1.Gestione Allogio\n2.Gestione villa\n0.Exit\nInserire numero: ");
            i = tastiera.nextInt();

            switch (i) {
                case 1  :System.out.println("Inserisci codice, Numero persone e metri quadri dell'alloggio: ");
                         codice = tastiera.nextInt();
                         numPersone = tastiera.nextInt();
                         metriquadri = tastiera.nextDouble();
                         System.out.println("================================================================");

                         A1 = new Alloggio(codice, numPersone, metriquadri);

                         Info = "";
                         Info = "Codice stanza: " + A1.getCodice() + "\tNumero Persone: " + A1.getNumPersone();
                         Info = Info + "\nMetri quadri: " + A1.getMetriQuadri();
                         Info = Info  + "\nValore dell'acqua: " + A1.costoAcqua(costoAcqua);
                         Info = Info + "\nValore Alloggio: " + A1.valore(valoreAllogio) + "\nDensita della stanza: " + A1.densita();
                        System.out.println(Info);
                    break;
            
                case 2  :System.out.println("Inserisci codice, Numero persone, metri quadri e dimensione del giardino della villa: ");
                         codice = tastiera.nextInt();
                         numPersone = tastiera.nextInt();
                         metriquadri = tastiera.nextDouble();
                         metriquadriGiardino = tastiera.nextDouble();
                         System.out.println("======================================================================================");

                         V1 = new Villa(codice, numPersone, metriquadri, metriquadriGiardino);

                         Info = "";
                         Info =  "Codice stanza: " + V1.getCodice() + "\nNumero Persone: " + V1.getNumPersone();
                         Info = Info + "\nMetri quadri: " + V1.getMetriQuadri() + "\nMetri quadri giardino: " + V1.getGiardino();
                         Info = Info + "\nValore Alloggio: " + V1.valore(valoreAllogio, valoreGiardino);
                         Info = Info + "\nValore dell'acqua: " + V1.costoAcqua(costoAcqua);
                         Info = Info + "\nDensita della stanza: " + V1.densita();
                         System.out.println(Info);
                    
                    break;
            
                default:System.out.println("Inserire un valore corretto");
                    break;
            }
            
        } while (i != 0);
        tastiera.close();
    }
}
