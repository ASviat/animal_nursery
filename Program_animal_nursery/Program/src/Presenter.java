import java.util.Scanner;

public class Presenter {

    private Model model;
    private View view;


    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void perform() {
        model.allAnimals.add(new Donkey("Donkey", "Opolo", "Jump", "12.12.2020"));
        model.allAnimals.add(new Donkey("Donkey", "Pokora", "Jump", "10.10.2010"));

        try (Scanner scanner = new Scanner(System.in)) {
            view.selectionMainMenu(scanner);
            Counter counter = new Counter();

            switch (view.answer) {
                case 1 -> {
                    System.out.println("That is all animals we have: ");
                    model.printAllAnimals();
                }
                case 2 -> {
                    model.addAnimal(scanner);
                    System.out.println("Animal added");
                    System.out.println("All animals: ");
                    model.printAllAnimals();
                    counter.add();
                }
                case 3 -> {
                    System.out.println("Whose commands you'd like to see? ");
                    model.printAllAnimals();
                    System.out.println("Type its name to continue: ");
                    model.showAnimalCommands(scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Whom you'd like to teach? ");
                    model.printAllAnimals();
                    System.out.println("Type its name to continue: ");
                    model.addCommandToAnimal(scanner.nextLine());

                }

            }

        } catch (NumberFormatException nfe) {

            System.out.println("Smth invalid");
        }
    }

}

