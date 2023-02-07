package CorsoJAVA;

public class L6_OverloadedMethods {
    public static void main(String[] args) {
        int doppioInt = addizione(2,3);
        int triploInt = addizione(1, 10, 4);
        double doppioDouble = addizione(2.4, 2.7);

        System.out.println(doppioInt);
        System.out.println(triploInt);
        System.out.println(doppioDouble);
    }

    static int addizione(int n1, int n2) {
        int risultato = n1 + n2;
        return risultato;
    }
    static int addizione(int n1, int n2, int n3) {
        int risultato = n1 + n2 + n3;
        return risultato;
    }
    static double addizione(double n1, double n2) {
        double risultato = n1 + n2;
        return risultato;
    }

}
