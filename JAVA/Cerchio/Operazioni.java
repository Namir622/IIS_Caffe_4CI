package Cerchio;

import java.util.Scanner;

public class Operazioni{
    public static void main(String[] args) {
        int raggio;
        String scelta;

        Scanner tastiera = new Scanner(System.in);
        Scanner tastiera1 = new Scanner(System.in);

        System.out.println("Inserisci la misura del Raggio: ");
        raggio = tastiera.nextInt();

        Cerchio cerchio1 = new Cerchio(raggio);

        System.out.println("Quale azzione vuoi compiere(perimetro---area---diametro---numero): ");
        scelta = tastiera1.nextLine();

        //char tmp = scelta.charAt(0);

        switch (scelta) {
            case "perimetro": System.out.println(cerchio1.Perimetro());
                break;

            case "area": System.out.println(cerchio1.Area());
                break;

            case "diametro": System.out.println(cerchio1.Diametro());
                break;

            case "numero": System.out.println("Insaerisci la posizione della quale vuoi sapere il numero(max 5)");
                            int index = tastiera.nextInt();
                            System.out.println(cerchio1.numeri(index));
                break;
        
            default:System.out.println("Non esiste questa scelta");
                break;
        }//switch

        tastiera.close();
        tastiera1.close();

    }//main
}//class
