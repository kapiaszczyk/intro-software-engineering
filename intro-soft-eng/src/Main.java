import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random dice = new Random();
        Player player = new PlayerComputer();

        try {
            player.setName("Joe");
        }
        catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Error");
        }

        int upperBound = 6;
        int userInput;
        int diceResult = dice.nextInt(upperBound) + 1;

        boolean userGuessed = false;

        System.out.println("Dice rolled: " + diceResult);

        do {
            System.out.print(player.getName() + " guessed: ");

            userInput = player.guess();
            System.out.println(userInput);

            if (userInput == diceResult) {
                userGuessed = true;
                System.out.println(player.getName() + " have guessed correctly!");
            } else {
                System.out.println("Wrong!");
            }

        } while (!userGuessed);

    }
}