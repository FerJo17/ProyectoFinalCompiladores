
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
        }
        
        
        try{
            con=Conectarbase();
            ps=con.prepareStatement("INSERT INTO tabla_simbolos (Lexema, Codigo_Categoria) VALUES (?, ?)");
            ps.setString(1, lexemaCodigo);
            ps.setInt(2, codigoCategoria);      
            int res=ps.executeUpdate();
            if(res>0){
                System.out.println("Registro Agregado");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            con.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }    
        
        
    }
    
    public void borradoTablas() {
        try {
            con = Conectarbase();

            // Eliminar contenido de la tabla_simbolos
            ps = con.prepareStatement("TRUNCATE TABLE tabla_simbolos;");
            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } 
    }  
}
