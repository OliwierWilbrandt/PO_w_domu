import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Zestaw_1 {
    public static void main(String[] args) {

        //1
        System.out.print("Zadanie 1\n");
        String ImieNazwisko = "OliwierWilbrandt";
        System.out.println(ImieNazwisko);


        //2
        System.out.print("Zadanie 2\n");
        System.out.println("Dlugosc imienia i nazwiska: " + ImieNazwisko.length());

        //3
        System.out.print("Zadanie 3\n");
        String slowo1 = "Ala ";
        String slowo2 = "ma ";
        String slowo3 = "kota ";

        String zdanie = slowo1 + slowo2 + slowo3;
        System.out.println(zdanie);

        //4.1
        System.out.print("Zadanie 4\n");
        System.out.println("                    *");
        System.out.println("                    * *");
        System.out.println("                    * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * *");
        System.out.println("                    * *");
        System.out.println("                    *");

        //4.2
        System.out.println("      *");
        System.out.println("     * *");
        System.out.println("   * * * *");
        System.out.println("  * * * * * ");
        System.out.println("* * * * * * *");
        System.out.println("  * * * * * ");
        System.out.println("   * * * *");
        System.out.println("    * * * ");
        System.out.println("     * *");
        System.out.println("      *");


        //5
        System.out.print("Zadanie 5\n");
        String zmodyfikowane_zdanie = zdanie.replace('a', 'e');
        System.out.println(zmodyfikowane_zdanie);


        //6
        System.out.print("Zadanie 6\n");
        for (char znak : zdanie.toCharArray()) {
            if (Character.isUpperCase(znak)) {
                System.out.print(Character.toLowerCase(znak));
            } else {
                System.out.print(Character.toUpperCase(znak));
            }
        }


        //7
        System.out.print("Zadanie 7\n");
        char[] znaki = {'A', '!', '@', '>', '~', '\n'};

        for (char znak : znaki) {
            System.out.println("Kod ASCII dla'" + znak + "' to " + (int) znak);
        }


        //8




        //9
        System.out.print("Zadanie 9\n");
        String zdani = "Grzesiek nie wiedzial dlaczego %s jest tak drapieżnym %s mimo, ze jego %s na to nie wskazuje.";
        String result = String.format(zdani, "tygrys", "stworzeniem", "wyglad");

        System.out.println(result);


        //10
        System.out.print("Zadanie 10\n");
        String zdaniee = "%s to najlepsza ksiazka napisana przez %s";
        String results = String.format(zdaniee, "Dziady", "Adama Mickiewicza");

        System.out.println(results);


        //11
        System.out.print("Zadanie 11\n");
        for (int i=0; i<5; i++) {
            System.out.print("wodrze ");
        }


        //12
        System.out.print("Zadanie 12\n");
        LocalDateTime teraz = LocalDateTime.now();

        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatGodzina = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Dzisiaj jest (" + teraz.format(formatData) + ") godzina(" + teraz.format(formatGodzina) + ")");


        //13
        System.out.print("Zadanie 13\n");
        int[] numery = {54, 103, 241, 67, 9999};
        for (int num : numery) {
            char znak = (char) num;
            System.out.println("Numer: " + num + " -> Znak: " + znak);
        }

        String imieNazwisko = "Oliwier Wilbrandt";
        int dlugoscImieniaNazwiska = imieNazwisko.length();
        char znakZDlugosci = (char) dlugoscImieniaNazwiska;
        System.out.println("Długość imienia i nazwiska: " + dlugoscImieniaNazwiska + " -> Znak: " + znakZDlugosci);

        int numerAlbumu = 177771;
        char znakZNumeru = (char) numerAlbumu;
        System.out.println("Numer albumu: " + numerAlbumu + " -> Znak: " + znakZNumeru);






    }
}
