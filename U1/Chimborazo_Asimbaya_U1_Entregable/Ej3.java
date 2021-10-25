package Entregable_U1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main( String args[] ) {

        int num1  , num2  , club , resultado1, resultado2, resultado3;
        String dia;

        Scanner teclado = new Scanner(System.in);
        System.out.println( "Pedidos Pitanza Feliz " );
        System.out.print( "Número de hamburguesas básicas: " );
        num1 = teclado.nextInt();
        System.out.print( "Número de hamburguesas gourmet: " );
        num2 = teclado.nextInt();
        System.out.print( "Día de la semana: " );
        dia = teclado.next();

        System.out.print( "¿Pertenece al club Fanegas? (s/n): " );
        club = teclado.nextInt();
        resultado1=0;
        resultado2=0;
        resultado3=0;
        double descuento=0;
        double resultado_final=0;

        if (dia.equalsIgnoreCase("Martes")){
            resultado1= 3 * num1;
            if (num2==1) {
                resultado2 = 5 * num2;

            }else if (num2==2){
                resultado2 = (9 * (num2/2));
            }else if (num2>2 && num2%2!=0){
                resultado2 = ( (9 *(num2/2))+(1*5));
            }else if(num2>2 && num2%2==0){
                resultado2 = (9 * (num2/2));
            }

            resultado3 = resultado1+resultado2;

        }else if (dia.equalsIgnoreCase("Miercoles")){
            resultado1 = 3 * num1;
            resultado2 = 5 * num2;
            resultado3 = resultado1+resultado2;

        }else if(dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Jueves") || dia.equalsIgnoreCase("Viernes") || dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Domingo")){

            resultado1 = 3 * num1;
            resultado2 = 5 * num2;
            resultado3 = resultado1+resultado2;
        }

        if (club == 0){
            resultado_final = resultado3;
        }else if (club == 1){
            descuento = resultado3 * 0.12;
            resultado_final = resultado3 - descuento;
        }


        System.out.println( "Aquí tiene su pedido. Gracias por su compra");

        System.out.println( "Hamburguesas básicas: "+ num1);
        System.out.println( "Hamburguesas gourmet: "+ num2);
        System.out.println( "Total: "+ resultado3);
        System.out.println( "Descuento: "+ descuento);
        System.out.print( "A pagar: "+ resultado_final);

    }
}
