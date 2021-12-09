package Entregable_2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    //Juego del buscaminas
    //
    //Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N columnas.
    //
    //A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:
    //
    //O bien un carácter X que significa que hay una bomba.
    //O bien un carácter - que significa que esa casilla no nada.
    //A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
    //
    //En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar por pantalla la cantidad de bombas que hay en las casillas de alrededor.
    //
    //Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que el usuario encuentre una bomba).
    //
    //NOTA: Podemos hacer la lectura de la posición como consideremos más oportuno.
    //
    //EJEMPLO:
    //
    //Tablero Relleno:
    //
    //Introduzca una posición: 1,1
    //
    //La posición 1,1 tiene 3 bombas en los alrededores
    //
    //Introduzca una posición: 1,0
    //
    //La posición 1,0 tiene 1 bomba en los alrededores
    //
    //Introduzca una posición: 3,1
    //
    //La posición 3,0 tiene una bomba, está muerto

    public static void main(String[] args) {


        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();

        String[][] datos = new String[num][num];

        int letra =  0 ;

        boolean bomba = false;

        for (int n = 0; n < num; n++) {

            for (int m = 0; m < num; m++) {

                letra = (int)(Math.random()*2+1);

                if (letra==1){
                    datos[n][m] = "X";
                }else if (letra==2){
                    datos[n][m] = "-";
                }



            }

        }

        for (int n = 0; n < num; n++) {

            for (int m = 0; m < num; m++) {

                System.out.print(datos[n][m]+ " ");

            }
            System.out.println("");
        }

        System.out.println(Arrays.deepToString(datos));



        while (bomba==false) {

            num1 = teclado.nextInt();
            num2 = teclado.nextInt();


            if (datos[num1][num2].equalsIgnoreCase("X")) {
                bomba = true;
                System.out.print(num1 + "," + num2);
                System.out.print(" tiene una bomba, está muerto");
                break;


            }

            System.out.print(num1 + "," + num2);
            System.out.println(" tiene 3 bombas en los alrededores");

        }

    }

}
