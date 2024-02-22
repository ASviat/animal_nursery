import java.util.LinkedList;
import java.util.Scanner;

public class Model {

    public LinkedList<Animal> allAnimals = new LinkedList<>();


    public void printAllAnimals() {
        for (Animal item : allAnimals) {
            System.out.println(
                    "Animal type: " + item.getAnimalType() + " |"
                            + " Name: " + item.getName() + " |"
                            + " Date of Birth: " + item.getDateOfBirth() + " |");
        }
    }

    public void addAnimal(Scanner scanner) {
        try {

            Animal newAnimal = new Animal();

            System.out.println("Set animals type: ");
            newAnimal.setAnimalType(scanner.nextLine());
            System.out.println("Set animals name: ");
            newAnimal.setName(scanner.nextLine());
            System.out.println("Set animals command: ");
            newAnimal.setCommand(scanner.nextLine());
            System.out.println("Set animals date of birth: ");
            newAnimal.setDateOfBirth(scanner.nextLine());


            allAnimals.add(newAnimal);

        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input");
        }

    }

    public void showAnimalCommands(String name) {
        for (Animal item : allAnimals) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println(item.getName() + " can " + item.getCommand() + " and that's incredible!");
                break;
            }
        }

    }

    public void addCommandToAnimal(String animalName) {
        for (Animal item : allAnimals) {
            if (item.getName().equalsIgnoreCase(animalName)) {
                System.out.println("What command you'd like to add? ");
                try (Scanner scanner2 = new Scanner(System.in)) {
                    String itemToAdd = " & ";
                    itemToAdd += scanner2.nextLine();
                    item.setCommand(item.getCommand() + itemToAdd);
                    System.out.println(item.getName() + " can " + item.getCommand() + " and that's incredible!");
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid data");
                }

            }
        }
    }

}
