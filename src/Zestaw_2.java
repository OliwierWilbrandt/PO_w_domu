import java.util.Scanner;

public class Zestaw_2 {
    public static void main(String[] args) {

        //1

        System.out.println("Zad1\n" +
                "23.0+76 - double\n" +
                "41*2.0+3 - double\n" +
                "5-33 - int\n" +
                "109%3 - int\n" +
                "50/2 - int\n" +
                "4|2 - int\n" +
                "3^5 - int\n" +
                "7&9 - int\n");


        //2


        double wynik = ((Math.sqrt(7)-1)/2)+ Math.pow(3,3)%2;

        int wynikInt = (int) wynik;

        System.out.println("Wynik działania 1 int: " + wynikInt);



        int rokurodzenia= 2005;
        int miesiacurodzenia= 7;
        int dzienurodzenia= 15;

        double wynik2 = (double) rokurodzenia/(dzienurodzenia*miesiacurodzenia);

        int wynik2Int = (int) wynik2;

        System.out.println("Wynik działania 2 int: " + wynik2Int);



        double wynik3 = (3 + Math.sqrt(3))/((Math.sqrt(5)/2)/3) + 1;

        int wynik3Int = (int) wynik3;

        System.out.println("Wynik działania 3 int: " + wynik3Int);


        int a=100;
        int b=2;
        int c=3;

        double wynik4 = (double) a%b%c;

        int wynik4Int = (int) wynik4;
        System.out.println("Wynik działania 4 int: " + wynik4Int);


        String imie = "Oliwier";
        String nazwisko = "Wilbrandt";

        int dlugoscImie = imie.length();
        int dlugoscNazwisko = nazwisko.length();

        int wynik5Modulo = (dlugoscNazwisko % dlugoscImie) + 1;

        double sqrt2 = Math.sqrt(2);

        double wynik5 = wynik5Modulo + sqrt2;

        int wynik5Int = (int) wynik5;

        System.out.println("Wynik działania 5 int: " + wynik5Int);



        //3

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj pierwsze słowo: ");
//        String slowo1 = scanner.nextLine();
//
//        System.out.print("Podaj drugie słowo: ");
//        String slowo2 = scanner.nextLine();
//
//        System.out.println("Pierwsze słowo: " + slowo1);
//        System.out.println("Drugie słowo: " + slowo2);


        //4

//        System.out.print("Podaj pierwszą liczbę: ");
//        double liczba1 = scanner.nextDouble();
//
//        System.out.print("Podaj drugą liczbę: ");
//        double liczba2 = scanner.nextDouble();
//
//        double suma = liczba1 + liczba2;
//        double roznica = liczba1 - liczba2;
//        double iloczyn = liczba1 * liczba2;
//        double iloraz = liczba1 / liczba2;
//
//        System.out.println("Suma: " + suma);
//        System.out.println("Różnica: " + roznica);
//        System.out.println("Iloczyn: " + iloczyn);
//        System.out.println("Iloraz: " + iloraz);


        //5

        System.out.print("Podal liczbe x: ");
        double x= scanner.nextDouble();

        double dodaj = x+140;
        System.out.println("Wynik po dodaniu do x 140: " + dodaj);

        double odejm = x-31;
        System.out.println("Wynik po odejmonwaniu od x 31: " + odejm);

        double razy = x*7;
        System.out.println("Wynik po pomnożeniu x przez 7: " + razy);

        double dziel = x/13;
        System.out.println("Wynik po podzieleniu  x przez 13: " + dziel);

        double modul = x%7;
        System.out.println("Wynik po modulo 7 : " + modul);

        double calkow = (int) x/4;
        System.out.println("Wynik po dzieleniu z czescia calkowita przez 4: " + calkow);

        double potega =Math.pow(x,45);
        System.out.println("Wynik po podniesieniu do potegi 45 x : " + potega);






















    }
}
