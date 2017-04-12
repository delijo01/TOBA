<%-- 
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
--%>
<%@ include file="/includes/header.html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--1. Create the password_reset jsp--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--Add Page Title--%>
        <title>Password Reset Page</title>
    </head>
    <body>-->
        <%--Add Page Content--%>
        <h1>Password Reset Form</h1>
        <br>
        <form action="PasswordResetServlet" method="post">
            <label class="pad_top">Current Temporary Password:</label>
            <input type="text" name="curTempPassword" value="${user.password}" ><br>
            <label class="pad_top">Password Change:</label>
            <input type="text" id="pwdChang" name="password"><br>
            <input type="submit" value ="Change Password">
        </form>
<!--    </body>
</html>-->

<%@ include file="/includes/footer.jsp" %>
