package rest;

import rest.security.RestSecured;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.ext.Provider;
import java.io.IOException;


@Provider
@Priority(Priorities.AUTHENTICATION)
@RestSecured
public class AuthenticationFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
Cookie cookie=containerRequestContext.getCookies().get("token");

    }


}
