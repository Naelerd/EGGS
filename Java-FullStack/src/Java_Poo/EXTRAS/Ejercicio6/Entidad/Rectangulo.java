package Java_Poo.EXTRAS.Ejercicio6.Entidad;

import java.util.Scanner;

/* Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
public class Rectangulo {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private double lado1;
    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void datosRectangulo() {
        System.out.println("Ingrese la base del rectangulo:");
        this.lado1 = teclado.nextInt();

        System.out.println("Ingrese la altura del rectangulo: ");
        this.lado2 = teclado.nextInt();
    }

    public void areaRectangulo() {
        double area;

        area = lado1 * lado2;
        System.out.println("El area del rectangulo es de: " + area);
    }
}
