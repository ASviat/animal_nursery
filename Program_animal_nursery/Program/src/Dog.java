public class Dog extends DomesticAnimals{
    public Dog(String animalType, String name, String command, String dateOfBirth) {
        super(animalType, name, command, dateOfBirth);
    }

    public Dog(String animalType, String name) {
        super(animalType, name);
    }

    public Dog(String animalType, String name, String command) {
        super(animalType, name, command);
    }
}
