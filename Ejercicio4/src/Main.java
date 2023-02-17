import logica.Color;
import logica.MedioDeDesplazamiento;
import logica.Vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static logica.Verificadores.verificarBooleano;
import static logica.Verificadores.verificarEntero;
import static logica.Verificadores.verificarEnum;
import static logica.Verificadores.verificarFecha;

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
        int maximo = 0;
        do{
            // Menú de opciones
            System.out.println("1.Crea vehiculo");
            System.out.println("2.Salir");
            opcion = verificarEntero(pregunta, "Escoja una opcion:");

            switch (opcion) {
                case 1: {
                    // Lista para almacenar los vehículos creados
                    List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

                    // Ciclo para crear un máximo de 10 vehículos
                    for( maximo = 1; maximo<=10;maximo++){

                        // Lectura de los datos para crear el vehículo
                        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
                        boolean Tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
                        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
                        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
                        MedioDeDesplazamiento medio = verificarEnum(pregunta
                                ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
                        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);

                        // Creación del objeto Vehiculo y agregado a la lista de vehículos
                        Vehiculo vehiculo = new Vehiculo(maximo,numeroDePasajeros,Tripulacion,numeroDeRuedas,fecha,medio,color);
                        vehiculos.add(vehiculo);
                    }

                    // Imprimir todos los vehículos creados
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