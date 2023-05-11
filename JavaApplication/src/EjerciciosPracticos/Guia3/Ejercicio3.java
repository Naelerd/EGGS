package EjerciciosPracticos.Guia3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num;

        System.out.println("Ingrese un numero para saber si es PRIMO.");
        num = teclado.nextInt();
        primo(num);

    }

    public static void primo(int num1) {
        int contador = 0, resultado;

        for (int i = 1; i <= 100 + 1; i++) {
            resultado = num1 % i;

            if (resultado == 0) {
                contador++;
            }
        }

        if (num1 == 1) {
            System.out.println("El numero 1 no es considerado PRIMO ni COMPUESTO.");
        } else if (contador <= 2) {
            System.out.println("El numero ingresado ES es primo.");
        } else {
            System.out.println("El numero ingresado NO es primo.");
        }
    }
}
