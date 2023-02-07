package If_else_semplice;

import java.util.Scanner;

public class If_else_semplice {
    public static void main(String[] args) {
        
        //dichierazione variabili
        int Num;

        //inseriemnto del numero
        try (Scanner tastiera = new Scanner(System.in)) {
            System.out.println("Inserisci il numero:");
            Num = tastiera.nextInt();
        }

        //elaborazione
         if (Num > 0) { Num = Num*Num*Num;} 
        else { Num = Num*Num;}

        //output del risultato
        System.out.println(Num);
    }
}