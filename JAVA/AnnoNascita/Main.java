package AnnoNascita;

public class Main {
    public static void main(String[] args) {
        
        Persona P1 = new Persona("Maccione", "Marco", "MCCMCL05D23Z131Z", "Barcellona");

        System.out.println("Nome: " + P1.getNome());
        System.out.println("Cognome: " + P1.getCognome());
        System.out.println("Anno di nascita: " + P1.AnnoNascita());
    }
}
