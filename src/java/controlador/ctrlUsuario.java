/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.UsuarioDao;
import entidades.JSONResponse;
import entidades.apiUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ctrlUsuario {

    private JSONResponse json;

    public JSONResponse consultarUsuarios() {
        UsuarioDao usuarioDao = new UsuarioDao();

        json = usuarioDao.selectAll();
        return json;
    }

    public JSONResponse consultarUsuario(String usuario, String pass) {
        UsuarioDao usuarioDao = new UsuarioDao();
        List<String> parametros = new ArrayList<>();

        parametros.add(0, usuario);
        parametros.add(1, pass);
        json = usuarioDao.select(parametros);
        return json;
    }

    public JSONResponse consultarUsuario(String usuario) {
        UsuarioDao usuarioDao = new UsuarioDao();
        List<String> parametros = new ArrayList<>();

        parametros.add(0, usuario);
        json = usuarioDao.select2(parametros);
        return json;
    }

    public JSONResponse crearUsuario(String nombres, String apellidos, String usuario, String pass) {
        UsuarioDao usuarioDao = new UsuarioDao();
        apiUsuario objUsuario = new apiUsuario();
        String[] splNombres = nombres.trim().split(" ");
        String[] splApellidos = apellidos.trim().split(" ");
        
        objUsuario.setUSUARIO(usuario);
        objUsuario.setCONTRASENIA(pass);
        objUsuario.setNOMBRE_UNO(splNombres.length >0 ? splNombres[0]:"");
        objUsuario.setNOMBRE_DOS((splNombres.length >1 ? splNombres[1]:""));
        objUsuario.setAPELLIDO_UNO(splApellidos.length >0 ?splApellidos[0]:"");
        objUsuario.setAPELLIDO_DOS(splApellidos.length >1 ? splApellidos[1]:"");

        json = usuarioDao.insert(objUsuario);
        return json;
    }
    
    public JSONResponse updatePass(String usuario, String pass) {
        UsuarioDao usuarioDao = new UsuarioDao();
        apiUsuario objUsuario = new apiUsuario();
        
        objUsuario.setCONTRASENIA(pass);
        objUsuario.setUSUARIO(usuario);

        json = usuarioDao.update(objUsuario);
        return json;
    }
}
