package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.*;
import static logica.Verificadores.verificarEnum;

/**
 * Definición de la clase Bicicleta, que hereda de la clase Vehiculo
 *
 * @author Ronald serrano
 * */
public class Bicicleta extends Vehiculo{

    private Uso uso ; // atributo que representa el uso de la bicicleta

    // constructor de la clase Bicicleta que recibe los atributos necesarios para crear una bicicleta
    public Bicicleta(int id,int numeroDePasajeros,Uso uso ,boolean tripulacion, int numeroDeRuedas
            , LocalDate fechaDeMatriculacion, MedioDeDesplazamiento medioDeDesplazamiento, Color color) {
        super(id, "Bicicleta", numeroDePasajeros, tripulacion, numeroDeRuedas, fechaDeMatriculacion, medioDeDesplazamiento, color);
        this.uso = uso; // asigna el uso de la bicicleta
    }

    // getter para el atributo uso
    public Uso getUso() {
        return uso;
    }

    // setter para el atributo uso
    public void setUso(Uso uso) {
        this.uso = uso;
    }

    // método estático que permite al usuario crear una instancia de Bicicleta
    public static Bicicleta crearBicicleta(int id){
        Scanner pregunta = new Scanner(System.in);

        // utiliza los métodos de la clase Verificadores para obtener los valores de los atributos necesarios para crear una bicicleta
        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
        boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
        MedioDeDesplazamiento medio = verificarEnum(pregunta
                ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
        Uso uso = verificarEnum(pregunta,"ingrese el uso(urbano/montaña)",Uso.class);
        Bicicleta bicicleta= new Bicicleta(id,numeroDePasajeros,uso, tripulacion,numeroDeRuedas,fecha,medio, color);
        return bicicleta; // devuelve la bicicleta creada
    }

    // método sobreescrito de la clase Object que devuelve una representación de cadena de caracteres de la bicicleta
    @Override
    public String toString() {
        // Método toString que devuelve una cadena de texto que representa el objeto de tipo Bicicleta.
        // Se llama al método toString de la clase padre (Vehiculo) usando la palabra clave 'super'.
        // Se agrega a la cadena resultante el valor de la variable 'USO'
        return super.toString() + " Uso: " + uso;
    }
}