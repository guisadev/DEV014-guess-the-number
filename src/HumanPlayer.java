import java.util.Scanner; //se utiliza para obtener la entrada del usuario a través de la consola.

public class HumanPlayer extends Player { //herencia que tiene acceso a los atributos de la clase Player
    public HumanPlayer(String name) {//constructor acepta el argumeto name que será en name de ese jugador
        super(name);// hereda el atributo name de la clase Player (super de superclase)
    }

    @Override //indica que el método se sobreescribirá de la clase Player
    public int guessNumber() {//método sobreescrito para obtener la adivinanza del jugador
        Scanner scanner = new Scanner(System.in);//esto crea una nueva instancia para leer la entrada del usuario en la consola
        System.out.print(name + ", por favor adivina un número: "); //muestra el mensaje en la consola
        return scanner.nextInt();//lee un entero ingresado por el usuario y lo devuelve como un jugador
    }
}