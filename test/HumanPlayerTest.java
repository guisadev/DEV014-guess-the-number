
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class HumanPlayerTest {

    @Test
    public void testGuessNumberInvalidInput() { //método que va a verificar el valor de entrada
        String input = "105"; // Simulamos que el usuario ingresa 105 y asegurar que el comportamiento sea el esperado.
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        HumanPlayer player = new HumanPlayer("Human");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, player::guessNumber);
//lo que está esperando
        String expectedMessage = "Número inválida. Debe ser menor a 100. Fin del juego.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}

//GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
//assertEquals(expected: 50, GuessTheNumberGame.numberToGuess(a 50));
//testResult: hacer que el juego simule que el numero de la jugadora es mayor que el numero objetivo