import java.util.Random;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public int guessNumber() {
        Random random = new Random();
        int guess = random.nextInt(100) + 1;
        System.out.println(name + " (Computer) adivina: " + guess);
        return guess;
    }
}