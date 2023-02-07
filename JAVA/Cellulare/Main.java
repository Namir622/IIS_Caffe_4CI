package Cellulare;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        Scanner tastiera2 = new Scanner(System.in);

        // inizializazione array
        Cellulare cell[] = new Cellulare[3];

        for (int i = 0; i < cell.length; i++) {
            System.out.println("Inserisci il codice, prezzo e ore di autonomia del cellulare n. " + i + 1);
            int codice = tastiera.nextInt();
            double prezzo = tastiera2.nextDouble();
            int oreAutonomia = tastiera.nextInt();

            cell[i] = new Cellulare(codice, prezzo, oreAutonomia);

        } // for

        // media dei prezzi
        int tot = 0;
        for (Cellulare cellulare : cell)
            tot += cellulare.prezzo;

        double media = tot / cell.length;
        System.out.println("la media dei prezzi è: " + media);

        // media delle ore di autonomia
        tot = 0;
        for (Cellulare cellulare : cell)
            tot += cellulare.oreAuronomia;

        media = tot / cell.length;
        System.out.println("la media delle ore di autonomia è: " + media);

        // il prezzo maggiore
        double max = 0;
        int i = 0;
        for (Cellulare cellulare : cell) {
            if (cellulare.prezzo > max) {

                max = cellulare.prezzo;
                i++;
            } // if
        } // for
        System.out.println("Il cellulare con il przzo magione è nella posizione " + i);

        // Eliminazione cellulare
        System.out.print("Inserisci la posizione del cellulare da eliminare: ");
        int posizione = tastiera.nextInt();

        Cellulare[] cell2 = null;
        // Cellulare tmp;

        /*
         * for (int j = 0; j < cell.length; j++) {
         * 
         * if(j != posizione){
         * cell2[j] = cell[j];
         * }
         * }
         * 
         * for (int j = 0; j < cell2.length; j++) {
         * System.out.print(cell2[j]);
         * }
         */

        for (int x = 0; x < cell.length - 1; x++) {
            if (x == posizione) {
                cell2 = new Cellulare[cell.length - 1];
                for (int index = 0; index < x; index++) {
                    cell2[index] = cell[index];
                }
                for (int j = x; j < cell.length - 1; j++) {
                    cell2[j] = cell[j + 1];
                }
                break;
            }
        }

        for (int j = 0; j < cell2.length; j++) {
            System.out.print(cell2[j]);
        }

        tastiera.close();
        tastiera2.close();
    }// main
}// class
