
package Frame;

import Componentes_Programa.mouseCursor;
import javax.swing.filechooser.FileNameExtensionFilter;
import jnafilechooser.api.JnaFileChooser;



public class ventananAnalisisDeCodigo extends javax.swing.JFrame {

    public ventananAnalisisDeCodigo() {
        initComponents();
        botonesV.initEvent(ventananAnalisisDeCodigo.this);
        mouseCursor mouse = new mouseCursor();
        cargarArchivo.addMouseListener(mouse);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new LIB.JEImagePanel();
        panelRedondo2 = new Componentes_Programa.panelRedondo();
        botonesV = new Componentes_Programa.botonesVentana();
        jLabel3 = new javax.swing.JLabel();
        jEImagePanel4 = new LIB.JEImagePanel();
        jLabel5 = new javax.swing.JLabel();
        panelRedondo1 = new Componentes_Programa.panelRedondo();
        jLabel4 = new javax.swing.JLabel();
        jEImagePanel5 = new LIB.JEImagePanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jEImagePanel6 = new LIB.JEImagePanel();
        jLabel9 = new javax.swing.JLabel();
        jEImagePanel7 = new LIB.JEImagePanel();
        panelRedondo3 = new Componentes_Programa.panelRedondo();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonPrincipal1 = new Componentes_Programa.botonPrincipal();
        cargarArchivo = new LIB.JEImagePanel();

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
        jLabel6.setText("Carga de Código");
        panelRedondo1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3, 130, 20));

        panelRedondo2.add(panelRedondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 25));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Analisis");
        panelRedondo2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 137, 150, 20));

        jEImagePanel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/analizar.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel6Layout = new javax.swing.GroupLayout(jEImagePanel6);
        jEImagePanel6.setLayout(jEImagePanel6Layout);
        jEImagePanel6Layout.setHorizontalGroup(
            jEImagePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jEImagePanel6Layout.setVerticalGroup(
            jEImagePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelRedondo2.add(jEImagePanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 137, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Base de Datos");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRedondo2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 20));

        jEImagePanel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/database.png"))); // NOI18N

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

        panelRedondo2.add(jEImagePanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        panelRedondo3.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondo3.setRedondeoInferiorLeft(10);
        panelRedondo3.setRedondeoInferiorRight(10);
        panelRedondo3.setRedondeoLeft(10);
        panelRedondo3.setRedondeoRight(10);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Carga de Código");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Carga el código a analizar, este debe ser de C++ puesto que si el código");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("no es de este lenguaje de programación no funcionará la compilación");

        botonPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        botonPrincipal1.setText("Analizar");
        botonPrincipal1.setBorderColor(new java.awt.Color(23, 122, 228));
        botonPrincipal1.setColor(new java.awt.Color(23, 122, 228));
        botonPrincipal1.setColorClick(new java.awt.Color(31, 39, 100));
        botonPrincipal1.setColorOver(new java.awt.Color(23, 122, 228));
        botonPrincipal1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        botonPrincipal1.setRadius(10);
        botonPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrincipal1ActionPerformed(evt);
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

        javax.swing.GroupLayout panelRedondo3Layout = new javax.swing.GroupLayout(panelRedondo3);
        panelRedondo3.setLayout(panelRedondo3Layout);
        panelRedondo3Layout.setHorizontalGroup(
            panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondo3Layout.createSequentialGroup()
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panelRedondo3Layout.setVerticalGroup(
            panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondo3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
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

    boolean accion;
    private void botonPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal1ActionPerformed
    if(accion){
        System.out.println("Hola");
    } else{
        System.out.println("Error!!");
    }
    }//GEN-LAST:event_botonPrincipal1ActionPerformed

    private void cargarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarArchivoMouseClicked
    //Instanciar el Objeto para seleccionar el archivo
    JnaFileChooser ch = new JnaFileChooser();
    //Colocar Filtro para que solo permita txt
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
    ch.addFilter("Text Files", "txt");  
    accion = ch.showOpenDialog(this);
    }//GEN-LAST:event_cargarArchivoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventananAnalisisDeCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventananAnalisisDeCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventananAnalisisDeCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventananAnalisisDeCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventananAnalisisDeCodigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes_Programa.botonPrincipal botonPrincipal1;
    private Componentes_Programa.botonesVentana botonesV;
    private LIB.JEImagePanel cargarArchivo;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel4;
    private LIB.JEImagePanel jEImagePanel5;
    private LIB.JEImagePanel jEImagePanel6;
    private LIB.JEImagePanel jEImagePanel7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Componentes_Programa.panelRedondo panelRedondo1;
    private Componentes_Programa.panelRedondo panelRedondo2;
    private Componentes_Programa.panelRedondo panelRedondo3;
    // End of variables declaration//GEN-END:variables
}
