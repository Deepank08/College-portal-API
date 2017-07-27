package org.deepank.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import org.deepank.rest.Professor;

 
@Path("/professorService")
public class ProfessorService
{
@GET
@Path("/professorinfo")
@Produces("application/json")
public String courses()
{
String professorinfo = null;
ArrayList<Professor> profList = new ArrayList<Professor>();
try
{
profList = new ProfAccessManager().getCourses();
Gson gson = new Gson();
professorinfo = gson.toJson(profList);
} catch (Exception e)
{
e.printStackTrace();
}
return professorinfo;
}
}
