package Java_Poo.EXTRAS.Ejercicio5.Main;

import Java_Poo.EXTRAS.Ejercicio5.Entidad.Empleado;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Empleado empleado = new Empleado();

        empleado.datos_aumento();
        empleado.calcularAumento();

    }

}
