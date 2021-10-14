package T1;
import java.util.Scanner;

public class Ejercicio3 {
    //Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        int primerNumero = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        int segundoNumero = teclado.nextInt();

        System.out.print( "Su Division es: " );
        System.out.println( primerNumero/segundoNumero );
    }

}
