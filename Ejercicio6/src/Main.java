import java.util.Vector;

import logica.LeerVector;
/**
 * La clase Main es la clase principal del programa, que se encarga de leer números del teclado
 * hasta que se introduce dos veces seguidas el mismo número. Luego, muestra los números ingresados
 * y finaliza la ejecución
 *
 * @author Ronald serrano
 */

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase LeerVector para leer los números del usuario
        LeerVector leer = new LeerVector();
        Vector<Integer> vector = leer.LeerNumero();

        // Mostrar los números ingresados por el usuario
        System.out.println("Los números introducidos son:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}