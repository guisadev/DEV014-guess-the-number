
public class GuessTheNumberGame {
    private int numberToGuess;
    private Player player;

    public GuessTheNumberGame(Player player) {
        this.player = player;
        this.numberToGuess = (int) (Math.random() * 100) + 1;
    }

    public void startGame() {
        System.out.println("Comenzando el juego. " + player.getName() + " intenta adivinar el número.");
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int playerGuess = player.guessNumber();
            if (playerGuess == numberToGuess) {
                System.out.println("¡Correcto! " + player.getName() + " ha adivinado el número.");
                guessedCorrectly = true;
            } else if (playerGuess < numberToGuess) {
                System.out.println("El número es mayor que " + playerGuess);
            } else {
                System.out.println("El número es menor que " + playerGuess);
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