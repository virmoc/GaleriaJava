package main;

import modell.Festmeny;
import modell.Galeria;
import modell.KiallitasiTargy;

public class Program {

    public static void main(String[] args) {
        Galeria galeria = new Galeria();
        
        System.out.println("Cím szerinti:");
        for (KiallitasiTargy targy : galeria.rendezCimSzerint()) {
            System.out.println(targy);
        }
        
        System.out.println("Készítő szerinti:");
        for (KiallitasiTargy targy : galeria.rendezKeszitoSzerint()) {
            System.out.println(targy);
        }
        
        for (KiallitasiTargy targy : galeria) {
            if(targy instanceof Festmeny){
                ((Festmeny)targy).megjelenites();
            }
        
        }
    }
    
}
