import java.sql.*;
import java.util.Scanner;

public class MostrarProductoCategoria {



    public static void informeCategoria() {


        Connection c = ConexionBD.getConnection();
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un precio: ");
            String cn = sc.nextLine();

            //String query = "select * from products where customerNumber="+cn;
            String sql = "select * from productLines pl JOIN products p where pl.productline = ? ";
            PreparedStatement statement = c.prepareStatement(sql);

            //Establezco los parámetros
            statement.setString(1,cn);

            //Mostrar la consulta
            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery();

            while (rs.next()){

                String name = rs.getString("productName");

                System.out.println("-------------------------");
                System.out.println("productName: " + name);
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }



    public static void FiltroPrecio() {

        //Scanner sc = new Scanner(System.in);

        Connection c = ConexionBD.getConnection();
        try {




            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca una Categoria: ");
            String cn = sc.nextLine();

            //String query = "select * from products where customerNumber="+cn;
            String sql = "select * from productlines pl JOIN products p where pl.productline = ? ";
            PreparedStatement statement = c.prepareStatement(sql);

            //Establezco los parámetros
            statement.setString(1,cn);

            //Mostrar la consulta
            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery();

            while (rs.next()){

                String name = rs.getString("productName");

                System.out.println("-------------------------");
                System.out.println("productName: " + name);
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
