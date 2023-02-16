package logica;
/**
 * Esta clase representa un cuerpo celeste en el sistema solar.
 * Contiene atributos como el id, nombre, masa, densidad, diámetro y distancia al sol.
 *
 * @author Ronald serrano
 * */
public class CuerpoCeleste {
    private int id; // identificador único del cuerpo celeste
    private String nombre; // nombre del cuerpo celeste
    private double masa; // masa del cuerpo celeste en kilogramos
    private double densidad; // densidad del cuerpo celeste en kg/m^3
    private double diametro; // diámetro del cuerpo celeste en metros
    private double distanciaAlSol; // distancia del cuerpo celeste al Sol en metros

    public CuerpoCeleste(int id, String nombre, double masa, double densidad, double diametro, double distanciaAlSol) {
        // constructor que inicializa los atributos del cuerpo celeste
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
    }

    // métodos para acceder a los atributos privados del cuerpo celeste
    public int Id() {
        return id;
    }

    public String Nombre() {
        return nombre;
    }

    public double Masa() {
        return masa;
    }

    public double Densidad() {
        return densidad;
    }

    public double Diametro() {
        return diametro;
    }

    public double DistanciaAlSol() {
        return distanciaAlSol;
    }

    public String toString() {
        // Devuelve una cadena que representa el objeto CuerpoCeleste
        return
            "[Id:" + id +            // Agrega el ID del CuerpoCeleste a la cadena
            "|| Nombre:" + nombre +  // Agrega el nombre del CuerpoCeleste a la cadena
            "|| Masa:" + masa +      // Agrega la masa del CuerpoCeleste a la cadena
            "|| Densidad:" + densidad +  // Agrega la densidad del CuerpoCeleste a la cadena
            "|| Diametro:" + diametro +  // Agrega el diámetro del CuerpoCeleste a la cadena
            "|| DistanciaAlSol:" + distanciaAlSol +"]";  // Agrega la distancia del CuerpoCeleste al Sol a la cadena
    }
}
