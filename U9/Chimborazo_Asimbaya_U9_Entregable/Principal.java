public class Principal {

    public static void main(String[] args) {


        MostrarProductos mostrar = new MostrarProductos();
        mostrar.FiltroPrecio();


        PagoCliente pago = new PagoCliente();
        pago.InfoPagos();


        MostrarProductoCategoria m2 = new MostrarProductoCategoria();

        m2.FiltroPrecio();
    }

}
