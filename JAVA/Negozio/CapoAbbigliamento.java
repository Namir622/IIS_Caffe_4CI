package Negozio;

public class CapoAbbigliamento extends TipoCapoAbigliamento{

    protected int taglia, quantitaAcquistata, quantitaDisponibile;

    CapoAbbigliamento(String marca, String modello, double costo, int taglia, int quantitaAcquistata, int quantitaDisponibile) {
        super(marca, modello, costo);
        this.taglia = taglia;
        this.quantitaAcquistata = quantitaAcquistata;
        this.quantitaDisponibile = quantitaDisponibile;
    }//costruttore

    public void venduto(int num){
        if (num<quantitaDisponibile) {
            quantitaDisponibile -= num;
        }//method venduto
    }

    public void getDettagli(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modello: " + this.modello);
        System.out.println("Costo: " + this.costo);
        System.out.println("Taglia: " + this.taglia);
        System.out.println("Quantità aquistata: " + this.quantitaAcquistata);
        System.out.println("Quantita disponibile: " + this.quantitaDisponibile);
    }
}
