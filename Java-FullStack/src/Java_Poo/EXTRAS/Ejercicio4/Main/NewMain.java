package Java_Poo.EXTRAS.Ejercicio4.Main;

import Java_Poo.EXTRAS.Ejercicio4.Entidad.Cuenta;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Cuenta cuenta = new Cuenta();

        cuenta.retirar_dinero(); 

    }
}
