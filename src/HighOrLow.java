import java.util.Scanner;
import java.util.Random;
public class HighOrLow {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        int randomNumber = rand.nextInt(10) + 1;
        int userGuess = 0;
        boolean done;
        String trash;
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {
                    System.out.println("Invalid input. The number must be between 1 and 10.");
                    done = false;
                }
            } else {
                trash = in.next();
                System.out.println("Invalid input. You entered: " + trash);
                done = false;
            }
        } while (!done);
        System.out.println("\nThe random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("You got it! On the money! ");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low! Try again next time.");
        } else {
            System.out.println("Too high! Try again next time.");
        }
    }
}
