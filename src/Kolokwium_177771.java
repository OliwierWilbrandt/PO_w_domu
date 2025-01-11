import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

//Zadnie 1
class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko){
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void przedstawsie() {
        System.out.println("Czesc, nazywam sie "+imie+" mam "+wiek+" lat, a moje stanowiko pracy to "+stanowisko);
    }

    public String getImie(){
        return imie;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    public String getStanowisko(){
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString() {
        return "Czesc nazywam sie "+imie+
                ", mam "+wiek+"lat"+
                ",a moje stanowisko to "+stanowisko;
    }

}


//Zadnie 2

//class Fabryka {
//    ArrayList<Elf> pracownicy;
//    double dlgeograficzna;
//    double szgeograficzna;
//
//
//    public Fabryka(double dlgeograficzna, double szgeograficzna) {
//        this.pracownicy = new ArrayList<>();
//        this.dlgeograficzna = dlgeograficzna;
//        this.szgeograficzna = szgeograficzna;
//    }
//
//    public void dodajPracownika(Elf elf) {
//        pracownicy.add(elf);
//        System.out.println("Dodano elfa: "+elf.getImie());
//    }
//
//    public void usunPracownika(Elf elf){
//        if (pracownicy.remove(elf)){
//            System.out.println("Usunieto elfa: "+elf.getImie());
//        }else {
//            System.out.println("Elf "+elf.getImie()+" nie jest na liscie");
//        }
//    }
//
//    public Elf najstarszyPracownik(){
//        if (pracownicy.isEmpty()){
//            System.out.println("Lista jest pusta");
//        }
//        return null;
//
//        Elf najstarszy = pracownicy.get(0);
//        for (Elf elf : pracownicy) {
//            if (elf.getWiek() > najstarszy.getWiek()) {
//                najstarszy = elf;
//            }
//        }
//        return najstarszy;
//
//    }
//
//    public void wyswietlPracownikow() {
//        System.out.print("Lista pracownikow: ");
//        for (Elf elf : pracownicy) {
//            elf.przedstawsie();
//        }
//    }
//
//}

//Zadnaie 3
class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public void nakarmRenifera() {
        this.predkosc += 5;
        System.out.println(imie+"nakarmiony, predkosc +5");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getPredkosc(){
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }




    @Override
    public String toString() {
        return "Renifer{ "+
                "imie= " + imie + '\'' +
                " predkosc= "+predkosc +
                '}';
    }

}


//Zadanie 4

//class Sanie{
//    ArrayList<Renifer> zaprzeg;
//
//    public Sanie(){
//        this.zaprzeg = new ArrayList<>();
//    }
//
//    public void dodajRenifera(Renifer renifer) {
//        zaprzeg.add(renifer);
//        System.out.println(renifer.getImie()+" zostal dodany");
//    }
//
//    public int sumaPredkosci(){
//        int suma = 0;
//        for (Renifer renifer : zaprzeg){
//            suma += renifer.getPredkosc();
//        }
//        return suma;
//
//    }
//
//    public  Renifer najwolniejszyRenifer() {
//        if (zaprzeg.isEmpty()) {
//            System.out.println("Zaprzeg jest pusty");
//            return null;
//        }
//        Renifer najwolniejszy = zaprzeg.get(0);
//        for (Renifer renifer : zaprzeg) {
//            if (renifer.getPredkosc()<najwolniejszy.getPredkosc()) {
//                najwolniejszy = renifer;
//            }
//        }
//        return najwolniejszy;
//    }
//
//    public void wyswietlZaprzeg() {
//        if (zaprzeg.isEmpty()) {
//            System.out.println("Zaprzeg jest pusty");
//        }else {
//            System.out.println("Renifery w zaprzegu: ");
//            for (Renifer renifer : zaprzeg) {
//                System.out.println(renifer);
//            }
//        }
//    }
//}









public class Kolokwium_177771 {

    public static void main(String[] args){

        System.out.println("Zadnie 1");
        Elf elf = new Elf("Student",80,"uczen");

        elf.przedstawsie();
        System.out.println(elf);

//        System.out.println("Zadnie 2");
//        Elf elf1 = new Elf("Student1",100,"uczen1");
//        Elf elf2 = new Elf("Student2",90,"uczen2");
//
//        Fabryka.dodajPracownika(elf1);
//        Fabryka.dodajPracownika(elf2);
//
//        Fabryka.wyswietlPracownikow();
//
//        Elf najstarszy = Fabryka.najstarszyPracownik();
//        if (najstarszy != null) {
//            System.out.println("Najstarszy pracownik: ");
//            najstarszy.przedstawsie();
//        }
//
//        Fabryka.usunPracownika(elf2);
//
//        Fabryka.wyswietlPracownikow();



        System.out.println("Zadnie 3");
        Renifer renifer1 = new Renifer("Renifer1", 15);
        Renifer renifer2 = new Renifer("Renifer2", 10);

        System.out.println(renifer1);

        renifer1.nakarmRenifera();

        System.out.println(renifer1);



//        System.out.println("Zadnie 4");
//        Sanie.dodajRenifera(renifer1);
//        Sanie.dodajRenifera(renifer2);
//
//        Sanie.wyswietlZaprzeg();
//
//        System.out.println("Suma predkosci reniferow: "+Sanie.sumaPredkosci());
//
//        Renifer najwolniejszy = Sanie.najwolniejszyRenifer();
//        if (najwolniejszy != null) {
//            System.out.println("Najwolniejszy: "+najwolniejszy);
//        }










    }




}
