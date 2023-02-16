import logica.CuerpoCeleste;
import logica.SistemaPlanetario;
import logica.SistemaSolar;

import java.util.List;
import java.util.Scanner;

/**
 *Este es el punto de entrada del programa, que se encarga de iniciar el sistema planetario
 * y de mostrar el menú de opciones al usuario
 *
 * @author Ronald serrano
 * */
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto sistema que representa un sistema planetario
        final SistemaPlanetario sistema = SistemaSolar.planetas();

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner pregunta = new Scanner(System.in);

        int opcion;
        do {
            // Mostramos las opciones disponibles al usuario
            System.out.println("1. Ver Sistema Planetario");
            System.out.println("2. Calcular atraccion gravitatoria ");
            System.out.println("3. Salir");
            System.out.print("Escoja una opción: ");
            opcion = pregunta.nextInt();

            switch (opcion) {
                case 1:
                    // Obtenemos la lista de cuerpos celestes en el sistema planetario
                    List<CuerpoCeleste> cuerposCelestes = sistema.getCuerposCelestes();

                    // Mostramos los atributos de todos los cuerpos celestes
                    for (CuerpoCeleste cuerpoCeleste : cuerposCelestes) {
                        System.out.println(cuerpoCeleste.toString());
                    }
                    break;


                case 2:{
                    // Obtenemos la lista de cuerpos celestes en el sistema planetario
                    cuerposCelestes = sistema.getCuerposCelestes();

                    // Mostramos los IDs y nombres de todos los cuerpos celestes
                    System.out.println("Seleccione dos cuerpos celestes diferentes: ");
                    for (CuerpoCeleste cuerpoCeleste : cuerposCelestes) {
                        System.out.printf("Id: %d || Nombre: %s\n", cuerpoCeleste.Id(), cuerpoCeleste.Nombre());
                    }

                    // Pedimos al usuario que seleccione dos cuerpos celestes diferentes
                    int planeta1 = -1;
                    int planeta2 = -1;

                    // Validamos que el primer cuerpo seleccionado esté en la lista
                    while (planeta1 < 0 || planeta1 >= cuerposCelestes.size()) {
                        System.out.print("Seleccione el primer planeta de la lista: ");
                        planeta1 = pregunta.nextInt() - 1;
                        if (planeta1 < 0 || planeta1 >= cuerposCelestes.size()) {
                            System.out.println("El número ingresado no corresponde a ningún planeta en la lista.");
                        }
                    }
                    System.out.println("Ha seleccionado el planeta " + cuerposCelestes.get(planeta1).Nombre());

                    // Validamos que el segundo cuerpo seleccionado esté en la lista y que sea diferente del primero
                    while (planeta2 == -1 || planeta2 == planeta1 || planeta2 >= cuerposCelestes.size()) {
                        System.out.print("Seleccione el segundo planeta de la lista: ");
                        planeta2 = pregunta.nextInt() - 1;
                        if (planeta2 == planeta1) {
                            System.out.println("Debe seleccionar un planeta diferente del primero.");
                        } else if (planeta2 < 0 || planeta2 >= cuerposCelestes.size()) {
                            System.out.println("El número ingresado no corresponde a ningún planeta en la lista.");
                        }
                    }
                    System.out.println("Ha seleccionado el planeta " + cuerposCelestes.get(planeta2).Nombre());

                    // Obtenemos los objetos CuerpoCeleste correspondientes a los IDs seleccionados
                    CuerpoCeleste cuerpo1 = cuerposCelestes.get(planeta1);
                    CuerpoCeleste cuerpo2 = cuerposCelestes.get(planeta2);

                    // Calculamos la atracción gravitatoria entre los dos cuerpos celestes y la mostramos al usuario
                    double atraccion = sistema.calcularAtraccionGravitatoria(cuerpo1, cuerpo2);
                    System.out.printf("La atracción gravitatoria entre %s y %s es %.2e N\n",
                            cuerpo1.Nombre(), cuerpo2.Nombre(), atraccion);
                    break;
                }
                case 3:
                    // Mostramos un mensaje de despedida
                    System.out.println("Saliendo...");
                    break;


                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }
}