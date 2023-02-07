package CorsoJAVA;
/*
 * equals
 * equalsIgnoreCase
 * lenght
 * cartAt
 * indexOf
 * isEmpty
 * toUppercase
 * toLowercase
 * trim
 * replace
 */
public class L3_MetodiStringe {
    public static void main(String[] args) {
        
        String nome = "Leonardo";

        //boolean risultato = nome.equals("Leonardo");//dice se è uguale alla stringa CASE SENSITIVE

        //boolean risultato = nome.equalsIgnoreCase("Leonardo");//dice se è uguale alla stringa NON CASE SENSITIVE

        //int risultato = nome.length();//fornisce la lungezza della stringa

        //char risultato = nome.charAt(0);//ti dice quale carattere è in quella posizione

        //int risultato = nome.indexOf("a");//ti dice in che posizione è quel carattere

        //boolean risultato = nome.isEmpty();//ti dice se la stringa è vuota o no

        //String risultato = nome.toUpperCase();
        //String risultato = nome.toLowerCase();

        //String risultato = nome.trim();

        String risultato = nome.replace('o', 'w');





        System.out.println(risultato);




    }
}
