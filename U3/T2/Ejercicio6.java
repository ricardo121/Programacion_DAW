package T2;

import java.util.Scanner;

public class Ejercicio6 {
    //Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe insertar otra intentando acertarla con
    //las pistas que le dará el programa: número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o "Fallaste".

    public static void main(String[] args) {

        String contraseña, contraseña2;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la contraseña: ");
        contraseña = teclado.nextLine();

        int longitud = contraseña.length();

        char primera = contraseña.charAt(0);
        char ultima = contraseña.charAt(longitud-1);

        System.out.println("Las Pistas son:   ");
        System.out.println("Numero de Caracteres " + longitud);
        System.out.println("Primera Letra: " + primera);
        System.out.println("Ultima Letra: " + ultima);

        contraseña2 = "";

        while (!contraseña.equalsIgnoreCase(contraseña2)){

            System.out.print("Introduzca la contraseña del primer jugador:  ");
            contraseña2 = teclado.nextLine();
            if (contraseña.equalsIgnoreCase(contraseña2)){
                System.out.println("Acertaste");
            }else{
                System.out.println("Fallaste");
            }

        }


    }

}
