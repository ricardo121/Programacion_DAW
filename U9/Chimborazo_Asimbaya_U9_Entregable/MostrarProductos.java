import java.sql.*;
import java.util.Scanner;

public class MostrarProductos {



    public static void FiltroPrecio() {

        //Scanner sc = new Scanner(System.in);

        Connection c = ConexionBD.getConnection();
        try {




            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un precio: ");
            Double cn = sc.nextDouble();

            //String query = "select * from products where customerNumber="+cn;
            String sql = "select * from products where buyPrice < ?";
            PreparedStatement statement = c.prepareStatement(sql);

            //Establezco los parámetros
            statement.setDouble(1,cn);

            //Mostrar la consulta
            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                String code = rs.getString("productCode");

                String name = rs.getString("productName");

                System.out.println("-------------------------");
                System.out.println("orderNumber: " + code);
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
