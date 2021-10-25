package T8b;

import java.util.Scanner;

public class Ejercicio1 {
    //Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá la combinación para
    //abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha
    //abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.

    public static void main(String[] args) {

        int num1 ,num2, num3, num4, cont;
        Scanner teclado = new Scanner(System.in);

        int comb1=1;
        int comb2=2;
        int comb3=3;
        int comb4=4;
        cont = 0;
        boolean resultado = false;

        while (cont<4 && resultado==false){

            System.out.print("Introduzca combinacion: ");
            num1 = teclado.nextInt();
            num2 = teclado.nextInt();
            num3 = teclado.nextInt();
            num4 = teclado.nextInt();

            if (num1==comb1 && num2==comb2 && num3==comb3 && num4==comb4){
                resultado = true;
            }else{
                resultado = false;
                System.out.println("Lo siento, esa no es la combinación");
            }

        }

        System.out.print("La caja fuerte se ha abierto satisfactoriamente");

    }
}
