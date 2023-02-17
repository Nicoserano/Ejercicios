package logica;
/**
 * Clase para implementar el algoritmo de ordenamiento Bubble Sort
 *
 * @author Ronald serrano 
 * */
public class BubbleSort {

    // Algoritmo de ordenamiento Bubble sort
    public static void bubbleSort(double[] array) {
        int tamano = array.length;
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiamos los elementos si están en el orden equivocado
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] =  temp;
                }
            }
        }
    }
}