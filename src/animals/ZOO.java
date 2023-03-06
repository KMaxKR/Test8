package animals;

import java.util.*;

public class ZOO{

    List<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public List<Animal> getAnimal(){
        return animals;
    }
}
