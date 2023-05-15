package Java_Poo.EXTRAS.Ejercicio6.Main;

import Java_Poo.EXTRAS.Ejercicio6.Entidad.Rectangulo;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Rectangulo rectangulo = new Rectangulo();

        rectangulo.datosRectangulo();
        rectangulo.areaRectangulo();
    }

}
