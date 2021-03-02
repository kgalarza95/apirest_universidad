/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author user
 */
public class apiUsuario {

    private int ID_USUARIO;
    private String USUARIO;
    private String CONTRASENIA;
    private String CAMP_STR1;
    private String CAMP_STR2;

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getCONTRASENIA() {
        return CONTRASENIA;
    }

    public void setCONTRASENIA(String CONTRASENIA) {
        this.CONTRASENIA = CONTRASENIA;
    }

    public String getCAMP_STR1() {
        return CAMP_STR1;
    }

    public void setCAMP_STR1(String CAMP_STR1) {
        this.CAMP_STR1 = CAMP_STR1;
    }

    public String getCAMP_STR2() {
        return CAMP_STR2;
    }

    public void setCAMP_STR2(String CAMP_STR2) {
        this.CAMP_STR2 = CAMP_STR2;
    }
}
