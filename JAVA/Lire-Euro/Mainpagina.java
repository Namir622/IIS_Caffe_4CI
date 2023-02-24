
public class Mainpagina{
    public static void main(String args[]){
        Myframe frame=new Myframe();
        frame.setTitle("Convertitore Da Euro->Lire");
        Year converti = new Year();
        frame.add(converti);
        frame.setVisible(true);
    }
}