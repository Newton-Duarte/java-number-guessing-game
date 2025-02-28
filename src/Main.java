import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(1, 101);

        System.out.print("Guess a number between 1-100: ");
        int userGuess = scanner.nextInt();

        while (userGuess != numberToGuess) {
            if (userGuess < numberToGuess) {
                System.out.println("TOO LOW! Try again\n");
            } else {
                System.out.println("TOO HIGH! Try again\n");
            }

            System.out.print("Guess a number between 1-100: ");
            userGuess = scanner.nextInt();
        }

        System.out.printf("The number was %d. YOU WIN! 🏆", numberToGuess);

        scanner.close();
    }
}
