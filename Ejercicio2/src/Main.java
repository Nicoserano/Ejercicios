import logica.Clase1;
import logica.Clase2;
/**
 *
 *
 * @author Ronald serrano
 * */
public class Main {
    public static void main(String[] args) {
        // Imprime mensaje de inicio de ejecución
        System.out.println("Iniciando ejecución del programa desde el punto de entrada...");

        // Ejecuta el método main de Clase1
        Clase1.main(new String[]{});

        // Ejecuta el método main de Clase2
        Clase2.main(new String[]{});

        // Imprime mensaje indicando cómo se determinó el punto de entrada
        System.out.println("El punto de entrada se determinó a través del método main de la clase Main.");

        // Imprime mensaje de fin de ejecución
        System.out.println("Fin del programa.");
    }
}

