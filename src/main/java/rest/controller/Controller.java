package rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class Controller {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public void all(){
        System.out.println("JJJJJPJPOPL::>");
    }
}
