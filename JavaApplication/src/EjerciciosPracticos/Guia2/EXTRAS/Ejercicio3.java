package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String vocales = "";
        
        System.out.println("Ingrese una letra.");
        vocales = teclado.next();
        
        if(vocales.equalsIgnoreCase("A") || vocales.equalsIgnoreCase("E") || vocales.equalsIgnoreCase("I") || vocales.equalsIgnoreCase("O") || vocales.equalsIgnoreCase("U")){
            System.out.println("Perfecto, el caracter ingresado es una VOCAL.");
        } else {
            System.out.println("Incorrecto, el caracter ingresado NO es una VOCAL.");
        }
    }
}
