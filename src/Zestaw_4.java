import java.util.Random;
import java.util.HashSet;

public class Zestaw_4 {

    public static void main(String[] args) {

//        System.out.print("Zadanie 1\n");
//        int n = 10;
//        int minWartosc = 10;
//        int maxWartosc = 50;
//
//        int[] tablica = generujTablice(n, minWartosc, maxWartosc);
//
//        System.out.println("Wygenerowana tablica ");
//        wypiszTablice(tablica);


//        System.out.print("Zadanie 7\n");
//        int n = 5;
//        int minWartosc = 5;
//        int maxWartosc = 15;
//
//        double[] tablica = generujZakres(n, minWartosc, maxWartosc);
//
//        System.out.println("Wygenerowana tablica:");
//        wypiszTablice(tablica);


//          System.out.print("Zadanie 2\n");
//          int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//          wypiszTablice(tablica, 3, 4);

//        System.out.print("Zadanie 3\n");
//        int n = 10;
//        int minWartosc = -5;
//        int maxWartosc = 5;
//
//        int[] tablica = generujTablice(n, minWartosc, maxWartosc);
//        System.out.println("Wygenerowana tablica:");
//        wypiszTablice(tablica);
//
//        System.out.println("Ilość liczb nieparzystych: " + ileNieparzystych(tablica));
//        System.out.println("Ilość liczb parzystych: " + ileParzystych(tablica));
//        System.out.println("Ilość liczb dodatnich: " + ileDodatnich(tablica));
//        System.out.println("Ilość liczb ujemnych: " + ileUjemnych(tablica));
//        System.out.println("Ilość liczb zerowych: " + ileZerowych(tablica));
//        System.out.println("Ilość liczb maksymalnych: " + ileMaxymalnych(tablica));
//        System.out.println("Ilość liczb minimalnych: " + ileMinimalnych(tablica));
//        System.out.println("Ilość liczb unikalnych: " + ileUnikalnych(tablica));


//        System.out.print("Zadanie 4\n");
//        int n = 10;
//        int minWartosc = -10;
//        int maxWartosc = 10;
//
//        int[] tablica = generujTablice(n, minWartosc, maxWartosc);
//
//        System.out.println("Wygenerowana tablica:");
//        wypiszTablice(tablica);
//
//        System.out.println("Suma liczb dodatnich: " + sumaDodatnich(tablica));
//        System.out.println("Suma liczb ujemnych: " + sumaUjemnych(tablica));
//        System.out.println("Suma odwrotności liczb: " + sumaOdwrotnosci(tablica));
//        System.out.println("Średnia arytmetyczna: " + sredniaArytmetyczna(tablica));
//        System.out.println("Średnia geometryczna: " + sredniaGeometryczna(tablica));
//        System.out.println("Średnia harmoniczna: " + sredniaHarmoniczna(tablica));


//        System.out.print("Zadanie 5\n");
//        int n = 10;
//        int minWartosc = -5;
//        int maxWartosc = 5;
//
//        int[] tablica = generujTablice(n, minWartosc, maxWartosc);
//
//        System.out.println("Wygenerowana tablica:");
//        wypiszTablice(tablica);
//
//        double[] wynikiLiniowe = funkcjaLiniowa(tablica, 2, 3);
//        double[] wynikiKwadratowe = funkcjaKwadratowa(tablica, 1, -2, 1);
//        double[] wynikiWykladnicze = funkcjaWykladnicza(tablica, 2);
//        int[] wynikiSignum = funkcjaSignum(tablica);
//
//        System.out.println("Wyniki funkcji liniowej (2x + 3):");
//        for (double wynik : wynikiLiniowe) {
//            System.out.print(wynik + " ");
//        }
//        System.out.println();
//
//        System.out.println("Wyniki funkcji kwadratowej (x^2 - 2x + 1):");
//        for (double wynik : wynikiKwadratowe) {
//            System.out.print(wynik + " ");
//        }
//        System.out.println();
//
//        System.out.println("Wyniki funkcji wykładniczej (2^x):");
//        for (double wynik : wynikiWykladnicze) {
//            System.out.print(wynik + " ");
//        }
//        System.out.println();
//
//        System.out.println("Wyniki funkcji signum:");
//        for (int wynik : wynikiSignum) {
//            System.out.print(wynik + " ");
//        }
//        System.out.println();


//        System.out.print("Zadanie 6\n");
//        int n = 15;
//        int minWartosc = -10;
//        int maxWartosc = 10;
//
//        int[] tablica = generujTablice(n, minWartosc, maxWartosc);
//
//        System.out.println("Wygenerowana tablica:");
//        wypiszTablice(tablica);
//
//        System.out.println("Najdłuższy ciąg dodatnich liczb: " + najdluzszyCiagDodatnich(tablica));
//
//        System.out.println("Najdłuższy ciąg ujemnych liczb: " + najdluzszyCiagUjemnych(tablica));
//
//        odwrocTablice(tablica);
//        System.out.println("Tablica po odwróceniu:");
//        wypiszTablice(tablica);
//
//        odwrocTablice(tablica, 3, 7);
//        System.out.println("Tablica po odwróceniu fragmentu (indeks 3 do 7):");
//        wypiszTablice(tablica);



   }


    //Zadanie 1
    //Napisz funkcję, która generuje tablicę liczb gdzie n oznacza ilość elementów tablicy, minWartosc wartość minimalną w tablicy, a maxWartosc wartość maksymalną.
    //generujTablice(n, minWartosc, maxWartosc)

//    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
//        int[] tablica = new int[n];
//        Random random = new Random();
//
//
//        for (int i=0; i<n; i++) {
//            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
//        }
//
//        return tablica;
//
//    }
//
//
//    public static void wypiszTablice(int[] tablica) {
//        for (int i : tablica) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//    }


    //Zadanie 7
    //Zmodyfikuj funkcję z zadania 1. w taki sposób, aby generowała tablicę, której liczby są w równych odstępach od siebie.
    //generujZakres(n, minWartosc, maxWartosc)

//    public static double[] generujZakres(int n, double minWartosc, double maxWartosc) {
//        double[] tablica = new double[n];
//
//        double krok = (maxWartosc - minWartosc) / (n - 1);
//
//        for (int i = 0; i < n; i++) {
//            tablica[i] = minWartosc + i * krok;
//        }
//
//        return tablica;
//    }
//
//    public static void wypiszTablice(double[] tablica) {
//        for (double i : tablica) {
//            System.out.printf("%.2f  ", i);
//        }
//        System.out.println();
//    }


    //Zadnie 2
    //Napisz funkcję, która wypisuje na ekranie tablice w formie macierzy o wymiarach n x m. W przypadku gdy n*m jest większe od długości tablicy program wypisuje puste pola. Zadbaj o to, aby liczby były ułożone równo.
    //wypiszTablice(tab, n, m)

//    public static void wypiszTablice(int[] tab, int n, int m) {
//        int index = 0;  // Indeks elementu w tablicy
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (index < tab.length) {
//                    System.out.printf("%-5d", tab[index]);
//                } else {
//                    System.out.printf("%-5s", " ");
//                }
//                index++;
//            }
//            System.out.println();
//        }
//    }


    //Zadnie 3
    //Wykorzystując funkcję z zadania 1. napisz funkcje zliczające ilość liczb w tablicy.
    //ileNieparzystych(tab) ileParzystych(tab) ileDodatnich(tab) ileUjemnych(tab) ileZerowych(tab) ileMaxymalnych(tab) ileMinimalnych(tab)
    //ileUnikalnych(tab)

//    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
//        int[] tablica = new int[n];
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
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
//
//    public static int ileNieparzystych(int[] tablica) {
//        int count = 0;
//        for (int num : tablica) {
//            if (num % 2 != 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileParzystych(int[] tablica) {
//        int count = 0;
//        for (int num : tablica) {
//            if (num % 2 == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileDodatnich(int[] tablica) {
//        int count = 0;
//        for (int num : tablica) {
//            if (num > 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileUjemnych(int[] tablica) {
//        int count = 0;
//        for (int num : tablica) {
//            if (num < 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileZerowych(int[] tablica) {
//        int count = 0;
//        for (int num : tablica) {
//            if (num == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileMaxymalnych(int[] tablica) {
//        int max = Integer.MIN_VALUE;
//        int count = 0;
//
//        for (int num : tablica) {
//            if (num > max) {
//                max = num;
//            }
//        }
//
//        for (int num : tablica) {
//            if (num == max) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileMinimalnych(int[] tablica) {
//        int min = Integer.MAX_VALUE;
//        int count = 0;
//
//        for (int num : tablica) {
//            if (num < min) {
//                min = num;
//            }
//        }
//
//        for (int num : tablica) {
//            if (num == min) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileUnikalnych(int[] tablica) {
//        HashSet<Integer> uniqueNumbers = new HashSet<>();
//
//        for (int num : tablica) {
//            uniqueNumbers.add(num);
//        }
//
//        return uniqueNumbers.size();
//    }


    //Zadanie 4
    //Wykorzystując funkcje z zadania 1. napisz funkcje wykonujące odpowiednie operacje arytmetyczne.
    //sumaDodatnich(tab)
    //sumaUjemnych(tab)
    //sumaOdwrotnosci(tab)
    //sredniaArytmetyczna(tab)
    //sredniaGeometryczna(tab)
    //sredniaHarmoniczna(tab)

//    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
//        int[] tablica = new int[n];
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
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
//
//    public static int sumaDodatnich(int[] tablica) {
//        int suma = 0;
//        for (int num : tablica) {
//            if (num > 0) {
//                suma += num;
//            }
//        }
//        return suma;
//    }
//
//    public static int sumaUjemnych(int[] tablica) {
//        int suma = 0;
//        for (int num : tablica) {
//            if (num < 0) {
//                suma += num;
//            }
//        }
//        return suma;
//    }
//
//    public static double sumaOdwrotnosci(int[] tablica) {
//        double suma = 0;
//        for (int num : tablica) {
//            if (num != 0) {
//                suma += 1.0 / num;
//            }
//        }
//        return suma;
//    }
//
//    public static double sredniaArytmetyczna(int[] tablica) {
//        double suma = 0;
//        for (int num : tablica) {
//            suma += num;
//        }
//        return suma / tablica.length;
//    }
//
//    public static double sredniaGeometryczna(int[] tablica) {
//        double iloczyn = 1.0;
//        int liczbaDodatnich = 0;
//
//        for (int num : tablica) {
//            if (num > 0) {
//                iloczyn *= num;
//                liczbaDodatnich++;
//            }
//        }
//
//        if (liczbaDodatnich == 0) {
//            return 0;
//        }
//
//        return Math.pow(iloczyn, 1.0 / liczbaDodatnich);
//    }
//
//    public static double sredniaHarmoniczna(int[] tablica) {
//        double suma = 0;
//        int liczbaElementow = 0;
//
//        for (int num : tablica) {
//            if (num != 0) {
//                suma += 1.0 / num;
//                liczbaElementow++;
//            }
//        }
//
//        if (liczbaElementow == 0) {
//            return 0;
//        }
//
//        return liczbaElementow / suma;
//    }


    //Zadanie 5
    //Wykorzystując funkcję z zadania 1. napisz funkcje zwracające tablice wartości dla odpowiednich funkcji.
    //funkcjaLiniowa(tab, a, b) //ax+b
    //funkcjaKwadratowa(tab, a, b, c) //ax^2+bx+c
    //funkcjaWykladnicza(tab, a) //a^x
    //funkcjaSignum(tab)

//    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
//        int[] tablica = new int[n];
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
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
//
//    public static double[] funkcjaLiniowa(int[] tablica, double a, double b) {
//        double[] wyniki = new double[tablica.length];
//
//        for (int i = 0; i < tablica.length; i++) {
//            wyniki[i] = a * tablica[i] + b;
//        }
//
//        return wyniki;
//    }
//
//    public static double[] funkcjaKwadratowa(int[] tablica, double a, double b, double c) {
//        double[] wyniki = new double[tablica.length];
//
//        for (int i = 0; i < tablica.length; i++) {
//            wyniki[i] = a * Math.pow(tablica[i], 2) + b * tablica[i] + c;
//        }
//
//        return wyniki;
//    }
//
//    public static double[] funkcjaWykladnicza(int[] tablica, double a) {
//        double[] wyniki = new double[tablica.length];
//
//        for (int i = 0; i < tablica.length; i++) {
//            wyniki[i] = Math.pow(a, tablica[i]);
//        }
//
//        return wyniki;
//    }
//
//    public static int[] funkcjaSignum(int[] tablica) {
//        int[] wyniki = new int[tablica.length];
//
//        for (int i = 0; i < tablica.length; i++) {
//            if (tablica[i] < 0) {
//                wyniki[i] = -1;
//            } else if (tablica[i] > 0) {
//                wyniki[i] = 1;
//            } else {
//                wyniki[i] = 0;
//            }
//        }
//
//        return wyniki;
//    }


    //*********
    //Zadnie 6
    //Wykorzystując funkcję z zadania 1. napisz funkcje, które wykonują odpowiednie operacje na tablicy.
    //najdluzszyCiagDodatnich(tab) najdluzszyCiagUjemnych(tab) odwrocTablice(tab) odwrocTablice(tab, indeksStart, indeksStop)
    //7.


//    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
//        int[] tablica = new int[n];
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
//        }
//
//        return tablica;
//    }
//
//
//    public static void wypiszTablice(int[] tablica) {
//        for (int i : tablica) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//
//
//    public static int najdluzszyCiagDodatnich(int[] tablica) {
//        int maxCiąg = 0;
//        int currentCiąg = 0;
//
//        for (int i = 0; i < tablica.length; i++) {
//            if (tablica[i] > 0) {
//                currentCiąg++;
//                maxCiąg = Math.max(maxCiąg, currentCiąg);
//            } else {
//                currentCiąg = 0;
//            }
//        }
//
//        return maxCiąg;
//    }
//
//    public static int najdluzszyCiagUjemnych(int[] tablica) {
//        int maxCiąg = 0;
//        int currentCiąg = 0;
//
//        for (int i = 0; i < tablica.length; i++) {
//            if (tablica[i] < 0) {
//                currentCiąg++;
//                maxCiąg = Math.max(maxCiąg, currentCiąg);
//            } else {
//                currentCiąg = 0;
//            }
//        }
//
//        return maxCiąg;
//    }
//
//    public static void odwrocTablice(int[] tablica) {
//        int left = 0;
//        int right = tablica.length - 1;
//        while (left < right) {
//            int temp = tablica[left];
//            tablica[left] = tablica[right];
//            tablica[right] = temp;
//
//            left++;
//            right--;
//        }
//    }
//
//    public static void odwrocTablice(int[] tablica, int indeksStart, int indeksStop) {
//        if (indeksStart < 0 || indeksStop >= tablica.length || indeksStart >= indeksStop) {
//            System.out.println("Niepoprawne indeksy");
//            return;
//        }
//
//        while (indeksStart < indeksStop) {
//            // Zamiana miejscami elementów
//            int temp = tablica[indeksStart];
//            tablica[indeksStart] = tablica[indeksStop];
//            tablica[indeksStop] = temp;
//
//            indeksStart++;
//            indeksStop--;
//        }
//    }









}
