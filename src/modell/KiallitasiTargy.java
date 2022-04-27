package modell;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;

class KeszitoComparator implements Comparator<KiallitasiTargy>{
    @Override
    public int compare(KiallitasiTargy o1, KiallitasiTargy o2) {
        Collator coll = Collator.getInstance();
        return coll.compare(o1.getKeszito(), o2.getKeszito());
        
        //return o1.getKeszito().compareTo(o2.getKeszito());
    } 
}

class CimComparator implements Comparator<KiallitasiTargy>{
    @Override
    public int compare(KiallitasiTargy o1, KiallitasiTargy o2) {
        Collator coll = Collator.getInstance();
        return coll.compare(o1.getCim(), o2.getCim());
        
        //return o1.getKeszito().compareTo(o2.getKeszito());
    } 
}

public abstract class KiallitasiTargy {
    private LocalDate letrehozas;
    private String keszito, cim;

    public KiallitasiTargy(String keszito, String cim) {
        this(LocalDate.now(), keszito, cim);
    }

    public KiallitasiTargy(LocalDate letrehozas, String keszito, String cim) {
        this.letrehozas = letrehozas;
        this.keszito = keszito;
        this.cim = cim;
    }

    public LocalDate getLetrehozas() {
        return letrehozas;
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }
    
    
}
