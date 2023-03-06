package animals;

public class Racoon extends Animal{

    public Racoon(String animalType, int kg, int age) {
        super(animalType, kg, age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getKg() {
        return super.getKg();
    }
}
