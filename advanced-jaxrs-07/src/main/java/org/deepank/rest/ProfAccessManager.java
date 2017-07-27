package org.deepank.rest;

import java.sql.Connection;
import java.util.ArrayList;
 
import org.deepank.rest.Professor;
import org.deepank.rest.ProfAccess;
import org.deepank.rest.Database;

 
public class ProfAccessManager
{
public ArrayList<Professor> getCourses() throws Exception
{
ArrayList<Professor> profList = new ArrayList<Professor>();
Database db = new Database();
Connection con = db.getConnection();
ProfAccess access = new ProfAccess();
profList = access.getCourses(con);
return profList;
}
}