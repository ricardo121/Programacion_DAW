package Entregable2122;

import java.io.*;

public class Divisa implements Comparable<Divisa>,Serializable {


    private String nombre;
    private String simbolo;
    private Integer id;

    private static Integer contador = 0;

    public Divisa(String nombre, String simbolo){
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.id = contador;
        contador++;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Divisa.contador = contador;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + " simbolo: " + simbolo + " Id: " + id ;
    }

    @Override
    public int compareTo(Divisa alumno) {
        return nombre.compareTo(alumno.getSimbolo());
    }
}
