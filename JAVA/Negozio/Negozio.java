package Negozio;

public class Negozio {
    public static void main(String[] args) {
        
        TipoCapoAbigliamento T1 = new TipoCapoAbigliamento("Colmar", "Giacca E45", 350.5);

        T1.getCosto();

        System.out.println(T1.applicaSconto(30));

        
        CapoAbbigliamento C1 = new CapoAbbigliamento("Levis", "jeans 570SC", 79.8, 40, 30, 30);
        
        C1.venduto(2);

        C1.getDettagli();
        
    }//main
}//class
