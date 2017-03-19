package pankkitili;

public class SaastoTili extends Pankkitili {
    private int nostojenMaara = 0;
    private static final int MAX_NOSTOJEN_MAARA = 2;   
    
    public void nostaRahaa(double summa) {
        if(nostojenMaara < MAX_NOSTOJEN_MAARA) {
            nostojenMaara++;
            super.nostaRahaa(summa);
        }
    }
}