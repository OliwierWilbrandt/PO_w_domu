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

















    }
}
