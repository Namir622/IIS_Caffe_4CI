package Jwindow;

import javax.swing.*;

public class Finestra {
    public static void main(String[] args) {

    //istanza dell’oggetto di classe Jwindow
    JWindow finestra_1 = new JWindow();

    //definizione delle dimensioni della finestra 1
    finestra_1.setSize(400,200);

    //la finestra diventa visibile chiamando il metodo setVisible
    finestra_1.setVisible(true);

    }
}
