package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner tastiera = new Scanner(System.in);

        int mese;
        
        do {
            System.out.println("Inserisci il numero del mese || inserisci \"0\" per uscire:");
            mese = tastiera.nextInt();

            switch (mese) {
                case 1: System.out.println("Il mese corrispodente è gennaio");
                        break;
                case 2: System.out.println("Il mese corrispodente è Febbraio");
                        break; 
                case 3: System.out.println("Il mese corrispodente è Marzo");
                        break;
                case 4: System.out.println("Il mese corrispodente è Aprile");
                        break;
                case 5: System.out.println("Il mese corrispodente è Maggio");
                        break;
                case 6: System.out.println("Il mese corrispodente è Giugno");
                        break;
                case 7: System.out.println("Il mese corrispodente è Luglio");
                        break;
                case 8: System.out.println("Il mese corrispodente è Agosto");
                        break;
                case 9: System.out.println("Il mese corrispodente è Settembre");
                        break;
                case 10: System.out.println("Il mese corrispodente è Ottobre");
                        break;
                case 11: System.out.println("Il mese corrispodente è Novembre");
                        break;
                case 12: System.out.println("Il mese corrispodente è Diciembre");
                        break;       
            
                default: System.out.println("Il numero da lei inserito è errato, riprovare");
                    break;
            }//switch
        } while (mese!=0); 
        tastiera.close();
    }//main
}//class
