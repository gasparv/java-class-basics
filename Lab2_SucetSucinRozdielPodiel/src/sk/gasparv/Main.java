package sk.gasparv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Vytvorim si scanner, ktory pouzijem neskor na nacitanie vstupu z klavesnice od pouzivatela
        Scanner scanner = new Scanner(System.in);

        //Vytvorim si dve premenne, ktore budem scitavat, odcitavat, nasobit alebo delit.
        int a;
        int b;

        //Napisem pouzivatelovi co od neho chcem
        System.out.print("Zadaj mi premennu A: ");

        //Pockam kym mi pouzivatel zada hodnotu. Hodnotu toho co pouzivatel zadal ziskam pomocou
        // scannera a ulozim to do premennej A.
        a = scanner.nextInt();

        //To iste spravim pre premennu B. Takze najprv napisem pouzivatelovi co od neho chcem.
        System.out.print("Zadaj mi premennu B: ");

        // Teraz pockam na to co mi zada pouzivatel pomocou scannera a zapisem do premennej b
        b = scanner.nextInt();

        //Vysledky jednotlivych operacii mozem vypisat do konzoly
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
