package T5b;

import java.util.Scanner;

public class Ejercicio4 {
    //Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras. Escribe un programa que calcule el salario semanal
    //de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41,
    //se pagan a 16 euros la hora.

    public static void main(String[] args) {

        int hora, sueldo1, sueldo2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero de horas semanales : ");
        hora = teclado.nextInt();
        sueldo1 = hora * 12;
        sueldo2 = (hora-40) * 16;


        if (hora<=40 ) {
            System.out.println("El sueldo semanal que le corresponde es de "+ sueldo1 +" euros");
        } else if (hora > 40){
            System.out.println("El sueldo semanal que le corresponde es de "+ sueldo2 +" euros");
        }
        else {
            System.out.println("Numero incorrecto de horas");
        }

    }

}
