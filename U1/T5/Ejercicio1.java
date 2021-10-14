package T5;

import java.util.Scanner;

public class Ejercicio1 {
    //Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero)
    //o si, por el contrario, no lo es (usando "else").
    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un numero: " );
        numero = teclado.nextInt();

        if (numero>0){
            System.out.println("Numero Positivo");
        }else
        {
            System.out.println("Numero Negativo");
        }


    }
}
