package rest.controller;

import entity.User;
import service.UserService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserController {

    @Inject
    UserService userService;

    @POST
    @Path("/addUser")
    @Produces(MediaType.APPLICATION_JSON)
    public void addUser(User user) {
        userService.addUser(user);
    }
}
