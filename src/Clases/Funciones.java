
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
        borradoTablaSimbolos();
    }
    
    public void cargarDatosBase(JTable tabla){       
        int aux = 0;
        int codigoCategoria, codigo;
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        
        try{
            con = Conectarbase();
            
            for (int i = 0; i < model.getRowCount(); i++){
            ps = con.prepareStatement("INSERT INTO tabla_simbolos values (?, ?, ?);");
            
            String lexema = model.getValueAt(i, 0).toString(); 
            codigoCategoria = 200;
            codigo = 100 + i;
            
            ps.setString(1, lexema);
            ps.setInt(2, codigoCategoria);
            ps.setInt(3, codigo);           
            aux = ps.executeUpdate();           
            }

            
            if(aux > 0){
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            con.close();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        

    }
    
public void visualizarTablaSimbolos() {

}
    
    public void borradoTablaSimbolos(){
        try{
            con = Conectarbase();            
            ps = con.prepareStatement("TRUNCATE TABLE tabla_simbolos; ");                   
            ps.executeUpdate();           
            con.close();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }         
    }
    
}
