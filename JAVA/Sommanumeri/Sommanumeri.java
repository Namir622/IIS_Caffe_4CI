package Sommanumeri;

import java.util.Scanner;

public class Sommanumeri{
		public static void main(String args[]){
			Scanner tastiera = new Scanner(System.in);
			int primoNumero;
			int secondoNumero;
			int risultato;


			System.out.println("Inserisci un numero");
			primoNumero = tastiera.nextInt();

			System.out.println("Inserisci un numero");
			secondoNumero = tastiera.nextInt();

			risultato = primoNumero+secondoNumero;

			System.out.println("La somma dei numeri e': " +risultato);
			
			tastiera.close();
		}//main
}//class