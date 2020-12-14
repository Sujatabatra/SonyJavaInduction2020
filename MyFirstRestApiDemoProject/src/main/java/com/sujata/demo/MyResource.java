package com.sujata.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("myresource")
public class MyResource {

	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "<h1>Got it!</h1>";
    }
    
	@Path("first")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String oneMoreGetIt() {
        return "<h1>Got it!</h1>";
    }
}
