package logica;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta es una clase de utilidad para la verificación de diferentes tipos de entrada en la consola.
 *
 * @author Ronald serrano
 * */
public class Verificadores {

    /**
     * Verifica que la entrada de un Scanner sea un número entero.
     *
     * @param scanner el objeto Scanner que se utiliza para leer la entrada
     * @param mensaje el mensaje que se muestra para solicitar la entrada
     * @return el número entero verificado
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

    /**
     * Verifica que la entrada de un Scanner sea un valor booleano ("true" o "false").
     *
     * @param pregunta el objeto Scanner que se utiliza para leer la entrada
     * @param mensaje el mensaje que se muestra para solicitar la entrada
     * @return el valor booleano verificado
     */
    public static boolean verificarBooleano(Scanner pregunta, String mensaje) {
        boolean entradaValida = false;
        boolean valor = false;
        do {
            System.out.println(mensaje);
            String entrada = pregunta.next();
            if (entrada.equalsIgnoreCase("true")) {
                valor = true;
                entradaValida = true;
            } else if (entrada.equalsIgnoreCase("false")) {
                valor = false;
                entradaValida = true;
            } else {
                System.out.println("Entrada incorrecta. Por favor, ingrese 'true' o 'false'.");
            }
        } while (!entradaValida);
        return valor;
    }

    /**
     * Verifica que la entrada de un Scanner sea una fecha en formato "dd/MM/yyyy".
     *
     * @param scanner el objeto Scanner que se utiliza para leer la entrada
     * @param mensaje el mensaje que se muestra para solicitar la entrada
     * @return la fecha verificada en formato LocalDate
     */
    public static LocalDate verificarFecha(Scanner scanner, String mensaje){
        while (true){
            System.out.println(mensaje);
            try{
                String fechaString = scanner.next();
                LocalDate fecha = LocalDate.parse(fechaString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                return fecha;
            }catch(DateTimeException e){
                System.out.println("Entrada incorrecta. Por favor, ingrese un formato valido.(dd/MM/yyyy)");
                scanner.nextLine();
            }
        }
    }

    /**
     * Verifica que la entrada de un Scanner sea un valor de un tipo enumerado.
     *
     * @param scanner el objeto Scanner que se utiliza para leer la entrada
     * @param mensaje el mensaje que se muestra para solicitar la entrada
     * @param enumType el tipo de enum que se espera para la entrada
     * @param <T> el tipo genérico del enum
     * @return el valor del enum verificado
     */
    public static <T extends Enum<T>> T verificarEnum(Scanner scanner, String mensaje, Class<T> enumType) {
        while (true){

            System.out.println(mensaje);
            try{
                String input = scanner.next();
                String inputMinuscula = input.toLowerCase();
                T value = Enum.valueOf(enumType, inputMinuscula);
                return (T) value;
            }catch(IllegalArgumentException e){
                System.out.println("Entrada incorrecta. Por favor, ingrese un tipo valido."+mensaje);
                scanner.nextLine();
            }
        }
    }

}
