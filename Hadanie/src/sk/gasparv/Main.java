package sk.gasparv;

import java.util.Scanner;

public class Main {
   static int spravnyTip = 105;
    static Scanner scanner;
    public static void main(String[] args) {
	    System.out.println("1. Start s nekonecnym poctom tipov");
        System.out.println("2. Start s konecnym poctom tipov");
        System.out.println("3. Ukonči hru");
        System.out.print("Zadaj jednu z možností: ");
        scanner = new Scanner(System.in);
        int moznost = scanner.nextInt();

        switch(moznost){
            case 1:{
                startSNekonecnymPoctomTipov();
                break;
            }
            case 2:{
                startSKonecnymPoctomTipov();
                break;
            }
            case 3:{
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Neznamy príkaz");
                break;
            }
        }
    }
    static void startSNekonecnymPoctomTipov(){
        int tipPouzivatela = 0;
        while(tipPouzivatela != spravnyTip){
            System.out.print("Zadaj tip: ");
            tipPouzivatela = scanner.nextInt();
            if(jeTipSpravny(tipPouzivatela,spravnyTip)){
                System.out.print("SUPER, UHADOL SI TO.");
                break;
            }
            else{
                System.out.println("Skus to este raz, nesprávny tip.");
                zistiCiMaZadatVacsiAleboMensie(tipPouzivatela,spravnyTip);
            }
        }
    }

    static void startSKonecnymPoctomTipov(){
        int tipPouzivatela = 0;
        System.out.print("Zadaj pocet tipov v hre: ");
        int pocetTipov = scanner.nextInt();
        for(int i = 0; i<pocetTipov;i++){
            System.out.print("Zadaj tip: ");
            tipPouzivatela = scanner.nextInt();
            if(jeTipSpravny(tipPouzivatela,spravnyTip)){
                System.out.print("SUPER, UHADOL SI TO.");
                break;
            }
            else{
                if(i != pocetTipov-1) {
                    System.out.println("Skus to este raz, nesprávny tip.");
                    zistiCiMaZadatVacsiAleboMensie(tipPouzivatela,spravnyTip);
                }
                else{
                    System.out.println("Sorry dnes to nevyslo");
                }
            }
        }
    }
    static void zistiCiMaZadatVacsiAleboMensie(int tipPouzivatela, int spravnyTip){
        if (tipPouzivatela > spravnyTip) {
            System.out.println("Mal by si zadávať menšie číslo");
        } else {
            System.out.println("Mal by si zadávať väčšie číslo");
        }
    }
    static boolean jeTipSpravny(int tipPouzivatela, int spravnyTip){
        if (tipPouzivatela <= spravnyTip + 5 && tipPouzivatela>= spravnyTip-5) {
            return true;
        } else {
            return false;
        }
    }
}
