import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int numberToGuess = random.nextInt(min, max + 1);
        int attempts = 1;

        System.out.printf("Guess a number between %d-%d: ", min, max);
        int userGuess = scanner.nextInt();

        while (userGuess != numberToGuess) {
            if (userGuess < numberToGuess) {
                System.out.println("TOO LOW! Try again\n");
            } else {
                System.out.println("TOO HIGH! Try again\n");
            }

            System.out.print("Guess a number between 1-100: ");
            userGuess = scanner.nextInt();
            attempts++;
        }

        System.out.printf("\nThe number was %d. YOU WIN! 🏆", numberToGuess);
        System.out.printf("\n%d attempts", attempts);

        scanner.close();
    }
}
