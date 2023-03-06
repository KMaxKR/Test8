package animals;

import java.util.*;

public class ZOO{

    List<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void getFromArray(){
        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).getAnimalType() + "\n" + animals.get(i).getKg() + "\n" + animals.get(i).getAge());
        }
    }
    public void getAnimal(){
        getFromArray();
    }
}
