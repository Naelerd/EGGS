package EjerciciosPracticos.Guia1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = 0;
        
        System.out.println("Escribe un numero.");
        num = teclado.nextInt();
        
        System.out.println("El doble del numero ingresado es: " + num * 2);
        System.out.println("El triple del numero ingresado es: " + num * 3);
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(num)); 
    }
}
