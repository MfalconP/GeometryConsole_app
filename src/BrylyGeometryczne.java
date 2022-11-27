import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BrylyGeometryczne {
    private ArrayList<Bryla> bryly;
    private Comparator sortowanieKolor = new kolorSort();
    private Comparator sortowanieWysokosc = new wysokosciSort();
    private Comparator sortowanieAll = new allSort();

    public BrylyGeometryczne(){
        bryly = new ArrayList<>();
    }


    public void createAddWalec(String kolor, int h, int r){
        bryly.add(new Walec(kolor, h, r));
    }
    public void createAddProstopadloscian(String kolor, int h, int a, int b){
        bryly.add(new Prostopadloscian(kolor, h, a, b));
    }

    public void showAll(){
        for (int i=0; i<bryly.size(); i++)
            System.out.println(bryly.get(i));
    }

    public void sortByColor(){
        Collections.sort(bryly, sortowanieKolor);
    }
    public void sortByH(){
        Collections.sort(bryly, sortowanieWysokosc);
    }
    public void sortFull(){
        Collections.sort(bryly, sortowanieAll);
    }

    public void maxObjetosc(){
        Bryla b1 = bryly.get(0);
        int indeks = 0;
        for (int i=0; i<bryly.size(); i++)
            if (bryly.get(i).objetosc() > b1.objetosc()){
                b1 = bryly.get(i);
                indeks = i;
            }
        System.out.println(b1 + ", pozycja - " + indeks + ", objetosc " + b1.objetosc());
    }

}


class kolorSort implements Comparator<Bryla> {
    public int compare(Bryla o1, Bryla o2) {
        return o1.getKolor().compareTo(o2.getKolor());
    }
}

class wysokosciSort implements Comparator<Bryla>{
    public int compare(Bryla o1, Bryla o2) {
        return o1.getH() - o2.getH();
    }
}

class allSort implements Comparator<Bryla>{
    public int compare(Bryla o1, Bryla o2) {
        if (o1.getKolor().equals(o2.getKolor()))
            return o1.getH() - o2.getH();
        else
            return o1.getKolor().compareTo(o2.getKolor());
    }
}