package ContoCorrente;

public class UsaContoCorrente {
    public static void main(String[] args) {
        ContoCorrente C1 = new ContoCorrente("Gianni", 245);
        ContoCorrente C2 = new ContoCorrente("Roberto", 378, 40700);
        ContoCorrente C3 = new ContoCorrente("Ciccio", 975, 62000);

        
        System.out.println("Numero di conto: " + C1.getNumeroDiConto());
        System.out.println("Intestatario: " + C1.getIntestatario());
        System.out.println("Saldo: " + C1.getSaldo());

        System.out.println("\n");

        System.out.println("Numero di conto: " + C2.getNumeroDiConto());
        System.out.println("Intestatario: " + C2.getIntestatario());
        System.out.println("Saldo: " + C2.getSaldo());

        System.out.println("\n");

        System.out.println("Numero di conto: " + C3.getNumeroDiConto());
        System.out.println("Intestatario: " + C3.getIntestatario());
        System.out.println("Saldo: " + C3.getSaldo());

        System.out.println("=================================");

        C1.prelievo(1000);
        C2.prelievo(1000);
        C3.prelievo(1000);

        C1.versamento(1500);
        C2.versamento(1500);
        C3.versamento(1500);

        System.out.println("=================================");

        System.out.println("Numero di conto: " + C1.getNumeroDiConto());
        System.out.println("Intestatario: " + C1.getIntestatario());
        System.out.println("Saldo: " + C1.getSaldo());

        System.out.println("\n");

        System.out.println("Numero di conto: " + C2.getNumeroDiConto());
        System.out.println("Intestatario: " + C2.getIntestatario());
        System.out.println("Saldo: " + C2.getSaldo());

        System.out.println("\n");

        System.out.println("Numero di conto: " + C3.getNumeroDiConto());
        System.out.println("Intestatario: " + C3.getIntestatario());
        System.out.println("Saldo: " + C3.getSaldo());
    }//main
}//class
