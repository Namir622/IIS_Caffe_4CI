package OrdinazioniTavoli;

import java.util.ArrayList;

public class Tavolo {
    private int idTavolo,nCoperti,saldo;
    private ArrayList<OrdinazioneGenerica> lista;
    
    Tavolo(int idTavolo,int nCoperti){//costruttore
        this.idTavolo=idTavolo;
        this.nCoperti=nCoperti; 
        this.saldo=0;
        
        ArrayList<OrdinazioneGenerica> l = new ArrayList<OrdinazioneGenerica>(0); 
        lista=l; 
    }//fine costruttor

    public void inserisciOrdine(OrdinazioneGenerica e){
        if (e.getPrezzo()!=0)lista.add(e);
    }//fine ins
    
    
    private int calcolaSaldo(){
        int tot=0;
        for(int i=0;i < lista.size();i++)
            tot+=((OrdinazioneGenerica)lista.get(i)).getPrezzo();
        return tot;
    }
    
    public int getIdTavolo() {return this.idTavolo;}
    public int getNcoperti() {return this.nCoperti;}
    
    public int getSaldo() {
            saldo=calcolaSaldo();
            return saldo;
    }
    public String getLista() {
        String s="\n";
        for(int i=0;i < lista.size();i++){
                s+=((OrdinazioneGenerica)lista.get(i)).getNome();
                s+="-"+((OrdinazioneGenerica)lista.get(i)).getPrezzo()+"\n";
        } 
        return s;
    }
    public String toString(){
        return getIdTavolo() + ":"+getNcoperti() + ":"+ getLista()+"\nsaldo:"+getSaldo();
    }
}//class