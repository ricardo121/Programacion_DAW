package T8b;

import java.util.Scanner;

public class Ejercicio7 {
    //Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

    public static void main(String[] args) {

        int num ,resto ,aux , resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero: ");
        num = teclado.nextInt();
        aux = num;
        resultado = 0;

        while (aux!=0){

            //Obtienes el resto que es el ultimo numero del introducido y sera el primero del nuevo numero
            resto=aux%10;
            //metes el numero obtenido antes y lo metes en una variable llamda resultado
            resultado = resultado * 10 + resto;
            //Al realizar la division quitas el primer digito del numero introducido
            aux = aux / 10;

        }

            System.out.print("Numero Introducido alreves: ");
            System.out.print(resultado);

        }

}
