package com.bb.desafio.rest.client;

import javax.inject.Inject;
import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.Set;

@Path("/country")
public class CountriesResource {

    @Inject
    @RestClient
    CountriesService countriesService;

    @GET
    @Path("/capital/{capital}")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Country> name(@PathParam PathSegment capital) {
        return countriesService.getByCapital(capital);
    }

}