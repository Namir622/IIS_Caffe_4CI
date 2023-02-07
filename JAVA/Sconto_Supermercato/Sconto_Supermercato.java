package Sconto_Supermercato;

import java.util.Scanner;

public class Sconto_Supermercato {
    public static void main(String[] args) {
        
    
    Scanner tastiera = new Scanner(System.in);
    Scanner tastiera2 = new Scanner(System.in);
    Scanner tastiera3 = new Scanner(System.in);

    String nome, metodo;
    int prezzo, tmp;

    

    System.out.println("Inserisci il nome del prodotto");
    nome = tastiera.nextLine();
    System.out.println("Inserisci il prezzo del prodotto:");
    prezzo = tastiera2.nextInt();
    System.out.println("Inserisci il metodo di pagamento(c-contanti || b-bancomat):");
    metodo = tastiera3.nextLine();

    tmp = prezzo;

    if (prezzo > 3000) { tmp = (tmp/100)*6;
    prezzo-=tmp;}

    tmp = prezzo;
    
    if (metodo == "c") {tmp = (tmp/100)*2;
    prezzo-=tmp;}

    System.out.println("Il prezzo finale del prodotto " + nome + " é di " + prezzo + " euro");

    tastiera.close();
    tastiera2.close();
    tastiera3.close();
    }//main
}//class