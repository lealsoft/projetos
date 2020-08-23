package com.bb.desafio.rest.service;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.bb.desafio.models.Cotacao;

@Path("/v1/odata")
@RegisterRestClient
public interface CotacaoService {
	
    @GET
    @Path("/CotacaoDolarDia(dataCotacao=@dataCotacao){dataCotacao}")
    //@Produces("application/json")
    @Produces("text/plain")
    Set<Cotacao> getCotacaoByDate(@PathParam("dataCotacao") String dataCotacao);

}