package T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    //Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada clase está compuesta por 5 alumnos.
    //Se pide leer las notas (números enteros) de cada uno de los alumnos en el primer trimestre, luego, las del segundo, y luego, las del tercero.
    //Debemos mostrar, al final, la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición pos
    //(que se lee por teclado). (Podéis hacerlo usando 3 vectores -uno por trimestre-, o usando una matriz bidimensional en la que las filas sean
    //los trimestres y las columnas los alumnos).

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] datos = new int [3][5];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++){

                datos[i][j] = i;

            }

        }

        System.out.println(Arrays.deepToString(datos));

        System.out.print( "Dime el alumno: " );
        int alumno = teclado.nextInt();

        int sumaAlumno = 0;
        int sumaTrimestre1 = 0;
        int sumaTrimestre2 = 0;
        int sumaTrimestre3 = 0;


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++){

                if (i==0){

                    sumaTrimestre1 += datos[i][j];

                }else if (i==1){

                    sumaTrimestre2 += datos[i][j];

                }else if (i==2){

                    sumaTrimestre3 += datos[i][j];

                }

                if (j==alumno){

                    sumaAlumno += datos[i][j];

                    //System.out.println( "Notas del alumno: "+ datos[i][j]);

                }

            }

        }


        System.out.println( "Media Primer Trimestre:"+ sumaTrimestre1/5 );
        System.out.println( "Media Segundo Trimestre:"+ sumaTrimestre2/5 );
        System.out.println( "Media Tercer Trimestre:"+ sumaTrimestre3/5 );

        System.out.println( "Media del alumno:"+ sumaAlumno/3 );

    }
}
