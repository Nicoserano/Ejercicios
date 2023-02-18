package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.verificarBooleano;
import static logica.Verificadores.verificarEntero;
import static logica.Verificadores.verificarEnum;
import static logica.Verificadores.verificarFecha;

/**
 * Definición de la clase Avion, que hereda de la clase Vehiculo
 *
 * @author Ronald serrano
 * */

public class Avion extends Vehiculo{
    private  Tipo tipo;

    public Avion(int id, int numeroDePasajeros, boolean tripulacion,Tipo tipo, int numeroDeRuedas, LocalDate fechaDeMatriculacion, MedioDeDesplazamiento medioDeDesplazamiento, Color color) {
        // Constructor de la clase Avion que recibe como parámetros la información necesaria para crear un objeto de tipo Avion
        // y llama al constructor de la clase padre (Vehiculo) usando la palabra clave 'super'.
        // Se inicializa la variable 'tipo' con el valor que se recibe como parámetro.
        super(id,"Avion", numeroDePasajeros, tripulacion, numeroDeRuedas, fechaDeMatriculacion, medioDeDesplazamiento, color);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public static Avion crearAvion(int id){
        // Método estático que devuelve un objeto de tipo Avion creado a partir de la información que se pide al usuario por consola.

        Scanner pregunta = new Scanner(System.in);

        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
        boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
        MedioDeDesplazamiento medio = verificarEnum(pregunta
                ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
        Tipo tipo= verificarEnum(pregunta,"ingrese el tipo(militar/comercial/privado):",Tipo.class);
        // Se pide al usuario que ingrese la información necesaria para crear un objeto de tipo Avion.
        // Se usan métodos estáticos de la clase Verificadores para validar y convertir la información ingresada por el usuario.
        // Se crea un objeto de tipo Avion con la información validada y se devuelve.

        Avion avion= new Avion(id,numeroDePasajeros, tripulacion,tipo,numeroDeRuedas,fecha,medio, color);
        return avion;
    }

    @Override
    public String toString() {
        // Método toString que devuelve una cadena de texto que representa el objeto de tipo Avion.
        // Se llama al método toString de la clase padre (Vehiculo) usando la palabra clave 'super'.
        // Se agrega a la cadena resultante el valor de la variable 'tipo'.
        return super.toString() + " Tipo: " + tipo;
    }
}
