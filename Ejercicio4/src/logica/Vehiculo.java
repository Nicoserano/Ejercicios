package logica;

import java.time.LocalDate;

/**
 * Clase que define un vehículo con sus propiedades y métodos correspondientes
 *
 * @author Ronald serrano
 * */
public class Vehiculo {
    // Variables de instancia privadas
    private int id;
    private int numeroDePasajeros;
    private boolean tripulacion = false;
    private int numeroDeRuedas;
    private LocalDate fechaDeMatriculacion;
    private MedioDeDesplazamiento medioDeDesplazamiento;
    private Color color;

    // Constructor de la clase Vehiculo
    public Vehiculo(int id,int numeroDePasajeros, boolean tripulacion, int numeroDeRuedas
            , LocalDate fechaDeMatriculacion, MedioDeDesplazamiento medioDeDesplazamiento, Color color) {
        // Inicialización de variables de instancia
        this.id =id;
        this.numeroDePasajeros = numeroDePasajeros;
        this.tripulacion= tripulacion;
        this.numeroDeRuedas= numeroDeRuedas;
        this.fechaDeMatriculacion= fechaDeMatriculacion;
        // Asigna el valor del parámetro medioDeDesplazamiento al atributo medioDeDesplazamiento.
        // La llamada a valueOf convierte el parámetro de tipo enum a un String y luego a un objeto de tipo enum
        this.medioDeDesplazamiento = MedioDeDesplazamiento.valueOf(String.valueOf(medioDeDesplazamiento));
        // Asigna el valor del parámetro color al atributo color.
        // La llamada a valueOf convierte el parámetro de tipo enum a un String y luego a un objeto de tipo enum
        this.color = Color.valueOf(String.valueOf(color));
    }

    // Método que devuelve una cadena que representa el objeto Vehiculo
    public  String toString(){
        return
                "||Id: "+id+
                        "||Numero de pasajeros: "+numeroDePasajeros+
                        "||Tripulacion: "+tripulacion+
                        "||Numero de ruedas: "+numeroDeRuedas+
                        "||Fecha de matriculacion:"+fechaDeMatriculacion+
                        "||Medio de desplazamiento: "+ medioDeDesplazamiento+
                        "||Color: "+color+"||";
    }
}