/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Conexion {

    private ConfiguracionSistem conf;
    private final String bd;
    private final String user;
    private final String pass;
    private final String url;
    private final String driver;
    private Connection cnx;

    public Conexion() {
        conf = new ConfiguracionSistem();
        cnx = null;
        bd = conf.getPropiedad(ConfiguracionSistem.KEY_BASE);
        user = conf.getPropiedad(ConfiguracionSistem.KEY_USUARIO);
        pass = conf.getPropiedad(ConfiguracionSistem.KEY_CONTRA);
        url = conf.getPropiedad(ConfiguracionSistem.KEY_URL);
        driver = conf.getPropiedad(ConfiguracionSistem.KEY_DRIVER);
//        url = "jdbc:mysql://127.0.0.1:3306/" + bd + "?autoReconnet=true&useSSL=false";
    }

    public Connection getConexion() {
        String msjConexion;
        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, user, pass);

            msjConexion = (cnx != null) ? "Conectado" : "Desconectado";
            System.out.println(msjConexion);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnx;
    }
    
    public void cerrarConexion() throws SQLException{
        cnx.close();
    }
}
