package sk.gasparv.Kavovary;

import sk.gasparv.IUrobNapoj;
import sk.gasparv.Napoj;
import sk.gasparv.Napoje.Caj;
import sk.gasparv.Napoje.Kava;

public class Kavomat implements IUrobNapoj {
    @Override
    public Napoj urob(String typNapoja) {
        if(typNapoja.equals("kava")){
            return new Kava();
        }
        if(typNapoja.equals("caj")){
            return new Caj();
        }
        return null;
    }
}
