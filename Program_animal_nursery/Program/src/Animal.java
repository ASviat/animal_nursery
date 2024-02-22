public class Animal {

    public int counter;


    private String animalType;
    private String name;
    private String command;
    private String dateOfBirth;


    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getCommand() {
        return command;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Animal(String animalType, String name, String command, String dateOfBirth) {
        this.animalType = animalType;
        this.name = name;
        this.command = command;
        this.dateOfBirth = dateOfBirth;
    }

    public Animal(String animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public Animal(String animalType, String name, String command) {
        this.animalType = animalType;
        this.name = name;
        this.command = command;
    }

    public Animal() {
    }

    public Animal(int counter, String animalType, String name, String command, String dateOfBirth) {
        this.counter = counter;
        this.animalType = animalType;
        this.name = name;
        this.command = command;
        this.dateOfBirth = dateOfBirth;
    }
}
