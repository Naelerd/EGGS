// Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
// El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
// Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”. 
package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int cantidad, contador = 0, numeros = 0, min = 0, max = 0, promedio = 0;

        System.out.println("Ingrese la cantidad de N que va a ingresar.");
        cantidad = teclado.nextInt();

        do {
            contador++;
            System.out.println("Ingrese el numero N" + contador);
            numeros = teclado.nextInt();
            promedio += numeros;

            if (max == 0 && min == 0) {
                max = numeros;
                min = numeros;
            }

            if (numeros < min) {
                min = numeros;
            } else if (numeros > max) {
                max = numeros;
            }

        } while (contador < cantidad);

        promedio /= cantidad;
        System.out.println("Promedio de numeros: " + promedio);
        System.out.println("Numero ingresado de denominacion mas ALTA fue: " + max);
        System.out.println("Numero ingresado de denominacion mas BAJA fue: " + min);
    }
}
