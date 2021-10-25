package T8b;

import java.util.Scanner;

public class Ejercicio10 {
    //Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. Fíjate que el programa
    //inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();

        System.out.println();
        for(int i = 1; i<=altura; i++){

            //Asteriscos
            for(int j=1; j<=altura; j++){
                if (j==1 && i<altura|| j==altura && i<altura ||i==altura && j>1 && j<altura ){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }

            }
            System.out.println();
        }
    }

}
