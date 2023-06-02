import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Jframe extends JFrame implements MenuListener{

    static JMenu menu;

    static JMenuItem T1;
    static JMenuItem T2;
    static JMenuItem T3;
    Jframe(){
        this.setTitle("bloc Notes");
        this.setBounds(300, 300, 600, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);


        Pannello coso = new Pannello();
        
        JMenuBar bar = new JMenuBar();
        menu = new JMenu("Lista");
        bar.add(menu);
        T1 = new JMenuItem("File 1", ABORT);
        T2 = new JMenuItem("File 2", ABORT);
        T3 = new JMenuItem("File 3", ABORT);
        menu.add(T1);menu.add(T2);menu.add(T3);

        menu.addMenuListener(this);

        this.setJMenuBar(bar);


        this.add(coso);
        this.setVisible(true);
    }//costruttore

    public static void main(String[] args) {
        new Jframe(); 
    }//main





    @Override
    public void menuSelected(MenuEvent e) {
        if (e.getSource() == T1) 
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
