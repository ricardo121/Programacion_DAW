package T1;
import java.util.Scanner;

public class Ejercicio3 {
    //Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.Para distinguir un caso de otro se le pasará
    //un número 1 (para área) o 2 (para volumen). Además, hemos de pasarle a la función el radio de la base y la altura.

    public static void calcular(int radio, int altura, int opcion) {

        if ( opcion == 1 ) {
            System.out.println( "Area: ");
            System.out.println( 2 * Math.PI * radio * ( altura + radio) );
        }
        else if ( opcion == 2){
            System.out.println( "Volumen: ");
            System.out.println( Math.PI* radio * radio * altura);
        }
        else {
            System.out.println( "No hay mas opciones" );
        }

    }

    public static void main(String args[]) {

        int radio, altura, opcion;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor del radio : ");
        radio = teclado.nextInt();
        System.out.print("Valor del altura : ");
        altura = teclado.nextInt();
        System.out.println("1.Calcular área\n" +
                "\n" +
                "2.Calcular volumen");
        System.out.println("");
        System.out.print("Elija una opcion (1,2) : ");
        opcion = teclado.nextInt();


        calcular(radio,altura,opcion);
    }
}



