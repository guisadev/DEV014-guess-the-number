public class GuessTheNumberGame {
    public static void main(String[] args) {
        Player humanPlayer = new HumanPlayer("Human");
        Player computerPlayer = new ComputerPlayer("IA");

        GuessTheNumberGame game = new GuessTheNumberGame();
        game.startGame(humanPlayer, computerPlayer);
    }

    private final int numberToGuess;

    public GuessTheNumberGame() {
        this.numberToGuess = (int) (Math.random() * 100) + 1;//
    }
    public void startGame(Player... players) {
        System.out.println("Número adivinar: " + numberToGuess);
        System.out.println("Comenzando el juego.");

        boolean guessedCorrectly = false;
        int[] guessCount = new int[players.length];

        while (!guessedCorrectly) {
            for (int i = 0; i < players.length; i++) {
                Player player = players[i];
                guessCount[i]++;
                int playerGuess = player.guessNumber();

                if(playerGuess == numberToGuess) {
                    System.out.println("¡Acertaste! " + player.getName() + " ha adividado el número en " + guessCount[i] + "intentos." );
                    guessedCorrectly = true;
                    break;
                } else if (playerGuess < numberToGuess) {
                    System.out.println("El número es mayor que " + playerGuess);
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