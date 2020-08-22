package com.bb.desafio.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

import java.util.Set;

@Path("/v2")
@RegisterRestClient(configKey="country-api")
public interface CountriesService {
	
    @GET
    @Path("/capital/{capital}")
    @Produces("application/json")
    Set<Country> getByCapital(@PathParam PathSegment capital);
   
}
