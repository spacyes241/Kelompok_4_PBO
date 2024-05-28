/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wi.go.jim;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException; 
import javax.swing.JOptionPane;
/**
 *
 * @author Farrel Haykal
 */
public class Koneksi {
    private static Connection mySqlConnection = null;
    private static String DB = "jbdc:mysql://localhost/tubespbo";
    private static String user = "root";
    private static String pass = "";
    public static Connection KoneksiDB()throws SQLException{
        if(mySqlConnection == null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mySqlConnection = DriverManager.getConnection(DB,user,pass);    
            } catch (SQLException e){
                e.getMessage();
            }
        } return mySqlConnection;
    }
}
