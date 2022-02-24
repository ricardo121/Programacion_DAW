package Entregable_2122;


public abstract class Multimedia {

    protected String titulo;
    protected int anio_publicacion;
    static int cont_ident = 0;
    public int ident_multimedia;


    public Multimedia(String titulo, int anio_publicacion){

        this.titulo = titulo;
        this.anio_publicacion = anio_publicacion;
        this.ident_multimedia = cont_ident;
        ++cont_ident;

    }

    public abstract void dar_por_finalizado();


    public String toString(){

        String resultado = " ";

        resultado += "Titulo: " + titulo + " , Año de publicacion: " + anio_publicacion;

        return resultado;
    }


    public String getTitulo(){

        return  titulo;

    }

    public int getAnio_publicacion(){

        return  anio_publicacion;

    }

    public void setTitulo(){

        this.titulo = titulo;

    }

    public void setAnio_publicacion(){

        this.anio_publicacion = anio_publicacion;

    }


}
