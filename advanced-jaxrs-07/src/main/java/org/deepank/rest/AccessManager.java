package org.deepank.rest;


import java.sql.Connection;
import java.util.ArrayList;
 
import org.deepank.rest.Student;
import org.deepank.rest.Access;
import org.deepank.rest.Database;

 
public class AccessManager
{
public ArrayList<Student> getCourses() throws Exception
{
ArrayList<Student> studentList = new ArrayList<Student>();
Database db = new Database();
Connection con = db.getConnection();
Access access = new Access();
studentList = access.getCourses(con);
return studentList;
}
}