<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Akhilesh.*"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%  
    String e= request.getParameter("email");
    String p= request.getParameter("password");
    LoginBean loginbean=new LoginBean();
    loginbean.setEmail(e);
    loginbean.setPass(p);
    LoginDao loginDao = new LoginDao();
   
    boolean status=LoginDao.validate(loginbean);  
    if(status){  
    out.println("You are successfully logged in");  
    session.setAttribute("session","TRUE");
    response.sendRedirect("managerSection.jsp");
    }  
    else  
    {  
    out.print("The email or password is wrong, please try again.");  
    %>  
    <br>
    <br>
    <br>
    <jsp:include page="auth.jsp"></jsp:include>  
    <%  
    }  
    %>  
</body>
</html>