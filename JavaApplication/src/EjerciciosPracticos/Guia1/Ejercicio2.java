package EjerciciosPracticos.Guia1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String nombre = "";
        
        System.out.println("Escriba su nombre.");
        nombre = teclado.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
       
    }
}
