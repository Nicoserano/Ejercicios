package logica;

import java.time.LocalDate;

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
    @Override
    public String toString() {
        return super.toString() + " Tipo: " + tipo;
    }
}
