package T6;

import java.util.Scanner;


public class Ejercicio5 {

    /*Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia,
    y a continuación muestre un pequeño menú con 3 opciones:

    1.Calcular diámetro
    2.Calcular perímetro
    3.Calcular área

    Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
    (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)*/

    public static void main( String args[] ) {

        int radio , opcion;

        final double PI = 3.141592;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Valor del radio : " );
        radio = teclado.nextInt();
        System.out.println( "1.Calcular diámetro\n" +
                "\n" +
                "2.Calcular perímetro\n" +
                "\n" +
                "3.Calcular área " );
        System.out.println( "" );
        System.out.print( "Elija una opcion (1,2,3) : " );
        opcion = teclado.nextInt();

        if ( opcion == 1 ) {
            System.out.println( "diametro: " );
            System.out.println( 2 * radio );
        }
        else if ( opcion == 2){
            System.out.println( "perimetro");
            System.out.println( 2 * PI *radio);
        }
        else if ( opcion == 3){
            System.out.println( "area: ");
            System.out.println( PI * radio * radio );
        }
        else {
            System.out.println( "No hay mas opciones" );
        }
    }

// Numero PI se puede poner como valor Predefinido por java (Preguntar chema)
}
