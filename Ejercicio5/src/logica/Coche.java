package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.*;
import static logica.Verificadores.verificarEnum;

public class Coche extends Vehiculo {
    private  Transmision transmision;
    public Coche(int id, int numeroDePasajeros, boolean tripulacion,Transmision transmision, int numeroDeRuedas, LocalDate fechaDeMatriculacion
            , MedioDeDesplazamiento medioDeDesplazamiento, Color color) {
        super(id,"Coche", numeroDePasajeros, tripulacion, numeroDeRuedas, fechaDeMatriculacion, medioDeDesplazamiento, color);
        this.transmision = transmision;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public static Coche crearCoche(int id){
        Scanner pregunta = new Scanner(System.in);
        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
        boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
        MedioDeDesplazamiento medio = verificarEnum(pregunta
                ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
        Transmision transmision = verificarEnum(pregunta,"ingrese la transmision del carro(automatico/manual):",Transmision.class);
        Coche coche= new Coche(id,numeroDePasajeros, tripulacion,transmision,numeroDeRuedas,fecha,medio, color);
        return coche;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }
    @Override
    public String toString() {
        return super.toString() + " Transmision: " + transmision;
    }
}
