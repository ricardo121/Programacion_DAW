package T2;

import java.util.Scanner;

public class Ejercicio8 {
    //Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con "Javalín, javalón", para después
    //hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco) y a continuación expresan el mensaje.
    //Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio, más o menos prolongado y
    //la coletilla "javalén, len, len". Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita en el idioma de Javalandia
    //(en cualquiera de sus dialectos), y en caso afirmativo, nos muestre el mensaje sin muletillas.

    public static void main(String[] args) {

        String frase, muletilla1, muletilla2;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la frase: ");
        frase = teclado.nextLine();

        int longitud = frase.length();

        System.out.println(" ");

        muletilla1 = "Javalín, javalón     ";
        muletilla2 = "    javalén, len, len";

        int longitudMuletilla1 = muletilla1.length();
        int longitudMuletilla2 = muletilla2.length();

        //System.out.println("Frase : "+ longitud);
        //System.out.println("Muletilla 1 : "+ longitudMuletilla1);
        //System.out.println("Muletilla 2 : "+ longitudMuletilla2);


        if (frase.substring(0,longitudMuletilla1).equalsIgnoreCase(muletilla1)) {

            System.out.println("la frase está escrita en el idioma de Javalandia");
            System.out.println(frase.substring(longitudMuletilla1,longitud));

        } else if (frase.substring(longitud - longitudMuletilla2, longitud).equalsIgnoreCase(muletilla2)){

            System.out.println("la frase está escrita en el idioma de Javalandia");
            System.out.println(frase.substring(0,longitud - longitudMuletilla2));

        }else{

            System.out.println("No es un dialecto de jalandia");

        }

    }

}