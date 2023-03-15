package Spesa;

import java.util.Scanner;

public class Stampa {
    public static void main(String[] args) {
        
        Lista spesa = new Lista();
        String scelta;
        //Scanner
        Scanner tastiera = new Scanner(System.in);
        Scanner tastiera1 = new Scanner(System.in);


        do {
            //chiedere scelta
            System.out.println("Cosa vuoi fare?(Inserire/Stampare prodotto)");
            scelta = tastiera.nextLine();

            //Elaborazione scleta
            switch (scelta) {
                case "Inserire": System.out.println("inseirsci il nome e il prezzo del rpodotto");
                            String nome = tastiera.nextLine();
                            int prezzo = tastiera1.nextInt();
                            Prodotto e = new Prodotto(nome, prezzo);
                            spesa.NuovoProdotto(e);
                    break;

                case "Stampare": spesa.StampaLista();
                    break;
            
                default:System.out.println("coglione");
                    break;
            }


        } while (scelta != "exit");

        tastiera.close();
        tastiera1.close();
    }
}
