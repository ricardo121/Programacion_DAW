package Examen_2122;

public class Coro extends AgrupacionOficial {

    private int numBandurrias;
    private  int numGuitarras;

    public Coro(String nombre, String autor, String autor_musica, String autor_letra, String tipo, int puntos, int numBandurrias, int numGuitarras){
        super(nombre,autor,autor_musica,autor_letra,tipo,puntos);
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;

    }


    public int getNumBandurrias(){
        return  numBandurrias;
    }
    public int getNumGuitarras(){
        return  numGuitarras;
    }


    public void setNumGuitarras( int numGuitarras){
        this.numGuitarras = numGuitarras;
    }


    @Override
    public void cantar_la_presentacion(){
        System.out.println("Cantando la presentación del Coro con nombre " + nombre);
    }

    @Override
    public void hacer_tipo(){
        System.out.println("El Coro " + nombre + " va de " + tipo);
    }


    public void caminito_del_falla(){
        System.out.println("El Coro " + nombre + " va caminito del falla");
    }


    @Override
    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " ,Numero de Bandurrias: " + numBandurrias + " ,Numero de Guitarras: " + numGuitarras;

        return resultado;
    }
}
