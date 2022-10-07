import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random dice = new Random();

        int upperBound = 6;
        int userInput;
        int diceResult = dice.nextInt(upperBound) + 1;

        boolean userGuessed = false;

        System.out.println("Dice rolled: " + diceResult);

        do {
            System.out.print("Your guess: ");
            // userInput = scanner.nextInt();

            // Testing
            userInput = dice.nextInt(upperBound) + 1;
            System.out.println(userInput);

            if (userInput == diceResult) {
                userGuessed = true;
                System.out.println("You have guessed correctly!");
            } else {
                System.out.println("Wrong!");
            }

        } while (!userGuessed);

    }
}