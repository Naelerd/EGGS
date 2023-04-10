package EjerciciosPracticos.Guia3;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int escalera;
       
        System.out.println("Ingrese un numero para definir el tamaño de la escalera.");
        escalera = teclado.nextInt();
        
        for(int i = 0; i <= escalera; i++){
            System.out.println(" ");
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }
        }
    }
}
