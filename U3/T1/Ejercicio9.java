package T1;
import java.util.Scanner;

public class Ejercicio9 {
    //Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número que se le pasa como parámetro

    public static boolean divisoresPrimo(int num) {

        boolean primo= true;

        for (int i = 2; i < num ; i++) {

            if (num % i == 0){
                primo= false;
                break;
            }

        }

        return primo;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();


        for (int i = 1; i < num ; i++) {

            if (num % i == 0){

                if (divisoresPrimo(i) && i > 1){
                    System.out.println(i + " es primo" );
                }else{
                    System.out.println(i + " no es primo" );
                }

            }

        }

    }

}
