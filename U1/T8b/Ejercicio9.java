package T8b;

import java.util.Scanner;

public class Ejercicio9 {
    //Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El palo horizontal de
    //la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        System.out.print("Introduzca Caracter: ");
        char caracter = sc.next().charAt(0);

        System.out.println();
        for(int i = 1; i<=altura; i++){

            //Asteriscos
            for(int j=1; j<=altura; j++){
                if (j==1||i==altura && j<=altura/2 ){
                    System.out.print(caracter);
                }else{
                    System.out.print("-");
                }

            }
            System.out.println();
        }
    }
}
