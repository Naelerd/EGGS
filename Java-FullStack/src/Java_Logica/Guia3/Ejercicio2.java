package EjerciciosPracticos.Guia3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int edad, cant;
        String nombres, opinion;
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Cuantas personas van a ingresar datos en el sistema?");
        cant = teclado.nextInt();

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese su nombre la persona N" + (i + 1) + ":");
            nombres = teclado.next();

            System.out.println("Ingrese que edad tiene la persona N " + (i + 1));
            edad = teclado.nextInt();

            data(edad, nombres);

            System.out.println("Desea seguir consultando la edad del resto de gente?" + " [" + (i - cant) + "]" + " restantes.");
            opinion = teclado.next();

            if (opinion.toLowerCase().equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("Gracias por utilizar nuestra APP de consulta.");
    }

    public static void data(int edad, String nombres) {

        if (edad >= 18) {
            System.out.println("El usuario/a " + nombres + " tiene " + edad + " por lo tanto es mayor de edad.");
        }
    }
}

// Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique 
// si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando 
// personas y frenar cuando el usuario ingrese la palabra “No”. 
