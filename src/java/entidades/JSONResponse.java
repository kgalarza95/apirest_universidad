/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


import java.util.List;

/**
 *
 * @author user
 */
public class JSONResponse {
    
    private String codRespuesta;
    private String menRespuesta;
    
    private List<apiUsuario> listUsuarios;
    private List<apiFacebook> listApiFacebook;
    private List<apiInstagram> listApiInstagram;
    private List<apiTwitter> listApiTwitter;

    public String getCodRespuesta() {
        return codRespuesta;
    }

    public void setCodRespuesta(String codRespuesta) {
        this.codRespuesta = codRespuesta;
    }

    public String getMenRespuesta() {
        return menRespuesta;
    }

    public void setMenRespuesta(String menRespuesta) {
        this.menRespuesta = menRespuesta;
    }

    public List<apiUsuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<apiUsuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

   

    public List<apiFacebook> getListApiFacebook() {
        return listApiFacebook;
    }

    public void setListApiFacebook(List<apiFacebook> listApiFacebook) {
        this.listApiFacebook = listApiFacebook;
    }

    public List<apiInstagram> getListApiInstagram() {
        return listApiInstagram;
    }

    public void setListApiInstagram(List<apiInstagram> listApiInstagram) {
        this.listApiInstagram = listApiInstagram;
    }

    public List<apiTwitter> getListApiTwitter() {
        return listApiTwitter;
    }

    public void setListApiTwitter(List<apiTwitter> listApiTwitter) {
        this.listApiTwitter = listApiTwitter;
    }
    
    
}
