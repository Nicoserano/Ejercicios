import logica.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static logica.Verificadores.verificarBooleano;
import static logica.Verificadores.verificarEntero;
import static logica.Verificadores.verificarEnum;
import static logica.Verificadores.verificarFecha;

/**
 * Clase principal que maneja la creación de vehículos y su almacenamiento.
 *
 * @author Ronald serrano
 */
public class Main {
    public static void main(String[] args) {

        // Objeto Scanner para leer la entrada del usuario
        Scanner pregunta = new Scanner(System.in);

        int opcion;
        int maximo = 0;
        do{
            // Menú de opciones
            System.out.println("1.Crea vehiculo");
            System.out.println("2.Salir");
            opcion = verificarEntero(pregunta, "Escoja una opcion:");

            switch (opcion) {
                case 1: {
                    List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
                    for( maximo = 1; maximo<=10;maximo++){
                        System.out.println(maximo);
                        System.out.println("1.Lancha");
                        System.out.println("2.Coche");
                        System.out.println("3.Bicicleta");
                        System.out.println("4.Avion");
                        int categoria= verificarEntero(pregunta, "Escoja una categoria:");
                        if (categoria == 1){
                            int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
                            boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
                            int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
                            LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
                            MedioDeDesplazamiento medio = verificarEnum(pregunta
                                    ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
                            Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
                            Material material = verificarEnum(pregunta,"ingrese el material de la lancha(madera/metal)",Material.class);
                            Lancha lancha = new Lancha(maximo,numeroDePasajeros, tripulacion,numeroDeRuedas,fecha,medio, color,material);
                            vehiculos.add(lancha);

                        }
                        else if (categoria == 2){
                            int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
                            boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
                            int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
                            LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
                            MedioDeDesplazamiento medio = verificarEnum(pregunta
                                    ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
                            Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
                            Transmision transmision = verificarEnum(pregunta,"ingrese la transmision del carro(automatico/manual):",Transmision.class);
                            Coche coche= new Coche(maximo,numeroDePasajeros, tripulacion,transmision,numeroDeRuedas,fecha,medio, color);
                            vehiculos.add(coche);
                        }
                        else if (categoria == 3){
                            int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
                            boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
                            int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
                            LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
                            MedioDeDesplazamiento medio = verificarEnum(pregunta
                                    ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
                            Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
                            Uso uso = verificarEnum(pregunta,"ingrese el uso(urbano/montaña)",Uso.class);
                            Bicicleta bicicleta= new Bicicleta(maximo,numeroDePasajeros,uso, tripulacion,numeroDeRuedas,fecha,medio, color);
                            vehiculos.add(bicicleta);
                        }
                        else if (categoria == 4){
                            int numeroDePasajeros = verificarEntero(pregunta, "Ingrese la cantidad de pasajeros:");
                            boolean tripulacion = verificarBooleano(pregunta,"Ingrese si tiene tripulación (true/false):");
                            int numeroDeRuedas= verificarEntero(pregunta,"Ingrese la cantidad de ruedas:" );
                            LocalDate fecha = verificarFecha(pregunta,"Ingrese la fecha de matriculación (dd/MM/yyyy):");
                            MedioDeDesplazamiento medio = verificarEnum(pregunta
                                    ,"Ingrese el medio de desplazamiento :(Tierra/Agua/Aire)", MedioDeDesplazamiento.class);
                            Color color = verificarEnum(pregunta, ("Ingrese el color (rojo, azul ,negro,blanco)"),Color.class);
                            Tipo tipo= verificarEnum(pregunta,"ingrese el tipo(militar/comercial/privado):",Tipo.class);
                            Avion avion= new Avion(maximo,numeroDePasajeros, tripulacion,tipo,numeroDeRuedas,fecha,medio, color);
                            vehiculos.add(avion);
                        }

                    }
                    for (Vehiculo vehiculo:vehiculos) {
                        System.out.println(vehiculo.toString());
                    }


                    }
                    break;

                case 2:{
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;
                }
                default:{
                    // Si el usuario ingresa una opción incorrecta
                    System.out.println("entrada incorrecta");
                    break;
                }
            }
        } while (opcion != 2);

    }

}