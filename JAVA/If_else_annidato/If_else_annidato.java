package If_else_annidato;

import java.util.Scanner;

public class If_else_annidato {
    public static void main(String[] args) {
        
        int Num1, Num2,risultato;

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il primo numero:");
        Num1 = tastiera.nextInt();
        System.out.println("Inserisci il secondo numero:");
        Num2 = tastiera.nextInt(); 
        
        
        if (Num1 < 0) { risultato = (Num1) - (Num2);} 
        else { if (Num2<0) {risultato = (Num1) - (Num2);} 
               else {risultato = (Num1) + (Num2);}
             }

        System.out.print("Il risultato é " + risultato);
        tastiera.close();
    }
}
