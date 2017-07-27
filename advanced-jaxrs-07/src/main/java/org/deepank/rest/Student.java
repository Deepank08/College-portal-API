package org.deepank.rest;

public class Student
{
private String rollno;
private String name;
private String username;
private String branch;
private String course;
private String year;
private String picture;
 
public Student()
{
 
}
 
public Student(String rollno, String name,String username, String branch, String course, String year, String picture)
{
super();
this.rollno = rollno;
this.name = name;
this.username = username;
this.branch = branch;
this.course = course;
this.year = year;
this.picture = picture;

}
 
public String getrollno()
{
return rollno;
}
 
public void setrollno(String rollno)
{
this.rollno = rollno;
}
 
public String getName()
{
return name;
}
 
public void setName(String name)
{
this.name = name;
}

public String getuserName()
{
return username;
}
 
public void setuserName(String username)
{
this.username = username;
}
 
public String getBranch()
{
return branch;
}
 
public void setBranch(String branch)
{
this.branch = branch;
}
 
public String getCourse()
{
return course;
}
 
public void setCourse(String course)
{
this.course = course;
}

public String getYear()
{
return year;
}
 
public void setYear(String year)
{
this.year = year;
}

public String getPicture()
{
return picture;
}
 
public void setPicture(String picture)
{
this.picture = picture;
}

 
@Override
public String toString()
{
return "Student [rollno=" + rollno + ", name=" + name + ", username=" + username + ", branch=" + branch + ", course=" + course + ", year=" + year + ", picture=" + picture + "]";
}
 
}
