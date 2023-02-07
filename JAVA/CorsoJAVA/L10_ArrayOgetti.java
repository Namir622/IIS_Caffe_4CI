package CorsoJAVA;

public class L10_ArrayOgetti {
    public static void main(String[] args) {
        
        
        

        L7_Persona persona1 = new L7_Persona("Luca", "Rossi", 25, "blu");
        L7_Persona persona2 = new L7_Persona("Marco", "Versi", 35, "Rosso");
        L7_Persona persona3 = new L7_Persona("Anna", "Neri", 23, "Giallo");

        /*persone[0] = persona1;
        persone[1] = persona2;
        persone[2] = persona3;*/

        L7_Persona[] persone = {persona1, persona2, persona3};

        for (int index = 0; index < persone.length; index++) {
            
            System.out.println(persone[index]);
            
        }
    }
}
