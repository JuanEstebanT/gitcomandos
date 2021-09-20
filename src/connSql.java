import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class connSql extends conector{
    public static void main(String[] args) {
        conector con = new conector();
        Connection conexion = con.conexion();
        String query = "SELECT * FROM dbo.\"Alumnos\"";
        try{
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = null;
            rs= ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
            }
        }catch (Exception a){
            a.printStackTrace();
        }
    }
}