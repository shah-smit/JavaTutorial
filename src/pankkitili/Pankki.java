package pankkitili;

public class Pankki {
    String nimi = "Osuuspankki";
    Pankkitili[] tilit;
    
    private int indeksi = 0;
    
    public String getNimi() {
        return nimi;
    }
    
    public Pankki(String nimi) {
        this.nimi = nimi;
    }
    
    public void lisaaTili(Pankkitili tili) {  
        tilit[indeksi] = tili;
        indeksi++;
        tili.yhdistaPankkiin(this);
    }
    
    public void tulostaTilit() {
        for(int i = 0;i < indeksi ; i++) {
            tilit[i].tulosta();
        }
                
    }
}