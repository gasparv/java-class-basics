package sk.gasparv;

import java.util.List;

public class Kuchar extends Zamestnanec {
    Pizza urobPizzu(Korpus korpus, Zaklad zaklad, List<Ingrediencia> ingrediencie){
        System.out.print("Vyrobil som novu pizzu");
        return new Pizza(korpus, zaklad, ingrediencie, false, false, 20);
    }
    Pizza zohrejPizzu(Pizza pizza, Pec pec){
        if(pizza.teplotaPizze<30){
            pizza = pec.zohrej(pizza);
            System.out.print("Pizza bola zohriata lebo mala menej ako 30°C");
            return pizza;
        }
        else{
            System.out.print("Pizza bola este tepla, tak ju nebolo treba zohrievat");
            return pizza;
        }
    }
    Pizza upecPizzu(Pizza pizza, Pec pec){
        if(pizza.jeUpecena){
            System.out.print("Pizza je uz upecena ...");
            return pizza;
        }
        else{
            pizza = pec.upec(pizza);
            return pizza;
        }
    }
}
