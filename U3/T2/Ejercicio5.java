package T2;

import java.util.Scanner;

public class Ejercicio5 {
    //Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre. Por ejemplo: "Álvaro Pérez" se
    //mostrará como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su Nombre y Apellido: ");
        String nombre = teclado.nextLine();

        int longitud = nombre.length();

        String resultado= "" ;

        String volcal1 = "AÁaá";
        String volcal2 = "EÉeé";
        String volcal3 = "IÍií";
        String volcal4 = "OÓoó";
        String volcal5 = "UÚuú";


        for (int i = 0; i < longitud; i++) {


            if (nombre.charAt(i) == volcal1.charAt(0) ||
                nombre.charAt(i) == volcal1.charAt(1) ||
                nombre.charAt(i) == volcal1.charAt(2) ||
                nombre.charAt(i) == volcal1.charAt(3)){


            }else if (nombre.charAt(i) == volcal2.charAt(0) ||
                    nombre.charAt(i) == volcal2.charAt(1) ||
                    nombre.charAt(i) == volcal2.charAt(2) ||
                    nombre.charAt(i) == volcal2.charAt(3)){

            }else if (nombre.charAt(i) == volcal3.charAt(0) ||
                    nombre.charAt(i) == volcal3.charAt(1) ||
                    nombre.charAt(i) == volcal3.charAt(2) ||
                    nombre.charAt(i) == volcal3.charAt(3)){

            }else if (nombre.charAt(i) == volcal4.charAt(0) ||
                    nombre.charAt(i) == volcal4.charAt(1) ||
                    nombre.charAt(i) == volcal4.charAt(2) ||
                    nombre.charAt(i) == volcal4.charAt(3)){

            }else{
                resultado = resultado + nombre.charAt(i);


            }

        }

        System.out.print("Resultado: " + resultado);

    }

}
