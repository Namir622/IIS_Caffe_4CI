import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Jframe extends JFrame implements MenuListener{

    static JMenu File;
    static JMenu Modifica;

    static JMenuItem Creazione;
    static JMenuItem Salvataggio;
    static JMenuItem Apertura;
    
    static JMenuItem Copia;
    static JMenuItem Incolla;


    Jframe(){
        this.setTitle("bloc Notes");
        this.setBounds(300, 300, 600, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);


        Pannello coso = new Pannello();
        
        JMenuBar bar = new JMenuBar();

        //menu file
        File = new JMenu("File");
        bar.add(File);
        Creazione = new JMenuItem("Creazione", ABORT);
        Salvataggio = new JMenuItem("Salvataggio", ABORT);
        Apertura = new JMenuItem("Apertura", ABORT);
        File.add(Creazione);File.add(Salvataggio);File.add(Apertura);

        //menu modifica
        Modifica = new JMenu("Modifica");
        bar.add(Modifica);
        Copia = new JMenuItem("Copia");
        Incolla = new JMenuItem("Incolla");
        Modifica.add(Copia); Modifica.add(Incolla);


        File.addMenuListener(this);

        this.setJMenuBar(bar);
        this.add(coso);
        this.setVisible(true);
    }//costruttore

    public static void main(String[] args) {
        new Jframe(); 
    }//main



    @Override
    public void menuSelected(MenuEvent e) {
        if (e.getSource() == Creazione) 
        {
            
        } else {
            
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menuDeselected'");
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menuCanceled'");
    }
     
}//class
