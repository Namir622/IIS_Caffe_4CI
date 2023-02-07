package Villa;

public class Alloggio {
    private int codice;
    private int numPersone;
    private double metriQuadri;

    Alloggio(int codice, int numPersone, double metriQuadri){
        this.numPersone = numPersone;
        this.codice = codice;
        this.metriQuadri = metriQuadri;
    }//costruttore


    public int getCodice() {
        return codice;
    }
    public double getMetriQuadri() {
        return metriQuadri;
    }
    public int getNumPersone() {
        return numPersone;
    }

    
    public double costoAcqua(double quota){
        double acqua;
        acqua = quota*this.numPersone;
        return acqua;
    }//costo dell'acqua

    public double valore(double valoreIm){
        double valoreTot;
        valoreTot = valoreIm*this.metriQuadri;
        return valoreTot;
    }//valore tutale dell'allogio

    public double densita(){
        double densita;
        densita = this.metriQuadri*this.numPersone;
        return densita;
    }
}
