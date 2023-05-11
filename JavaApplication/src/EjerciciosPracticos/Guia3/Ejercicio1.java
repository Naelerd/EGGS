package EjerciciosPracticos.Guia3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num1, num2;
        String opcion = "";

        do {

            System.out.println("Ingrese un numero para calcular.");
            num1 = teclado.nextInt();
            System.out.println("Ingrese un segundo numero para calcular.");
            num2 = teclado.nextInt();

            System.out.println("Ingrese un numero respectivo a su interes"
                    + "\n [1] + SUMAR"
                    + "\n [2] - RESTAR"
                    + "\n [3] / DIVIDIR"
                    + "\n [4] * MULTIPLICAR"
                    + "\n [5] = SALIR");
            opcion = teclado.next();

            calculadora(opcion, num1, num2);

        } while (!"5".equals(opcion));

    }

    public static void calculadora(String opcion, int num1, int num2) {
        switch (opcion) {
            case "1":
                num1 += num2;
                System.out.println("El resultado de tu suma es: " + num1);
                System.out.println(" ");
                break;
            case "2":
                num1 -= num2;
                System.out.println("El resultado de tu resta es:" + num1);
                break;
            case "3":
                num1 /= num2;
                System.out.println("El resultado de tu division es:" + num1);
                break;
            case "4":
                num1 *= num2;
                System.out.println("El resultado de tu multiplicacion es:" + num1);
                break;
            case "5":
                System.out.println("Gracias por utilizar nuestra calculadora.");
                break;
        }
    }
}
