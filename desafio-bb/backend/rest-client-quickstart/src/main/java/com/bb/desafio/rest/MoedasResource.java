package com.bb.desafio.rest;

import java.util.ArrayList;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import com.bb.desafio.models.ODataContext;

@Path("/cotacao")
public class MoedasResource {

    @Inject
    @RestClient
    MoedasService moedasService;
    
    @GET
    @Path("/Moedas")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<ODataContext> moedas() {
    	
        return moedasService.getMoedas();
    }

}