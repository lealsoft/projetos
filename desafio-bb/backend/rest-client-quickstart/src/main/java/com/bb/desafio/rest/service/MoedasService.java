package com.bb.desafio.rest.service;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import com.bb.desafio.models.Moedas;
import com.bb.desafio.models.ODataContext;


@Path("/v1/odata")
@RegisterRestClient
public interface MoedasService {

    @GET
    @Path("/Moedas")
    @Produces("application/json")
    ArrayList<ODataContext> getMoedas();


}