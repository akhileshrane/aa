<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.*"%>
<%@page import="akhilesh.*"%>
<%@page import="java.io.*" %>
<h2>Adding student to database</h2>
<% 

try{
StudentDao studentDao=new StudentDao();
int r=Integer.parseInt(request.getParameter("rollNumber"));
String n= request.getParameter("studentName");
String c= request.getParameter("course");
int a=Integer.parseInt(request.getParameter("age"));
Student student = new Student(r,n,a,c);
studentDao.addStudent(student);
}
catch(Exception e){
	out.println(""+e.getMessage());
	response.addHeader("REFRESH","3;URL=addStudent.jsp");
	%>
<h2>Refreshing page,try with a new value for rollnumber</h2>
<%
}
%>

</body>
</html>