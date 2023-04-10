// Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente 
// y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
// este resultado es el residuo, y el número de restas realizadas es el cociente.
package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int dividendo = 0, divisor = 0, contador = 0;

        System.out.println("Ingrese un numero como dividendo.");
        dividendo = teclado.nextInt();

        System.out.println("Ingrese un numero como divisor.");
        divisor = teclado.nextInt();

        while (dividendo > divisor || dividendo > 0) {
            dividendo -= divisor;
            contador++;
        }
        System.out.println("La division de restas quedaria " + dividendo + " como resto y " + contador + " como cociente.");
    } 
}
