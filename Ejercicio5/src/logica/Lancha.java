package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.*;
import static logica.Verificadores.verificarEnum;

/**
 * Definición de la clase Lancha, que hereda de la clase Vehiculo
 *
 * @author Ronald serrano
 * */
public class Lancha extends Vehiculo{

    //Declaración del atributo material
    private  Material material;


    // Constructor de la clase Lancha
    public Lancha(int id, int numeroDePasajeros, boolean tripulacion, int numeroDeRuedas, LocalDate fechaDeMatriculacion,
                  MedioDeDesplazamiento medioDeDesplazamiento, Color color, Material material) {
        // Llamada al constructor de la clase base (Vehiculo)
        super(id,"Lancha", numeroDePasajeros, tripulacion, numeroDeRuedas, fechaDeMatriculacion, medioDeDesplazamiento, color);
        // Asignación del material de la lancha
        this.material= material;
    }

    // Getter del material de la lancha
    public Material getMaterial() {
        return material;
    }

    // Setter del material de la lancha
    public void setMaterial(Material material) {
        this.material = material;
    }

    // Método estático para crear una nueva lancha
    public static Lancha crearLancha(int id){
        Scanner pregunta = new Scanner(System.in);
        // Se solicitan los datos necesarios para crear una lancha
        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
        boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
        MedioDeDesplazamiento medio = verificarEnum(pregunta, "Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
        Material material = verificarEnum(pregunta,"ingrese el material de la lancha(madera/metal)",Material.class);
        // Se crea la lancha con los datos ingresados
        Lancha lancha = new Lancha(id,numeroDePasajeros, tripulacion,numeroDeRuedas,fecha,medio, color,material);
        return lancha;
    }

    // Método toString para imprimir la información de la lancha
    @Override
    public String toString() {
        // Método toString que devuelve una cadena de texto que representa el objeto de tipo Lancha.
        // Se llama al método toString de la clase padre (Vehiculo) usando la palabra clave 'super'.
        // Se agrega a la cadena resultante el valor de la variable 'material'
        return super.toString() + " Material: " +material ;
    }
}


