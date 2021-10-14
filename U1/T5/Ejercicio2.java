package T5;

import java.util.Scanner;

public class Ejercicio2 {
    //Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo ha hecho correctamente o no.

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el numero 12: " );
        numero = teclado.nextInt();

        if (numero==12){
            System.out.println("Lo ha hecho correctamente");
        }else
        {
            System.out.println("Se ha equivocado");
        }


    }
}
