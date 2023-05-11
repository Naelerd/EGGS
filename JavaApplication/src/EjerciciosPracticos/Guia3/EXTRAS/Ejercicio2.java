package EjerciciosPracticos.Guia3.EXTRAS;

import java.util.Scanner;

/* 2. Implementar una función que permita obtener el valor absoluto de un número positivo y otra que obtenga la raíz cuadrada. 
Para ello utilice los métodos abs() y sqrt() de la clase Math. */
public class Ejercicio2 {

    public static void main(String[] args) {
        int num;

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un numero para pasarlo a su valor absoluto y mostrar su raiz cuadrada.");
        num = teclado.nextInt();

        System.out.println("El valor absoluto del numero es:" + absoluto(num));
        System.out.println("La raiz cuadrada del numero es:" + raiz(num));

    }

    public static int absoluto(int num) {

        return Math.abs(num);
    }

    public static double raiz(double num) {

        return Math.sqrt(num);
    }
}
