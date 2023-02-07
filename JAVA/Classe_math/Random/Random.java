package Classe_math.Random;


import java.util.Scanner;

public class Random {
    
    public static void main(String[] args) {
        
        int Num1, Num2, Num3, NumRand;

        try (Scanner tastiera = new Scanner(System.in)) {
            System.out.print("\n Inserisci il numero minimo: ");
            Num1 = tastiera.nextInt();
            System.out.print("\n Inserisci il numero massimo: ");
            Num2 = tastiera.nextInt();
        }

        Num3 = Num2 - Num1;


        for(int i=0; i<10; i++){

            NumRand = (int) (Num1 + (Num3 * Math.random()));
            System.out.println(NumRand);

        }//for
    }
}