package pankkitili;
import java.util.Scanner;

public class PankkitiliTesti {
    
    public static void main(String[] args) {
        Pankkitili tili = new Pankkitili();
       
        Scanner reader = new Scanner(System.in);
        System.out.println("Anna nimesi");
        String nimi = reader.nextLine();
        System.out.println("Anna tilinumerosi");
        String tilinumero = reader.nextLine();
        
        tili.setTilinumero(tilinumero);
        
        tili.setTilinomistaja(nimi);
        
        
        tili.tulosta();
    }
    
}