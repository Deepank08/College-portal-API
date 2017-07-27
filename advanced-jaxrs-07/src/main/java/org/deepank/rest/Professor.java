package org.deepank.rest;

public class Professor {
	private String profid;
	private String name;
	private String username;
	private String branch;
	private String course;
	private String designation;
	private String picture;
	 
	public Professor()
	{
	 
	}
	 
	public Professor(String profid, String name,String username, String designation, String branch, String course, String picture)
	{
	super();
	this.profid = profid;
	this.name = name;
	this.username = username;
	this.branch = branch;
	this.course = course;
	this.designation = designation;
	this.picture = picture;

	}
	 
	public String getprofid()
	{
	return profid;
	}
	 
	public void setprofid(String profid)
	{
	this.profid = profid;
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

	public String getDesignation()
	{
	return designation;
	}
	 
	public void setDesignation(String designation)
	{
	this.designation = designation;
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
	return "Student [profid=" + profid + ", name=" + name + ", username=" + username + ", designation=" + designation + ",branch=" + branch + ", course=" + course + ",  picture=" + picture + "]";
	}

}
