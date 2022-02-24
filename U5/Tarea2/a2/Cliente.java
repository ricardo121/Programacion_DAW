package Tarea2.a2;

import java.util.Objects;

public class Cliente implements Comparable {

    protected String dni;
    protected String nombre;
    protected int edad;
    protected double saldo;


    public Cliente(String dni, String nombre, int edad, double saldo){

        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;

    }


    public String toString(){

        String resultado = " ";

        resultado += "DNI: "+ dni + ", Nombre: " + nombre + ", Edad: " + edad + ", Saldo: " + saldo;

        return resultado;
    }


    public void equals(){



    }


    @Override
    public int compareTo(Object o) {

        Cliente that = (Cliente) o;

        return dni.compareTo(that.dni);

    }

}
