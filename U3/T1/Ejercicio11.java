package T1;
import java.util.Scanner;

public class Ejercicio11 {
    //Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo. Realizar una versión iterativa y otra recursiva.

    public static int numeroElevado(int num, int elevado) {

        int resultado = 1;

        for (int i = 0; i < elevado ; i++) {

            resultado = resultado * num;

        }

        return resultado;
    }



    public static int RnumeroElevado(int num, int elevado) {


        if (num == 1 && elevado == 0){

            return 1;

        }else if (elevado == 0) {
            return 1;
        }

        return num * RnumeroElevado(num,elevado-1);
    }



    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int a = teclado.nextInt();

        System.out.print("Introduzca un numero: ");
        int n = teclado.nextInt();


        System.out.println("A elevado a N: " + numeroElevado(a,n));
        System.out.println("---------------------------------------");

        System.out.println("A elevado a N: " + RnumeroElevado(a,n));

    }


}
