package sk.gasparv;

public class Main {

    public static void main(String[] args) {
	Lietadlo noveLietadlo = new Lietadlo();
	noveLietadlo.stupaj();
        noveLietadlo.stupaj();
        noveLietadlo.stupaj();
        noveLietadlo.stupaj();
        noveLietadlo.stupaj();
        noveLietadlo.stupaj();
        noveLietadlo.stupaj();
        System.out.println("Aktualna vyska lietadla je: " + noveLietadlo.getAktualnaVyska());
    }
}
