package Java_Poo.EXTRAS.Ejercicio1.Main;

import Java_Poo.EXTRAS.Ejercicio1.Entidad.Cancion;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Cancion cancion = new Cancion();

        cancion.llenarDatos();
        cancion.devolverDatos();
    }

}
