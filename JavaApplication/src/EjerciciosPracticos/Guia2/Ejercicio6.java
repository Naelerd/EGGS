package EjerciciosPracticos.Guia2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
  
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        int num1;
        int num2;
        String opcion;
        
        System.out.println("Ingresa el primer numero entero positivo.");
        num1 = teclado.nextInt();
        
        System.out.println("Ingresa el segundo numero entero positivo.");
        num2 = teclado.nextInt();
        
        do{
            System.out.println("Ingrese una opcion" 
            + "\n1: SUMAR"
            + "\n2: RESTAR "
            + "\n3: DIVIDIR"
            + "\n4: MULTIPLICAR"
            + "\n5: SALIR");
            opcion = teclado.next();
               
            switch(opcion){
                case "1":
                        System.out.println("La suma entre " + num1 + " con " + num2 + " es de: " + (num1 + num2)); 
                        System.out.println("");
                        break;
                case "2":
                        System.out.println("La resta entre " + num1 + " con " + num2 + " es de: " + (num1 + num2)); 
                        System.out.println("");
                        break;
                case "3":
                        System.out.println("La division entre " + num1 + " con " + num2 + " es de: " + (num1 + num2)); 
                        System.out.println("");
                        break;
                case "4":
                        System.out.println("La multiplicacion entre " + num1 + " con " + num2 + " es de: " + (num1 + num2));
                        System.out.println("");
                        break;
                case "5":
                        System.out.println("Seguro que desea salir? [S]");  
                        opcion = teclado.next();
                        break;
            }
        }while(!"S".equalsIgnoreCase(opcion));
   }
}
