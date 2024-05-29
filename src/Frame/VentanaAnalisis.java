
package Frame;
import Clases.Funciones;
import Clases.AnalisisLexico;
import static Clases.ConexionMYSQL.Conectarbase;
import java.io.File;
import jnafilechooser.api.JnaFileChooser;

public class VentanaAnalisis extends javax.swing.JFrame {
    
    
    ////Instanciar el Objetos
    JnaFileChooser ch = new JnaFileChooser();  
    Funciones funcion = new Funciones();
      
    boolean accion; 
    
    
    public VentanaAnalisis() {
        initComponents();
        funcion.limpiarTabla(tabla);
        botonesV.initEvent(VentanaAnalisis.this);
        analizar.setEnabled(false);
        cargarArchivo.setEnabled(false);
        limpiar.setEnabled(false);
        tablaSimbolos.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new LIB.JEImagePanel();
        panelRedondo2 = new ComponentesSwing.panelRedondo();
        botonesV = new ComponentesSwing.botonesVentana();
        jLabel3 = new javax.swing.JLabel();
        jEImagePanel4 = new LIB.JEImagePanel();
        jLabel5 = new javax.swing.JLabel();
        panelRedondo1 = new ComponentesSwing.panelRedondo();
        jLabel4 = new javax.swing.JLabel();
        jEImagePanel5 = new LIB.JEImagePanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jEImagePanel7 = new LIB.JEImagePanel();
        panelRedondo3 = new ComponentesSwing.panelRedondo();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        analizar = new ComponentesSwing.botonPrincipal();
        cargarArchivo = new LIB.JEImagePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentarios = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        limpiar = new ComponentesSwing.botonPrincipal();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        tablaSimbolos = new ComponentesSwing.botonPrincipal();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/macOS-Monterey-wallpaper-Light.jpg"))); // NOI18N

        panelRedondo2.setBackground(new java.awt.Color(212, 198, 231));
        panelRedondo2.setRedondeoInferiorLeft(10);
        panelRedondo2.setRedondeoInferiorRight(10);
        panelRedondo2.setRedondeoLeft(10);
        panelRedondo2.setRedondeoRight(10);
        panelRedondo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRedondo2.add(botonesV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Menú de Opciones");
        panelRedondo2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jEImagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel4Layout = new javax.swing.GroupLayout(jEImagePanel4);
        jEImagePanel4.setLayout(jEImagePanel4Layout);
        jEImagePanel4Layout.setHorizontalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jEImagePanel4Layout.setVerticalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelRedondo2.add(jEImagePanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Home");
        panelRedondo2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 20));

        panelRedondo1.setBackground(new java.awt.Color(194, 174, 204));
        panelRedondo1.setRedondeoInferiorLeft(10);
        panelRedondo1.setRedondeoInferiorRight(10);
        panelRedondo1.setRedondeoLeft(10);
        panelRedondo1.setRedondeoRight(10);
        panelRedondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Home");
        panelRedondo1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 20));

        jEImagePanel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/carga.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel5Layout = new javax.swing.GroupLayout(jEImagePanel5);
        jEImagePanel5.setLayout(jEImagePanel5Layout);
        jEImagePanel5Layout.setHorizontalGroup(
            jEImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jEImagePanel5Layout.setVerticalGroup(
            jEImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelRedondo1.add(jEImagePanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Análisis de Código");
        panelRedondo1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3, 130, 20));

        panelRedondo2.add(panelRedondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 25));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Tabla de Símbolos");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRedondo2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 137, 150, 20));

        jEImagePanel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tabla.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel7Layout = new javax.swing.GroupLayout(jEImagePanel7);
        jEImagePanel7.setLayout(jEImagePanel7Layout);
        jEImagePanel7Layout.setHorizontalGroup(
            jEImagePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jEImagePanel7Layout.setVerticalGroup(
            jEImagePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelRedondo2.add(jEImagePanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 137, -1, -1));

        panelRedondo3.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondo3.setRedondeoInferiorLeft(10);
        panelRedondo3.setRedondeoInferiorRight(10);
        panelRedondo3.setRedondeoLeft(10);
        panelRedondo3.setRedondeoRight(10);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Carga de Código");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cargar el código a análizar, este debe ser del lenguaje de programación C++ puesto que si el código no es de este lenguaje de");

        analizar.setForeground(new java.awt.Color(255, 255, 255));
        analizar.setText("Analizar");
        analizar.setBorderColor(new java.awt.Color(23, 122, 228));
        analizar.setColor(new java.awt.Color(23, 122, 228));
        analizar.setColorClick(new java.awt.Color(31, 39, 100));
        analizar.setColorOver(new java.awt.Color(23, 122, 228));
        analizar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        analizar.setRadius(10);
        analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarActionPerformed(evt);
            }
        });

        cargarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cargar.jpg"))); // NOI18N
        cargarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarArchivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cargarArchivoLayout = new javax.swing.GroupLayout(cargarArchivo);
        cargarArchivo.setLayout(cargarArchivoLayout);
        cargarArchivoLayout.setHorizontalGroup(
            cargarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        cargarArchivoLayout.setVerticalGroup(
            cargarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        comentarios.setColumns(20);
        comentarios.setRows(5);
        jScrollPane1.setViewportView(comentarios);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Comentarios");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Análisis de Código");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Componentes Léxicos");

        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.setBorderColor(new java.awt.Color(23, 122, 228));
        limpiar.setColor(new java.awt.Color(23, 122, 228));
        limpiar.setColorClick(new java.awt.Color(31, 39, 100));
        limpiar.setColorOver(new java.awt.Color(23, 122, 228));
        limpiar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        limpiar.setRadius(10);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("programación no funcionará el análisis del mismo.");

        tabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lexema", "Categoría Léxica"
            }
        ));
        tabla.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane3.setViewportView(tabla);

        tablaSimbolos.setForeground(new java.awt.Color(255, 255, 255));
        tablaSimbolos.setText("Tabla de Simbolos");
        tablaSimbolos.setBorderColor(new java.awt.Color(23, 122, 228));
        tablaSimbolos.setColor(new java.awt.Color(23, 122, 228));
        tablaSimbolos.setColorClick(new java.awt.Color(31, 39, 100));
        tablaSimbolos.setColorOver(new java.awt.Color(23, 122, 228));
        tablaSimbolos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        tablaSimbolos.setRadius(10);
        tablaSimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaSimbolosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRedondo3Layout = new javax.swing.GroupLayout(panelRedondo3);
        panelRedondo3.setLayout(panelRedondo3Layout);
        panelRedondo3Layout.setHorizontalGroup(
            panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(panelRedondo3Layout.createSequentialGroup()
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                        .addComponent(analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tablaSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
        );
        panelRedondo3Layout.setVerticalGroup(
            panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)))
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablaSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelRedondo2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelRedondo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRedondo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRedondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarActionPerformed
    //Aqui meter todo lo de expresiones regulares 
  if (accion) {
    File archivo = ch.getSelectedFile();
    funcion.cargarDatos(tabla, archivo);

    // Crear una instancia de la clase analisislex
    AnalisisLexico analizador = new AnalisisLexico();

    // Llamar al método analizarCodigo para realizar el análisis léxico
    analizador.analizarCodigo(archivo, tabla, comentarios);
    tablaSimbolos.setEnabled(true);

} 
    }//GEN-LAST:event_analizarActionPerformed

    private void cargarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarArchivoMouseClicked
    
    //Colocar Filtro para que solo permita txt
    ch.addFilter("Archivo .txt, .cpp", "txt", "cpp");

    accion = ch.showOpenDialog(this);
    
    //Habilitar Botones
    analizar.setEnabled(true);
    cargarArchivo.setEnabled(true);
    limpiar.setEnabled(true);
    }//GEN-LAST:event_cargarArchivoMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    funcion.limpiarTabla(tabla);
    analizar.setEnabled(false);
    cargarArchivo.setEnabled(false);
    limpiar.setEnabled(false);
    tablaSimbolos.setEnabled(false);   
    comentarios.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void tablaSimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaSimbolosActionPerformed
    VentanaTablaSimbolos ver = new VentanaTablaSimbolos();
    ver.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_tablaSimbolosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAnalisis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ComponentesSwing.botonPrincipal analizar;
    private ComponentesSwing.botonesVentana botonesV;
    private LIB.JEImagePanel cargarArchivo;
    private javax.swing.JTextArea comentarios;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel4;
    private LIB.JEImagePanel jEImagePanel5;
    private LIB.JEImagePanel jEImagePanel7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private ComponentesSwing.botonPrincipal limpiar;
    private ComponentesSwing.panelRedondo panelRedondo1;
    private ComponentesSwing.panelRedondo panelRedondo2;
    private ComponentesSwing.panelRedondo panelRedondo3;
    private javax.swing.JTable tabla;
    private ComponentesSwing.botonPrincipal tablaSimbolos;
    // End of variables declaration//GEN-END:variables
}
