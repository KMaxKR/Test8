import animals.*;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ZOO zoo = new ZOO();
        //Animal animals = new Animal();

        zoo.addAnimal(new Animal("Lion", 12, 2));
        zoo.addAnimal(new Animal("Racoon", 3, 2));

        System.out.println(zoo.getAnimal());
    }
}