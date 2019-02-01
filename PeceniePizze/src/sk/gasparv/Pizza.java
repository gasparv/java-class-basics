package sk.gasparv;

import java.util.List;

public class Pizza {
    public Pizza(Korpus korpus, Zaklad zaklad, List<Ingrediencia> ingrediencie, boolean jeUpecena, boolean bolaZohrievana, int teplota){
        this.korpus = korpus;
        this.zaklad = zaklad;
        this.ingrediencie = ingrediencie;
        this.jeUpecena = jeUpecena;
        this.bolaZohrievana = bolaZohrievana;
        this.teplotaPizze = teplota;

    }
    int velkost;
    boolean jeUpecena;
    boolean bolaZohrievana;
    int teplotaPizze;
    List<Ingrediencia> ingrediencie;
    Korpus korpus;
    Zaklad zaklad;
    int chladni(Pizza pizza){
        if(teplotaPizze>20){
            teplotaPizze = 20;
        }
        return teplotaPizze;
    }
    //        return new Pizza(korpus, zaklad, ingrediencie, false, false, 20);
}
