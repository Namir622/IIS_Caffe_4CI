package ContoCorrente;

import java.util.Scanner;

public class ContoCorrenteMenu {
    public static void main(String[] args) {
        //Scanner
        Scanner num = new Scanner(System.in);
        Scanner parola = new Scanner(System.in);
        //variabili
        ContoCorrente C1;
        int scelta;

        System.out.print("Inserisci il numero di conto: ");
        int numero = num.nextInt();
        System.out.print("Inserisci il nome dell'intestatario: ");
        String nome = parola.nextLine();

        C1 = new ContoCorrente(nome, numero);
        
        do {
            System.out.println("1.Prelevare  2.versamento  3.Infomazioni conto  0.Exit");
            scelta = num.nextInt();

            switch (scelta) {
                case 1:System.out.print("Inserire l'importo del prelievo: ");
                       int prelievo = num.nextInt();
                       C1.prelievo(prelievo);
                       System.out.println("Prelievo effetuato con sucesso");
                    break;
                case 2:System.out.print("Inserire l'importo del versamento: ");
                       int versamento = num.nextInt();
                       C1.versamento(versamento);
                       System.out.println("Versamento effetuato con sucesso");
                       System.out.println("Nuovo saldo: " + C1.getSaldo());
                    break;
                case 3:System.out.print("Informazioni conto: \n");
                       String info = "";
                       info = info + "Numero di conto: " + C1.getNumeroDiConto() + "\nIntestatario: " + C1.getIntestatario() + "\nSaldo conto: " + C1.getSaldo();
                       System.out.println(info);
                    break;
                case 0:System.out.println("Uscendo...");
                    break;
            
                default:System.out.println("ERRORE!!!");
                    break;
            }
            
        } while (scelta != 0);
        num.close();
        parola.close();
    }
}