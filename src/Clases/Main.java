package Clases;

import Frame.Inicio;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {         
        Inicio ver = new Inicio();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        ConexionMYSQL.Conectarbase();
    }
}
