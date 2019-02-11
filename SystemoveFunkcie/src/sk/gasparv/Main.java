package sk.gasparv;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.spi.CalendarDataProvider;

public class Main {

    public static void main(String[] args) {
        //Math.round(2.125489,2);
        int a = 10;
        float b = 15.25899f;
        float c = a+b;
        String retazec = "Sucet cisla " + a + " a cisla " + b + " je " + c;
        System.out.println(retazec);

        String retazec2 = String.format("Sucet cisla %1$d a cisla %2$.2f je %3$.2f",a,b,c);
        System.out.println(retazec2);
        System.out.println(zaokruhli(15.25689778,3));
        String.join(";","premennaA","premenna B", "premennaC");

        Date datumaCas = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy hh:mm:ss.S a z");
        String aktualnyDatumACas = simpleDateFormat.format(datumaCas);
        System.out.println(aktualnyDatumACas);

        Calendar cal = Calendar.getInstance();
        int den = cal.get(Calendar.HOUR);
        String[] mesiace = {"Januar", "Februar","Marec", "April","Maj", "Jun", "Jul", "August", "September", "Oktober", "November", "December"};
        int[] cislaMesiacov = {1,2,3,4,5,7,8,9,10,11,12};
        int mesiac = cal.get(Calendar.MONTH);
        System.out.println(cislaMesiacov[mesiac]);
        System.out.println(mesiace[mesiac]);

    }
    public static double zaokruhli(double vstupnaHodnota, int pocetDesMiest){
        //15.25689778 * 10^pocetDesMiest
        //15256.89778
        //Math.round(15256.89778) = 15257;
        //15257 / 10^pocetDesMiest
        //15.257
        double prvaHodnota = vstupnaHodnota * Math.pow(10,pocetDesMiest);
        double zaokruhlenaHodnota = Math.round(prvaHodnota);
        double finalnaHodnota = zaokruhlenaHodnota * Math.pow(10,-pocetDesMiest);
        return finalnaHodnota;
    }
}
