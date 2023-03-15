package StampaNumeri;

import java.util.Scanner;

public class Operatore {
    public static void main(String[] args) {
        
        //dichiarazione scanner
        Scanner tastiera = new Scanner(System.in);
        Scanner tastiera1 = new Scanner(System.in);

        //dichiarazione variabili
        String nome;
        int eta;
        Persona classe[] = new Persona[3];

        System.out.println("Inserisi i nomi e le eta dei ragazzi:");

        for (int i = 0; i < classe.length; i++) {
            System.out.println("Raggazzo n." + i+1);

            System.out.print("nome: ");
            nome = tastiera.nextLine();
            System.out.print("eta: ");
            eta = tastiera1.nextInt();

            Persona persona1 = new Persona(nome, eta);
            classe[i] = persona1;
        }//for

        for (int i = 0; i < classe.length; i++) {
            System.out.println(classe[i]);
        }

        tastiera.close();
        tastiera1.close();
    }//main
}//classe
