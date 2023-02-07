package CorsoJAVA;

public class L5_Metodi {
    public static void main(String[] args) {

        CucinaPranzo("carne");

        adizzione(4, 4);//passagio dei parametri e chiamata del metodo
    


    }//main

   static void CucinaPranzo(String cibo){
    System.out.println("Sto cucinando " + cibo);
   }//metodo

   static void adizzione(int n1, int n2){
    int risultato = n1+n2;
    System.out.println(risultato);
   }

}//classe
