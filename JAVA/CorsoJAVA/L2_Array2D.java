package CorsoJAVA;

public class L2_Array2D {
    public static void main(String[] args) {

        String[][] classi = new String[3][3];

        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";

        classi[1][0] = "Edoardo";
        classi[1][1] = "Leonardo";
        classi[1][2] = "Antonio";

        classi[2][0] = "Arianna";
        classi[2][1] = "Paolo";
        classi[2][2] = "Andrea";
       
        /*for (int classe = 0; classe < classi.length; classe++) {
            System.out.println();
            for (int studente = 0; studente < classi[classe].length; studente++) {
                System.out.print(classi[classe][studente] + " ");
            }    
        }*/

        for (String[] classe : classi) {
            System.out.println();
            for (String studente : classe) {
                System.out.print(studente + " ");
            }
        }

        
    }//main
}//class
