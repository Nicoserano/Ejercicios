package logica;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * La clase LeerVector se encarga de leer números enteros del teclado hasta que se introduce
 * dos veces seguidas el mismo número, y devuelve los números ingresados en un objeto Vector.
 *
 * @author Ronald serrano
 */
public class LeerVector {

    /**
     * Este método utiliza un objeto Vector para almacenar los números leídos del teclado.
     * Se detiene cuando el usuario ingresa dos veces seguidas el mismo número.
     *
     * @return un objeto Vector que contiene los números leídos
     */
    public Vector<Integer> LeerNumero() {
        Vector<Integer> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            numero = verificarEntero(scanner,"Introduzca un número: ");
            if (!vector.contains(numero)) {
                vector.add(numero);
            } else {
                break;
            }
        } while (true);

        return vector;
    }

    /**
     * Este método verifica que la entrada del usuario sea un número entero válido.
     *
     * @param scanner el objeto Scanner utilizado para leer la entrada del usuario
     * @param mensaje el mensaje que se muestra al usuario para solicitar la entrada
     * @return el número entero ingresado por el usuario
     */
    public static int verificarEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta. Por favor, ingrese un número entero.");
                scanner.nextLine(); // Descartar entrada no válida
            }
        }
    }
}
