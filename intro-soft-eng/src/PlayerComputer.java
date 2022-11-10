import java.util.Random;

public class PlayerComputer extends Player {

    private Random randomInt = new Random();

    public PlayerComputer() {
    }

    public PlayerComputer(String name) {
        super(name);
    }

    public int guess() {
        return randomInt.nextInt(6) + 1;
    }

}