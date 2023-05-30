import javax.swing.*;

public class Jframe extends JFrame {
    
    Jframe(){
        this.setTitle("bloc Notes");
        this.setBounds(300, 300, 600, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);

        
        Pannello coso = new Pannello();
        
        this.add(coso);
        
        this.setVisible(true);
    }//costruttore

    public static void main(String[] args) {
        new Jframe();
    }//main
     
}//class
