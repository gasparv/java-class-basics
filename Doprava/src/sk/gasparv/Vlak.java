package sk.gasparv;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Vlak extends DopravnyProstriedok implements IPohybovatelny {
    @Override
    public void dopredu() {
        System.out.println("Prepni smer na smer dopredu");
    }

    @Override
    public void dozadu() {
        System.out.println("Prepni smer na smer dozadu");
    }

    @Override
    public void zrychli() {
        System.out.println("Posunie paku zrychlenia dopredu");
    }

    @Override
    public void spomal() {
        System.out.println("Posunie paku zrychlenia dozadu a zacne postupne brzdit");
    }

    @Override
    public void dolava() {
        System.out.println("Vodic posunie vyhybku na kolaj vlavo");
    }

    @Override
    public void doprava() {
        System.out.println("Vodic posunie vyhybku na kolaj vpravo");
    }
}
