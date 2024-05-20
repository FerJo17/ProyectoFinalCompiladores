package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ConexionMYSQL {

    public static final String URL = "jdbc:mysql://localhost:3306/?useTimezone=true&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "sierraF017";
    public static final String NOMBRE_BASE_DE_DATOS = "proyectoFinal";

    public static Connection Conectarbase() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conectado al servidor de base de datos");
            crearBaseDeDatos(con);
            con.setCatalog(NOMBRE_BASE_DE_DATOS); // Establecer la base de datos a usar
            crearTablaCategorias(con);
            crearTablaSimbolos(con);
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }
        return con;
    }

    private static void crearBaseDeDatos(Connection con) {
        try {
            Statement stmt = con.createStatement();
            // Verificar si la base de datos existe
            String consultaBD = "SHOW DATABASES LIKE '" + NOMBRE_BASE_DE_DATOS + "'";
            if (!stmt.executeQuery(consultaBD).next()) {
                // Si la base de datos no existe, crearla
                String crearBDSQL = "CREATE DATABASE " + NOMBRE_BASE_DE_DATOS;
                stmt.executeUpdate(crearBDSQL);
                System.out.println("Base de datos '" + NOMBRE_BASE_DE_DATOS + "' creada");
            } else {
                System.out.println("La base de datos '" + NOMBRE_BASE_DE_DATOS + "' ya existe");
            }
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
private static void crearTablaCategorias(Connection con) {
    try {
        Statement stmt = con.createStatement();

        // Verificar si la tabla existe
        String consultaTabla = "SHOW TABLES LIKE 'tabla_categorias'";
        ResultSet rs = stmt.executeQuery(consultaTabla);
        if (!rs.next()) {
            // Si la tabla no existe, crearla
            System.out.println("La tabla no existe, creando tabla...");
            String crearTablaSQL = "CREATE TABLE tabla_categorias (Codigo INTEGER PRIMARY KEY, Categoria VARCHAR(50));";
            stmt.executeUpdate(crearTablaSQL);

            // Insertar datos en la tabla solo si no hay datos presentes
            String contarFilasSQL = "SELECT COUNT(*) FROM tabla_categorias";
            ResultSet rsCount = stmt.executeQuery(contarFilasSQL);
            if (rsCount.next()) {
                int rowCount = rsCount.getInt(1);
                System.out.println("Número de filas en la tabla: " + rowCount);
                if (rowCount == 0) {
                    System.out.println("La tabla está vacía, insertando datos...");
                    String insertarDatosSQL = "INSERT INTO tabla_categorias (Codigo, Categoria) VALUES "
                            + "(100, 'Palabras clave'), "
                            + "(200, 'Identificadores'), "
                            + "(300, 'Operadores'), "
                            + "(400, 'Constantes numéricas'), "
                            + "(500, 'Constantes de carácter o cadena'), "
                            + "(600, 'Símbolos especiales');";
                    stmt.executeUpdate(insertarDatosSQL);
                    System.out.println("Datos insertados correctamente.");
                }
            }
            rsCount.close();
        } else {
            System.out.println("La tabla ya existe con Datos.");
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        e.printStackTrace(); // Para ver el stack trace completo en la consola
    }
}
      
    private static void crearTablaSimbolos(Connection con) {
        try {
            Statement stmt = con.createStatement();
            // Verificar si la tabla existe
            String consultaTabla = "SHOW TABLES LIKE 'tabla_simbolos'";
            if (!stmt.executeQuery(consultaTabla).next()) {
                // Si la tabla no existe, crearla
                String crearTablaSQL = "CREATE TABLE tabla_simbolos (Lexema varchar(100), Codigo_Categoria integer, Codigo integer, primary key(Codigo), foreign key(Codigo_Categoria) references tabla_categorias(Codigo));";
                stmt.executeUpdate(crearTablaSQL);
            } else {
            }
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }        
    
    public static void main(String[] args) {
        Conectarbase();
    }
}

