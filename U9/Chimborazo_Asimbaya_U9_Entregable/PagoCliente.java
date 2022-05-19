import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class PagoCliente {


    public static void InfoPagos() {

        //Scanner sc = new Scanner(System.in);

        Connection c = ConexionBD.getConnection();
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un precio: ");
            int cn = sc.nextInt();


            String sql = "SELECT * from customers c JOIN payments where c.customerNumber = ?";
            PreparedStatement statement = c.prepareStatement(sql);

            statement.setInt(1,cn);

            System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement.toString());

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                String name = rs.getString("customerName");

                String number = rs.getString("checkNumber");

                Date fecha = rs.getDate("paymentDate");


                double cantidad = rs.getDouble("amount");

                System.out.println("-------------------------");
                System.out.println("customerName: " + name);
                System.out.println("checkNumber: " + number);
                System.out.println("paymentDate: " + fecha);
                System.out.println("amount: " + cantidad);
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

