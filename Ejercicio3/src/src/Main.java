import logica.BubbleSort;
import logica.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Clase principal del programa para ordenar arrays
 *
 * @author Ronald serrano
 * */
public class Main {
    public static void main(String[] args) {
        Scanner pregunta = new Scanner(System.in);
        boolean exit =false;
        while(exit == false) {
            // Generamos un tamaño aleatorio para el array
            int tamano = (int) Math.round(Math.random() * 20);

            // Creamos un array de números aleatorios
            double[] array = new double[tamano];
            for (int i = 0; i < tamano; i++) {
                array[i] = (Math.random() * 1000);
            }

            // Mostramos el array generado por pantalla
            System.out.println("Nuevo Array generado: " + Arrays.toString(array));

            // Pedimos al usuario que seleccione un algoritmo de ordenamiento
            int opcion = 0;
            while (opcion != 1 && opcion != 2 && opcion != 3) {
                System.out.println("¿Qué algoritmo de ordenamiento desea utilizar? (1 para Bubble Sort, 2 para Quicksort" +
                        ", 3 para salir)");
                if (pregunta.hasNextInt()) {
                    opcion = pregunta.nextInt();
                    if (opcion != 1 && opcion != 2 && opcion != 3) {
                        System.out.println("Opción inválida. Intente nuevamente.");
                    }
                } else {
                    pregunta.next(); // Descartar entrada inválida
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            }

            switch (opcion) {
                case 1: {
                    // Ordenamos el array mediante el algoritmo de la burbuja
                    BubbleSort.bubbleSort(array);
                    System.out.println("Array ordenado mediante Bubble sort: " + Arrays.toString(array));
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                }

                case 2: {
                    // Ordenamos el array mediante Quicksort
                    QuickSort.quickSort(array, 0, tamano - 1);
                    System.out.println("Array ordenado mediante Quick Sort: " + Arrays.toString(array));
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                }
                case 3:{
                    exit = true;
                    System.out.println("saliendo...");
                    break;
                }

                default: {
                    // Si el usuario ingresa una opción inválida, mostramos un mensaje de error
                    System.out.println("Opción inválida.");
                    break;
                }
            }
        }
    }
}