
package Clases;

import static Clases.ConexionMYSQL.Conectarbase;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Funciones {
    
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    public void cargarDatos(JTable tabla, File archivo){
        //Vector que almacena los encabezados de la JTable
        Vector encabezado = new Vector();
        encabezado.addElement("Lexema");
        encabezado.addElement("Categoría Léxica");
        
        //Modelo para la tabla
        DefaultTableModel modelo = new DefaultTableModel (encabezado, 0);
        tabla.setModel(modelo);

        
    }
    
    public void limpiarTabla(JTable tabla){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        borradoTablas();
        
    }
   
    
    public void cargaBaseDatos(String lexema, String categoria){
        String lexemaCodigo = "";
        int codigoCategoria = 0;
        
        switch(categoria){
            case "Palabra Clave":
                    lexemaCodigo = lexema;
                    codigoCategoria = 100;                 
                    break;
            case "Identificador":
                    lexemaCodigo = lexema;
                    codigoCategoria = 200; 
                    break;   
            case "Operador":
                    lexemaCodigo = lexema;
                    codigoCategoria = 300; 
                    break; 
            case "Constante":
                    lexemaCodigo = lexema;
                    codigoCategoria = 400; 
                    break;                     
            case "Cadena o Caracter":
                    lexemaCodigo = lexema;
                    codigoCategoria = 500; 
                    break; 
            case "Simbolo Especial":
                    lexemaCodigo = lexema;
                    codigoCategoria = 600; 
                    break;                        
            case "Otros":
                    lexemaCodigo = lexema;
                    codigoCategoria = 700; 
                    break;                              
        }
        
    try (Connection con = Conectarbase();
         PreparedStatement pstmt = con.prepareStatement("SELECT 1 FROM tabla_simbolos WHERE Lexema = ?")) {
        pstmt.setString(1, lexemaCodigo);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                System.out.println("El lexema ya existe en la tabla de símbolos.");
                return; // Salir del método si el lexema ya existe
            }
        }
    } catch (Exception e) {
        System.out.println("Error al verificar el lexema en la tabla de símbolos: " + e.getMessage());
        return;
    }

    // Si el lexema no existe, proceder con la inserción
    try (Connection con = Conectarbase();
         PreparedStatement pstmt = con.prepareStatement("INSERT INTO tabla_simbolos (Lexema, Codigo_Categoria) VALUES (?, ?)")) {
        pstmt.setString(1, lexemaCodigo);
        pstmt.setInt(2, codigoCategoria);
        int filasInsertadas = pstmt.executeUpdate();
        if (filasInsertadas > 0) {
            System.out.println("Lexema insertado correctamente en la tabla de símbolos.");
        } else {
            System.out.println("No se pudo insertar el lexema en la tabla de símbolos.");
        }
    } catch (Exception e) {
        System.out.println("Error al insertar el lexema en la tabla de símbolos: " + e.getMessage());
    }
               
        
}
    
    public void borradoTablas() {
        try {
            con = Conectarbase();

            // Eliminar contenido de la tabla_simbolos y trigger para evitar problemas
            ps = con.prepareStatement("TRUNCATE TABLE tabla_simbolos;");
            ps.executeUpdate();
            ps = con.prepareStatement("DROP TRIGGER IF EXISTS codigo_tabla_simbolos;");
            ps.execute();
            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } 
    }  
}
