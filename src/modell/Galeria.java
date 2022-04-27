package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Galeria implements Iterable<KiallitasiTargy>{
    private ArrayList<KiallitasiTargy> targyak;
    
    public Galeria(){
        targyak = new ArrayList<>();
    }
    
    public void felvesz(KiallitasiTargy targy){
        targyak.add(targy);
    }

    @Override
    public Iterator<KiallitasiTargy> iterator() {
        return Collections.unmodifiableList(targyak).iterator();
    }
}
