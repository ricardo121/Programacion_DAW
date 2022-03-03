package Examen_2122;

public class Chirigota extends AgrupacionOficial implements Callejera {

    private int numCuples;

    public Chirigota(String nombre, String autor, String autor_musica, String autor_letra, String tipo, int puntos, int numCuples){
        super(nombre,autor,autor_musica,autor_letra,tipo,puntos);
        this.numCuples = numCuples;

    }


    public int getNumCuples(){
        return  numCuples;
    }


    public void setNumCuples( int numCuples){
        this.numCuples = numCuples;
    }

    @Override
    public void cantar_la_presentacion(){
        System.out.println("Cantando la presentación de la Chirigota con nombre " + nombre);
    }

    @Override
    public void hacer_tipo(){
        System.out.println("La Chirigota " + nombre + " va de " + tipo);
    }


    public void caminito_del_falla(){
        System.out.println("La chirigota " + nombre + " va caminito del falla");
    }

    @Override
    public void amo_a_escucha(){
        System.out.println("Amo a escucha la Chirigota" + nombre );
    }



    @Override
    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " ,Numero de cuplés: " + numCuples ;

        return resultado;
    }

}
