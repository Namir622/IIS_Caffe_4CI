package Trinagolo;

public class Triangolo {
    double lato1, lato2, lato3;
    double perimetro;

    Triangolo(double lato1, double lato2, double lato3){
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }//triangolo scaleno
    Triangolo(double lato1, double lato2){
        this.lato1 = lato1;
        this.lato2 = lato2;
    }//triangolo isoscele
    Triangolo(double lato1){
        this.lato1 = lato1;
    }//triangolo equulatero

    //metodi per calcolare il perimetro 
    public double perimetroScaleno(){
        perimetro = this.lato1+this.lato2+this.lato3;
        return perimetro;
    }
    public double perimetroIsoscele(){
        perimetro = this.lato1+(this.lato2*2);
        return perimetro;
    }
    public double perimetroEquilatero(){
        perimetro = this.lato1*3;
        return perimetro;
    }
}
