package com.bb.desafio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cotacao")
public class ConsultaCotacaoResource {
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String consulta() {
    	
    	
    	
    	
    	
        return "Cotação Dolar";
        
        
        
    }

}
