package OrdinazioniTavoli;

public class Menu {
    private OrdinazioneGenerica Piatti[]; 
    private OrdinazioneGenerica Bevande[]; 
    
	Menu(){//costruttore
		OrdinazioneGenerica p1=new OrdinazioneGenerica("SPAGHETTI",4);
		OrdinazioneGenerica p2=new OrdinazioneGenerica("PIZZA",3);
		OrdinazioneGenerica p3=new OrdinazioneGenerica("VERDURA",2);
		OrdinazioneGenerica p4=new OrdinazioneGenerica("PESCE",5);
		OrdinazioneGenerica p5=new OrdinazioneGenerica("CARNE",2);
		OrdinazioneGenerica p[]={p1,p2,p3,p4,p5};
		Piatti = p;
		
		OrdinazioneGenerica b1=new OrdinazioneGenerica("ACQUA",1);
		OrdinazioneGenerica b2=new OrdinazioneGenerica("VINO",3);
		OrdinazioneGenerica b3=new OrdinazioneGenerica("BIRRA",2);
		OrdinazioneGenerica b4=new OrdinazioneGenerica("COCACOLA",3);
		OrdinazioneGenerica b[]={b1,b2,b3,b4};
		Bevande=b;
	}//costruttore

    //stampa a video le pietanze
    public void stampaPiatti() {
        for(int i=0;i < Piatti.length;i++){
            System.out.println(i+"."+Piatti[i].getNome());
        }//for
    }//func
   
   
    //stampa a video le bevande
    public void stampaBevande() {
        //stampa a video le bevande
        for(int i=0;i < Bevande.length;i++){
            System.out.println(i+"."+Bevande[i].getNome());
        }//for
    }
    
    //restituisce l'elemento i-esimo del vettore Piatti.
    OrdinazioneGenerica getPiatto(int i) {

        return Piatti[i];
    }
    //restituisce l'elemento i-esimo del vettore Piatti.
    OrdinazioneGenerica getBevanda(int i) {

        return Bevande[i];
    }
}//class