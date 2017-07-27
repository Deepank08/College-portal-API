package org.deepank.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.deepank.rest.Professor;

public class ProfAccess
{
public ArrayList<Professor> getCourses(Connection con) throws SQLException
{
ArrayList<Professor> profList = new ArrayList<Professor>();
PreparedStatement stmt = con.prepareStatement("SELECT profid, name, username, designation, branchname, coursename, picture FROM users.Profinfo INNER JOIN users.user INNER JOIN users.branchinfo INNER JOIN users.courseinfo ON user.username=Profinfo.user_username");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
Professor courseObj = new Professor();
courseObj.setprofid(rs.getString("profid"));
courseObj.setName(rs.getString("name"));
courseObj.setuserName(rs.getString("username"));
courseObj.setDesignation(rs.getString("designation"));
courseObj.setBranch(rs.getString("branchname"));
courseObj.setCourse(rs.getString("coursename"));
courseObj.setPicture(rs.getString("picture"));

profList.add(courseObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return profList;

}
}