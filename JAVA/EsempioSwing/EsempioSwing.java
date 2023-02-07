

import javax.swing.JFrame;

public class EsempioSwing{
    public static void main(String[] args) {
        JFrame finestra1 = new JFrame("Prima finestra");//istanza l'ogetto finestra
        finestra1.setSize(400,200);//definisci la dimensione

        finestra1.setBounds(200,200,400,200);

        finestra1.setVisible(true);
    }
}