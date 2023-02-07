package Stagista;

public class Main {
    public static void main(String[] args) {
        Stagista S1 = new Stagista("Rossi", "Mario", "MRORSS11A90D234Y", "Kiev", 234, 8);
        Stagista S2 = new Stagista("Verdi", "Marco", "VRDMCR03F00D234Y", "Padova", 100, 10);
        Stagista S3 = new Stagista("Neri", "Anna", "NRIANN09H10D234Y", "Kiev", 600, 11);

        Stagista stagisti[] = {S1, S2, S3};
        int min = 0;
        for (int i = 0; i < stagisti.length; i++) {
            for (int j = i+1; j < stagisti.length; j++) {

                if (stagisti[i].AnnoNascita()>22 && stagisti[j].AnnoNascita()>22){

                    if (stagisti[i].AnnoNascita()>stagisti[j].AnnoNascita()) { min = i;}
                    else min = j;}

                else if (stagisti[i].AnnoNascita()<22 && stagisti[j].AnnoNascita()<22) {

                        if (stagisti[i].AnnoNascita()>stagisti[j].AnnoNascita()) { min = i;}
                        else min = j;

                    }else if (stagisti[i].AnnoNascita()>22 && stagisti[j].AnnoNascita()<22) { min = j;}
                          else {min = i;}
            }//for j
        }//for i

        System.out.println("Lo stagista più giovane è " + stagisti[min].getNome());
            
        
    }//main
}//class
