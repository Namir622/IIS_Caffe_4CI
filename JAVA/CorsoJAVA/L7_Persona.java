package CorsoJAVA;

public class L7_Persona {
     
     //attibuti
     String nome;
     String cognome;
     int eta;
     String colorePreferito;
     //è condiviso tra tutte le istanze
     static int numeroPersone;

     //costruttore
     L7_Persona(String nome, String cognome, int eta, String colorePreferito){

        //this serve a legare una variabile ad una sola istanza quando viene creata 
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
        numeroPersone++;

     }//costruttore

     public String toString(){
        String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito;
        return stringa;
     }

     void saluta(){
        System.out.println("ciao " + nome);
    }//metodo saluta
    
     void saluta(L7_Persona personaDaSalutare){
     System.out.println("ciao " + personaDaSalutare.nome + " sono " + this.nome);
    }//metodo saluta

     void cammina(){
        System.out.println("Sto camminado...");
    }//metodo mannina

}//class