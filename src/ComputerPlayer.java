//
import java.util.Random;// se importa random desde java.util para usar números aleatorios

//Esta es una subclase de Player y hereda sus propiedades pero tambien puede agregar sus propios comportamientos
public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {//constructor que inicializa un nuevo objeto
        super(name); // aquí se llama al constructor d ela superclase Player para inicializar el atributo name
    }

    @Override //notación pra sobreescribir el metodo de la superclase Player
    public int guessNumber() {//método q devuelve un número entero que representa la suposición del jugador computadora.
        Random random = new Random(); //crea un nuevo objeto random para generar nros aleatorios
        int guess = random.nextInt(100) + 1; //genera nro aleatorio y lo asigna a la var guess
        System.out.println(name + " (Computer) adivina: " + guess); //imprime que ha adivinado el nro
        return guess; //devuelve el número aleatorio generado como la suposición del jugador computadora.
    }
}