
package ComponentesSwing;

import Clases.Funciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class botonesVentana extends javax.swing.JPanel {
    
    Funciones funcion = new Funciones();

    public botonesVentana() {
        initComponents();
        setOpaque(false);

    }
        public void initEvent(JFrame ventana){
            
        cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                funcion.borradoTablas();
                System.exit(0);
            }
        });
        
        minimizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana.setState(JFrame.ICONIFIED);
            }
        });
        
        maximizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               if (ventana.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    ventana.setExtendedState(JFrame.NORMAL);
                } else {
                    ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrar = new ComponentesSwing.boton();
        minimizar = new ComponentesSwing.boton();
        maximizar = new ComponentesSwing.boton();

        cerrar.setBackground(new java.awt.Color(255, 55, 55));

        minimizar.setBackground(new java.awt.Color(228, 225, 70));
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });

        maximizar.setBackground(new java.awt.Color(68, 198, 51));
        maximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maximizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
   // funcion.maximizarFrame(minimizar, frame);
    }//GEN-LAST:event_minimizarActionPerformed

    private void maximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximizarActionPerformed

    }//GEN-LAST:event_maximizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ComponentesSwing.boton cerrar;
    private ComponentesSwing.boton maximizar;
    private ComponentesSwing.boton minimizar;
    // End of variables declaration//GEN-END:variables
}
