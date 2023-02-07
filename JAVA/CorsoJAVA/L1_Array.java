package CorsoJAVA;

public class L1_Array {
    public static void main(String[] args) {
        
        int[] numeri = new int[3];

        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;

        System.out.println(numeri.length);
        System.out.println(numeri[2]);
        
        numeri[2] = 100;
        System.out.println(numeri[2]);

        int[] numeri2 = {10, 20, 30, 40};
        System.out.println(numeri2[1]);

       /*  for (int i = 0; i < numeri2.length; i++) {
            System.out.println(numeri2[i]);
        }*/

        for (int x : numeri2) {
            System.out.println(numeri2[x]);
        }
    }
}
