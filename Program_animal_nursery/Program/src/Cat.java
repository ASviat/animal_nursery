public class Cat extends DomesticAnimals{
    public Cat(String animalType, String name, String command, String dateOfBirth) {
        super(animalType, name, command, dateOfBirth);
    }

    public Cat(String animalType, String name) {
        super(animalType, name);
    }

    public Cat(String animalType, String name, String command) {
        super(animalType, name, command);
    }
}
