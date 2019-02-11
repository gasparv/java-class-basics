package sk.gasparv.Kavovary;

import sk.gasparv.IUrobKavu;
import sk.gasparv.IUrobNapoj;
import sk.gasparv.Napoj;
import sk.gasparv.Napoje.Kava;

public class PressoStroj implements IUrobKavu {

    @Override
    public Kava urobKavu() {
        return new Kava();
    }
}
