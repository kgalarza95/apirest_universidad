/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ConfiguracionSistem {

    private Properties archivoConf;
//    private final String RUTA = "utilidades/configuracion.properties";
    private final String RUTA = "utilidades/configuracion.properties";

    public final static String KEY_USUARIO = "usuario";
    public final static String KEY_CONTRA = "contrasenia";
    public final static String KEY_URL = "url";
    public final static String KEY_DRIVER = "driver";
    public final static String KEY_BASE = "base";

    public ConfiguracionSistem() {
        archivoConf = new Properties();
        try {
            archivoConf.load(ConfiguracionSistem.class.getClassLoader().getResourceAsStream(RUTA));
//            archivoConf.load(new FileReader(RUTA));
        } catch (IOException ex) {
            Logger.getLogger(ConfiguracionSistem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Devuelve la propiedad que se necesita (segun la key enviada)
     *
     * @param clave
     * @return
     */
    public String getPropiedad(String clave) {
        return archivoConf.getProperty(clave);
    }

}
