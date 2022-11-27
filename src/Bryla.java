public abstract class Bryla {
    protected String kolor;
    protected int h;

    public Bryla(){
        kolor = "niebieski";
        h = 12;
    }

    public Bryla(String kolor, int h){
        this.kolor = kolor;
        this.h = h;
    }

    public String getKolor() {
        return kolor;
    }
    public int getH() {
        return h;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    public void setH(int h) {
        this.h = h;
    }

    public String toString() {
        return "Kolor " + kolor + ", wysokosc " + h;
    }

    public abstract double objetosc();
}
