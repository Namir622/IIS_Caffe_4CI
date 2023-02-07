package Negozio;

public class TipoCapoAbigliamento {
    protected String marca, modello;
    protected double costo;

    TipoCapoAbigliamento(String marca, String modello, double costo){
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }//costruttore

    public void getCosto(){
       System.out.println(this.costo);
    }//method

    public double applicaSconto(double percentuale){
        double sconto = (this.costo*percentuale)/100;

        this.costo -= sconto;
        return this.costo;
    }//method

    public void modificaCosto(double nuovo){
        this.costo = nuovo;
    }
}
