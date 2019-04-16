package rest.security;

import entity.User;
import org.apache.commons.lang3.RandomStringUtils;
import service.UserService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;


@Path("/auth")
public class AuthenticationEndPoint {

    @Inject
    UserService userService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response authenticateUser() {
        try {
            NewCookie cookie1 = new NewCookie("token",issueToken());
            return Response.ok().cookie(cookie1).build();

        } catch (Exception e) {
            return Response.status(Response.Status.FORBIDDEN).build();
        }
    }

    private String issueToken() {
        String token = RandomStringUtils.random(10, true, true);
        return token;
    }
}
