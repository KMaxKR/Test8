import animals.*;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ZOO zoo = new ZOO();
        zoo.addAnimal(new Lion());
        zoo.addAnimal(new Racoon());

        System.out.println(zoo.getAnimal());
    }
}