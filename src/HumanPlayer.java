import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int guessNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", por favor adivina un número: ");
        return scanner.nextInt();
    }
}