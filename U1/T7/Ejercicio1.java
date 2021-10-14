package T7;

public class Ejercicio1 {
    //Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.

    public static void main( String args[] ) {

        int a = 1; // Dos enteros con valores prefijados
        int b = 2;

        int c = a;
        int d = b;

        a=c;
        b=d;

        System.out.println("Variable A: "+ b );
        System.out.println("Variable B: "+ a);
    }
}
