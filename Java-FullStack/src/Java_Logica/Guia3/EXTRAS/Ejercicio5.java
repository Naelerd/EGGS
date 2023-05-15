package EjerciciosPracticos.Guia3.EXTRAS;

import java.util.Scanner;

/*5. Crea un programa que pida el nombre al usuario y lo escriba alternando mayúsculas y minúsculas */
public class Ejercicio5 {

    public static void main(String[] args) {

        String nombre = "";
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un nombre.");
        nombre = teclado.next();
        System.out.println(alternarNombre(nombre));
    }

    public static String alternarNombre(String nombre) {
        String resultado = "";
        nombre = nombre.toLowerCase();
        for (int i = 0; i < nombre.length(); i++) {
            if (i % 2 == 0) {
                resultado += Character.toUpperCase(nombre.charAt(i));
            } else {
                resultado += nombre.charAt(i);
            }
        }
        return resultado;
    }

}
