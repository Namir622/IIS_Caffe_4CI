import javax.swing.JFrame;

public class Frame extends JFrame {
    Frame(){
        //impopstiamo le dimensioni
        this.setBounds(500, 300, 500, 600);

        //titolo
        this.setTitle("Bilancia della frutta");

        //termina il programma alla chiusura della finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel_Principale principale = new Panel_Principale();
        this.add(principale);


        this.setVisible(true);
    }


    public static void main(String[] args) {
        new Frame();

    }//main

}//class