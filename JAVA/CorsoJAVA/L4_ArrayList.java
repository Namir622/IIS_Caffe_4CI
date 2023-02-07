package CorsoJAVA;

import java.util.ArrayList;


public class L4_ArrayList {
    public static void main(String[] args) {

        //nuovo ArrayList
        ArrayList<String> persone = new ArrayList<String>();

        //aggiungere un elemento
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");

        //modificare un elemento
        persone.set(1, "Mirko");

        //rimuovere un elemento
        persone.remove(0);

        //Cancellare tutto
        //persone.clear();

        //stampare elemento
        for (int index = 0; index < persone.size(); index++) {
            System.out.println(persone.get(index));

        }
        
    }
} 