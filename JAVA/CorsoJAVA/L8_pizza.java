package CorsoJAVA;


//overloaded constructor


public class L8_pizza {
    
    String impasto;
    String salsa;
    String formaggio;
    String extra;
    String extra2;

    L8_pizza(String impasto, String salsa, String formaggio, String extra){
            this.impasto = impasto;
            this.salsa = salsa;
            this.formaggio = formaggio;
            this.extra = extra;
            System.out.println("Ingredienti "+ impasto + ", " + salsa + ", " + formaggio + ", " + extra);
    }

    L8_pizza(String impasto){
        this.impasto = impasto;
        System.out.println("Ingredienti "+ impasto);
    }

    L8_pizza(String impasto, String salsa){
        this.impasto = impasto;
        this.salsa = salsa;
        System.out.println("Ingredienti "+ impasto + ", " + salsa );
    }

    L8_pizza(String impasto, String salsa, String formaggio){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        System.out.println("Ingredienti "+ impasto + ", " + salsa + ", " + formaggio);
    }

    L8_pizza(String impasto, String salsa, String formaggio, String extra, String extra2){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;
        this.extra2 = extra2;
        System.out.println("Ingredienti "+ impasto + ", " + salsa + ", " + formaggio + ", " + extra + ", " + extra2);
}
}
