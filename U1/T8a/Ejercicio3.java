package T8a;

import java.util.Scanner;

public class Ejercicio3 {
    //Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando de acertarlo.
    //El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
    //El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).

    public static void main(String[] args) {

        int num ;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();

        int num_aleatorio= (int) (Math.random()*100+1);


        while (num!=num_aleatorio && num!=-1){

            System.out.println("aleatorio:"+ num_aleatorio);

            if (num > num_aleatorio){
                System.out.println("Es mayor");
            }else {
                System.out.println("Es menor");
            }

            System.out.print("Introduzca un número : ");
            num = teclado.nextInt();

        }

        System.out.println("Terminado!");

    }

}
