package T1;
import java.util.Scanner;

public class Ejercicio1 {
    //Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces el mensaje "Eco..."

    public static void eco(int n) {

        int cont=0;
        while (cont < n){

            System.out.println("Eco...");
            cont++;

        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = teclado.nextInt();

        eco(n);

    }

}
