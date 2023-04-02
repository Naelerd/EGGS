package EjerciciosPracticos.Guia1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        double f = 32, c = 0;
        
        System.out.println("Ingrese la cantidad de grados Centigrados para calcular.");
        c = teclado.nextInt();
        
        f += (9 * c / 5);
        
        System.out.println("El equivalente en grados Fahrenheit es: " + f);
    } 
}
