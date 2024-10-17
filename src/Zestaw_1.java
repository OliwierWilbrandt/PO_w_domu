import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Zestaw_1 {
    public static void main(String[] args) {

        //1

        String ImieNazwisko = "OliwierWilbrandt";
        System.out.println(ImieNazwisko);


        //2
        System.out.println("Dlugosc imienia i nazwiska: " + ImieNazwisko.length());

        //3
        String slowo1 = "Ala ";
        String slowo2 = "ma ";
        String slowo3 = "kota ";

        String zdanie = slowo1 + slowo2 + slowo3;
        System.out.println(zdanie);

        //4.1
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
        String zmodyfikowane_zdanie = zdanie.replace('a', 'e');
        System.out.println(zmodyfikowane_zdanie);


        //6
        for (char znak : zdanie.toCharArray()) {
            if (Character.isUpperCase(znak)) {
                System.out.print(Character.toLowerCase(znak));
            } else {
                System.out.print(Character.toUpperCase(znak));
            }
        }


        //7
        char[] znaki = {'A', '!', '@', '>', '~', '\n'};

        for (char znak : znaki) {
            System.out.println("Kod ASCII dla'" + znak + "' to " + (int) znak);
        }


        //8




        //9
        String zdani = "Grzesiek nie wiedzial dlaczego %s jest tak drapieżnym %s mimo, ze jego %s na to nie wskazuje.";
        String result = String.format(zdani, "tygrys", "stworzeniem", "wyglad");

        System.out.println(result);


        //10
        String zdaniee = "%s to najlepsza ksiazka napisana przez %s";
        String results = String.format(zdaniee, "Dziady", "Adama Mickiewicza");

        System.out.println(results);


        //11
        for (int i=0; i<5; i++) {
            System.out.print("wodrze ");
        }


        //12

        LocalDateTime teraz = LocalDateTime.now();

        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatGodzina = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Dzisiaj jest (" + teraz.format(formatData) + ") godzina(" + teraz.format(formatGodzina) + ")");


        //13






    }
}
