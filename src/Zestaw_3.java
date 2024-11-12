import java.util.Scanner;

public class Zestaw_3 {

    public static void main(String[] args) {
//        System.out.print("Zadanie 14\n");
//        int n = 11;
//        trojkatpascala(n);
//
//        System.out.print("Zadanie 15\n");
//        int liczba = 15;
//
//        if (czypalindrom(liczba)) {
//            System.out.println("Liczba " + liczba + " jest palindromem");
//        } else {
//            System.out.println("Liczba " + liczba + " nie jest palindromem");
//        }
//
//        System.out.print("Zadanie 1\n");
//        int p = 20;
//        trojkiPitagorejskie(p);
//
//
//        System.out.print("Zadanie 7\n");
//        int s =5;
//        System.out.println("Silnia liczby " + s + " wynosi: " + silnia(s));


//        System.out.print("Zadanie 2\n");
//        int n = 5;
//
//        System.out.println("Zestawy współczynników dla których istnieją rozwiązania:");
//        funKwaRozwiazania(n);



//        System.out.print("Zadanie 3\n");
//        int n = 5;
//
//        System.out.println("Zestawy współczynników dla których pierwiastek z delty jest liczbą całkowitą:");
//        funKwaDelta(n);


//        System.out.print("Zadanie 4\n");
//        int n = 30;
//        liczbyPierwsze(n);



//        System.out.print("Zadanie 5\n");
//        int m = 3;
//        int n = 5;
//
//        liczbyPodzielne(m, n);



//        System.out.print("Zadanie 6\n");
//        int n = 5;
//        int variant = 1;
//
//        piramida(n, variant);



//        System.out.print("Zadanie 8\n");
//        int n = 7;
//        System.out.println("Silnia podwójna liczby " + n + " to: " + silniaPodwojna(n));


//        System.out.print("Zadanie 9\n");
//        int m = 2;
//        int n = 7;
//
//        System.out.println("Silnia m-ta (" + m + " " + n + ") to: " + silnia(m, n));



//        System.out.print("Zadanie 10\n");
//        int n = 5;
//        int k = 2;
//
//        System.out.println("Dwumian Newtona (" + n + " po " + k + ") = " + dwumianNewtona(n, k));




//        System.out.print("Zadanie 11\n");
//        int n = 10;
//
//        ciagFibonacciego(n);



//        System.out.print("Zadanie 12\n");
//        int n = 10;
//
//        int sumaNat = sumaNaturalnych(n);
//        int sumaParz = sumaParzystych(n);
//        int sumaNieparz = sumaNieparzystych(n);
//        int sumaKwaNat = sumaKwaNaturalnych(n);
//        int sumaSzeNat = sumaSzeNaturalnych(n);
//        double sumaOdwNat = sumaOdwNaturalnych(n);
//
//        System.out.println("Suma " + n + " liczb naturalnych: " + sumaNat);
//        System.out.println("Suma " + n + " liczb parzystych: " + sumaParz);
//        System.out.println("Suma " + n + " liczb nieparzystych: " + sumaNieparz);
//        System.out.println("Suma " + n + " kwadratów liczb naturalnych: " + sumaKwaNat);
//        System.out.println("Suma " + n + " sześcianów liczb naturalnych: " + sumaSzeNat);
//        System.out.println("Suma " + n + " odwrotności liczb naturalnych: " + sumaOdwNat);




//        System.out.print("Zadanie 13\n");
//        String wyraz = "kajak";
//
//        if (czyPalindrom(wyraz)) {
//            System.out.println(wyraz + " jest palindromem.");
//        } else {
//            System.out.println(wyraz + " nie jest palindromem.");
//        }



//        System.out.print("Zadanie 16\n");
//        int n = 28;
//
//        if (czyDoskonala(n)) {
//            System.out.println(n + " jest liczbą doskonałą.");
//        } else {
//            System.out.println(n + " nie jest liczbą doskonałą.");
//        }


//        System.out.print("Zadanie 17\n");
//        int n = 29;
//
//        if (czyPierwsza(n)) {
//            System.out.println(n + " jest liczbą pierwszą.");
//        } else {
//            System.out.println(n + " nie jest liczbą pierwszą.");
//        }



//        System.out.print("Zadanie 18\n");
//        int a = 56;
//        int b = 98;
//
//        int nwd = NWD(a, b);
//
//        System.out.println("Największy wspólny dzielnik (" + a + ", " + b + ") to: " + nwd);




//        System.out.print("Zadanie 19\n");
//        int[] tablica = wczytajTablice();
//
//        System.out.println("Wczytana tablica:");
//        wypiszTablice(tablica);



//        System.out.print("Zadanie 20\n");
//        int[] tablica = {1, 2, 3};
//
//        podzbiory(tablica);

    }









    //Zadanie 14
    //Wypisz trójkąt Pascala, którego wysokość jest liczbą n. (+1 pkt) trojkatPascala(n)

//    public static int dwumian(int n, int k) {
//        int wynik = 1;
//
//        for (int i = 0; i < k; i++) {
//            wynik = wynik * (n - i) / (i + 1);
//
//        }
//        return wynik;
//    }
//
//    public static void trojkatpascala(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 0; k <= i; k++) {
//                System.out.print(dwumian(i, k) + " ");
//            }
//
//            System.out.println();
//        }
//    }



    //Zadanie 15
    //Sprawdź czy podana liczba jest palindromem. (bool)(+1 pkt) czyPalindrom(n)

//    public static boolean czypalindrom(int n) {
//        int poczatkowaliczba = n;
//        int odwroconaliczba = 0;
//
//        while (n != 0) {
//            int ostatniacyfra = n % 10;
//            odwroconaliczba = odwroconaliczba * 10 + ostatniacyfra;
//            n = n / 10;
//        }
//        return poczatkowaliczba == odwroconaliczba;
//    }



    //Zadanie 1
    //Wypisz w granicach n wszystkie trójki pitagorejskie.
    //trojkiPitagorejskie(n)

//    public static void trojkiPitagorejskie(int p) {
//        System.out.println("Trójki pitagorejskie w zakresie " + p + ":\n");
//
//        for (int a = 1; a <= p; a++) {
//            for (int b = a + 1; b <= p; b++) {
//                for (int c = b + 1; c <= p; c++) {
//                    if (a * a + b * b == c * c) {
//                        System.out.println("(" + a + ", " + b + ", " + c + ")");
//                    }
//                }
//            }
//        }
//    }


    //Zadanie 7
    //Oblicz silnie liczby n.
    //silnia(n)

//    public static long silnia(int s) {
//        if (s == 0) {
//            return 1;
//        } else {
//            return s * silnia(s - 1);
//        }
//    }


    //Zadanie 2
    //Wypisz w granicach n wszystkie możliwe zestawy współczynników funkcji kwadratowej dla których istnieją rozwiązania.
    //funKwaRozwiazania(n)

//    public static void funKwaRozwiazania(int n) {
//        for (int a = -n; a <= n; a++) {
//            for (int b = -n; b <= n; b++) {
//                for (int c = -n; c <= n; c++) {
//                    int delta = b * b - 4 * a * c;
//
//                    if (delta >= 0) {
//                        System.out.println("a = " + a + ", b = " + b + ", c = " + c + " -> Delta = " + delta);
//                    }
//                }
//            }
//        }
//    }


    //Zadanie 3
    //Wypisz w granicach n wszystkie możliwe zestawy współczynników funkcji kwadratowej dla których pierwiastek z delty jest kwadratem liczby naturalnej.
    //funKwaDelta(n)

//    public static void funKwaDelta(int n) {
//        for (int a = -n; a <= n; a++) {
//            for (int b = -n; b <= n; b++) {
//                for (int c = -n; c <= n; c++) {
//                    int delta = b * b - 4 * a * c;
//
//                    if (delta >= 0) {
//                        int sqrtDelta = (int) Math.sqrt(delta);
//                        if (sqrtDelta * sqrtDelta == delta) {
//                            System.out.println("a = " + a + ", b = " + b + ", c = " + c + " -> Delta = " + delta + " (sqrt(Delta) = " + sqrtDelta + ")");
//                        }
//                    }
//                }
//            }
//        }
//    }


    //Zadanie 4
    //Wypisz wszystkie liczby pierwsze od 2 do n.
    //liczbyPierwsze(n)

//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    public static void liczbyPierwsze(int n) {
//        System.out.println("Liczby pierwsze od 2 do " + n + ":");
//        for (int i = 2; i <= n; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }



    //Zadanie 5
    //Wypisz wszystkie liczby naturalne m-cyfrowe, które podzielne są przez n.
    //liczbyPodzielne(m,n)

//    public static void liczbyPodzielne(int m, int n) {
//        int min = (int) Math.pow(10, m - 1);
//        int max = (int) Math.pow(10, m) - 1;
//
//        System.out.println("Liczby " + m + "-cyfrowe podzielne przez " + n + ":");
//
//        for (int i = min; i <= max; i++) {
//            if (i % n == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }



    //Zadnie 6
    //Wypisz piramidę z gwiazdek w dwóch wariantach, której wysokość jest liczbą n.
    //piramida(n,variant)

//    public static void piramida(int n, int variant) {
//        if (variant == 1) {
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= n - i; j++) {
//                    System.out.print(" ");
//                }
//                for (int k = 1; k <= (2 * i - 1); k++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        } else if (variant == 2) {
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= (2 * i - 1); j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Nieznany wariant");
//        }
//    }


    //Zadanie 8
    //Oblicz silnie podwójną liczby n.
    //silniaPodwojna(n)

//    public static int silniaPodwojna(int n) {
//        int wynik = 1;
//
//        for (int i = n; i > 0; i -= 2) {
//            wynik *= i;
//        }
//
//        return wynik;
//    }



    //Zadanie 9
    //Oblicz silnie m-tą liczby n.
    //silnia(m,n)

//    public static int silnia(int m, int n) {
//        int wynik = 1;
//
//        for (int i = n; i > 0; i -= m) {
//            wynik *= i;
//        }
//
//        return wynik;
//    }



    //Zadanie 10
    //Oblicz dwumian Newtona n po k.
    //dwumianNewtona(n,k)

//    public static int silnia(int n) {
//        int wynik = 1;
//        for (int i = 1; i <= n; i++) {
//            wynik *= i;
//        }
//        return wynik;
//    }
//
//    public static int dwumianNewtona(int n, int k) {
//        if (k > n) {
//            return 0; // Jeśli k jest większe niż n, wynik to 0
//        }
//
//        return silnia(n) / (silnia(k) * silnia(n - k));
//    }



    //Zadanie 11
    //Wypisz n pierwszych elementów ciągu Fibonacciego.
    //ciagFibonacciego(n)

//    public static void ciagFibonacciego(int n) {
//        if (n <= 0) {
//            System.out.println("Proszę podać liczbę większą niż 0.");
//            return;
//        }
//
//        int a = 0, b = 1;
//
//        System.out.print("Ciag Fibonacciego: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//        System.out.println();
//    }


    //Zadanie 12
    //12.
    //Oblicz sumę n liczb:
    //Naturalnych sumaNaturalnych(n)
    //Parzystych sumaParzystych(n)
    //Nieparzystych sumaNieparzystych (n)
    //Kwadratów liczb naturalnych sumaKwaNaturalnych(n)
    //Sześcianów liczb naturalnych sumaSzeNaturalnych(n)
    //Odwrotności liczb naturalnych sumaOdwNaturalnych(n)

//    public static int sumaNaturalnych(int n) {
//        int suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += i;
//        }
//        return suma;
//    }
//
//    public static int sumaParzystych(int n) {
//        int suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += 2 * i;
//        }
//        return suma;
//    }
//
//    public static int sumaNieparzystych(int n) {
//        int suma = 0;
//        for (int i = 0; i < n; i++) {
//            suma += 2 * i + 1;
//        }
//        return suma;
//    }
//    public static int sumaKwaNaturalnych(int n) {
//        int suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += i * i; // Kwadrat liczby
//        }
//        return suma;
//    }
//
//    public static int sumaSzeNaturalnych(int n) {
//        int suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += i * i * i; // Sześcian liczby
//        }
//        return suma;
//    }
//
//    public static double sumaOdwNaturalnych(int n) {
//        double suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += 1.0 / i;
//        }
//        return suma;
//    }


    //Zadanie 13
    //Sprawdź czy podany wyraz jest palindromem. (bool)
    //czyPalindrom(wyraz)

//    public static boolean czyPalindrom(String wyraz) {
//
//        StringBuilder odwroconyWyraz = new StringBuilder(wyraz).reverse();
//
//        return wyraz.equals(odwroconyWyraz.toString());
//    }



    //Zadanie 16
    //Sprawdź czy wprowadzona liczba jest doskonała. (bool)
    //czyDoskonala(n)

//    public static boolean czyDoskonala(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        int sumaDzielnikow = 0;
//
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                sumaDzielnikow += i;
//            }
//        }
//
//        return sumaDzielnikow == n;
//    }



    //Zadanie 17
    //Sprawdź czy wprowadzona liczba jest pierwsza. (bool)
    //czyPierwsza(n)

//    public static boolean czyPierwsza(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        if (n == 2) {
//            return true;
//        }
//
//        if (n % 2 == 0) {
//            return false;
//        }
//
//        for (int i = 3; i * i <= n; i += 2) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }



    //Zadanie 18
    //Wyznacz największy wspólny dzielnik dwóch liczb.
    //NWD(a,b)

//    public static int NWD(int a, int b) {
//        while (b != 0) {
//            int reszta = a % b;
//            a = b;
//            b = reszta;
//        }
//        return a;
//    }



    //Zadanie 19
    //Funkcja wczytuje liczbę n, a następnie tworzy tablicę n wprowadzonych liczb przez użytkownika, którą zwraca.
    //wczytajTablice()

//    public static int[] wczytajTablice() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Podaj rozmiar tablicy: ");
//        int n = scanner.nextInt();
//
//        int[] tablica = new int[n];
//
//        System.out.println("Podaj " + n + " liczbe:");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Podaj liczbę " + (i + 1) + ": ");
//            tablica[i] = scanner.nextInt();
//        }
//
//        return tablica;
//    }
//
//    public static void wypiszTablice(int[] tablica) {
//        for (int i : tablica) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }



    //Zadanie 20
    //Wypisz wszystkie podzbiory tablicy n-elementowej.
    //podzbiory(tab)

//    public static void podzbiory(int[] tablica) {
//        int n = tablica.length;
//        int liczbaPodzbiorow = (int) Math.pow(2, n);
//
//        for (int i = 0; i < liczbaPodzbiorow; i++) {
//            System.out.print("{ ");
//            for (int j = 0; j < n; j++) {
//                if ((i & (1 << j)) != 0) {
//                    System.out.print(tablica[j] + " ");
//                }
//            }
//            System.out.println("}");
//        }
//    }

}



