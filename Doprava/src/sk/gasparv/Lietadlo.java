package sk.gasparv;

public class Lietadlo extends DopravnyProstriedok implements IPohybovatelny {
    private int aktualnaRychlost = 0;

    public int getAktualnaRychlost() {
        return aktualnaRychlost;
    }

    @Override
    public void dopredu() {
        System.out.println("Paky na zrychlovanie su v polohe 0");
    }

    @Override
    public void dozadu() {
        System.out.println("Paky na reverz su vytiahnute");
    }

    @Override
    public void zrychli() {

        System.out.println("Pilot posuva paky na zrychlenie smerom dopredu pre vybrane motory");
        aktualnaRychlost += 10;
    }

    @Override
    public void spomal() {
        System.out.println("Pilot posuva paky na zrychlenie smerom dozadu (k sebe) pre vybrane motory");
    }

    @Override
    public void dolava() {
        System.out.println("Pilot natoci lietadlo o niekolko stupnov do lava a potom pritahne kormidlo aby lietadlo neklesalo.");
    }

    @Override
    public void doprava() {
        System.out.println("Pilot natoci lietadlo o niekolko stupnov do prava a potom pritahne kormidlo aby lietadlo neklesalo.");
    }
}
