package Java_Poo.EXTRAS.Ejercicio3.Main;

import Java_Poo.EXTRAS.Ejercicio3.Entidad.Juego;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Juego juego = new Juego();

        juego.iniciar_juego();
    }

}
