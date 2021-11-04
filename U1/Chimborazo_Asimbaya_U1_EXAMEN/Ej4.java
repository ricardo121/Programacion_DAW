package Examen_U1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String args[] ) {

        int gramos  , material  , procesado, premium ;

        Scanner teclado = new Scanner(System.in);
        System.out.println( "Bienvenido a Carbonita Volando " );
        System.out.print( "Introduzca el peso de su figura en gramos: " );
        gramos = teclado.nextInt();
        System.out.print( "Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): " );
        material = teclado.nextInt();
        System.out.print( "¿Quiere posprocesado? (1=si, 2=no) " );
        procesado = teclado.nextInt();

        System.out.print( "¿Pertenece a Enjuto3D Premium? (1=si, 2=no): " );
        premium = teclado.nextInt();

        double resultado1 = 0;
        double resultado2 = 0;

        double total = 0;

        if (material==1){
            resultado1 = gramos * 0.2;
        }else if (material==2) {
            resultado1 = gramos * 0.3;
        } else if (material==3) {
            resultado1 = gramos * 0.5;
        }else if (material==4) {
            resultado1 = gramos * 0.7;
        }


        if (procesado == 1){
            resultado2= resultado1 + 3;
        }else if (procesado == 2){
            resultado2= resultado1;
        }

        if (premium == 1){
            total = resultado2;
        }else if (premium== 2){
            total = resultado2+2;
        }


        System.out.println( "El coste total de la pieza es: "+ total);


    }
}
