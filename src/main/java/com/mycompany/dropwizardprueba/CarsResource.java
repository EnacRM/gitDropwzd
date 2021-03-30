/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dropwizardprueba;

import com.codahale.metrics.annotation.Timed;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarsResource {
    private final List<String> coches;
    String value="";
    int var=0;
    
    public CarsResource(List<String> coches){
        this.coches=coches;
    }
    
    
    public Saying2 sayCar(int i) {   
        final String value = coches.get(i);
        return new Saying2(value);      
    }
    
    @GET
    @Timed
    public List<Saying2> devolvercoches (List<String> l){
        
       List<Saying2>ls2=new ArrayList();
               
       for(int i=0;i<coches.size();i++){
           Saying2 s2=sayCar(i);
           ls2.add(s2);
       }
       return ls2;
    }
      
}
