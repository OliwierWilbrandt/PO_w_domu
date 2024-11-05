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

        System.out.print("Zadanie 1\n");
        int p = 20;
        trojkiPitagorejskie(p);


        System.out.print("Zadanie 7\n");
        int s =5;
        System.out.println("Silnia liczby " + s + " wynosi: " + silnia(s));
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



    //1

    public static void trojkiPitagorejskie(int p) {
        System.out.println("Trójki pitagorejskie w zakresie " + p + ":\n");

        for (int a = 1; a <= p; a++) {
            for (int b = a + 1; b <= p; b++) {
                for (int c = b + 1; c <= p; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
    }


    //7

    public static long silnia(int s) {
        if (s == 0) {
            return 1;
        } else {
            return s * silnia(s - 1);
        }
    }

}



