package T5b;

import java.util.Scanner;

public class Ejercicio19 {
    //Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el fin
    //de semana. Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día
    //y hora correctos, anterior al viernes a las 15:00h

    public static void main(String[] args) {

        int dia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un dia de la semana : ");
        dia = teclado.nextInt();

        int hora, minutos, resultadom, resultadoh, segundos;
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


        if (dia==1) {
            System.out.println("Lunes");
        } else if (dia==2){
            System.out.println("Martes");
        }
        else if (dia==3){
            System.out.println("Miercoles");
        }
        else if (dia==4){
            System.out.println("Jueves");
        }
        else if (dia==5){
            System.out.println("Viernes");
        }
        else if (dia==6){
            System.out.println("Sabado");
        }
        else if (dia==7){
            System.out.println("Domingo");
        }
        else {
            System.out.println("No hay mas dias, solo 7 dias a la semana");
        }


        //Completar
    }
}
