
package ComponentesSwing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class panelRedondo extends JPanel{

    public int getRedondeoLeft() {
        return redondeoLeft;
    }

    public void setRedondeoLeft(int redondeoLeft) {
        this.redondeoLeft = redondeoLeft;
        repaint();
    }

    public int getRedondeoRight() {
        return redondeoRight;
    }

    public void setRedondeoRight(int redondeoRight) {
        this.redondeoRight = redondeoRight;
        repaint();   
    }

    public int getRedondeoInferiorLeft() {
        return redondeoInferiorLeft;
    }

    public void setRedondeoInferiorLeft(int redondeoInferiorLeft) {
        this.redondeoInferiorLeft = redondeoInferiorLeft;
        repaint();        
    }

    public int getRedondeoInferiorRight() {
        return redondeoInferiorRight;
    }

    public void setRedondeoInferiorRight(int redondeoInferiorRight) {
        this.redondeoInferiorRight = redondeoInferiorRight;
        repaint();
    }
    
    private int redondeoLeft = 0;
    private int redondeoRight = 0;
    int redondeoInferiorLeft = 0;
    int redondeoInferiorRight = 0; 
    
    public panelRedondo(){
        setOpaque(false);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Area area = new Area(createRedondeoLeft());
        if(redondeoRight > 0){
            area.intersect(new Area(createRedondeoRigth()));
        }
        if(redondeoInferiorLeft > 0){
            area.intersect(new Area(createRedondeoInferiorLeft()));
        }
        if(redondeoInferiorRight > 0){
            area.intersect(new Area(createRedondeoInferiorRight()));
        }
        g2.fill(area);
        g2.dispose();
        super.paint(g);
    }
    
    private Shape createRedondeoLeft(){
        int ancho = getWidth();
        int alto = getHeight();
        int roundX = Math.min(ancho, redondeoLeft);
        int roundY = Math.min(alto, redondeoLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, ancho, alto, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, ancho - roundX / 2, alto)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, ancho, alto - roundY / 2)));    
        return area;
    }
    
    private Shape createRedondeoRigth(){
        int ancho = getWidth();
        int alto = getHeight();
        int roundX = Math.min(ancho, redondeoRight);
        int roundY = Math.min(alto, redondeoRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, ancho, alto, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, ancho - roundX / 2, alto)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, ancho, alto - roundY / 2)));    
        return area;
    }
    
        private Shape createRedondeoInferiorLeft(){
        int ancho = getWidth();
        int alto = getHeight();
        int roundX = Math.min(ancho, redondeoInferiorLeft);
        int roundY = Math.min(alto, redondeoInferiorLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, ancho, alto, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, ancho - roundX / 2, alto)));
        area.add(new Area(new Rectangle2D.Double(0, 0, ancho, alto - roundY / 2)));    
        return area;
    }
        
        private Shape createRedondeoInferiorRight(){
        int ancho = getWidth();
        int alto = getHeight();
        int roundX = Math.min(ancho, redondeoInferiorRight);
        int roundY = Math.min(alto, redondeoInferiorRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, ancho, alto, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, ancho - roundX / 2, alto)));
        area.add(new Area(new Rectangle2D.Double(0, 0, ancho, alto - roundY / 2)));    
        return area;
    }       
    
}
