package CorsoJAVA;

public class L7_intruduzione_OOP {
    public static void main(String[] args) {
        
        //definire istanze della classe
        L7_Persona persona1 = new L7_Persona("Luca", "rossi", 25, "blu");
        L7_Persona persona2 = new L7_Persona("marco", "verdi", 35, "Rosso");

        System.out.println(persona1.toString());
        System.out.println(persona2.cognome);

        //stampare una variabile statica
        System.out.println(L7_Persona.numeroPersone);
        
        

        persona1.saluta();
        persona1.saluta(persona2);



        //L8_pizza pizza1 = new L8_pizza("integrale", "pomodoro", "mozzarella", "ananas");
        //L8_pizza pizza2 = new L8_pizza("5 Cereali");
        //L8_pizza pizza3 = new L8_pizza("normale", "pomodoro", "mozzarella");
    }
}
