package Examen_2122;

import Entregable_2122.Multimedia;

public abstract class Agrupacion implements Comparable {


    protected String nombre;
    protected String autor;
    protected String autor_musica;
    protected String autor_letra;
    protected String tipo;
    static int contAgrupaciones = 0;


    public Agrupacion(String nombre, String autor, String autor_musica, String autor_letra, String tipo){


        this.nombre = nombre;
        this.autor = autor;
        this.autor_musica = autor_musica;
        this.autor_letra = autor_letra;
        this.tipo = tipo;
        contAgrupaciones++;

    }

    public static int getContAgrupaciones(){

        return  contAgrupaciones;

    }

    public static void setContAgrupaciones( int cont){

        contAgrupaciones = cont;

    }

    public abstract void cantar_la_presentacion();

    public abstract void hacer_tipo();



    public String getNombre(){
        return  nombre;
    }

    public String getAutor(){
        return  autor;
    }

    public String getAutor_musica(){
        return  autor_musica;
    }

    public String getAutor_letra(){
        return  autor_letra;
    }

    public String getTipo(){
        return  tipo;
    }


    public void setNombre( String nombre){
        this.nombre = nombre;
    }

    public void setAutor( String autor){
        this.autor = autor;
    }

    public void setAutor_musica( String autor_musica){
        this.autor_musica = autor_musica;
    }

    public void setAutor_letra( String autor_letra ){
        this.autor_letra = autor_letra;
    }

    public void setTipo( String tipo){
        this.tipo = tipo;
    }


    public String toString(){

        String resultado = " ";

        resultado += "Nombre: " + nombre + " ,Autor: " + autor + " ,Autor Musica: " + autor_musica +
                " ,Autor de la Letra: " + autor_letra + " ,Tipo(Disfraz): " + tipo;

        return resultado;
    }


    public int compareTo(Object o) {

        Agrupacion that = (Agrupacion) o;

        return nombre.compareTo(that.nombre);

    }

}
