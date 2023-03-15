package Spesa;

public class Prodotto {
    String nome;
    int prezzo;

    Prodotto(String nome, int prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }


    public String toString(){
        return nome + ":" + prezzo;
    }

}
