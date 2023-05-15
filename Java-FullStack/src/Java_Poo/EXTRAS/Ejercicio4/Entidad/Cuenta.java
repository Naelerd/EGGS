package Java_Poo.EXTRAS.Ejercicio4.Entidad;

import java.util.Scanner;

/* Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero
del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
public class Cuenta {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private int saldo = 10000;
    private int cantidad;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular, int cantidad) {
        this.saldo = saldo;
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void retirar_dinero() {
        System.out.println("Nombre del titular de la cuenta");
        this.titular = teclado.nextLine();
        System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
        this.cantidad = teclado.nextInt();

        if (saldo - cantidad > 0) {
            this.saldo -= cantidad;
            System.out.println("Muy bien " + titular + ", los billetes se estan imprimiendo..."
                    + "\nLe queda un saldo total a: $" + saldo + " en su cuenta.");
        } else {
            System.out.println("No podemos darle a retirar dinero ya que su saldo esta en $" + saldo);
        }

    }
}
