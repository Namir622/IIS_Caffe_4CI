package Trinagolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double lato1, lato2, lato3;

        Scanner line = new Scanner(System.in);
        Scanner lato = new Scanner(System.in);

        System.out.println("Inserisci il tipo di triangolo || Scaleno, Iscoscele, Equilatero: ");
        String scelta = line.nextLine();
        char s = scelta.toLowerCase().charAt(0);

        switch (s) {
            case 's':
                System.out.println("Inserisci la misura dei tre lati del triangolo: ");
                lato1 = lato.nextDouble();
                lato2 = lato.nextDouble();
                lato3 = lato.nextDouble();

                Triangolo T1 = new Triangolo(lato1, lato2, lato3);

                System.out.println("Il perimetro del triangolo scaleno è: " + T1.perimetroIsoscele());

                break;
            case 'i':
                System.out.println("Inserisci la misura dei due lati del triangolo: ");
                lato1 = lato.nextDouble();
                lato2 = lato.nextDouble();

                Triangolo T2 = new Triangolo(lato1, lato2);

                System.out.println("Il perimetro del triangolo isoscele è: " + T2.perimetroIsoscele());

                break;
            case 'e':
                System.out.println("Inserisci la misura del lato del triangolo: ");
                lato1 = lato.nextDouble();

                Triangolo T3 = new Triangolo(lato1);

                System.out.println("Il perimetro del triangolo equilatero è: " + T3.perimetroIsoscele());

                break;

            default:
                System.out.println("Stringolo inesistente=====\"Errore\"");
                break;
        }//switch

        line.close();
        lato.close();
    }// main
}// class
