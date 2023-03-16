import javax.swing.JFrame;

public class Frame extends JFrame {
    Frame(){
        //impopstiamo le dimensioni
        this.setBounds(500, 100, 500, 600);

        //titolo
        this.setTitle("Bilancia della frutta");

        //termina il programma alla chiusura della finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creiamo e aggiungiamo listanza del pannello principale
        Panel_Principale principale = new Panel_Principale();
        this.add(principale);


        this.setVisible(true);
    }//costruttore


    public static void main(String[] args) {
        new Frame();

    }//main

}//class
