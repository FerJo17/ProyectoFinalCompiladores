package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexionMYSQL {

    public static final String URL = "jdbc:mysql://localhost:3306/?useTimezone=true&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Ferjo2003*";
    public static final String NOMBRE_BASE_DE_DATOS = "proyectoFinal";

    public static Connection Conectarbase() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conectado al servidor de base de datos");
            crearBaseDeDatos(con);
            con.setCatalog(NOMBRE_BASE_DE_DATOS); // Establecer la base de datos a usar
            crearTabla(con);
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

    private static void crearTabla(Connection con) {
        try {
            Statement stmt = con.createStatement();
            // Verificar si la tabla existe
            String consultaTabla = "SHOW TABLES LIKE 'tabla_simbolos'";
            if (!stmt.executeQuery(consultaTabla).next()) {
                // Si la tabla no existe, crearla
                String crearTablaSQL = "CREATE TABLE tabla_simbolos (Lexema varchar(100), Codigo_Categoria integer, Codigo integer, primary key(Codigo));";
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

