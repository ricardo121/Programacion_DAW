package Examen_2122;

public class Integrante {


    private String nombre;
    private int edad;
    private String localidad;
    private int numParticipante;


    public Integrante(String nombre, int edad, String localidad, int numParticipante){

        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
        this.numParticipante = numParticipante;

    }


    public String getNombre(){
        return  nombre;
    }
    public int getEdad(){
        return  edad;
    }
    public String getLocalidad(){
        return  localidad;
    }
    public int getNumParticipante(){
        return  numParticipante;
    }


    public void setNombre( String  nombre){
        this.nombre = nombre;
    }
    public void setEdad( int edad){
        this.edad = edad;
    }
    public void setLocalidad( String  localidad){
        this.localidad = localidad;
    }
    public void setNumParticipante( int numParticipante){
        this.numParticipante = numParticipante;
    }


}
