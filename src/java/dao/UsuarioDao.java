/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.JSONResponse;
import entidades.apiUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.Conexion;

/**
 *
 * @author user
 */
public class UsuarioDao implements IDAO<apiUsuario> {

    private JSONResponse json;
    private Conexion cnx;
    private ResultSet rs;
    private PreparedStatement ps;
    private String SQL;

    public UsuarioDao() {
        json = new JSONResponse();
        cnx = new Conexion();
    }

    @Override
    public JSONResponse insert(apiUsuario obj) {
        return json;
    }

    @Override
    public JSONResponse selectAll() {
        List<apiUsuario> listapiUsuarios = new ArrayList<>();
        apiUsuario usuario;
        SQL = "SELECT * FROM usuario";

        try {
            ps = cnx.getConexion().prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario = new apiUsuario();
                usuario.setID_USUARIO(rs.getInt("ID_USUARIO"));
                usuario.setUSUARIO(rs.getString("USUARIO"));
                usuario.setCONTRASENIA(rs.getString("CONTRASENIA"));
                usuario.setCAMP_STR1(rs.getString("CAMP_STR1"));
                listapiUsuarios.add(usuario);
            }
            json.setCodRespuesta("000");
            json.setMenRespuesta("PROCESO EXITOSO");
            json.setListUsuarios(listapiUsuarios);

        } catch (SQLException e) {
            json.setCodRespuesta("009");
            json.setMenRespuesta("Error al consultar la informacion");
            System.out.println("USUARIO_DAO - selectAll :Error al consultar la informacion");
        } finally {
            try {
                rs.close();
                ps.close();
                cnx.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return json;
    }

    @Override
    public JSONResponse select(List<String> condicion) {
        List<apiUsuario> listapiUsuarios = new ArrayList<>();
        apiUsuario usuario;
        SQL = "SELECT * FROM usuario where USUARIO=? AND CONTRASENIA=?";

        try {
            ps = cnx.getConexion().prepareStatement(SQL);
            ps.setString(1, condicion.get(0));
            ps.setString(2, condicion.get(1));
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario = new apiUsuario();
                usuario.setID_USUARIO(rs.getInt("ID_USUARIO"));
                usuario.setUSUARIO(rs.getString("USUARIO"));
                usuario.setCONTRASENIA(rs.getString("CONTRASENIA"));
                usuario.setCAMP_STR1(rs.getString("CAMP_STR1"));
                listapiUsuarios.add(usuario);
            }
            if (listapiUsuarios.size()>0) {
                json.setCodRespuesta("000");
                json.setMenRespuesta("PROCESO EXITOSO");
            } else {
                json.setCodRespuesta("002");
                json.setMenRespuesta("NO EXISTE EL USUARIO");
            }

            json.setListUsuarios(listapiUsuarios);

        } catch (SQLException e) {
            json.setCodRespuesta("009");
            json.setMenRespuesta("Error al consultar la informacion");
            System.out.println("USUARIO_DAO - select :Error al consultar la informacion");
        } finally {
            try {
                rs.close();
                ps.close();
                cnx.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return json;
    }

    @Override
    public JSONResponse update(apiUsuario obj) {
        return json;
    }

    @Override
    public JSONResponse delete(int identificador) {
        return json;
    }

}
