package Maggiorenne;

import java.util.Scanner;
public class Maggiorenne {

    public static void main(String[] args) {

        String Nome;
        int age;

        try (Scanner tastiera = new Scanner(System.in)) {
            System.out.println("Inserisci il nome");
            Nome = tastiera.nextLine();
            System.out.println("Inserisci l\'eta:");
            age = tastiera.nextInt();
        }

        if (age > 18) { System.out.println(Nome + " é maggiorenne");} 
        else {System.out.println(Nome + " non é maggionerre");}
    }
}
