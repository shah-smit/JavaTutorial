package pankkitili;

public class Pankkitili {
    private String tilinumero;
    private String tilinomistaja;
    private double saldo;
    private Pankki pankki;
    //private static String pankinNimi;
    //Ei toimi, staticia ei voi mennä muuttamaan 
    public Pankkitili() {
        tilinumero = "";
        tilinomistaja = "";
        saldo = 0.0;
        System.out.println("Tili luotu.");
    }
    
    public String getTilinumero() {
        return tilinumero;
    }
    public boolean setTilinumero(String uusi_tilinumero) {
        if (uusi_tilinumero.matches("^([0-9]{6})-([0-9]{6})$")) {
            tilinumero = uusi_tilinumero;
            return true;
        } else {
            System.out.println("Tilinumero ei kelpaa");
            return false;
        }
    }
    
    public String getTilinomistaja() {
        return tilinomistaja;
    }
    
    public void setTilinomistaja(String tilinomistaja) {
        this.tilinomistaja = tilinomistaja;
    }
    
    public double getSaldo() {
       return saldo;
   }
//Muutos 28
    public boolean setSaldo(double saldo) {
        if(saldo >=0) {
            this.saldo = saldo;
            return true;
        } else {
            System.out.println("Saldo ei voi olla negatiivinen");
            return false;
        }
    }
    
    public void nostaRahaa(double summa) {
            setSaldo(saldo - summa);
    }
    public void tallennaRahaa(double summa) {
        setSaldo(saldo + summa);
    }
    
    public void tulosta() {
        System.out.println("Tilinumero: " + tilinumero);
        System.out.println("Tilinomistaja: " + tilinomistaja);
        System.out.println("Saldo: " + saldo);
        
        //En saa toimimaan, kommentoitu pois että nään toimiiko muut tehtävät
        //System.out.println("Pankki: " + pankki.getNimi());
    }
    
    public void yhdistaPankkiin(Pankki p) {
        pankki = p;
    }
}