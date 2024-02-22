public class Hamster extends DomesticAnimals{
    public Hamster(String animalType, String name, String command, String dateOfBirth) {
        super(animalType, name, command, dateOfBirth);
    }

    public Hamster(String animalType, String name) {
        super(animalType, name);
    }

    public Hamster(String animalType, String name, String command) {
        super(animalType, name, command);
    }
}
