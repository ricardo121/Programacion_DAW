package Examen_2122;


public class Cuarteto extends AgrupacionOficial implements Callejera {

    private int numMiembros;


    public Cuarteto(String nombre, String autor, String autor_musica, String autor_letra, String tipo, int puntos, int numMiembros){
        super(nombre,autor,autor_musica,autor_letra,tipo,puntos);
        this.numMiembros = numMiembros;

    }


    public int getNumMiembros(){
        return  numMiembros;
    }


    public void setNumMiembros( int numMiembros){
        this.numMiembros = numMiembros;
    }


    @Override
    public void cantar_la_presentacion(){
        System.out.println("Cantando la presentación del Cuarteto con nombre " + nombre);
    }

    @Override
    public void hacer_tipo(){
        System.out.println("El cuarteto " + nombre + " va de " + tipo);
    }


    public void caminito_del_falla(){
        System.out.println("El cuarteto " + nombre + " va caminito del falla");
    }


    public void amo_a_escucha(){
        System.out.println("Amo a escucha la Cuarteto" + nombre );
    }


    @Override
    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " ,Numero de miembros: " + numMiembros;

        return resultado;
    }

}
