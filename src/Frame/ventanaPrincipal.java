
package Frame;


public class ventanaPrincipal extends javax.swing.JFrame {

    public ventanaPrincipal() {
        initComponents();
        botonesV.initEvent(ventanaPrincipal.this);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new LIB.JEImagePanel();
        panelRedondo2 = new Componentes_Programa.panelRedondo();
        botonesV = new Componentes_Programa.botonesVentana();
        panelRedondo1 = new Componentes_Programa.panelRedondo();
        jEImagePanel3 = new LIB.JEImagePanel();
        jLabel4 = new javax.swing.JLabel();
        jEImagePanel4 = new LIB.JEImagePanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelTransparente2 = new LIB.JPanelTransparente();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonPrincipal1 = new Componentes_Programa.botonPrincipal();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Imagenes/macOS-Monterey-wallpaper-Light.jpg"))); // NOI18N

        panelRedondo2.setBackground(new java.awt.Color(212, 198, 231));
        panelRedondo2.setRedondeoInferiorLeft(10);
        panelRedondo2.setRedondeoInferiorRight(10);
        panelRedondo2.setRedondeoLeft(10);
        panelRedondo2.setRedondeoRight(10);
        panelRedondo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRedondo2.add(botonesV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelRedondo1.setBackground(new java.awt.Color(194, 174, 204));
        panelRedondo1.setRedondeoInferiorLeft(10);
        panelRedondo1.setRedondeoInferiorRight(10);
        panelRedondo1.setRedondeoLeft(10);
        panelRedondo1.setRedondeoRight(10);
        panelRedondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEImagePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Imagenes/home.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel3Layout = new javax.swing.GroupLayout(jEImagePanel3);
        jEImagePanel3.setLayout(jEImagePanel3Layout);
        jEImagePanel3Layout.setHorizontalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jEImagePanel3Layout.setVerticalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelRedondo1.add(jEImagePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Home");
        panelRedondo1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 20));

        jEImagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Imagenes/home.png"))); // NOI18N

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

        panelRedondo1.add(jEImagePanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Home");
        panelRedondo1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3, 50, 20));

        panelRedondo2.add(panelRedondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 180, 25));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Menú de Opciones");
        panelRedondo2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jPanelTransparente2.setArch(5);
        jPanelTransparente2.setArcw(5);
        jPanelTransparente2.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente2.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido al Compilador de Programas de C++ precione en el botón para inciar");
        jPanelTransparente2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 510, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido al Sistema");
        jPanelTransparente2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 510, -1));

        botonPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        botonPrincipal1.setText("Iniciar");
        botonPrincipal1.setBorderColor(new java.awt.Color(23, 122, 228));
        botonPrincipal1.setColor(new java.awt.Color(23, 122, 228));
        botonPrincipal1.setColorClick(new java.awt.Color(31, 39, 100));
        botonPrincipal1.setColorOver(new java.awt.Color(23, 122, 228));
        botonPrincipal1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        botonPrincipal1.setRadius(10);
        botonPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrincipal1ActionPerformed(evt);
            }
        });
        jPanelTransparente2.add(botonPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 90, 30));

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelRedondo2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelTransparente2, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelTransparente2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addComponent(panelRedondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal1ActionPerformed
    ventanaCargaDeCodigo ver = new ventanaCargaDeCodigo();
    ver.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_botonPrincipal1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes_Programa.botonPrincipal botonPrincipal1;
    private Componentes_Programa.botonesVentana botonesV;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel3;
    private LIB.JEImagePanel jEImagePanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private LIB.JPanelTransparente jPanelTransparente2;
    private Componentes_Programa.panelRedondo panelRedondo1;
    private Componentes_Programa.panelRedondo panelRedondo2;
    // End of variables declaration//GEN-END:variables
}
