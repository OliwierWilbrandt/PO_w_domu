import java.util.ArrayList;
import java.util.List;


class Box<T>{
    T objekt;

    public void setObjekt(T objekt){
        this.objekt=objekt;
    }

    public T getObjekt(){
        return objekt;
    }
}


class Counter<T>{
    List<T> lista;

    public Counter(){
        lista = new ArrayList<T>();
    }

    public void add(T objekt){
        lista.add(objekt);
    }

    public int getCount(){
        return lista.size();
    }

}




class Animal {
    int wiek;

    public Animal(int wiek) {
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }
}

class Dog extends Animal {
    public Dog(int wiek) {
        super(wiek);
    }
}



class Pair<T> {
    T first;
    T second;

    public Pair() {
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}




public class Progr_generyczne {

    public static <T> boolean isEqual(T obj1,T obj2){
        return obj1.equals(obj2);
    }


    public static <T extends Animal> T findMax(T element1, T element2) {
        return (element1.getWiek() > element2.getWiek()) ? element1 : element2;
    }

    public static <T extends Animal> T findMax(Pair<? extends Animal> pair) {
        return (pair.getFirst().getWiek() > pair.getSecond().getWiek())
                ? (T) pair.getFirst()
                : (T) pair.getSecond();
    }


    public static void findMinMaxAge(Dog[] dogs, Pair<? super Dog> result) {
        if (dogs == null || dogs.length == 0) {
            throw new IllegalArgumentException("Tablica psów nie może być pusta.");
        }

        Dog minDog = dogs[0];
        Dog maxDog = dogs[0];

        for (Dog dog : dogs) {
            if (dog.getWiek() < minDog.getWiek()) {
                minDog = dog;
            }
            if (dog.getWiek() > maxDog.getWiek()) {
                maxDog = dog;
            }
        }

        result.setFirst(minDog);
        result.setSecond(maxDog);
    }


    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Double> box3 = new Box<>();


        box1.setObjekt("slowo");
        System.out.println(box1.getObjekt());

        box2.setObjekt(10);
        System.out.println(box2.getObjekt());

        box3.setObjekt(3.14);
        System.out.println(box3.getObjekt());

        System.out.println(isEqual(box1.getObjekt(),box2.getObjekt()));
        System.out.println(isEqual(box2.getObjekt(),box3.getObjekt()));



        Counter<String> stringCounter = new Counter<>();
        stringCounter.add(box1.getObjekt());
        stringCounter.add("slowo2");
        stringCounter.add("slowo3");
        System.out.println(stringCounter.getCount());





        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(3);

        Animal starszy = findMax(dog1, dog2);

        System.out.println("Wiek starszego psa: " + starszy.getWiek());

        Pair<Dog> dogPair = new Pair<>(dog1, dog2);

        Dog starszypair = findMax(dogPair);

        System.out.println("Wiek starszego psa(pair): " + starszypair.getWiek());



        Dog[] dogs = {
                new Dog(3),
                new Dog(7),
                new Dog(1),
                new Dog(5)
        };

        Pair<Dog> result = new Pair<>();

        findMinMaxAge(dogs, result);

        System.out.println("Najmłodszy pies ma wiek: " + result.getFirst().getWiek());
        System.out.println("Najstarszy pies ma wiek: " + result.getSecond().getWiek());



    }
}
