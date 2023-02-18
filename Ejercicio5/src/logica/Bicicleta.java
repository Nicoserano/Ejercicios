package logica;

import java.time.LocalDate;

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
    @Override
    public String toString() {
        return super.toString() + " Uso: " + uso;
    }
}
