import logica.Avion;
import logica.Bicicleta;
import logica.Coche;
import logica.Lancha;
import logica.Vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static logica.Avion.crearAvion;
import static logica.Bicicleta.crearBicicleta;
import static logica.Coche.crearCoche;
import static logica.Lancha.crearLancha;
import static logica.Verificadores.verificarEntero;


/**
 * Clase principal que maneja la creación de vehículos y su almacenamiento.
 *
 * @author Ronald serrano
 */
public class Main {
    public static void main(String[] args) {

        // Objeto Scanner para leer la entrada del usuario
        Scanner pregunta = new Scanner(System.in);

        int opcion;
        int numeroDeVehiculos = 0;
        do{
            // Menú de opciones
            System.out.println("1.Crea vehiculo");
            System.out.println("2.Salir");
            opcion = verificarEntero(pregunta, "Escoja una opcion:");

            switch (opcion) {
                case 1: {
                    // Definición de una lista de objetos Vehiculo
                    List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

                    // Creación de vehículos y agregado a la lista
                    for( numeroDeVehiculos = 1; numeroDeVehiculos<=2;numeroDeVehiculos++){

                        // Imprime una lista de categorías
                        System.out.println(numeroDeVehiculos);
                        System.out.println("1.Lancha");
                        System.out.println("2.Coche");
                        System.out.println("3.Bicicleta");
                        System.out.println("4.Avion");

                        // Solicita al usuario que seleccione una categoría
                        int categoria= verificarEntero(pregunta, "Escoja una categoria:");

                        // Crea un objeto de la categoría seleccionada y lo agrega a la lista de vehículos
                        if (categoria == 1){
                            Lancha lancha = crearLancha(numeroDeVehiculos);
                            vehiculos.add(lancha);

                        }
                        else if (categoria == 2){
                            Coche coche = crearCoche(numeroDeVehiculos);
                            vehiculos.add(coche);
                        }
                        else if (categoria == 3){
                            Bicicleta bicicleta= crearBicicleta(numeroDeVehiculos);
                            vehiculos.add(bicicleta);
                        }
                        else if (categoria == 4){
                            Avion avion = crearAvion(numeroDeVehiculos);
                            vehiculos.add(avion);
                        }
                        else {
                            System.out.println("opcion invalida");
                        }

                    }
                    //Imprime los vehiculos añadidos
                    for (Vehiculo vehiculo:vehiculos) {
                        System.out.println(vehiculo.toString());
                    }

                    break;
                    }

                case 2:{
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;
                }
                default:{
                    // Si el usuario ingresa una opción incorrecta
                    System.out.println("entrada incorrecta");
                    break;
                }
            }
        } while (opcion != 2);

    }

}