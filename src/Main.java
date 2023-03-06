import animals.*;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Lion lion = new Lion();
        Racoon racoon = new Racoon();


        lion.AnimalInfo("Lion", 12,4);
        racoon.AnimalInfo("Racoon", 3,2);

        System.out.println(lion.getAnimalType() + "\n" + lion.getLionKg() + "\n" + lion.getLionAge());
        System.out.println(racoon.getAnimalType() + "\n" + racoon.getRacoonKg() + "\n" + racoon.getRacoonAge());




    }
}