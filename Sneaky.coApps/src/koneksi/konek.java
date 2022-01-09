
package koneksi;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class konek {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3307/sneakydb";//url database
            String user = "root"; //user database
            String pass = ""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = (Connection) DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.err.println("Koneksi gagal "+e.getMessage());//perintah menampilkan error    
        }
        return mysqlconfig;
    }

    

    

    
    
}
