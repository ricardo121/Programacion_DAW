package T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    //Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta. La aplicación genera de forma aleatoria,
    //una combinación secreta de n dígitos del 1 al 5 (siendo n la longitud indicada anteriormente por el usuario).
    //El jugador introduce ahora una combinación de prueba. En cada intento se mostrará como pista, para cada dígito, si es mayor menor o
    //igual que el correspondiente de la combinación secreta.

    public static void main(String[] args) {

        int[] clave;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos numeros desea introducir: ");
        int num = teclado.nextInt();


        clave = new int[num];
        int cont = 0;


        for (int i = 0; i < num; i++) {

            clave[i] = (int)(Math.random()*5+1);

        }

        System.out.println(Arrays.toString(clave));

        int [] clave2 = new int[num];

        while (num > cont) {

            cont = 0;

            for (int i = 0; i < num; i++){


                clave2[i] = teclado.nextInt();


            }


            for (int i = 0; i < num; i++) {


                if (clave[i] < clave2[i]) {
                    System.out.println(clave2[i] +" Es Mayor");
                } else if (clave[i] > clave2[i]) {
                    System.out.println(clave2[i]+ " Es Menor");
                } else {
                    System.out.println(clave2[i] + " es igual");
                    cont++;
                }

            }

                if (cont < num){
                System.out.println("Intente acertarla de nuevo");
                }

        }

        System.out.println("Acertaste!!!");

    }

}
