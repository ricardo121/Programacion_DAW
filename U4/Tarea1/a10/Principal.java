package Tarea1.a10;

import Tarea1.a8.Bombilla;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca una hora: ");
        int hora = teclado.nextInt();

        System.out.print("Introduzca una cantidad de segundos: ");
        int segundos = teclado.nextInt();


        Hora h1 = new Hora(hora,0,0);



        System.out.println("Hora introducida: " + h1.getHora());

        h1.setSegundo(segundos);

        System.out.print("Hora: " + h1.getHora());

        System.out.print(" Minutos : " + h1.getMinuto());

        System.out.print(" Segundos : " + h1.getSegundo());

    }

}
