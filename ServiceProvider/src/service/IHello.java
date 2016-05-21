package service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import entities.User;


@Path("/")
public interface IHello {
	
	
	@GET
	@Path("{identity}")
	@Produces(MediaType.APPLICATION_JSON)
	public User login(@PathParam("identity") String identity);
	
	
	@POST
	@Path("{identity}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public RegisterRequest register(
			@PathParam("identity") String identity,
			RegisterRequest register
			);

}
 