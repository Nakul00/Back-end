package com.nakul.demo_restapi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/aliens")
public class AlienResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getAlien()
	{
		System.out.println("i am in");
		Alien a1 = new Alien();
		a1.setName("Nakul");
		a1.setPoints(90);
		
		return a1;
	}
	
	

}
