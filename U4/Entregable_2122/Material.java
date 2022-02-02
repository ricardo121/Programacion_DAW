package Entregable_2122;


import Entregable_1920.Pizzeria.Pizza;

import java.util.Scanner;

public class Material {


    private String descripcion;
    private String proveedor ;
    private int unidad ;
    private double precio;
    static double IVA;

    public Material(String descripcion, String proveedor, int unidad, double precio){

        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.unidad = getUnidad(unidad);
        this.precio = precio;

    }


    public Material(String descripcion, int unidad, double precio){

        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.unidad = getUnidad(unidad);
        this.precio = precio;

    }


    public static void cambiarIVA(double nuevoIVA){

        IVA = nuevoIVA;

    }

    public static void mostrarIVA(){

        System.out.println("Iva que se esta aplicando actualmente: " + IVA);
        System.out.println("\n");

    }


    public int getUnidad(int unidad){

            if (unidad>=0 && unidad<=10000){
                return unidad;
            }else {
                System.out.println("Unidad incorrecta inserte una entre 0 - 10.000" );
                unidad = 0;
                return unidad;
            }

    }


    public void mostrarInformacion(){

        System.out.println("MATERIAL ");
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Unidad: " + unidad);
        System.out.println("Precio: " + precio);
        System.out.println("\n");
    }




}
