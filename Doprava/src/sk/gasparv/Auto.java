package sk.gasparv;

public class Auto extends DopravnyProstriedok implements IPohybovatelny {
    @Override
    public void dopredu() {
        System.out.println("Sofer zaradil jednotku.");
    }

    @Override
    public void dozadu() {
        System.out.println("Sofer zaradil spiatocku");
    }

    @Override
    public void zrychli() {
        System.out.println("Sofer pomaly pusta spojku a pridava plyn. Auto zrychluje");
    }

    @Override
    public void spomal() {
        System.out.println("Sofer pusta plyn, postupne brzdi");
    }

    @Override
    public void dolava() {
        System.out.println("Sofer da smerovku dolava, a otoci volantom tak aby odbocil do smeru vlavo.");
    }

    @Override
    public void doprava() {
        System.out.println("Sofer da smerovku do prava, a otoci volantom tak aby odbocil do smeru vpravo.");
    }
}
