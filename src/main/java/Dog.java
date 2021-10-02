import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Dog {

    private String name;

    public Dog (String name) {
        this.name = name;
    }


    public static void main (String[] args) {


        ArrayList<Dog> dogs = new ArrayList<> ();
        Dog thomas = new Dog ("Tomas");
        Dog bill = new Dog ("Билл");
        Dog philipp = new Dog ("Philipp");
        Dog mishka = new Dog ("Мишка");
        Dog elvis = new Dog ("Элвис");

        dogs.add (thomas);
        dogs.add (bill);
        dogs.add (philipp);
        dogs.add (mishka);

        // получить список всех элементов
        Dog[] dogsArray = {thomas, bill, philipp, mishka, elvis};
        ArrayList<Dog> dogsList = new ArrayList<> (Arrays.asList (dogsArray));
        System.out.println (dogsList);

        // получить элемент  из списка по индексу
        Dog thirdDog = dogs.get (3);
        System.out.println (thirdDog);


        LinkedList<Dog> dogs1 = new LinkedList<> ();
        // заменить элемент
        dogs.set (1, elvis);
        System.out.println (dogs);

        //удалить элемент
        dogs.remove (1);
        System.out.println (dogs);


        // узнать число добавленных элементов
        System.out.println (dogs.size ());

    }
}
