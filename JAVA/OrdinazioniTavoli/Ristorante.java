package OrdinazioniTavoli;

import java.util.Scanner;

public class Ristorante{ public static void main (String args []) {
    int j,pre=0;
    char ch;
    String nome="";
    Tavolo t1 = new Tavolo(1,3);
    Menu menu=new Menu();
    
    //-------------------------------------
    do{
        System.out.print("bevanda, piatto o exit (p/b/x)?:");
        Scanner q =new Scanner(System.in);
        ch = q.nextLine().charAt(0);
        
        if(ch=='p')menu.stampaPiatti();
        else if(ch=='b')menu.stampaBevande();
            else break;
        
        System.out.print("ins.indice:");
        j=q.nextInt();
        if(ch=='p'||ch=='b'){
            if(ch=='p'){
                nome=menu.getPiatto(j).getNome();
                pre=menu.getPiatto(j).getPrezzo();
            } else nome=menu.getBevanda(j).getNome();
                pre=menu.getBevanda(j).getPrezzo();
            
           OrdinazioneGenerica e=new OrdinazioneGenerica(nome,pre);
            t1.inserisciOrdine(e);
        }//if
        q.close();
    }while(ch!='x');
    //-------------------------------------
    System.out.println(t1);

    }//fine main
}// fine classe Ristorante