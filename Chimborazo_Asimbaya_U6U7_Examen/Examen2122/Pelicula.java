package Examen2122;



import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable, Comparable<Pelicula> {

    private String titulo;
    private int anioEstreno;
    private String pais;
    private String genero;
    private String director;
    private Integer idPelicula;

    private static Integer contador = 0;

    public Pelicula(String titulo, int anioEstreno, String pais, String genero, String director){

        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.pais = pais;
        this.genero = genero;
        this.director = director;
        this.idPelicula = contador;
        contador++;

    }




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Pelicula.contador = contador;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anioEstreno=" + anioEstreno +
                ", pais='" + pais + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", idPelicula=" + idPelicula +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelicula)) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo) && Objects.equals(idPelicula, pelicula.idPelicula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, idPelicula);
    }

    @Override
    public int compareTo(Pelicula pelicula) {
        return getTitulo().compareTo(pelicula.getTitulo());
    }
}
