package T2;

import java.util.Scanner;

public class Ejercicio9 {
    //Realizar un programa que realice lo siguiente:
    //
    //a) Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
    //b) Mostrar por consola su capacidad y longitud.
    //c) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Chicharrones de Chiclana"
    // y mostrarla por consola.
    //d) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones"
    // y mostrarla por consola. El número entero 5000 debe estar almacenado en un int inicialmente.
    //e) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones
    //   ven Chiclana" y mostrarla por consola.
    //f) Almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese String por consola.
    //g) Mostrar por  consola  la capacidad y longitud del StringBuilder final.
    //h) Realizar el mismo ejercicio con la clase StringBuffer.
    //
    //Ejemplo de ejecución:
    //
    //El StringBuilder es : Alabí Alixar
    //Capacidad inicial = 29
    //Longitud inicial = 12
    //Chicharrones
    //Hay 5000 Chicharrones
    //Hay 5000 Chicharrones en Chiclana
    //lana
    //Capacidad final = 34
    //Longitud final = 34
    //


    public static void main(String[] args) {

        String frase, muletilla1, muletilla2;

        StringBuilder s = new StringBuilder("Alabí Alixar");

        int capacidad = s.capacity();
        int longitud = s.length();

        //Apartado A y B
        System.out.println("El StringBuilder es : "+ s);
        System.out.println("Capacidad inicial : "+ capacidad);
        System.out.println("Longitud inicial : "+ longitud);

        //Apartado C
        s.replace(0,s.length(),"Chicharrones de Chiclana");
        System.out.println( s );

        //Apartado D
        int numero = 500;
        s.delete(0,s.length());
        s.insert(0,"Hay ");
        s.insert(s.length(),numero);
        s.insert(s.length()," Chicharrones");
        System.out.println( s );

        //Apartado E

        s.insert(s.length()," en Chiclana");
        System.out.println( s );

        //Apartado F

        s.substring(s.length()-4,s.length());
        String fraseFinal = s.toString();
        System.out.println( s.substring(s.length()-4,s.length()) );
        System.out.println( fraseFinal );

        //Apartado G

        System.out.println("Capacidad final : "+ s.capacity());
        System.out.println("Longitud final : "+ s.length());


    }

}
