# College-portal-API

A Restful API developed with **Java(JAX-RS)** using **Jersey** framework based on **REST** architechture along with consistent **MySQL** database model which is scalable enough to work with large number of users.
*Each request is POST with request parameters in JSON format*

*Output is JSON as well.*

## Details

**Login API**
- User is able to login as either student or professor.
- Username, password, uniqueID are stored and fetched from MySQL database.
- New user registration is done incase not registered.

**Student API**
- APT designed for getting details about student.
- Response contains details like name, roll number, branch, year, profile picture, list of courses undertaken during semester.

**Professor API**
- API designed for getting details about professor.
- Response contains details like name, designation, department, profile picture, list of courses taught etc.

**Course API**
- API designed for getting details about course.
- Response contains assigned professor, short description of subject, recommended books, lecture slides, tutorials.

## API End-points

*Demo credentials for student
name		deepank
username	13cse101
password	omega*

//Demo credentials for Prof
*name		Prof1
username	13fcse501
password	utopia*

>To do Registration : http://localhost:8080/advanced-jaxrs-07/webapi/register/doregister
Here, username and password has to be passed as parameters in the URL to register new user. 
Data of the new user will be saved in DB. POST method is used.
Any REST client or PostMan can be used to fetch the data in JSON format.

**Sample Responses:**
1. when the user is already registered.
{
  "tag": "register",
  "status": false,
  "error_msg": "You are already registered"
}

2. when new user passes input parameters to register.
{
  "tag": "register",
  "status": true
}

3. when no parameters are pass or in case of exception.
{
  "tag": "register",
  "status": false,
  "error_msg": "Error occured"
}

>To do login : http://localhost:8080/advanced-jaxrs-07/webapi/login/dologin/
username and password has to be passed as parameters in the URL to validate the user.
POST method is used.
Any REST client or PostMan can be used to fetch the data in JSON format.

**Sample Responses:**
1. when incorrect credentials are passed or no parameters as pass or in case of exception.
{
  "tag": "login",
  "status": false,
  "error_msg": "Incorrect Email or Password"		//error msg would change according to the error.
}

2. when login is successful either student or professor.
{
  "tag": "login",
  "status": true
}

>To fetch the data of a student: http://localhost:8080/advanced-jaxrs-07/webapi/studentService/studentinfo
This will return the basic info about the user in this format: 
 
  {
    "rollno": "1301021048",
    "name": "deepank",
    "username": "13cse101",
    "branch": "CSE",
    "course": "Btech",
    "year": "2013",
    "picture": "http://<link-of-image>"
  }
 

>To fetch the data of a Professor: http://localhost:8080/advanced-jaxrs-07/webapi/professorService/professorinfo
This will return the basic info about the professor in this format:

  {
    "profid": "1029384756",
    "name": "Prof1",
    "username": "13fcse501",
    "branch": "CSE",
    "course": "Btech",
    "designation": "Professor",
    "picture": "http://<link-of-image>"
  }
  
  
>Extra feature:To see the working of Basic Auth with Base64 encoding of parameter in URL
Hit this URl : http://localhost:8080/advanced-jaxrs-07/webapi/secured/message/
with username as "user" and password as "password" in any REST Client or Postman.
After successful authentication it would return: "This API is secured"

## Configure 

- Download the project as zip file or clone it.
- The zip contains the Jersey implementation JARs and its core dependencies. It also contains dependencies for third party     JARs to provide support for JSON support and JavaDoc.
- After unzip, make sure all the required JARs by the project are present in the
  **advanced-jaxrs-07/src/main/webapp/WEB-INF** folder.
- Import the project in Eclipse and ensure that the web.xml deployment descriptor is created.
- To manage all the data using a mysql database, a dump file of the database(present in project .zip file) can be used to deploy the database on any local/remote machine to handle data flow.

## Deployment 

- Any web container can be used, for example Tomcat or the Google App Engine.
- You need to register Jersey as the servlet dispatcher for REST requests. Open the file web.xml and modify it accordingly.
- The parameter jersey.config.server.provider.packages defines in which package Jersey will look for the web service classes.
- This property must point to your resources classes. The URL pattern defines the part of the base URL your application will be placed.
- Run the web application in Eclipse and validate that you can access your service using the above API end-points.

## Contributor
**Deepank Srivastava** | deepank@outlook.com
