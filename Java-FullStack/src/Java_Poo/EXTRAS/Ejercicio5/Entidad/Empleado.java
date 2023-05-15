package Java_Poo.EXTRAS.Ejercicio5.Entidad;

import java.util.Scanner;

/* Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento salarial 
de un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 
30 años.

 */
public class Empleado {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private double salario;

    private static final double AUMENTO_MAYOR_30 = 0.1;
    private static final double AUMENTO_MENOR_30 = 0.05;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void datos_aumento() {
        System.out.println("Ingrese su nombre.");
        this.nombre = teclado.nextLine();

        System.out.println("Ingrese su edad.");
        this.edad = teclado.nextInt();

        System.out.println("Ingrese su salario actual:");
        this.salario = teclado.nextInt();
    }

    public void calcularAumento() {
        double aumento;

        if (edad > 30) {
            aumento = salario * AUMENTO_MAYOR_30;
        } else {
            aumento = salario * AUMENTO_MENOR_30;
        }

        double nuevoSalario = salario + aumento;
        System.out.println("El salario actual de " + nombre + " luego del aumento es de: " + nuevoSalario); 
    }

}
