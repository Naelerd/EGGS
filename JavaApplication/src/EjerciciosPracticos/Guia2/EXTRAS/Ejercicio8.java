// Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y 
// mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
// Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break. 
package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num, contador = 0, pares = 0, impares = 0;

        do {
            System.out.println("Ingrese un numero.");
            num = teclado.nextInt();
            contador++;
            if (num > 0) {
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (num % 5 != 0);

        System.out.println("Cantidad de numeros ingresados es de: " + contador);
        System.out.println("La cantidad de numeros PARES es de: " + pares);
        System.out.println("La cantidad de numeros IMPARES es de: " + impares);
    } 
}
