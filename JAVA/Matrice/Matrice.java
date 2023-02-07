package Matrice;

public class Matrice {
    public static void main(String[] args){
        //dichiarazione matrice
        int matrice[][]=new int[2][3];
        int matriceT[][] = new int[3][2];

        //definizione matrice
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrice[i][j] = (int)(Math.random()*50) + 1;
            }
        }

        System.out.println("Matrice:");

        //stampa matrice
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }

        //trasposta matrice
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matriceT[j][i]=matrice[i][j];
            }
        }

        System.out.println("Matrice tasposta");

        //stampa matrice
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(matriceT[i][j] + "\t");
            }
            System.out.println();
        }
    }//main
}//class
