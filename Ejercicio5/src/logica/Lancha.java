package logica;

import java.time.LocalDate;

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
    @Override
    public String toString() {
        return super.toString() + " Material: " +material ;
    }
}
