package service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface IService {

	
	@POST
	@Path("{user}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public RegisterResponse register(@PathParam("user") String user, RegisterRequest request);
	
	@GET
	@Path("{user}")
	@Produces(MediaType.APPLICATION_JSON)
	public LoginResponse login(@PathParam("user") String user, LoginRequest request);

	@GET
	@Path("{user}/pubkey")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public PubkeyResponse pubkey(@PathParam("user") String user);

	@POST
	@Path("{user}/message")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public SendMessageResponse sendMessage(@PathParam("user") String user, SendMessageRequest request);

	@GET
	@Path("{user}/message")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public GetMessageResponse getMessage(@PathParam("user") String user, GetMessageRequest request);

}
