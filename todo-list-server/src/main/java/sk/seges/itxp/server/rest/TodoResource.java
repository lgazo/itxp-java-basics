/**
 * 
 */
package sk.seges.itxp.server.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sk.seges.itxp.shared.domain.Task;


/**
 * @author ladislav.gazo
 */
@Path("/todo")
public class TodoResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Task> getTasks() {
		List<Task> projects = new ArrayList<Task>();
		projects.add(get("1"));
		projects.add(get("2"));
		return projects;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Task get(@PathParam("id") String id) {
		Task task = new Task();
		task.setCreated(new Date());
		task.setLabel("task " + id);

		return task;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Task create(Task newTask) {
		return newTask;
	}

//	@Path("{projectId}/scopes")
//	public ScopeResource scopes(@PathParam("projectId") String projectId) {
//		return new ScopeResource(projectId);
//	}
}
