import java.sql.*;
import java.util.Scanner;

public class GestionarEmpleado {


    public static void insertEmployee(Employee employee) throws SQLException{
        Connection con=ConexionBD.getConnection();

        String sql="INSERT INTO employees VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,employee.getEmployeeNumber());
        sentencia.setString(2,employee.getLastName());
        sentencia.setString(3,employee.getFirstName());
        sentencia.setString(4,employee.getExtension());
        sentencia.setString(5,employee.getEmail());
        sentencia.setString(6, employee.getOfficeCode());
        sentencia.setInt(7,employee.getReportsTo());
        sentencia.setString(8,employee.getJobTittle());

        sentencia.executeUpdate();
    }


}
