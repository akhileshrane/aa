<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="akhilesh.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Updating</h2>
<% 
try{
StudentDao studentDao=new StudentDao();
int r=Integer.parseInt(request.getParameter("rollNumber"));
String n= request.getParameter("studentName");
String c= request.getParameter("course");
int a=Integer.parseInt(request.getParameter("age"));
Student student = new Student(r,n,a,c);
studentDao.updateStudent(student);
}
catch(Exception e){
	out.println("error");
}
response.sendRedirect("viewAllStudents.jsp");
%>
<a href="index.jsp">Click here to go to index page</a>
</body>
</html>