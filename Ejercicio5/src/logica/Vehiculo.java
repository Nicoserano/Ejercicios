package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.*;

/**
 * Clase que define un vehículo con sus propiedades y métodos correspondientes
 *
 * @author Ronald serrano
 * */
public class Vehiculo {
    // Variables de instancia privadas
    private int id;
    private int numeroDePasajeros;
    private String categoria;
    private boolean tripulacion = false;
    private int numeroDeRuedas;
    private LocalDate fechaDeMatriculacion;
    private MedioDeDesplazamiento medioDeDesplazamiento;
    private Color color;

    // Constructor de la clase Vehiculo
    public Vehiculo(int id, String categoria, int numeroDePasajeros, boolean tripulacion, int numeroDeRuedas
            , LocalDate fechaDeMatriculacion, MedioDeDesplazamiento medioDeDesplazamiento, Color color) {
        // Inicialización de variables de instancia
        this.id =id;
        this.categoria = categoria;
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public boolean isTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(boolean tripulacion) {
        this.tripulacion = tripulacion;
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public LocalDate getFechaDeMatriculacion() {
        return fechaDeMatriculacion;
    }

    public void setFechaDeMatriculacion(LocalDate fechaDeMatriculacion) {
        this.fechaDeMatriculacion = fechaDeMatriculacion;
    }

    public MedioDeDesplazamiento getMedioDeDesplazamiento() {
        return medioDeDesplazamiento;
    }

    public void setMedioDeDesplazamiento(MedioDeDesplazamiento medioDeDesplazamiento) {
        this.medioDeDesplazamiento = medioDeDesplazamiento;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Método que devuelve una cadena que representa el objeto Vehiculo
    public  String toString(){
        return
                "||Id: "+id+
                "||categoria:"+ categoria +
                "||Numero de pasajeros: "+numeroDePasajeros+
                "||Tripulacion: "+tripulacion+
                "||Numero de ruedas: "+numeroDeRuedas+
                "||Fecha de matriculacion:"+fechaDeMatriculacion+
                "||Medio de desplazamiento: "+ medioDeDesplazamiento+
                "||Color: "+color+"||";
    }


}