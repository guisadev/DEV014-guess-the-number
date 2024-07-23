//esta clase es el núcleo del juego adivinar un número
public class GuessTheNumberGame { //este es el constructor que inicializa el juego
    public static void main(String[] args) { //este es el método de entrada de la aplicación que crea dos objetos de tipo Player
        Player humanPlayer = new HumanPlayer("Human");
        Player computerPlayer = new ComputerPlayer("IA");

        GuessTheNumberGame game = new GuessTheNumberGame();// se crea la instancia de GuessTheNumberGame
        game.startGame(humanPlayer, computerPlayer);
    }

    private final int numberToGuess;//este es el atributo que va a contener los numeros enteros generados aleatoriamente
    public GuessTheNumberGame() {// se instancia el constructor
        this.numberToGuess = (int) (Math.random() * 100) + 1;//
    }
    public void startGame(Player... players) {//metodo que aloja a los dos jugadores como argumento
        System.out.println("Número adivinar: " + numberToGuess);
        System.out.println("Comenzando el juego.");
//inicializa una variable booleana a false para controlar el bucle principal
        boolean guessedCorrectly = false;
        //se crea un arreglo guessCount para contar los intentos introducidos por los jugadores
        int[] guessCount = new int[players.length];
//mientras guessedCorrectly sea falso itera sobre los jugadores para introducir nuevamente un intento
        while (!guessedCorrectly) {
            for (int i = 0; i < players.length; i++) {
                Player player = players[i];
                guessCount[i]++;//incrementa el numero de intentos del jugador actual
                int playerGuess = player.guessNumber();//obtiene el numero adivinado del jugador actual
//si acerta al numero adivinado
                if(playerGuess == numberToGuess) { //obtiene el mensaje, el número adivinado, y los intentos
                    System.out.println("¡Acertaste! " + player.getName() + " ha adividado el número en " + guessCount[i] + "intentos." );
                    guessedCorrectly = true; //cambia la variable booleana a true para terminar el bucle.
                    break; //acaba el intento
                    //si el adivinado es mayor al adivinar imprime el mensaje: es mayor que
                } else if (playerGuess < numberToGuess) {
                    System.out.println("El número es mayor que " + playerGuess);
                    //si no, se imprime es menor que
                } else {
                    System.out.println("El número es menor que" + playerGuess);
                }
            }
        }
    }
}


//primero se crea la función que va a contener a los jugadores /clase
//siguiendo crear el método para un jugador/ variables
//luego pasarle los atributos a esos métodos
//Crear y empezar el juego
//Verificar el numero con una salida en la consola
//pasasrle condicionales y crear el bucle que va a iterar sobre la condición
//tener en cuenta que cada clase debe ir en un archivo distinto
//