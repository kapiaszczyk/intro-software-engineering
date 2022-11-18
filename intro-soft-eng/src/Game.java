import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    Random dice = new Random();

    // fields
    private Player player;
    ArrayList<Player> playerList = new ArrayList<Player>();

    public void addPlayer(Player player){
        this.player = player;
        if(!nameIsUnique(player.getName())){
            playerList.add(player);
        }
        else {
            player.setName(player.getName() + dice.nextInt(10));
            addPlayer(player);
        }
    }

    private boolean nameIsUnique(String playerName) {
        for (Player player : playerList) {
            if (player.getName().equals(playerName)) {
                return true;
            }
        }
        return false;
    }

    public void listPlayers(){
        for (Iterator<Player> it = playerList.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }

    public void play() {

        int userInput;
        int diceResult;
        boolean userGuessed = false;

        do {
            diceResult = dice.nextInt(6) + 1;
            System.out.println("Dice rolled: " + diceResult);

            for(Player player : playerList) {
                System.out.print(player.getName() + " guessed: ");
                userInput = player.guess();
                System.out.println(userInput);
                if (userInput == diceResult) {
                    userGuessed = true;
                    System.out.println(player.getName() + " have guessed correctly!");
                } else {
                    System.out.println("Wrong!");
                }
            }
            System.out.println("--- NEW GAME ---");
        } while (!userGuessed);
    }
}
