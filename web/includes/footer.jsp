<%-- 
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
--%>
<%@page import="java.util.Locale"%>
<%--Pulling in the Gregorian Calendar to get current date--%>
<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%--Creating the Calendar instance and then pulling the current Year--%>
        <%
            GregorianCalendar currentDate = new GregorianCalendar();
            String currentMonth = currentDate.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
            int currentDay = currentDate.get(Calendar.DATE);
            int currentYear = currentDate.get(Calendar.YEAR);

        %> 
        <p>&copy; Copyright <%=currentMonth %> <%=currentDay %>, <%=currentYear %> TOBA Titan &amp; Corporation</p>
    </body>
</html>
