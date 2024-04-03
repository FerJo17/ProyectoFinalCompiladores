
package Frame;

import Componentes_Tabla.TableCustom;

public class ventananAnalisisDeCodigo extends javax.swing.JFrame {

    public ventananAnalisisDeCodigo() {
        initComponents();
        botonesV.initEvent(ventananAnalisisDeCodigo.this);
        TableCustom.apply(scroll, TableCustom.TableType.DEFAULT);
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
        jLabel9 = new javax.swing.JLabel();
        jEImagePanel7 = new LIB.JEImagePanel();
        panelRedondo4 = new Componentes_Programa.panelRedondo();
        jLabel7 = new javax.swing.JLabel();
        jEImagePanel8 = new LIB.JEImagePanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jEImagePanel5 = new LIB.JEImagePanel();
        panelRedondo3 = new Componentes_Programa.panelRedondo();
        jLabel2 = new javax.swing.JLabel();
        botonPrincipal1 = new Componentes_Programa.botonPrincipal();
        tableScrollButton1 = new Componentes_Tabla.TableScrollButton();
        scroll = new javax.swing.JScrollPane();
        tablaComponentesLexicos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonPrincipal2 = new Componentes_Programa.botonPrincipal();

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

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Base de Datos");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRedondo2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 165, 150, 20));

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

        panelRedondo2.add(jEImagePanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 165, -1, -1));

        panelRedondo4.setBackground(new java.awt.Color(194, 174, 204));
        panelRedondo4.setRedondeoInferiorLeft(10);
        panelRedondo4.setRedondeoInferiorRight(10);
        panelRedondo4.setRedondeoLeft(10);
        panelRedondo4.setRedondeoRight(10);
        panelRedondo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Home");
        panelRedondo4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 20));

        jEImagePanel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/analizar.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel8Layout = new javax.swing.GroupLayout(jEImagePanel8);
        jEImagePanel8.setLayout(jEImagePanel8Layout);
        jEImagePanel8Layout.setHorizontalGroup(
            jEImagePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jEImagePanel8Layout.setVerticalGroup(
            jEImagePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelRedondo4.add(jEImagePanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Analisis");
        panelRedondo4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3, 140, 20));

        panelRedondo2.add(panelRedondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 25));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Carga de Código");
        panelRedondo2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, 20));

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

        panelRedondo2.add(jEImagePanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        panelRedondo3.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondo3.setRedondeoInferiorLeft(10);
        panelRedondo3.setRedondeoInferiorRight(10);
        panelRedondo3.setRedondeoLeft(10);
        panelRedondo3.setRedondeoRight(10);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Análisis de Código");

        botonPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        botonPrincipal1.setText("Limpiar");
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

        tablaComponentesLexicos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tablaComponentesLexicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexema"
            }
        ));
        scroll.setViewportView(tablaComponentesLexicos);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Componentes Léxicos");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Comentarios");

        botonPrincipal2.setForeground(new java.awt.Color(255, 255, 255));
        botonPrincipal2.setText("Cargar en DB");
        botonPrincipal2.setBorderColor(new java.awt.Color(23, 122, 228));
        botonPrincipal2.setColor(new java.awt.Color(23, 122, 228));
        botonPrincipal2.setColorClick(new java.awt.Color(31, 39, 100));
        botonPrincipal2.setColorOver(new java.awt.Color(23, 122, 228));
        botonPrincipal2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        botonPrincipal2.setRadius(10);
        botonPrincipal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrincipal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRedondo3Layout = new javax.swing.GroupLayout(panelRedondo3);
        panelRedondo3.setLayout(panelRedondo3Layout);
        panelRedondo3Layout.setHorizontalGroup(
            panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondo3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll))
                .addGap(18, 18, 18)
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tableScrollButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(panelRedondo3Layout.createSequentialGroup()
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRedondo3Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botonPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRedondo3Layout.setVerticalGroup(
            panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(tableScrollButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondo3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelRedondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
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

    private void botonPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal1ActionPerformed

    }//GEN-LAST:event_botonPrincipal1ActionPerformed

    private void botonPrincipal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPrincipal2ActionPerformed

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
    private Componentes_Programa.botonPrincipal botonPrincipal2;
    private Componentes_Programa.botonesVentana botonesV;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel4;
    private LIB.JEImagePanel jEImagePanel5;
    private LIB.JEImagePanel jEImagePanel7;
    private LIB.JEImagePanel jEImagePanel8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private Componentes_Programa.panelRedondo panelRedondo2;
    private Componentes_Programa.panelRedondo panelRedondo3;
    private Componentes_Programa.panelRedondo panelRedondo4;
    private javax.swing.JScrollPane scroll;
    public static javax.swing.JTable tablaComponentesLexicos;
    private Componentes_Tabla.TableScrollButton tableScrollButton1;
    // End of variables declaration//GEN-END:variables
}
