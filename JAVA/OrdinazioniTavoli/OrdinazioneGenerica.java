package OrdinazioniTavoli;

public class OrdinazioneGenerica {
    private String nome; 
    private int prezzo;
    
    public OrdinazioneGenerica(String nome,int prezzo){
        this.nome=nome; 
        this.prezzo=prezzo;
    }//costruttore

    public String getNome() {
        return nome;
    }
    
    public int getPrezzo() {
        return prezzo;
    }
}//class




