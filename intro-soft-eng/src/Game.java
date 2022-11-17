import java.util.Random;
import java.util.Scanner;

public class Game {

    private Player player;

    // Setter pola player
    public void addPlayer(Player player){
        this.player = player;
    }

    Scanner scanner = new Scanner(System.in);
    Random dice = new Random();

    public void play() {

        int userInput;
        int diceResult = dice.nextInt(6) + 1;

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
