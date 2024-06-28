public class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int guessNumber() {
        // Este método debe ser sobreescrito por las subclases
        return -1;
    }
}
