package Entregable_2021_Tarde;

import java.util.Scanner;

public class Ejercicio2 {

    //Crea una función con la siguiente cabecera:
    //
    //public String convierteEnMorse(int n)
    //
    //Esta función convierte el número n al sistema Morse y lo devuelve en una
    //cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
    //Morse. Utiliza esta función en un programa para comprobar que funciona bien.
    //Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
    //desde el programa principal.
    //
    //1 . _ _ _ _ 6 _ . . . .
    //2 . . _ _ _ 7 _ _ . . .
    //3 . . . _ _ 8 _ _ _ . .
    //4 . . . . _ 9 _ _ _ _ .
    //5 . . . . . 0 _ _ _ _ _

    public static String convierteEnMorse(int n) {

        String morse = "";
        int numero,posicion,resultado;
        int falta,numeroInvertido,resto;
        int cont;

        while(n<=0);
        falta=n;
        numeroInvertido=0;
        resto=0;
        cont=0;




        while(falta!=0)
        {
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }


        falta=numeroInvertido;

        resto=0;

        while(falta!=0)
        {


                resto = falta % 10;

            if (resto==1){
                morse = morse + ". _ _ _ _";
            }else if (resto==2){
                morse = morse + ". . _ _ _";
            }else if (resto==3){
                morse = morse + ". . . _ _";
            }else if (resto==4){
                morse = morse + ". . . . _";
            }else if (resto==5){
                morse = morse + ". . . . .";
            }else if (resto==6){
                morse = morse + "_ . . . .";
            }else if (resto==7){
                morse = morse + "_ _ . . .";
            }else if (resto==8){
                morse = morse + "_ _ _ . .";
            }else if (resto==9){
                morse = morse + "_ _ _ _ .";
            }else if (resto==0){
                morse = morse + "_ _ _ _ _";
            }

            //resultado = resultado * 10 + resto;
                falta = falta / 10;


        }




        return morse;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();

        System.out.print("El numero " + num +" en morse es : "+ convierteEnMorse(num));


    }
}
