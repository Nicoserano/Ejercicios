package logica;

import java.time.LocalDate;
import java.util.Scanner;

import static logica.Verificadores.*;
import static logica.Verificadores.verificarEnum;

public class Bicicleta extends Vehiculo{

    private Uso uso ;

    public Bicicleta(int id,int numeroDePasajeros,Uso uso ,boolean tripulacion, int numeroDeRuedas
            , LocalDate fechaDeMatriculacion, MedioDeDesplazamiento medioDeDesplazamiento, Color color) {
        super(id, "Bicicleta", numeroDePasajeros, tripulacion, numeroDeRuedas, fechaDeMatriculacion, medioDeDesplazamiento, color);
        this.uso = uso;
    }

    public Uso getUso() {
        return uso;
    }

    public void setUso(Uso uso) {
        this.uso = uso;
    }
    public static Bicicleta crearBicicleta(int id){
        Scanner pregunta = new Scanner(System.in);
        int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
        boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
        int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
        LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
        MedioDeDesplazamiento medio = verificarEnum(pregunta
                ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
        Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
        Uso uso = verificarEnum(pregunta,"ingrese el uso(urbano/montaña)",Uso.class);
        Bicicleta bicicleta= new Bicicleta(id,numeroDePasajeros,uso, tripulacion,numeroDeRuedas,fecha,medio, color);
        return bicicleta;
    }
    @Override
    public String toString() {
        return super.toString() + " Uso: " + uso;
    }
}
