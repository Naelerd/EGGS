package Java_Poo.EXTRAS.Ejercicio2.Entidad;

import java.util.Scanner;

public class Puntos {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double distancia;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void crearPuntos() {
        System.out.println("Ingrese la primera posicion del punto X:");
        this.x1 = teclado.nextInt();

        System.out.println("Ingrese la segunda posicion del punto X:");
        this.y1 = teclado.nextInt();

        System.out.println("Ingrese la primera posicion del punto Y:");
        this.x2 = teclado.nextInt();

        System.out.println("Ingrese la segunda posicion del punto X:");
        this.y2 = teclado.nextInt();
    }

    public void distanciaPuntos() {
        this.distancia = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
        System.out.println("La distancia entre punto y punto es: " + distancia);

    }
}
