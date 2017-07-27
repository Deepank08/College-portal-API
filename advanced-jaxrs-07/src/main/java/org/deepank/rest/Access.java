package org.deepank.rest;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.deepank.rest.Student;

public class Access
{
public ArrayList<Student> getCourses(Connection con) throws SQLException
{
ArrayList<Student> studentList = new ArrayList<Student>();
PreparedStatement stmt = con.prepareStatement("SELECT rollno, name, username, branchname, coursename, year, picture FROM users.studentinfo INNER JOIN users.user INNER JOIN users.branchinfo INNER JOIN users.courseinfo ON user.username=studentinfo.user_username");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
Student courseObj = new Student();
courseObj.setrollno(rs.getString("rollno"));
courseObj.setName(rs.getString("name"));
courseObj.setuserName(rs.getString("username"));
courseObj.setBranch(rs.getString("branchname"));
courseObj.setCourse(rs.getString("coursename"));
courseObj.setYear(rs.getString("year"));
courseObj.setPicture(rs.getString("picture"));

studentList.add(courseObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return studentList;

}
}