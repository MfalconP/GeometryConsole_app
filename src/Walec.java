public class Walec extends Bryla{
    private int r;

    public Walec(){
        r = 15;
    }

    public Walec(String kolor, int h, int r){
        super(kolor, h);
        this.r = r;
    }


    public int getH() {
        return super.getH();
    }
    public String getKolor() {
        return super.getKolor();
    }
    public int getR() {
        return r;
    }


    public void setKolor(String kolor) {
        super.setKolor(kolor);
    }
    public void setH(int h) {
        super.setH(h);
    }
    public void setR(int r) {
        this.r = r;
    }

    public String toString() {
        return super.toString() +", "+ getClass().getName() + ", promien " + r;
    }

    public double objetosc() {
        return 3.14*r*r*h;
    }
}
