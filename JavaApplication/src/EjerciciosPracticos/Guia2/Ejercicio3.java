package EjerciciosPracticos.Guia2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String frase = "";
        
        System.out.println("Escriba una frase.");
        frase = teclado.nextLine();
        
        if(frase.length() != 8){
            System.out.println("INCORRECTO!");
        } else {
            System.out.println("CORRECTO!");
        }
    }
}
