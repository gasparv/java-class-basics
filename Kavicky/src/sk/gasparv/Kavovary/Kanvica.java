package sk.gasparv.Kavovary;

import sk.gasparv.IUrobCaj;
import sk.gasparv.IUrobKavu;
import sk.gasparv.IUrobNapoj;
import sk.gasparv.Napoj;
import sk.gasparv.Napoje.Caj;
import sk.gasparv.Napoje.Kava;

public class Kanvica implements IUrobCaj, IUrobKavu {

    @Override
    public Caj urobCaj() {
        return new Caj();
    }

    @Override
    public Kava urobKavu() {
        return new Kava();
    }
}
