package logica;

import java.time.LocalDate;

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

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }
    @Override
    public String toString() {
        return super.toString() + " Transmision: " + transmision;
    }
}
