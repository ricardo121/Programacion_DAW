package Examen2122;

import Entregable2021.Alumno;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable ,Comparable<Actor>  {




    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Integer idActor;

    private static Integer contador = 0;

    public Actor(String nombre, String apellido, String nacionalidad){

        setNombre(nombre);
        setApellido(apellido);
        setNacionalidad(nacionalidad);
        this.idActor = contador;
        contador++;

    }

    public Actor(){
        contador++;

    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getIdActor() {
        return idActor;
    }

    public void setIdActor(Integer idActor) {
        this.idActor = idActor;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Actor.contador = contador;
    }



    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", idActor=" + idActor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return Objects.equals(nombre, actor.nombre) && Objects.equals(idActor, actor.idActor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, idActor);
    }

    @Override
    public int compareTo(Actor actor) {
        return getNombre().compareTo(actor.getNombre());
    }

}
