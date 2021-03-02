/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import com.google.gson.Gson;
import controlador.ctrlUsuario;
import entidades.JSONResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author user
 */
@Path("universidad")
public class UniversidadResource {

    @Context
    private UriInfo context;
    
    private ctrlUsuario opUsuario;
    private JSONResponse json = new JSONResponse();
   private final Gson gson = new Gson();
    
    /**
     * Creates a new instance of UniversidadResource
     */
    public UniversidadResource() {
    }

    @GET
    @Path("/getUsuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsuarios() {
        opUsuario = new ctrlUsuario();     
        json = opUsuario.consultarUsuarios();
        return gson.toJson(json);
    }
    
    @GET
    @Path("/getUsuario")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsuario(@QueryParam("usuario") String usuario, 
            @QueryParam("contrasenia") String contrasenia) {
        opUsuario = new ctrlUsuario();     
        json = opUsuario.consultarUsuario(usuario, contrasenia);
        return gson.toJson(json);
    }
    
    /**
     * Retrieves representation of an instance of interfaz.UniversidadResource
     * @return an instance of java.lang.String
     */
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getJson() {
//        //TODO return proper representation object
//        throw new UnsupportedOperationException();
//    }

    /**
     * PUT method for updating or creating an instance of UniversidadResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
