import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class conector {
    Connection con;
    public Connection conexion(){

        try{
            //Para decirle al programa que base de datos conectarse
            con = DriverManager.getConnection("jdbc:sqlserver://juanes.database.windows.net:1433;database=pruebaDB;user=JuanAdmin@juanes;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","JuanAdmin","2b6c3bC2@");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Conexion no establecida");
        }

        return con;
    }
}