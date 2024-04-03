
package Componentes_Programa;

import LIB.JEImagePanel;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mouseCursor extends MouseAdapter{

    @Override
    public void mouseEntered(MouseEvent e) {
        JEImagePanel panel = (JEImagePanel) e.getSource();
        panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
}
