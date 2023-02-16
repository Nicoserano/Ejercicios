package logica;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un sistema planetario y almacena una lista de cuerpos celestes.
 *
 * @author Ronald serrano
 **/
public class SistemaPlanetario {
    private List<CuerpoCeleste> cuerposCelestes;

    /**
     * Constructor de la clase SistemaPlanetario que inicializa la lista de cuerpos celestes.
     */
    public SistemaPlanetario() {
        cuerposCelestes = new ArrayList<>();
    }

    /**
     * Agrega un cuerpo celeste al sistema planetario
     *
     * @param cuerpo el cuerpo celeste a agregar
     */
    public void agregarCuerpoCeleste(CuerpoCeleste cuerpo) {
        cuerposCelestes.add(cuerpo);
    }

    /**
     * Calcula la atracción gravitatoria entre dos cuerpos celestes
     *
     * @param cuerpo1 el primer cuerpo celeste
     * @param cuerpo2 el segundo cuerpo celeste
     * @return la fuerza de atracción gravitatoria entre los dos cuerpos celestes
     */
    public double calcularAtraccionGravitatoria(CuerpoCeleste cuerpo1, CuerpoCeleste cuerpo2) {
        double G = 6.67430E-11; // Constante gravitatoria de Newton
        double distancia = Math.abs(cuerpo1.DistanciaAlSol() - cuerpo2.DistanciaAlSol());
        double fuerza = (G * cuerpo1.Masa() * cuerpo2.Masa()) / (distancia * distancia);
        return fuerza;
    }

    /**
     * Obtiene la lista de cuerpos celestes del sistema planetario
     *
     * @return la lista de cuerpos celestes del sistema planetario
     */
    public List<CuerpoCeleste> getCuerposCelestes() {
        return (List<CuerpoCeleste>) cuerposCelestes;
    }

}
