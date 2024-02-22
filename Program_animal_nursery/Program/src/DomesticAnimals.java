public class DomesticAnimals extends Animal{
    public DomesticAnimals(String animalType, String name, String command, String dateOfBirth) {
        super(animalType, name, command, dateOfBirth);
    }

    public DomesticAnimals(String animalType, String name) {
        super(animalType, name);
    }

    public DomesticAnimals(String animalType, String name, String command) {
        super(animalType, name, command);
    }
}
