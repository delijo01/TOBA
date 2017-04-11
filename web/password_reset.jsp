<%-- 
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
--%>
<%--1. Create the password_reset jsp--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--Add Page Title--%>
        <title>Password Reset Page</title>
    </head>
    <body>
        <%--Add Page Content--%>
        <h1>Password Reset Form</h1>
        
        <form>
            <input type="text" name="PASSWORD" value="${user.password}" ><br>
            <label class="pad_top" id="lblpwdChg" title="PasswordChange" >${user.password}</label>
            <label class="pad_top">Password Change:</label>
            <input type="text" id="pwdChang" name="PASSWORDCHANGE"><br>
            <input type="submit" value ="Change Password">
        </form>
    </body>
</html>
