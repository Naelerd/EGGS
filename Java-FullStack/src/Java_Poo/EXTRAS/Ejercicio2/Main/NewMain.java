package Java_Poo.EXTRAS.Ejercicio2.Main;

import Java_Poo.EXTRAS.Ejercicio2.Entidad.Puntos;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Puntos puntos = new Puntos();

        puntos.crearPuntos();
        puntos.distanciaPuntos();

    }

}
