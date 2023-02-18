package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.*;
import static logica.Verificadores.verificarEnum;

public class Lancha extends Vehiculo{
    private  Material material;


    public Lancha(int id, int numeroDePasajeros, boolean tripulacion, int numeroDeRuedas
            , LocalDate fechaDeMatriculacion, MedioDeDesplazamiento medioDeDesplazamiento, Color color, Material material) {
        super(id,"Lancha", numeroDePasajeros, tripulacion, numeroDeRuedas, fechaDeMatriculacion, medioDeDesplazamiento, color);
        this.material= material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    public static Lancha crearLancha(int id){
        Scanner pregunta = new Scanner(System.in);
        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
        boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
        MedioDeDesplazamiento medio = verificarEnum(pregunta
                ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
        Material material = verificarEnum(pregunta,"ingrese el material de la lancha(madera/metal)",Material.class);
        Lancha lancha = new Lancha(id,numeroDePasajeros, tripulacion,numeroDeRuedas,fecha,medio, color,material);
        return lancha;
    }
    @Override
    public String toString() {
        return super.toString() + " Material: " +material ;
    }
}
