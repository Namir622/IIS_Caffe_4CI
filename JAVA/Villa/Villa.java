package Villa;

public class Villa extends Alloggio{
    private double giardino;

    Villa(int codice, int numPersone, double metriQuadri, double giardino) {
        super(codice, numPersone, metriQuadri);
        this.giardino = giardino;
    }//costruttore

    public double getGiardino() {
        return giardino;
    }

    public double valore(double valoreAlloggio, double valoreGiardino){
        double valoreTot;
        valoreTot = getMetriQuadri()*valoreAlloggio+this.giardino*valoreGiardino;
        return valoreTot;
    }

    public double densita(){
        double densita;
        densita = (getMetriQuadri()+giardino)/getNumPersone();
        return densita;
    }
}