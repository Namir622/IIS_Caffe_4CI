package Classe_math.Random_Int;




public class Random_Int {
    public static void main(String[] args) {
        
    
        int NumRand;

        for(int i=0; i<10; i++){

            NumRand = (int) (10 * Math.random());
            System.out.println(NumRand);

        }//for
    }
}
