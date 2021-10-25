package T5b;

import java.util.Scanner;

public class Ejercicio7 {
    //Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).

    public static void main(String[] args) {

        int x, y, z, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        x = teclado.nextInt();
        System.out.print("Introduzca un número : ");
        y = teclado.nextInt();
        System.out.print("Introduzca un número : ");
        z = teclado.nextInt();


        resultado= (x+y+z)/3;
        System.out.println("Media de los tres numeros solicitados es: ");
        if (resultado<=4){
            System.out.print("INSUFICIENTE");
        }else if (resultado==5){
            System.out.print("SUFICIENTE");
        }
        else if (resultado==6){
            System.out.print("BIEN");
        }
        else if (resultado>=7 && resultado<=8){
            System.out.print("NOTABLE");
        }
        else if (resultado>=9 && resultado<=10){
            System.out.print("SOBRESALIENTE");
        }else{
            System.out.print("Valor Incorrecto");
        }


    }

}
