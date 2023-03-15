package Spesa;

import java.util.ArrayList;

public class Lista {
    ArrayList<Prodotto> listaSpesa = new ArrayList<Prodotto>(0);

    public void NuovoProdotto(Prodotto e){

        listaSpesa.add(e);

    }

    public void StampaLista(){
        for (Prodotto index : listaSpesa) {
            System.out.println(index);
        }//for
    }//method
}
