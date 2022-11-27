public class Prostopadloscian extends Bryla {
    private int a;
    private int b;
    private boolean jestSzescianem;

    public Prostopadloscian(){
        int a = 12;
        int b = 12;
        if (h == a && a==b)
            jestSzescianem = true;
        else
            jestSzescianem = false;
    }

    public Prostopadloscian(String kolor, int h, int a, int b){
        super(kolor, h);
        this.a = a;
        this.b = b;
        if (h == a && a==b)
            jestSzescianem = true;
        else
            jestSzescianem = false;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public String getKolor() {
        return super.getKolor();
    }
    public int getH() {
        return super.getH();
    }

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    public String toString() {
        return super.toString() +", " + getClass().getName() + ", pierwszy bok " + a + ", drugi bok " + b + ", czy jest szescianem " + jestSzescianem;
    }

    public double objetosc() {
        return a*b*h;
    }

}
