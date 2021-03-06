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
    1. Create a Transaction.html
    2. Add a Header for the page
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Add the tag library to the page -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<!-- Add the header to the page -->
<c:import url="/includes/header.html" />
<html>
    <head>
        <!--Add Page Title-->
        <title>TOBA Titan Online Banking Application</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <div>
        <!-- Create a header for the Transaction page  -->
            <header>
                <h1>Transactions</h1>
            </header>
        </div>
    </body>
</html>
<!-- Add the footer to the page -->        
<c:import url="/includes/footer.jsp" />
