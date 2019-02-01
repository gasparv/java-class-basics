package sk.gasparv;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.print("teraz ti upeciem pizzu aku budes chciet");

        List<Ingrediencia> zoznamIngredienciiKtoreMame = new ArrayList<>();
        zoznamIngredienciiKtoreMame.add(new Ingrediencia("Paradajky","Drvene paradajky zavarane","sladke", null));
        zoznamIngredienciiKtoreMame.add(new Ingrediencia("Olivy", "Grecke zelene olivy bez kostky s paprikou", "slane", null));


        Kuchar janci = new Kuchar();
        Korpus novyKorpus = new Korpus();
        novyKorpus.jeKapsa = false;
        novyKorpus.maSyroveRohy = true;

        Zaklad novyZaklad = new Zaklad();
        novyZaklad.zakladneIngrediencie = new ArrayList<>();
        novyZaklad.zakladneIngrediencie.add(zoznamIngredienciiKtoreMame.get(0));
        Pizza novaPizza = janci.urobPizzu(novyKorpus,novyZaklad,zoznamIngredienciiKtoreMame);
        Pec pecNaPizzu = new Pec();
        Pizza upecenaHotovaPizza = janci.upecPizzu(novaPizza,pecNaPizzu);
        System.out.print("");
    }
}
