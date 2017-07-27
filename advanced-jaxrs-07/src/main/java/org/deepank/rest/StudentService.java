package org.deepank.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import org.deepank.rest.Student;
import org.deepank.rest.AccessManager;

 
@Path("/studentService")
public class StudentService
{
@GET
@Path("/studentinfo")
@Produces("application/json")
public String courses()
{
String studentinfo = null;
ArrayList<Student> studentList = new ArrayList<Student>();
try
{
studentList = new AccessManager().getCourses();
Gson gson = new Gson();
studentinfo = gson.toJson(studentList);
} catch (Exception e)
{
e.printStackTrace();
}
return studentinfo;
}
}
