
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static final String URL="jdbc:mysql://localhost:3306/pruebas"+"?useTimezone=true&serverTimezone=UTC";  
    public static final String USERNAME="root";
    public static final String PASSWORD="sierraF017";
    Connection con=null;
    
       public static Connection Conectarbase(){
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conectado a la BD");
            return con;
        } 
        catch(Exception err){
          JOptionPane.showMessageDialog(null,err);
          return null;
        }
   }   
}
