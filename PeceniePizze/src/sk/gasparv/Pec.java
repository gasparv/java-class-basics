package sk.gasparv;

import java.util.ArrayList;
import java.util.List;

public class Pec {
    int teplota;
    int objem;
    boolean pecie;
    List<Pizza> pizzeKtoreSaPravePecu = new ArrayList<>(objem);
    Pizza zohrej(Pizza pizza){
        pecie = true;
        teplota = 300;
        pizza.bolaZohrievana = true;
        teplota = 0;
        pecie = false;
        return pizza;
    }
    Pizza upec(Pizza surovaPizza){
        if(surovaPizza.jeUpecena){
            System.out.print("Preco to tam pchas, je to uz upecene.");
        }
        else {
            pecie = true;
            teplota = 300;
            surovaPizza.jeUpecena = true;
            surovaPizza.teplotaPizze = 80;
            teplota = 0;
            pecie = false;
        }
        return surovaPizza;
    }
}
