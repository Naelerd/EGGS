package Java_Poo.Ejercicio3.Entidad;

import java.util.Scanner;

public class Operacion {

    /* Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le 
informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa 
al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private int numero1;
    private int numero2;
    private int resultado;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el primer N: ");
        this.numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo N: ");
        this.numero2 = teclado.nextInt();
    }

    public void sumar() {
        this.resultado = numero1 + numero2;
        System.out.println("Suma: " + resultado);
    }

    public void restar() {
        if (numero2 > numero1) {
            this.resultado = numero2 - numero1;
            System.out.println("Resta: " + resultado);
        } else {
            this.resultado = numero1 - numero2;
            System.out.println("Resta: " + resultado);
        }
    }

    public void multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            numero1 = 0;
            System.out.println("Error, no puede ingresar un 0");
        } else {
            this.resultado = numero1 * numero2;
            System.out.println("Multiplicacion: " + resultado);
        }
    }

    public void dividir() {
        if (numero1 == 0 || numero2 == 0) {
            resultado = 0;
            System.out.println("Error, no puede ingresar un 0");
        } else if (numero2 > numero1) {
            this.resultado = numero2 / numero1;
            System.out.println("division: " + resultado);
        } else {
            this.resultado = numero1 / numero2;
            System.out.println("Division: " + resultado);
        }

    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
}
