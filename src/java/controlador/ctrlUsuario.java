/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.UsuarioDao;
import entidades.JSONResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ctrlUsuario {
    private JSONResponse json;
    
    public JSONResponse consultarUsuarios(){
        UsuarioDao usuarioDao = new UsuarioDao();
        
        json = usuarioDao.selectAll();   
        return json;
    }
    
    public JSONResponse consultarUsuario(String usuario, String pass){
        UsuarioDao usuarioDao = new UsuarioDao();
        List<String> parametros = new ArrayList<>();
        
        parametros.add(0, usuario);
        parametros.add(1, pass);
        json = usuarioDao.select(parametros);   
        return json;
    }
}
