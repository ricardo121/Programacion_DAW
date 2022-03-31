package Examen2122;


import java.io.*;
import java.util.*;

public class Filmaffinity {


    private Set<Actor> conjuntoActores;
    private Set<Pelicula> conjuntoPeliculas;
    private Map<Pelicula, Set<Actor>> mapaPeliculas;
    private Map<Actor, Set<Pelicula>> mapaActores ;



    public Filmaffinity(){

        this.conjuntoPeliculas = new HashSet<>();
        this.conjuntoActores=  new HashSet<>();

        this.mapaPeliculas = new HashMap<>();
        this.mapaActores= new HashMap<>();

    }





    public void addPeliculaActor(Pelicula p, Actor a){

        conjuntoActores.add(a);
        conjuntoPeliculas.add(p);

        if (mapaActores.containsKey(a)) {
            mapaActores.get(a).add(p);
        } else {
            Set<Pelicula> conjPeli = new LinkedHashSet<>();
            conjPeli.add(p);
            mapaActores.put(a, conjPeli);
        }


        if (mapaPeliculas.containsKey(p)) {
            mapaPeliculas.get(p).add(a);
        } else {
            Set<Actor> conjAct = new LinkedHashSet<>();
            conjAct.add(a);
            mapaPeliculas.put(p, conjAct);
        }


        //System.out.println("Peli:" +conjuntoPeliculas);
        //System.out.println(" Actor:" +conjuntoActores);
        //System.out.println("Mapa Peli:" +mapaPeliculas);
        //System.out.println("Mapa Actor:" +mapaActores);
    }

    public List<Actor> getActores(Pelicula p){

        List<Actor> resultado = new ArrayList<>();


        Iterator<Pelicula> it = mapaPeliculas.keySet().iterator();

        while (it.hasNext()) {
            Pelicula base = it.next();
            if (base.getTitulo().equals(p.getTitulo())) {

            }
        }


        return resultado;

    }


    public List<Pelicula> getPeliculas(Actor a){

        List<Pelicula> resultado = new ArrayList<>();


        return resultado;

    }

    public Pelicula getPelicula(String titulo){

        Iterator<Pelicula> it = this.conjuntoPeliculas.iterator();


        while (it.hasNext()) {

            Pelicula base = it.next();



            if (base.getTitulo().equals(titulo)) {
                System.out.println("hoal "+base.getTitulo());
                return base;
            }

        }


        return null;
    }

    public void removePelicula(String titulo){

    }

    public Actor getActor(String nombre, String apellido){

        Iterator<Actor> it = this.conjuntoActores.iterator();

        while (it.hasNext()) {

            Actor base = it.next();

            if (base.getNombre().equals(nombre) && base.getApellido().equals(apellido)) {
                 return base;
            }

        }
        return null;

    }


    static Set interseccion (Set conjunto1, Set conjunto2){

        Iterator<Integer> it = conjunto1.iterator();

        Set resultado = new HashSet();

        while (it.hasNext()) {

            Integer temp = it.next();
            if (conjunto2.contains(temp)){
                resultado.add(temp);
            }

        }

        return resultado;
    }




    public void guardarDatos() {


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ficheros/filmaffinity.dat"))) {

            out.writeObject(mapaActores);
            out.writeObject(mapaPeliculas);
            out.writeObject(conjuntoActores);
            out.writeObject(conjuntoPeliculas);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }





    public void cargarDatos(){

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ficheros/filmaffinity.dat"))) {
            Pelicula p = (Pelicula) in.readObject();
            Actor a = (Actor) in.readObject();
            mapaPeliculas.clear();
            mapaActores.clear();
            System.out.println("Mapa borrado");
            System.out.println(mapaPeliculas);
            System.out.println(mapaActores);
            //Iterator<Pelicula> it = completa1.iterator();
            //while (it.hasNext()) {
               // Pelicula p = it.next();
                addPeliculaActor(p,a);
            //}
            System.out.println("Mapa cargado");
            System.out.println(mapaPeliculas);
            System.out.println(mapaActores);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }



    public Set<Actor> getConjuntoActores() {
        return conjuntoActores;
    }

    public void setConjuntoActores(Set<Actor> conjuntoActores) {
        this.conjuntoActores = conjuntoActores;
    }

    public Set<Pelicula> getConjuntoPeliculas() {
        return conjuntoPeliculas;
    }

    public void setConjuntoPeliculas(Set<Pelicula> conjuntoPeliculas) {
        this.conjuntoPeliculas = conjuntoPeliculas;
    }

    public Map<Pelicula, Set<Actor>> getMapaPeliculas() {
        return mapaPeliculas;
    }

    public void setMapaPeliculas(Map<Pelicula, Set<Actor>> mapaPeliculas) {
        this.mapaPeliculas = mapaPeliculas;
    }

    public Map<Actor, Set<Pelicula>> getMapaActores() {
        return mapaActores;
    }

    public void setMapaActores(Map<Actor, Set<Pelicula>> mapaActores) {
        this.mapaActores = mapaActores;
    }


}
