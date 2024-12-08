import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

//Zadanie 2
class Adres {
    String ulica;
    int numerDomu;
    Integer numerMieszkania;
    String miasto;
    String kodPocztowy;

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica=ulica;
        this.numerDomu=numerDomu;
        this.numerMieszkania=numerMieszkania;
        this.miasto=miasto;
        this.kodPocztowy=kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica=ulica;
        this.numerDomu=numerDomu;
        this.numerMieszkania=null;
        this.miasto=miasto;
        this.kodPocztowy=kodPocztowy;
    }

    public void pokaz() {
        System.out.println(kodPocztowy+" "+miasto);
        System.out.println("ul. "+ulica+" "+numerDomu+
                (numerMieszkania != null ? "/"+numerMieszkania : ""));
    }

    public boolean przed(Adres innyAdres) {
        return this.kodPocztowy.compareTo(innyAdres.kodPocztowy)<0;
    }

    //Zadanie 5
    public String getClassDescription() {
        return "Cześć jestem klasą <" + getClass().getSimpleName() + ">";
    }



    //Zadanie 4
    @Override
    public String toString() {
        return kodPocztowy + " "+miasto+"\n" +
                "ul. " + ulica + " " + numerDomu +
                (numerMieszkania != null ? "/"+numerMieszkania : "");

    }
}


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
//
//    @Override
//    public String toString() {
//        return "\nProdukt: "+nazwa+", Cena: "+cena+", Ilosc na magazynie: "+iloscNaMagazynie;
//






public class Zestaw_7 {

    public static void main(String[] args) {

        System.out.println("Zadaie 2\n");
        Adres adres1= new Adres("Ogrodowa", 50, 6, "Olsztyn", "11-000");
        Adres adres2= new Adres("Glowna", 20, 3, "Warszawa", "10-000");


        System.out.println("Adres 1: ");
        adres1.pokaz();

        System.out.println("Adres 2: ");
        adres2.pokaz();


        System.out.println("\n Czy adres1 jest przed adres2? ");
        System.out.println(adres1.przed(adres2) ? "Tak" : "Nie");


        System.out.println("Zadaie 4\n");
        System.out.print(adres1.toString());


//        Produkt produkt1 = new Produkt("Laptop", 3000, 5);
//
//        System.out.print(produkt1.toString());


        System.out.println("Zadanie 5\n");
        System.out.println(adres1.getClassDescription());



    }
}
