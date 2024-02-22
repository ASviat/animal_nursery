import java.util.Scanner;

public class View {

    int answer;

    public void selectionMainMenu(Scanner scanner) {
        try {

            System.out.println("What action you would like to perform?");
            System.out.println("1. Show all animals");
            System.out.println("2. Add an animal");
            System.out.println("3. Show commands performed by the animal");
            System.out.println("4. Teach animal new commands");
            System.out.println("Any key (not integer) to exit");

            answer = Integer.parseInt(scanner.nextLine());
            answer =
                    answer == 1 ? 1 :
                            answer == 2 ? 2 :
                                    answer == 3 ? 3 :
                                            answer == 4 ? 4 :
                                                    -1;

        } catch (NumberFormatException nfe) {
            System.out.println("Good bye");
        }
    }


}
