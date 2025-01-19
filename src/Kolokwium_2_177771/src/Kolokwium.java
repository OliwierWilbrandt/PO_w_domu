import java.util.Arrays;

class Sort {
    public static <T extends Comparable<T>> void sortDescending(T[] array) {
        Arrays.sort(array, (a,b) -> b.compareTo(a));
    }

}

public class Kolokwium {

    public static void main(String[] args){

        //Zadanie 1
        Building building=new Building(15,"Czarny");
        System.out.println(building);


        House house=new House(5,"zolty",11);
        System.out.println(house);


        //Zadanie 2

        //Zadanie 4

        //Zadnie 3

        //Zadanie 6

        Integer[] numbers={5,8,3,9};
        Sort.sortDescending(numbers);
        System.out.println("Po sortowaniu: "+Arrays.toString(numbers));



    }

}
