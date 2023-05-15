package Java_Poo.Ejercicio2.Entidad;

import java.util.Scanner;

public class Circunferencia {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.print("Ingrese el radio del circulo: ");
        this.radio = teclado.nextDouble();

    }

    public void devolverArea() {
        this.area = Math.PI * radio * radio;
        System.out.println("El area es de: " + this.area);
    }

    public void devolverPerimetro() {
        this.perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro es de: " + this.perimetro);
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
