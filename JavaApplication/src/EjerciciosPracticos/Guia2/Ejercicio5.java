package EjerciciosPracticos.Guia2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = 0, limite = 0, suma = 0;
        
        System.out.println("Ingrese un numero limite.");
        limite = teclado.nextInt();
        
        do{
            System.out.println("Ingrese un número");
            num = teclado.nextInt();
            suma += num;
        }while (suma < limite);
        
        System.out.println("Limite alcanzado!.");
    }
}
