package ContoCorrente;

public class ContoCorrente {
    private int NumeroDiConto, saldo;
    private String intestatario;

    ContoCorrente(String intestatario, int NumeroDiConto, int saldo){
        this.intestatario = intestatario;
        this.NumeroDiConto = NumeroDiConto;
        this.saldo = saldo;
    }//costruttore 1

    ContoCorrente(String intestatario, int NumeroDiConto){
        this.intestatario = intestatario;
        this.NumeroDiConto = NumeroDiConto;
        this.saldo = 0;
    }//costruttore 2

    public String getIntestatario(){
        return this.intestatario;
    }//get
    public int getSaldo(){
        return this.saldo;
    }//get
    public int getNumeroDiConto(){
        return this.NumeroDiConto;
    }//get

    public void prelievo(int importo){
        if (importo<this.saldo) {
            this.saldo -= importo;
        }else System.out.println("Impossibile prelevare");
    }//method prelievo

    public void versamento(int importo){
        this.saldo += importo;
    }//method versamento

}//class
