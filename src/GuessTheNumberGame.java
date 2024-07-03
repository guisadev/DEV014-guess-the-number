
public class GuessTheNumberGame {
    public static void main(String[] args) {
        // Crear un jugador humano
        Player h = new HumanPlayer("Human");

        // Crear un jugador de computadora
        Player c = new ComputerPlayer("IA");

        // Crear y empezar el juego para el jugador humano
        GuessTheNumberGame humanGame = new GuessTheNumberGame();
        humanGame.startGame(h, c);

    }
    private int numberToGuess; //se declaran las variables de instancia para usarlas más tarde


    public GuessTheNumberGame() { //Player es la clase que se reutiliza (PascalCase)
        this.numberToGuess = (int) (Math.random() * 100) + 1; //Las variables y nombres de objetos siguen la convención camelCase.
    }

    public void startGame(Player humanPlayer, Player computerPlayer) {
        System.out.println(numberToGuess);
        //clase que comienza el juego
        System.out.println("Comenzando el juego. " + humanPlayer.getName() + " intenta adivinar el número.");
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int playerGuess = humanPlayer.guessNumber();
            if (playerGuess == numberToGuess) {
                System.out.println("¡Correcto! " + humanPlayer.getName() + " ha adivinado el número.");
                guessedCorrectly = true;
            } else if (playerGuess < numberToGuess) {
                System.out.println("El número es mayor que " + playerGuess);
            } else {
                System.out.println("El número es menor que " + playerGuess);
            }
            int playerGuessComputer = computerPlayer.guessNumber();
            if (playerGuessComputer == numberToGuess) {
                System.out.println("¡Correcto! " + computerPlayer.getName() + " ha adivinado el número.");
                guessedCorrectly = true;
            } else if (playerGuessComputer < numberToGuess) {
                    System.out.println("El número es mayor que " + playerGuessComputer);
                } else {
                        System.out.println( "El número es menor que " + playerGuessComputer);
                }

        }
    }
}




//primero se crea la función que va a contener a los jugadores /clase
//siguiendo crear el método para un jugador/ variables d
//luego pasarle los campos (variables en js) Int
//Verificar el numero con una salida en la consola
//pasasrle condicionales
//tener en cuenta que cada clase debe ir en un archivo distinto
//
//en javaScript
// let guessTheNumberGame(player){
//if (typeof humanPlayer === 'int' && computerPlayer === random);
//
//}