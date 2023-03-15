package Cerchio;

public class Cerchio {
    
    private int raggio;
    private final double Pgreco = 3.14;


    Cerchio(int raggio){
        this.raggio = raggio;
    }//costruttore

    public double Perimetro(){
        double p;

        p = (this.raggio*2)*Pgreco;

        return p;
    }//method

    public double Area(){
        double a;

        a = ((this.raggio*this.raggio)*Pgreco)/4;

        return a;
    }//method

    public int Diametro(){
        int d;

        d = this.raggio*2;
        
        return d;
    }//method

    public int numeri(int i){

        int array[] = {2,5, 6, 12,45,67};

        return array[i];
    }
}
