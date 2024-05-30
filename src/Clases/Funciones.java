
package Clases;

import static Clases.ConexionMYSQL.Conectarbase;
import com.mysql.cj.xdevapi.Statement;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSTableMetro;

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
            default:
                    lexemaCodigo = lexema;
                    codigoCategoria = 700;                              
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
            PreparedStatement ps = con.prepareStatement("INSERT INTO tabla_simbolos (Lexema, Codigo_Categoria) VALUES (?, ?)")) {
            ps.setString(1, lexemaCodigo);
            ps.setInt(2, codigoCategoria);
            int filasInsertadas = ps.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Lexema insertado correctamente en la tabla de símbolos.");
            } else {
                System.out.println("No se pudo insertar el lexema en la tabla de símbolos.");
            }
        } catch (Exception e) {
            System.out.println("Error al insertar el lexema en la tabla de símbolos: " + e.getMessage());
        }
                     
    }
    
    public void visualizarDatos(RSTableMetro tabla) {
            try{
                DefaultTableModel modelo=new DefaultTableModel();
                tabla.setModel(modelo);
                con=Conectarbase();
                ps=con.prepareStatement("SELECT * FROM tabla_simbolos");
                rs=ps.executeQuery();
                ResultSetMetaData rsMd=rs.getMetaData();
                int cantcol= rsMd.getColumnCount();
                modelo.addColumn("Lexema");
                modelo.addColumn("Código de la Categoria");
                modelo.addColumn("Código del Lexema");
                while(rs.next()){
                    Object[]filas=new Object[cantcol];
                    for(int i=0; i<cantcol;i++){
                        filas[i]=rs.getObject(i+1);
                    }
                    modelo.addRow(filas);
                }
                con.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
    }

    public void mostrarCategorias(JFrame ventana) {
        try {
            con=Conectarbase();
            ps=con.prepareStatement("SELECT * FROM tabla_categorias");
            rs=ps.executeQuery();

            StringBuilder stringBuilder = new StringBuilder();
            while (rs.next()) {
                stringBuilder.append(rs.getString(1)).append(" - ").append(rs.getString(2)).append("\n");
            }

            JTextArea textArea = new JTextArea(stringBuilder.toString()); // Crea el TextArea en donde van a ir las Categorias Léxicas
            textArea.setEditable(false); // Para que el usuario no pueda editar el texto
            textArea.setFont(new Font("Roboto", Font.PLAIN, 16)); // Aumentar el tamaño de la fuente

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(300, 160));

            JOptionPane.showMessageDialog(ventana, scrollPane, "Categorias Léxicas", JOptionPane.PLAIN_MESSAGE);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void verCodigoAnalizar(File archivo, JFrame ventana){

        StringBuilder contenidoArchivo = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenidoArchivo.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores de lectura del archivo
        }

        // Crear un JTextArea para mostrar el contenido del archivo
        JTextArea textArea = new JTextArea(contenidoArchivo.toString());
        textArea.setEditable(false);

        // Colocar el JTextArea dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(600, 300));

        // Mostrar el JScrollPane dentro de un JOptionPane
        JOptionPane.showMessageDialog(ventana, scrollPane, "Contenido del Archivo", JOptionPane.PLAIN_MESSAGE);
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
