// Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
// y el promedio de estaturas en general. 

package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        int cantP, bajitos = 0;
        double estatura, promedio = 0, promediobajitos = 0;
        
        System.out.println("Cuantas personas van a ingresar su estatura para sacar el promedio de todas?");
        cantP = teclado.nextInt();
        
        
        for(int i = 1; i <= cantP; i++){
            System.out.println("Ingrese la estatura N" + i);
            estatura = teclado.nextDouble();
            promedio += estatura;
            
            if(estatura < 1.60){
                bajitos++;
                promediobajitos += estatura;
            }
        }
        
        promedio /= cantP;
        promediobajitos /= bajitos;
        
        System.out.println("El promedio de estatura general fue de: " + promedio);
        System.out.println("El promedio de estatura menor a 1,60 fue de: " + promediobajitos);
    }
}
