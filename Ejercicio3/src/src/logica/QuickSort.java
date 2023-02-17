package logica;

/**
 *  Clase que implementa el algoritmo de ordenamiento QuickSort para arrays de tipo double.
 *
 * @author Ronald serrano
 * */
public class QuickSort {

    // Algoritmo de ordenamiento Quicksort
    public static void quickSort(double[] array, int low, int high) {
        if (low < high) {
            // Seleccionamos el índice del pivote
            int pi = partition(array, low, high);
            // Ordenamos recursivamente los elementos antes y después del pivote
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Función que coloca el elemento pivot en su posición correcta en el array ordenado
    public static int partition(double[] array, int low, int high) {
        double pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Intercambiamos el elemento actual con el elemento en la posición i
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Intercambiamos el elemento pivot con el elemento en la posición i+1
        double temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        // Devolvemos la posición del pivote en el array ordenado
        return i + 1;
    }
}

