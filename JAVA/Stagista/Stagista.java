package Stagista;

public class Stagista extends Persona{

    private int numeroPresenza;
    private int numeroIdentificativo;

    Stagista(String cognome, String nome, String codiceFiscale, String città, int numeroIdentificativo, int numeroPresenza) {
        super(cognome, nome, codiceFiscale, città);
        this.numeroPresenza = numeroPresenza;
        this.numeroIdentificativo = numeroIdentificativo;
    }//costruttore

    //set
    public void setNumeroPresenza(int numeroPresenza) {
        this.numeroPresenza = numeroPresenza;
    }
    public void setNumeroIdentificativo(int numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }

    //get
    public int getNumeroIdentificativo() {
        return numeroIdentificativo;
    }
    public int getNumeroPresenza() {
        return numeroPresenza;
    }

    
    
}//class
