package Clases;

import Frame.VentanaInicio;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {         
        VentanaInicio ver = new VentanaInicio();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        ConexionMYSQL.Conectarbase();
    }
}
