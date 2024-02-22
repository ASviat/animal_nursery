public class PackAnimals extends Animal{
    public PackAnimals(String animalType, String name, String command, String dateOfBirth) {
        super(animalType, name, command, dateOfBirth);
    }

    public PackAnimals(String animalType, String name) {
        super(animalType, name);
    }

    public PackAnimals(String animalType, String name, String command) {
        super(animalType, name, command);
    }
}
