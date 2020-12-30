/*
author: Carlos Toruño
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos las variables
        String jugador1;
        String jugador2;;
        String instrucciones = "Escoge una letra - P=Piedra, L=Papel, T=Tijera.";
        String ganaJugador1 = "Ha ganado el jugador 1";
        String ganaJugador2 = "Ha ganado el jugador 2";
        String jugarDeNuevo = "N";

        //Creamos el input del juego
        Scanner input = new Scanner(System.in);

        //Creamos la logica del juego
        do{

            //Solicitamos que el jugador uno haga su eleccion
            System.out.println(instrucciones);
            System.out.print("Jugador 1: ");
            jugador1 = input.nextLine();

            //Solicitamos que el jugador dos haga su eleccion
            System.out.println(instrucciones);
            System.out.print("Jugador 2: ");
            jugador2 = input.nextLine();

            //Selecionamos a los ganadores
            if (jugador1.equals("P") && jugador2.equals("L")) {
                //En este caso gana el jugador 2
                System.out.println(ganaJugador2);
            } else if (jugador1.equals("P") && jugador2.equals("T")) {
                //En este caso gana el jugador 1
                System.out.println(ganaJugador1);
            } else if (jugador1.equals("L") && jugador2.equals("P")) {
                //En este caso gana el jugador 1
                System.out.println(ganaJugador1);
            } else if (jugador1.equals("T") && jugador2.equals("P")) {
                //En este caso gana el jugador 2
                System.out.println(ganaJugador2);
            } else if (jugador1.equals("L") && jugador2.equals("T")) {
                //En este caso gana el jugador 2
                System.out.println(ganaJugador2);
            } else if (jugador1.equals("T") && jugador2.equals("L")) {
                //En este caso gana el jugador 1
                System.out.println(ganaJugador1);
            } else {
                System.out.println("Empate");
            }

            //Salto de linea y preguntamos a los jugadores si desean jugar de nuevo.
            System.out.println();
            System.out.println("Desean jugar de Nuevo? Y = Si, N = No: ");
            jugarDeNuevo = input.nextLine();
            System.out.println();
        }while(jugarDeNuevo.equals("Y"));
    }
}