package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.*;
import static logica.Verificadores.verificarEnum;

/**
 * Definición de la clase Coche, que hereda de la clase Vehiculo
 *
 * @author Ronald serrano
 * */
public class Coche extends Vehiculo {
    //Declaración de atributos
    private  Transmision transmision;

    //Constructor de la clase Coche
    public Coche(int id, int numeroDePasajeros, boolean tripulacion, Transmision transmision, int numeroDeRuedas, LocalDate fechaDeMatriculacion, MedioDeDesplazamiento medioDeDesplazamiento, Color color) {

        //Llamado al constructor de la clase padre (Vehiculo) mediante la palabra clave super
        super(id, "Coche", numeroDePasajeros, tripulacion, numeroDeRuedas, fechaDeMatriculacion, medioDeDesplazamiento, color);

        //Inicialización del atributo transmision
        this.transmision = transmision;
    }

    //Getter para el atributo transmision
    public Transmision getTransmision() {
        return transmision;
    }

    //Método estático que permite crear un objeto Coche a partir de la entrada por consola de los atributos del coche
    public static Coche crearCoche(int id){

        //Creación de un objeto Scanner para leer la entrada por consola
        Scanner pregunta = new Scanner(System.in);

        //Lectura y verificación del número de pasajeros ingresado por consola
        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");

        //Lectura y verificación de la presencia o no de tripulación en el coche
        boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");

        //Lectura y verificación del número de ruedas del coche
        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );

        //Lectura y verificación de la fecha de matriculación del coche
        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");

        //Lectura y verificación del medio de desplazamiento del coche
        MedioDeDesplazamiento medio = verificarEnum(pregunta, "Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);

        //Lectura y verificación del color del coche
        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul, negro, blanco)"), Color.class);

        //Lectura y verificación de la transmisión del coche
        Transmision transmision = verificarEnum(pregunta, "Ingrese la transmisión del carro (automático/manual):", Transmision.class);

        //Creación de un objeto Coche con los atributos ingresados
        Coche coche= new Coche(id, numeroDePasajeros, tripulacion, transmision, numeroDeRuedas, fecha, medio, color);

        //Retorno del objeto Coche creado
        return coche;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    // método sobreescrito de la clase Object que devuelve una representación de cadena de caracteres del coche
    @Override
    public String toString() {
        // Método toString que devuelve una cadena de texto que representa el objeto de tipo Coche.
        // Se llama al método toString de la clase padre (Vehiculo) usando la palabra clave 'super'.
        // Se agrega a la cadena resultante el valor de la variable 'transmision'
        return super.toString() + " Transmision: " + transmision;
    }
}
