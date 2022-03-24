package Entregable2122;

public class Criptomoneda extends Divisa {

    private int precio ;
    private int volumen;
    private String fechaCreacion;


    public Criptomoneda(String nombre, String simbolo, int precio, int volumen, String fechaCreacion){

        super(nombre,simbolo);
        this.precio = precio;
        this.volumen = volumen;
        this.fechaCreacion = fechaCreacion;

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return super.toString() + " precio: " + precio + " volumen: " + volumen + " Fecha de creacion: " + fechaCreacion;
    }

}
