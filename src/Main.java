
import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        boolean salir = false;
        int opcion;
        System.out.println("\n¡Bienvenidos al juego de la rueda de la fortuna! en donde se elegirá un premio al azar.");
        while(!salir) {
            System.out.println("\nElige una opción");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    double x;
                    String[] premios = {"0. 10,000 dolares", "1. Una computadora", "2. Un carro", "3. Un viaje a las Vegas", "4. Una casa"};
                    System.out.println("\nLos premios que puede ganar son:");
                    for (int i = 0; i < premios.length; i++) {
                        System.out.println(premios[i]);
                    }

                    int ganador = (int) (Math.random()*5);

                    System.out.println("\nEl premio que ganó es: "+ premios[ganador]);

                    break;
                case 2:
                    System.out.println("¡HASTA LA PROXIMA!");
                    break;


            }
        }
    }
}