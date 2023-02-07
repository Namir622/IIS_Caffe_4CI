package ArrayList;

import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {

        //Dichiarazione ArrayList
        ArrayList<String> persone = new ArrayList<String>();

        persone.add("Ciccio");
        persone.add("Pluto");
        persone.add("Paperino");
        persone.add("Roberto");

        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));
        }

        System.out.println();

        persone.clear();
        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));
        }


        ArrayList<Integer> eta = new ArrayList<Integer>();
        eta.add(17);
        eta.add(20);
        eta.add(32);
        eta.add(12);
    }//main
}//Class
