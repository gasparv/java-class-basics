package sk.gasparv;

import java.util.List;

public class Kvalitar extends Zamestnanec {
    boolean overKvalitu(Pizza pizza) {
        boolean suKompatibilne = overKompatibilituIngrediencii(pizza.ingrediencie);
        //boolean suFarebneKomatibilne = overFarebnuKompatibilitu;
        //boolean sediZaklad = OverCiSediZakladKIngredienciam;
        if(suKompatibilne /*&& suFarebneKompatibilne && sediZaklad*/){
            return true;
        }
        else{
            return false;
        }
    }

    boolean otestujPec(Pec pec) {
        boolean zbehlaProcedura = spustiTestovaciuProceduruPece(pec);
        return zbehlaProcedura;
    }
    private boolean spustiTestovaciuProceduruPece(Pec pec){
        if(pec.pecie == true){
            pec.pecie = false;
        }
        if(pec.pizzeKtoreSaPravePecu.size() != 0){
            pec.pizzeKtoreSaPravePecu.clear();
        }
        pec.teplota = 10000;
        if(pec.teplota == 10000){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean overKompatibilituIngrediencii(List<Ingrediencia> ingrediencieNaPizzy) {
        int pocetSlanych = 0;
        int pocetSladkych = 0;
        int pocetKyslych = 0;
        int pocetHorkych = 0;

        for(Ingrediencia ingrediencia:ingrediencieNaPizzy){
            if(ingrediencia.chut.equals("slane")){
                pocetSlanych++;
            }
            if(ingrediencia.chut.equals("sladke")){
                pocetSladkych++;
            }
            if(ingrediencia.chut.equals("kysle")){
                pocetKyslych++;
            }
            if(ingrediencia.chut.equals("horke")){
                pocetHorkych++;
            }
        }
        if(pocetHorkych>0 && pocetKyslych>0 && pocetSladkych>0 && pocetSlanych>0){
            return false;
        }
        if(pocetSladkych == 0 && pocetSlanych<2){
            return false;
        }
        if((pocetHorkych == 0 && pocetKyslych == 0) && pocetSladkych<5 && pocetSlanych<5 ){
            return true;
        }
        if(ingrediencieNaPizzy.size()<4){
            return true;
        }
        return false;
    }
}
