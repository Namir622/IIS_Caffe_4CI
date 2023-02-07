package Classe_math.Random_Float;

import java.lang.Math;

public class Random_Float {
    public static void main(String[] args) {
        
    
        float NumRand;

        for(int i=0; i<10; i++){
            NumRand = (float) Math.random();
            System.out.println(NumRand);
        }//for
    }
}//class