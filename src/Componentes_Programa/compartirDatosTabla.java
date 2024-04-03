
package Componentes_Programa;

import javax.swing.table.DefaultTableModel;

public class compartirDatosTabla {
    
    private DefaultTableModel modelo;
    
    public compartirDatosTabla(){
        
    }
    
    public compartirDatosTabla(DefaultTableModel modelo){
        this.modelo = modelo;
    }
    
    public DefaultTableModel getModeloTabla(){
        return modelo;
    }
    
    public void setModeloTabla(DefaultTableModel modelo){
        this.modelo = modelo;
    }
}
