package sk.gasparv;

import java.util.List;

public class Ingrediencia {
    public Ingrediencia(String nazov, String popis, String chut, List<Alergen> alergeny){
        this.nazov = nazov;
        this.popis = popis;
        this.chut = chut;
        this.alergeny = alergeny;
    }
    String nazov;
    String popis;
    String chut;
    List<Alergen> alergeny;
}
