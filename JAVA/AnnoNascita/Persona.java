package AnnoNascita;

public class Persona {
    private String cognome, nome, codiceFiscale, città;

    Persona(){
        this.cognome = null;
        this.nome = null;
        this.codiceFiscale = null;
        this.città = null;
    }//costruttore

    Persona(String cognome, String nome, String codiceFiscale, String città){
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.città = città;
    }//costruttore



    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public String getCittà() {
        return città;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public void setCittà(String città) {
        this.città = città;
    }


    public String AnnoNascita(){
        String anno;

        anno = this.codiceFiscale.substring(6, 8);

        return anno;
    }//method anno di nascita

}//class
