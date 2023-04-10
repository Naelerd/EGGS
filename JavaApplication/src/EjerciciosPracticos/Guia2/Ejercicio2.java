package EjerciciosPracticos.Guia2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String contraseña = "";

        System.out.println("Ingrese su contraseña porfavor.");
        contraseña = teclado.nextLine();

        if (contraseña.equalsIgnoreCase("Eureka")) {
            System.out.println("La contraseña es CORRECTA!");
        } else {
            System.out.println("La contraseña es INCORRECTA!");
        }
    }
}
