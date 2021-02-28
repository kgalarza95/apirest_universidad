/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ug.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ug.cliente.rest.ApiClienteUniversidad;

/**
 *
 * @author KevinGalarza
 */
@WebServlet(name = "SrvLogin", urlPatterns = {"/SrvLogin"})
public class SrvLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String tarea = request.getParameter("opcion");
        String respText;
        ApiClienteUniversidad ARest = new ApiClienteUniversidad();
        
        switch (tarea) {
            case "ConsultaUsuarios":
//                    respText = ws.ProcesoFinal("PRC_TRX_LOGIN", parametros);
//                    respText = ARest.getUsuario();
//                    resp_json = new JSONObject(respText);
//                    if (resp_json.get("CodResponse").equals("00")) {
//                        VSSessiones.setAttribute("Session", "true");
//                        VSSessiones.setAttribute("Session_Usuario", usuario);
//                        VSSessiones.setAttribute("Session_Empresas", "");
//                        JSONObject obj_jscontrol = XML.toJSONObject(resp_json.get("pv_dat1_response").toString());
//                        cmb_empresas += "<option value = '0' disabled selected>Seleccione Empresa</option>";
//                        if (Integer.parseInt(resp_json.get("pv_dat2_response").toString()) > 1) {
//                            JSONArray jsonArray = obj_jscontrol.getJSONArray("empresas");
//                            for (int i = 0; i < jsonArray.length(); i++) {
//                                try {
//                                    JSONObject json = jsonArray.getJSONObject(i);
//                                    cmb_empresas += "<option value='" + json.getInt("cod_empresa") + "'>" + json.getString("nombre_empresa") + "</option>";
//                                } catch (JSONException e) {
//                                    System.out.println(e.toString());
//                                    CodResponse = "99";
//                                    MsjResponse = "Error al mostrar las empresas.";
//                                }
//                            }
//                        } else {
//                            Iterator<?> permisos = obj_jscontrol.keys();
//                            while (permisos.hasNext()) {
//                                String key = (String) permisos.next();
//                                cmb_empresas += "<option value='" + obj_jscontrol.getJSONObject(key).getInt("cod_empresa") + "'>" + obj_jscontrol.getJSONObject(key).getString("nombre_empresa") + "</option>";
//                            }
//                        }
//                        VSSessiones.setAttribute("Session_Empresas", cmb_empresas);
//                    } else {
//                        VSSessiones.invalidate();
//                    }
//                    CodResponse = resp_json.get("CodResponse").toString();
//                    MsjResponse = resp_json.get("MsjResponse").toString();
//                } catch (JSONException e) {
//                    System.out.println(e.toString());
//                    CodResponse = "99";
//                    MsjResponse = "Error al ejecuta el Login";
//                } finally {
//                    writer.object();
//                    writer.key("empresas").value(cmb_empresas);
//                    writer.key("CodResponse").value(CodResponse);
//                    writer.key("MsjResponse").value(MsjResponse);
//                    writer.endObject();
//                }
//                out.print(stringWriter.toString());
//                break;
//            default:
//                throw new AssertionError();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
