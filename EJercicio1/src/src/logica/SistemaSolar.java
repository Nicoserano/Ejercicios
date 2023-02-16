package logica;
/**
 * La clase SistemaSolar representa un sistema solar compuesto por un conjunto de planetas y otros cuerpos celestes.
 * Esta clase se encarga de crear y almacenar los planetas del sistema, así como de proveer métodos para acceder y
 * manipular dichos cuerpos celestes.
 *
 * @author Ronald serrano
 * */
public class SistemaSolar {
    public static SistemaPlanetario planetas() {

        // Método que retorna un objeto de tipo SistemaPlanetario
        SistemaPlanetario sistemaSolar = new SistemaPlanetario();

        // Se agregan cuerpos celestes al sistema
        sistemaSolar.agregarCuerpoCeleste(new CuerpoCeleste(1, "Mercurio",3.3011e23
                ,5.427,4880,57.9e6));

        sistemaSolar.agregarCuerpoCeleste(new CuerpoCeleste(2, "Venus", 4.8675e24
                ,5.243,12104,108.2e6));

        sistemaSolar.agregarCuerpoCeleste(new CuerpoCeleste(3,"Tierra",5.97e24
                ,5.51,12742,149.6e6));

        sistemaSolar.agregarCuerpoCeleste(new CuerpoCeleste(4,"Marte", 6.4171e23
                ,3.933,6799,227.9e6));

        sistemaSolar.agregarCuerpoCeleste(new CuerpoCeleste(5,"Jupiter",1.898e27
                ,1.326,139822,778.3e6));

        sistemaSolar.agregarCuerpoCeleste(new CuerpoCeleste(6,"Saturno",5.6834e26
                ,0.687,116460,1.4e9));

        sistemaSolar.agregarCuerpoCeleste(new CuerpoCeleste(7,"Urano",8.681e25
                ,1.27,50724,2.87e9));

        sistemaSolar.agregarCuerpoCeleste(new CuerpoCeleste(8,"Neptuno",1.024e26
                ,1.638,49244,4.5e9));

        // Se retorna el objeto SistemaPlanetario con los cuerpos celestes agregados
        return sistemaSolar;
    }


}
