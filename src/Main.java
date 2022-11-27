import java.util.Scanner;

public class Main {
    static BrylyGeometryczne lista = new BrylyGeometryczne();

    public static void menuText(){
        System.out.println("********************************");
        System.out.println("1. Utworz Prostopadloscian\n2. Utworz Walec\n3. Wyswietl wszystkie");
        System.out.println("4. Sortowanie (kolor)\n5. Sortowanie (wysokosc)\n6. Sortowanie (razem)");
        System.out.println("7. Bryla z najwieksza objetoscia\n8. Koniec programu");
        System.out.println("********************************");
    }
    public static void addProstopadloscian(){
        Scanner read = new Scanner(System.in);
        System.out.print("Kolor: ");
        String kolor = read.nextLine();
        System.out.print("h: ");
        int h = read.nextInt();
        System.out.print("a: ");
        int a = read.nextInt();
        System.out.print("b: ");
        int b = read.nextInt();
        lista.createAddProstopadloscian(kolor, h, a, b);
    }
    public static void addWalec(){
        Scanner read = new Scanner(System.in);
        System.out.print("Kolor: ");
        String kolor = read.nextLine();
        System.out.print("h: ");
        int h = read.nextInt();
        System.out.print("r: ");
        int r = read.nextInt();
        lista.createAddWalec(kolor, h, r);
    }
    public static void showAll(){
        lista.showAll();
    }
    public static void sortColor(){
        lista.sortByColor();
    }
    public static void sortH(){
        lista.sortByH();
    }
    public static void sort(){
        lista.sortFull();
    }
    public static void maxObjetosc(){
        lista.maxObjetosc();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wybor = 0;
        while (!(wybor == 8)){
            menuText();
            wybor = sc.nextInt();
            switch (wybor){
                case 1: addProstopadloscian(); break;
                case 2: addWalec(); break;
                case 3: showAll(); break;
                case 4: sortColor(); break;
                case 5: sortH(); break;
                case 6: sort(); break;
                case 7: maxObjetosc(); break;
                default: break;
            }
        }
        sc.close();
    }
}
