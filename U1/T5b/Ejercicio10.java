package T5b;

import java.util.Scanner;

public class Ejercicio10 {
    //Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a la medianoche.

    public static void main(String[] args) {

        int hora, minutos, resultadom, resultadoh, segundos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una Hora y minutos: ");
        System.out.println("Por favor, introduzca la hora: ");
        hora= teclado.nextInt();
        System.out.println("Por favor, introduzca los minutos ");
        minutos= teclado.nextInt();


        if (hora==24 && minutos==0) {
            System.out.print("Son las 12 de medianoche");
        }
        else if (hora==23 && minutos<60){
            resultadom = (60-minutos) * 60;
            segundos = resultadom;

            System.out.print("Segundos para ser MediaNoche: " + segundos);
        }
        else if (hora<23 && minutos<60) {
            resultadoh = (23 - hora) * 60 * 60;
            resultadom = (60 - minutos) * 60;
            segundos = resultadoh + resultadom;

            System.out.print("Segundos para ser MediaNoche: " + segundos);

        }
        else {
            System.out.print("Numero incorrectos");
        }

    }
}
