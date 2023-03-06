package animals;

public class Animal {
    ZOO zoo = new ZOO();

    private String animalType;
    private int kg;
    private int age;

    public void AnimalInfo(String animalType, int kg, int age){
        this.animalType = animalType;
        this.kg = kg;
        this.age = age;
        zoo.animalsList.add(animalType);
    }

    public String getAnimalType(){
        return animalType;
    }
    public int getKg(){
        return kg;
    }
    public int getAge(){
        return age;
    }
}