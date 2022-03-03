package Examen_2122;

public class Romancero extends Agrupacion implements Callejera {

    private String tematica;

    public Romancero(String nombre, String autor, String autor_musica, String autor_letra, String tipo, String tematica){

        super(nombre,autor,autor_musica,autor_letra,tipo);
        this.tematica = tematica;

    }


    public String getTematica(){
        return  tematica;
    }


    public void setTematica( String tematica){
        this.tematica = tematica;
    }


    @Override
    public void cantar_la_presentacion(){
        System.out.println("Cantando la presentación del Romancero con nombre " + nombre);
    }

    @Override
    public void hacer_tipo(){
        System.out.println("El Romancero " + nombre + " va de " + tipo);
    }

    @Override
    public void amo_a_escucha(){
        System.out.println("Amo a escucha el Romancero" + nombre );
    }

    @Override
    public String toString(){

        String resultado = " ";

        resultado += super.toString() + " ,Tematica: " + tematica;

        return resultado;
    }


}
