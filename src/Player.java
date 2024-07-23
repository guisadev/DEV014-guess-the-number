//Player es una clase que no se puede instanciar pero que si puede heredar sus clases hijas.
public abstract class Player {
    protected String name; //almacena el nombre del jugador

    public Player(String name) {//inicializa un nuevo jugador con el nombre específico
        this.name = name;
    }

    public String getName() {//método que accede y devuelve el nombre del jugador
        return name;
    }

    public abstract int guessNumber();//clases implementan este método para definir como cada jugador adivina el numero.
}
