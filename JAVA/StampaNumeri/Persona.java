package StampaNumeri;

public class Persona {
    String nome;
    int eta;

    Persona(String nome, int eta){
        this.nome = nome; 
        this.eta = eta;
    }

    public String toString(){
        return nome + ":" + eta;
    }
}
