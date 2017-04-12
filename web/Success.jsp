<c:import url="/includes/header.html" />
<%--
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>
<!DOCTYPE html>
<%--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
--%>
<%-- 
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
--%>
<%--
    Page Assignment for Assignment 1
    1. Create a Success.html
    2. Add a message that will display that the account has been successfully updated
--%>
        <!-- Create a header for the Success page  -->
<html>
    <head>
        <!--Add Page Title-->
        <title>TOBA Titan Online Banking Application</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    
        <!--<header></header>-->
        <h1>Success Message</h1>
        
        <%-- Add a message that will display that the account has been successfully updated --%>
        <label id="lblmessSuccess" title="Success Message Box">This action completed successfully</label><br>
        <%--<form action="LoginServlet" method="post" > --%>
        <p>Below is your registration information that you entered:</p><br>
        
            <label>First Name:</label>
            <span>${user.firstName}</span><br>
            <label>Last Name:</label>
            <span>${user.lastName}</span><br>
            <span></span>
            <label>Phone:</label>
            <span>${user.phone}</span><br>
            <label>Address:</label>
            <span>${user.address}</span><br>
            <label>City:</label>
            <span>${user.city}</span><br>
            <label>State:</label>
            <span>${user.state}</span><br>
            <label>Zip Code:</label>
            <span>${user.zip}</span><br>
            <label>Email:</label>
            <span>${user.email}</span><br>
            <label>User Name:</label>
            <!--<span></span>--><br>
            <label>Password:</label>
            <span>${user.password}</span><br>
        </form>

</html>
    
    
 <c:import url="/includes/footer.jsp" />
