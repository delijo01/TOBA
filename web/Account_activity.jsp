
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!-- 
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
-->
<!--
    Page Assignment for Assignment 1
    1. Create a Account_activity.html
    2. Add a Header for the page
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />



<!--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">

<html>
    <head>-->
        <!-- Add a title for the html -->
        <!--<title>Customer Details</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>-->
    <div>
        <!-- Create a header for the Transaction page  -->
        <header>
            <h1>Current Account Activity</h1>
        </header>
    </div>
    <c:choose>
    <c:when test="${user.password != ''}">
        <p>Welcome ${user.firstname} ${user.lastname} to your account activity page</p>
    </c:when>
    <c:otherwise>
        <p>You are not logged into the system</p>
    </c:otherwise>
</c:choose>
<!--    </body>
</html>-->
<c:import url="/includes/footer.jsp" />