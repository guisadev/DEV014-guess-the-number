public abstract class Player { //qué hace este abstract?
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int guessNumber();
}
