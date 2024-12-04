import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

//Zadanie 1

//class Produkt {
//     String nazwa;
//     double cena;
//     int iloscNaMagazynie;
//
//
//
//     public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
//         this.nazwa = nazwa;
//         this.cena = cena;
//         this.iloscNaMagazynie = iloscNaMagazynie;
//     }
//
//     public void wyswietlinformacje() {
//         System.out.println("Produkt: "+nazwa);
//         System.out.println("Cena: "+cena);
//         System.out.println("Ilosc na magazynir: "+iloscNaMagazynie);
//     }
//
//
//     public void dodajDoMagazynu(int ilosc) {
//         if (ilosc>0) {
//             iloscNaMagazynie+=ilosc;
//             System.out.println("Dodano "+ilosc+" sztuk do magazynu");
//         }else {
//             System.out.println("Nie mozna dodac ujemnej wartosci");
//         }
//     }
//
//     public void usunZMagazynu(int ilosc) {
//         if (ilosc>iloscNaMagazynie) {
//             System.out.println("Nie mozna usunac "+ilosc+" sztuk na magazynie jest za malo "+iloscNaMagazynie);
//         }else if (ilosc>0) {
//             iloscNaMagazynie-=ilosc;
//             System.out.println("Usunieto "+ilosc+"sztuk");
//         }else {
//             System.out.println("Nie mozna usunac ujemnej ilosci");
//         }
//     }
//}


//Zadanie 2

//class Produkt {
//    String nazwa;
//    double cena;
//    int iloscNaMagazynie;
//
//    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
//        this.nazwa = nazwa;
//        this.cena = cena;
//        this.iloscNaMagazynie = iloscNaMagazynie;
//    }
//
//    public String getNazwa() {
//        return nazwa;
//    }
//
//    public double getCena() {
//        return cena;
//    }
//
//    public int getIloscNaMagazynie() {
//        return iloscNaMagazynie;
//    }
//
//    public boolean usunZMagazynu(int ilosc) {
//        if (iloscNaMagazynie >= ilosc) {
//            iloscNaMagazynie -= ilosc;
//            return true;
//        }
//        return false;
//    }
//
//    public void wyswietlInformacje() {
//        System.out.println("Produkt: " + nazwa + ", Cena: " + cena + ", Ilość na magazynie: " + iloscNaMagazynie);
//    }
//}
//
//class KoszykZakupowy {
//    private Map<Produkt, Integer> koszyk;
//
//    public KoszykZakupowy() {
//        koszyk = new HashMap<>();
//    }
//
//    public boolean dodajProdukt(Produkt produkt, int ilosc) {
//        if (produkt.usunZMagazynu(ilosc)) {
//            koszyk.put(produkt, koszyk.getOrDefault(produkt, 0) + ilosc);
//            return true;
//        }
//        System.out.println("Brak wystarczającej ilości produktu: " + produkt.getNazwa());
//        return false;
//    }
//
//    public void wyswietlZawartoscKoszyka() {
//        if (koszyk.isEmpty()) {
//            System.out.println("Koszyk jest pusty.");
//        } else {
//            for (Map.Entry<Produkt, Integer> entry : koszyk.entrySet()) {
//                System.out.println("Produkt: " + entry.getKey().getNazwa() + ", Ilość: " + entry.getValue() + ", Cena: " + entry.getKey().getCena());
//            }
//        }
//    }
//
//    public double obliczCalkowitaWartosc() {
//        double suma = 0;
//        for (Map.Entry<Produkt, Integer> entry : koszyk.entrySet()) {
//            suma += entry.getKey().getCena() * entry.getValue();
//        }
//        return suma;
//    }
//}



//Zadanie 3

//class Produkt {
//    String nazwa;
//    double cena;
//    int iloscNaMagazynie;
//
//    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
//        this.nazwa = nazwa;
//        this.cena = cena;
//        this.iloscNaMagazynie = iloscNaMagazynie;
//    }
//
//    public String getNazwa() {
//        return nazwa;
//    }
//
//    public double getCena() {
//        return cena;
//    }
//
//    public int getIloscNaMagazynie() {
//        return iloscNaMagazynie;
//    }
//
//    public boolean usunZMagazynu(int ilosc) {
//        if (iloscNaMagazynie >= ilosc) {
//            iloscNaMagazynie -= ilosc;
//            return true;
//        }
//        return false;
//    }
//
//    public void wyswietlInformacje() {
//        System.out.println("Produkt: " + nazwa + ", Cena: " + cena + ", Ilość na magazynie: " + iloscNaMagazynie);
//    }
//}
//
//class KoszykZakupowy {
//    Map<Produkt, Integer> koszyk;
//
//    public KoszykZakupowy() {
//        koszyk = new HashMap<>();
//    }
//
//    public boolean dodajProdukt(Produkt produkt, int ilosc) {
//        if (produkt.usunZMagazynu(ilosc)) {
//            koszyk.put(produkt, koszyk.getOrDefault(produkt, 0) + ilosc);
//            return true;
//        }
//        System.out.println("Brak wystarczającej ilości produktu: " + produkt.getNazwa());
//        return false;
//    }
//
//    public void wyswietlZawartoscKoszyka() {
//        if (koszyk.isEmpty()) {
//            System.out.println("Koszyk jest pusty.");
//        } else {
//            for (Map.Entry<Produkt, Integer> entry : koszyk.entrySet()) {
//                System.out.println("Produkt: " + entry.getKey().getNazwa() + ", Ilość: " + entry.getValue() + ", Cena: " + entry.getKey().getCena());
//            }
//        }
//    }
//
//    public double obliczCalkowitaWartosc() {
//        double suma = 0;
//        for (Map.Entry<Produkt, Integer> entry : koszyk.entrySet()) {
//            suma += entry.getKey().getCena() * entry.getValue();
//        }
//        return suma;
//    }
//}
//
//class Zamowienie {
//    KoszykZakupowy koszykZakupowy;
//    String statusZamowienia;
//
//    public Zamowienie(KoszykZakupowy koszykZakupowy) {
//        this.koszykZakupowy = koszykZakupowy;
//        this.statusZamowienia = "Nowe"; // Domyślny status zamówienia
//    }
//
//    public void ustawStatusZamowienia(String nowyStatus) {
//        this.statusZamowienia = nowyStatus;
//    }
//
//    public void wyswietlZamowienie() {
//        System.out.println("Status zamówienia: " + statusZamowienia);
//        System.out.println("Zawartość koszyka:");
//        koszykZakupowy.wyswietlZawartoscKoszyka();
//        System.out.println("Całkowita wartość zamówienia: " + koszykZakupowy.obliczCalkowitaWartosc() + " PLN");
//    }
//}


//Zadanie 4

//class Klient {
//    String imie;
//    String nazwisko;
//    List<Zamowienie> listaZamowien;
//
//    public Klient(String imie, String nazwisko) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.listaZamowien = new ArrayList<>();
//    }
//
//    public void dodajZamowienie(Zamowienie zamowienie) {
//        listaZamowien.add(zamowienie);
//    }
//
//    public void wyswietlHistorieZamowien() {
//        if (listaZamowien.isEmpty()) {
//            System.out.println("Klient " + imie + " " + nazwisko + " nie ma żadnych zamówień.");
//        } else {
//            System.out.println("Historia zamówień klienta: " + imie + " " + nazwisko);
//            for (int i = 0; i < listaZamowien.size(); i++) {
//                System.out.println("Zamówienie #" + (i + 1) + ":");
//                listaZamowien.get(i).wyswietlZamowienie();
//                System.out.println();
//            }
//        }
//    }
//
//    public double obliczLacznyKosztZamowien() {
//        double suma = 0;
//        for (Zamowienie zamowienie : listaZamowien) {
//            suma += zamowienie.koszykZakupowy.obliczCalkowitaWartosc();
//        }
//        return suma;
//    }
//}



//Zadanie 5

//class Sklep {
//    List<Produkt> produkty;
//
//    public Sklep() {
//        this.produkty = new ArrayList<>();
//    }
//
//    public void dodajProdukt(Produkt produkt) {
//        produkty.add(produkt);
//    }
//
//    public void wyswietlOferty() {
//        if (produkty.isEmpty()) {
//            System.out.println("Brak produktów w ofercie sklepu.");
//        } else {
//            System.out.println("Oferta sklepu:");
//            for (Produkt produkt : produkty) {
//                produkt.wyswietlInformacje();
//            }
//        }
//    }
//
//    public Produkt wyszukajProduktu(String nazwa) {
//        for (Produkt produkt : produkty) {
//            if (produkt.getNazwa().equalsIgnoreCase(nazwa)) {
//                return produkt;
//            }
//        }
//        System.out.println("Produkt o nazwie \"" + nazwa + "\" nie został znaleziony.");
//        return null;
//    }
//
//    public void zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc) {
//        Produkt produkt = wyszukajProduktu(nazwaProduktu);
//        if (produkt != null) {
//            if (produkt.getIloscNaMagazynie() >= ilosc) {
//                koszyk.dodajProdukt(produkt, ilosc);
//                produkt.usunZMagazynu(ilosc);
//                System.out.println("Dodano " + ilosc + " szt. produktu \"" + nazwaProduktu + "\" do koszyka.");
//            } else {
//                System.out.println("Niewystarczająca ilość produktu \"" + nazwaProduktu + "\" na magazynie.");
//            }
//        }
//    }
//}



//Zadanie 6

//class Platnosc {
//    double kwota;
//    String statusPlatnosci;
//
//    public Platnosc(double kwota) {
//        this.kwota = kwota;
//        this.statusPlatnosci = "Nieopłacone";
//    }
//
//    public void zaplac() {
//        if (this.kwota > 0) {
//            this.statusPlatnosci = "Opłacone";
//            System.out.println("Płatność w wysokości " + this.kwota + " PLN została opłacona.");
//        } else {
//            System.out.println("Kwota płatności musi być większa niż 0.");
//        }
//    }
//
//    public String getStatusPlatnosci() {
//        return statusPlatnosci;
//    }
//
//    public double getKwota() {
//        return kwota;
//    }
//
//    public void setKwota(double kwota) {
//        this.kwota = kwota;
//    }
//}
//
//class Zamowienie {
//    KoszykZakupowy koszykZakupowy;
//    String statusZamowienia;
//    Platnosc platnosc;
//
//    public Zamowienie(KoszykZakupowy koszykZakupowy, double kwotaPlatnosci) {
//        this.koszykZakupowy = koszykZakupowy;
//        this.statusZamowienia = "Oczekujące";
//        this.platnosc = new Platnosc(kwotaPlatnosci);
//    }
//
//    public void ustawStatusZamowienia(String status) {
//        this.statusZamowienia = status;
//    }
//
//    public void wyswietlZamowienie() {
//        System.out.println("Zawartość koszyka:");
//        koszykZakupowy.wyswietlZawartoscKoszyka();
//        System.out.println("Status zamówienia: " + statusZamowienia);
//        System.out.println("Status płatności: " + platnosc.getStatusPlatnosci());
//    }
//
//    public void finalizujZamowienie() {
//        if (platnosc.getStatusPlatnosci().equals("Opłacone")) {
//            ustawStatusZamowienia("Gotowe do wysyłki");
//            System.out.println("Zamówienie zostało sfinalizowane i jest gotowe do wysyłki.");
//        } else {
//            System.out.println("Zamówienie nie może zostać sfinalizowane. Płatność nie została opłacona.");
//        }
//    }
//
//    public void zwrocProdukt(String nazwaProduktu, int ilosc) {
//        boolean sukces = koszykZakupowy.usunProdukt(nazwaProduktu, ilosc);
//        if (sukces) {
//            Produkt produkt = koszykZakupowy.getProdukt(nazwaProduktu);
//            if (produkt != null) {
//                produkt.dodajDoMagazynu(ilosc);
//            }
//            double nowaKwota = koszykZakupowy.obliczCalkowitaWartosc();
//            platnosc.setKwota(nowaKwota);
//            System.out.println("Produkt \"" + nazwaProduktu + "\" w ilości " + ilosc + " został zwrócony. Nowa wartość zamówienia: " + nowaKwota + " PLN.");
//        } else {
//            System.out.println("Nie udało się zwrócić produktu \"" + nazwaProduktu + "\" w podanej ilości.");
//        }
//    }
//}



public class Zestaw_6 {

    public static void main(String[] args){


//        System.out.println("\nZadanie 1");
//        Produkt produkt = new Produkt("zegarek", 600, 5);
//
//        System.out.println("Informacje: ");
//        produkt.wyswietlinformacje();
//
//        System.out.println("Dodawanie do magazynu: ");
//        produkt.dodajDoMagazynu(2);
//        produkt.wyswietlinformacje();
//
//        System.out.println("Usuwanie z magazynu: ");
//        produkt.usunZMagazynu(1);
//        produkt.wyswietlinformacje();




//        System.out.println("\nZadanie 2");
//
//        Produkt produkt1 = new Produkt("Laptop", 3000, 5);
//        Produkt produkt2 = new Produkt("Myszka", 50, 20);
//        Produkt produkt3 = new Produkt("Klawiatura", 150, 10);
//
//        produkt1.wyswietlInformacje();
//        produkt2.wyswietlInformacje();
//        produkt3.wyswietlInformacje();
//
//        KoszykZakupowy koszyk = new KoszykZakupowy();
//
//        koszyk.dodajProdukt(produkt1, 2); // Dodanie 2 laptopów
//        koszyk.dodajProdukt(produkt2, 3); // Dodanie 3 myszek
//        koszyk.dodajProdukt(produkt3, 1); // Dodanie 1 klawiatury
//
//        System.out.println("Zawartość koszyka:");
//        koszyk.wyswietlZawartoscKoszyka();
//
//        double calkowitaWartosc = koszyk.obliczCalkowitaWartosc();
//        System.out.println("Całkowita wartość koszyka: " + calkowitaWartosc + " PLN");


//        System.out.println("\nZadanie 3");
//
//        Produkt produkt1 = new Produkt("Laptop", 3000, 5);
//        Produkt produkt2 = new Produkt("Myszka", 50, 20);
//        Produkt produkt3 = new Produkt("Klawiatura", 150, 10);
//
//        KoszykZakupowy koszyk = new KoszykZakupowy();
//
//        koszyk.dodajProdukt(produkt1, 2); // Dodanie 2 laptopów
//        koszyk.dodajProdukt(produkt2, 3); // Dodanie 3 myszek
//        koszyk.dodajProdukt(produkt3, 1); // Dodanie 1 klawiatury
//
//        Zamowienie zamowienie = new Zamowienie(koszyk);
//
//        zamowienie.wyswietlZamowienie();
//
//        zamowienie.ustawStatusZamowienia("W realizacji");
//        System.out.println("\nZaktualizowane zamówienie:");
//        zamowienie.wyswietlZamowienie();



//        System.out.println("\nZadanie 4");
//
//        Produkt produkt1 = new Produkt("Laptop", 3000, 5);
//        Produkt produkt2 = new Produkt("Myszka", 50, 20);
//        Produkt produkt3 = new Produkt("Klawiatura", 150, 10);
//
//        KoszykZakupowy koszyk1 = new KoszykZakupowy();
//        koszyk1.dodajProdukt(produkt1, 1); // Dodanie 1 laptopa
//        koszyk1.dodajProdukt(produkt2, 2); // Dodanie 2 myszek
//
//        Zamowienie zamowienie1 = new Zamowienie(koszyk1);
//        zamowienie1.ustawStatusZamowienia("Zrealizowane");
//
//        KoszykZakupowy koszyk2 = new KoszykZakupowy();
//        koszyk2.dodajProdukt(produkt2, 5); // Dodanie 5 myszek
//        koszyk2.dodajProdukt(produkt3, 1); // Dodanie 1 klawiatury
//
//        Zamowienie zamowienie2 = new Zamowienie(koszyk2);
//        zamowienie2.ustawStatusZamowienia("W realizacji");
//
//        Klient klient = new Klient("Jan", "Kowalski");
//
//        klient.dodajZamowienie(zamowienie1);
//        klient.dodajZamowienie(zamowienie2);
//
//        klient.wyswietlHistorieZamowien();
//
//        System.out.println("Łączny koszt zamówień: " + klient.obliczLacznyKosztZamowien() + " PLN");


//        System.out.println("\nZadanie 5");
//
//        Sklep sklep = new Sklep();
//
//        Produkt produkt1 = new Produkt("Laptop", 3000, 10);
//        Produkt produkt2 = new Produkt("Myszka", 50, 20);
//        Produkt produkt3 = new Produkt("Klawiatura", 150, 15);
//
//        sklep.dodajProdukt(produkt1);
//        sklep.dodajProdukt(produkt2);
//        sklep.dodajProdukt(produkt3);
//
//        sklep.wyswietlOferty();
//
//        System.out.println("Wyszukiwanie produktu 'Myszka':");
//        Produkt znalezionyProdukt = sklep.wyszukajProduktu("Myszka");
//        if (znalezionyProdukt != null) {
//            znalezionyProdukt.wyswietlInformacje();
//        }
//
//        KoszykZakupowy koszyk = new KoszykZakupowy();
//        sklep.zakupy(koszyk, "Laptop", 1);
//        sklep.zakupy(koszyk, "Myszka", 5);
//        sklep.zakupy(koszyk, "Klawiatura", 2);
//
//        System.out.println("\nZawartość koszyka:");
//        koszyk.wyswietlZawartoscKoszyka();
//
//        System.out.println("\nOferta sklepu po zakupach:");
//        sklep.wyswietlOferty();


//        System.out.println("\nZadanie 6");
//
//        Produkt produkt1 = new Produkt("Laptop", 3000, 10);
//        Produkt produkt2 = new Produkt("Myszka", 50, 20);
//        Produkt produkt3 = new Produkt("Klawiatura", 150, 15);
//
//        KoszykZakupowy koszyk = new KoszykZakupowy();
//        koszyk.dodajProdukt(produkt1, 1);
//        koszyk.dodajProdukt(produkt2, 2);
//
//        Zamowienie zamowienie = new Zamowienie(koszyk, koszyk.obliczCalkowitaWartosc());
//
//        zamowienie.wyswietlZamowienie();
//
//        zamowienie.platnosc.zaplac();
//
//        zamowienie.finalizujZamowienie();
//
//        zamowienie.zwrocProdukt("Myszka", 1);
//
//        zamowienie.wyswietlZamowienie();

    }

}
