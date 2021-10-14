package T5;

import java.util.Scanner;

public class Ejercicio6 {
    //Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de "tiempo", y calcule y muestre la velocidad
    //(velocidad=gravedad x tiempo). Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"

    public static void main(String[] args) {

        double gravedad, tiempo, velocidad ;
        Scanner teclado = new Scanner(System.in);
        gravedad = 9.8;
        System.out.print( "Introduzca el tiempo : " );
        tiempo = teclado.nextDouble();
        velocidad = gravedad * tiempo;


        if (tiempo<=0) {
            System.out.println("Tiempo Incorrecto" );
        }
        else{
            System.out.println("La velocidad es: " + velocidad );
        }

    }
}
