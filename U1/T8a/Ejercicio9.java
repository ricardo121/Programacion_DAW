package T8a;

import java.util.Scanner;

public class Ejercicio9 {
    //Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
    //Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1. Los árboles se identifican
    //mediante etiquetas con números correlativos, comenzando en 0.

    public static void main(String[] args) {

        int altura ,cont1 , altura_max, cont2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca altura de arbol : ");
        altura = teclado.nextInt();
        cont1=0;
        altura_max=0;
        cont2= 0;

        while (altura!=-1){
            cont1++;

            if (altura>=altura_max){
                altura_max=altura;
                cont2=cont1;
            }

            System.out.print("Introduzca altura de arbol : ");
            altura = teclado.nextInt();

        }

        System.out.println("El arbol mas alto es : " + (cont2-1)  );
    }

}
