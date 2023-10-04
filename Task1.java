import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
//
        Math math = null;
        int answer=1+(int)(100*math.random());


        int maxAttempts = 5;
        int attempt1 = 0;

        System.out.println("Welcome to the Guess Number Game!");
        System.out.println("Enter a guess number between " + min+ " to " + max);

        while (attempt1 < maxAttempts) {
            System.out.print("Attempt " + (attempt1 + 1) + ": Enter your guess: ");
            int Guess = scanner.nextInt();

            if (Guess < min || Guess > max ) {
                System.out.println("Please enter a number between " + min + " and " + max  );
                continue;
            }

            if (Guess == answer) {
//
                System.out.println("Congratulations! You guessed the correct number. You Win the Game:" +answer);
                break;
            } else if (Guess < answer) {
                System.out.println("Your Guess Number is Smaller");
            } else {
                System.out.println("Your Guess Number is Greater");
            }

            attempt1++;
        }
         

        if (attempt1 == maxAttempts) {
            System.out.println("Sorry, you are out of the attempt. The correct number was " + answer + ".");
        }

        System.exit(0);
    }
}

