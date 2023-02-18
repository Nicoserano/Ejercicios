package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.*;
import static logica.Verificadores.verificarEnum;

public class Avion extends Vehiculo{
    private  Tipo tipo;

    public Avion(int id, int numeroDePasajeros, boolean tripulacion,Tipo tipo, int numeroDeRuedas, LocalDate fechaDeMatriculacion, MedioDeDesplazamiento medioDeDesplazamiento, Color color) {
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
        Scanner pregunta = new Scanner(System.in);

        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
        boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
        MedioDeDesplazamiento medio = verificarEnum(pregunta
                ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
        Tipo tipo= verificarEnum(pregunta,"ingrese el tipo(militar/comercial/privado):",Tipo.class);
        Avion avion= new Avion(id,numeroDePasajeros, tripulacion,tipo,numeroDeRuedas,fecha,medio, color);
        return avion;


    }
    @Override
    public String toString() {
        return super.toString() + " Tipo: " + tipo;
    }
}
