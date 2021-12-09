package T2;

import java.util.Scanner;

public class Ejercicio7 {
    //En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor", según la palabra introducida sea menor
    //alfabéticamente que la contraseña, o mayor.

    public static void main(String[] args) {

        String contraseña, contraseña2;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la contraseña: ");
        contraseña = teclado.nextLine();

        int longitud = contraseña.length();

        char primera = contraseña.charAt(0);
        char ultima = contraseña.charAt(longitud-1);

        System.out.println("Las Pistas son: ");
        System.out.println("Numero de Caracteres: " + longitud);
        System.out.println("Primera Letra: " + primera);
        System.out.println("Ultima Letra: " + ultima);
        System.out.println(" ");

        contraseña2 = "";

        while (!contraseña.equalsIgnoreCase(contraseña2)){

            System.out.print("Introduzca la contraseña del primer jugador:  ");
            contraseña2 = teclado.nextLine();
            if (contraseña.compareTo(contraseña2)==0){
                System.out.println("Acertaste");
            }else if (contraseña.compareTo(contraseña2)<=0){
                System.out.println("Menor");
                //System.out.println(contraseña.compareTo(contraseña2));
            }else{
                System.out.println("Mayor");
                //System.out.println(contraseña.compareTo(contraseña2));
            }


        }


    }

}
