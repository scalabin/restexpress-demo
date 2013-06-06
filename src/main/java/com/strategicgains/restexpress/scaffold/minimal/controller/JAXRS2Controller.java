package com.strategicgains.restexpress.scaffold.minimal.controller;

import java.util.Date;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.strategicgains.hyperexpress.domain.LinkableCollection;
import com.strategicgains.restexpress.Request;
import com.strategicgains.restexpress.Response;
import com.strategicgains.restexpress.scaffold.minimal.dto.MessageActionDto;

@Path("/rs2")
public interface JAXRS2Controller
{
		
	@Path("/collection/route/msg.{format}")
	@POST
	public Object create(MessageActionDto dto);
	

	@Path("/route/msg/{sampleId}.{format}")
	@GET
	public Object read(@PathParam("sampleId") String id, @QueryParam("name") String name);
	

	@Path("/collection/route/msg.{format}")
	@GET
	public LinkableCollection<Object> readAll();
	

	@Path("/route/msg/{sampleId}.{format}")
	@PUT
	public Object update(@PathParam("sampleId") String id, MessageActionDto dto);
	

	@Path("/route/msg/{sampleId}.{format}")
	@DELETE
	public void delete(@PathParam("sampleId") int id);
	
	@Path("/route/string/dummy.{format}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String readAsString(Request request, Response response);
	
	@Path("/route/{version}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String readPathAndQuery(@PathParam("version") String version, @QueryParam("releaseOn") Date releaseDate);
	
}
