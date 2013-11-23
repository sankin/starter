package com.clevesque.starter.api.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.clevesque.starter.api.vo.HelloWS;

@Path("sample")
public interface SampleApi {
	@GET
	@Path("hello")
	@Produces({ MediaType.APPLICATION_JSON })
	HelloWS sayHello(@QueryParam("name") @DefaultValue("World") String name);
}
