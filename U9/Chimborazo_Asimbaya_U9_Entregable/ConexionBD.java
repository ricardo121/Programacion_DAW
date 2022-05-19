
import java.sql.*;

public class ConexionBD {


    private static Connection con=null;
    public static Connection getConnection(){
        try{
            if( con == null ){
                con = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
                System.out.println("Conection Succesfull");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }


}
