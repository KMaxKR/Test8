import animals.*;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ZOO zoo = new ZOO();
        Animal animals1 = new Racoon("Lion", 12, 2);
        Animal animals2 = new Lion("Racoon", 3, 2);

        zoo.addAnimal(animals1);
        zoo.addAnimal(animals2);


        zoo.getAnimal();
    }
}