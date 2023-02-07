package Cellulare;

public class Cellulare {
    int codice;
    double prezzo;
    int oreAuronomia;

    Cellulare(int codice, double prezzo, int oreAuronomia){
        this.codice = codice;
        this.prezzo = prezzo;
        this.oreAuronomia = oreAuronomia;
    }//costruttore

    public String toString(){
        return "Codice: " + this.codice + "\nPrezzo: " + this.prezzo + "\nOre di Autonomia: " + this.oreAuronomia + "\n\n";
    }//method toString
}
