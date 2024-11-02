public class Zestaw_3 {

    //Zad14

    public static int dwumian(int n, int k) {
        int wynik = 1;

        for (int i = 0; i < k; i++) {
            wynik = wynik * (n - i) / (i + 1);

        }
        return wynik;
    }

    public static void trojkatpascala(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(dwumian(i, k) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Zadanie 14\n");
        int n = 11;
        trojkatpascala(n);

        System.out.print("Zadanie 15\n");
        int liczba = 15;

        if (czypalindrom(liczba)) {
            System.out.println("Liczba " + liczba + " jest palindromem");
        } else {
            System.out.println("Liczba " + liczba + " nie jest palindromem");
        }
    }


    //15

    public static boolean czypalindrom(int n) {
        int poczatkowaliczba = n;
        int odwroconaliczba = 0;

        while (n != 0) {
            int ostatniacyfra = n % 10;
            odwroconaliczba = odwroconaliczba * 10 + ostatniacyfra;
            n = n / 10;
        }
        return poczatkowaliczba == odwroconaliczba;
    }

}
