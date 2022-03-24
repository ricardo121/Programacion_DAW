package Entregable2122;

import java.util.*;
import java.io.*;

public class Exchange {

    private ArrayList<ParCotizacion> listaCotizacion = new ArrayList<>();
    private Map<Divisa, List<ParCotizacion>> mapa;

    public Exchange(){

        this.mapa = new HashMap<>();

    }


    public void mostrarDivisasOrdenadas() {
        Set<Divisa> completa = new TreeSet<>(new Comparator<Divisa>() {
                            @Override
                            public int compare(Divisa d1, Divisa d2) {

                                return d1.getSimbolo().compareTo(d2.getSimbolo());
                            }
                        });

        System.out.println(completa);
    }




    public void obtenerCotizaciones(String simbolo){

    }



    public void mostrarCotizacionesAlAlzaUnaHora(){

    }

    public void addCotizacion(ParCotizacion cotizacion){

        listaCotizacion.add(cotizacion);

        //System.out.println(listaCotizacion);
    }




    public void cargarAlumnos() {
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("ficheros/fichero.bin"))) {
            Set<ParCotizacion> completa = (Set<ParCotizacion>) in.readObject();
            mapa.clear();
            System.out.println("Mapa borrado");
            System.out.println(mapa);
            Iterator<ParCotizacion> it = completa.iterator();
            while (it.hasNext()) {
                ParCotizacion a = it.next();
                addCotizacion(a);
            }
            System.out.println("Mapa cargado");
            System.out.println(mapa);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }



    public void guardarCotizaciones() {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("ficheros/gestion_alixar.bin"))) {
            Set<ParCotizacion> completa = new TreeSet<>();
            Set<Map.Entry<Divisa, List<ParCotizacion>>> entradas = mapa.entrySet();
            Iterator<Map.Entry<Divisa, List<ParCotizacion>>> it = entradas.iterator();
            while (it.hasNext()) {
                Map.Entry<Divisa, List<ParCotizacion>> entrada = it.next();
                completa.addAll(entrada.getValue());
            }
            out.writeObject(completa);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
