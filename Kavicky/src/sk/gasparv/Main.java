package sk.gasparv;

import sk.gasparv.Kavovary.Kanvica;
import sk.gasparv.Kavovary.Kavomat;
import sk.gasparv.Napoje.Caj;
import sk.gasparv.Napoje.Kava;

public class Main {

    public static void main(String[] args) {
        Kanvica kanvicaVKancelarii = new Kanvica();
        Caj ovocnyCajSMedom = kanvicaVKancelarii.urobCaj();
        Kava tureckaKavaZalievana = kanvicaVKancelarii.urobKavu();

        Kavomat kavomatNaChodbe = new Kavomat();
        Napoj nejakyNapoj = kavomatNaChodbe.urob("kava");
        System.out.println("");
    }
}
