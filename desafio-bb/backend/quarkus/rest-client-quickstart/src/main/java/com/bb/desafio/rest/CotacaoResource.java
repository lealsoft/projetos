package com.bb.desafio.rest;

import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.bb.desafio.models.Cotacao;

@Path("/cotacao")
public class CotacaoResource {
	
    @Inject
    @RestClient
    CotacaoService cotacaoService;
    
    @GET
    @Path("/CotacaoDolarDia/{dataCotacao}")
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Set<Cotacao> name(@PathParam String dataCotacao) {
    	//Código de consulta do Banco Central do Brasil
    	
        return cotacaoService.getCotacaoByDate(dataCotacao);
    }

}
