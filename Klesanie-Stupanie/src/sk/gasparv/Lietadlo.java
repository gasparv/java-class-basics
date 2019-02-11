package sk.gasparv;

public class Lietadlo implements IZmenaVysky {
    private int aktualnaVyska = 0;

    public int getAktualnaVyska(){
        return aktualnaVyska;
    }

    @Override
    public void stupaj() {
        aktualnaVyska +=10;
    }

    @Override
    public void klesaj() {
        if(aktualnaVyska>=10) {
            aktualnaVyska -= 10;
        }
    }
}
