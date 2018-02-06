package com.mindtree.jersy1.jersyExample;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import productExample.ProductService;
import productExample.Productpojo;

@Path("/myresource")
public class MyResource {
	ProductService ps=new ProductService(); 
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Productpojo> getProductsInfo() {
       return ps.getAllProducts();
    	
    }
}
