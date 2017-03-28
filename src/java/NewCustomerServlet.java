/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
 */
public class NewCustomerServlet extends HttpServlet {

    /**
     * 1. Code the servlet to retrieve tghe new customer form data and just
     * redirect to the success.html page
     *
     * 2. Code the NewCustomerServlet to validate the user has entered in values
     * for all the form fields, if not assign a message variable such as
     *  "Please fill out all the form fields" and display a message on the 
     *  new_customer.html page
     */
    //Create the doPost method
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //set the Content Type
        response.setContentType("text/html;charset=UTF-8");
        
              
        // get parameters from the request
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipcode = request.getParameter("zipcode");
        String email = request.getParameter("Email");
        String url = "/New_customer.html";
               
        
        String message;
        //use a condition to validate the parameters
        if (firstname == null || lastname == null || phone == null || address == null || 
                city == null || state == null || zipcode == null || email == null ||
                firstname.isEmpty() || lastname.isEmpty() || phone.isEmpty() || 
                address.isEmpty() || city.isEmpty() || state.isEmpty() || 
                zipcode.isEmpty() || email.isEmpty()) {
            message = "Please fill out all eight text boxes.";
            url = "/New_customer.html";
        } 
        else {
            message = "";
            url = "/Success.html";
        }
        
        //set the message attributes
        request.setAttribute("message", message);
        
        //get the information from the form
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
        
        //print the message on the form
        PrintWriter out = response.getWriter();
        try {
            //out.println("<!DOCTYPE html>");
            //out.println("<html>");
            //out.println("<head>");
            //out.println("<title>Servlet TransactionServlet</title>");
            out.println("<h1>Servlet NewCustomerServlet" + request.getAttribute(message) + "</h1>");
            out.println("<p>NewCustomerServlet Message " + request.getAttribute("message") + "</p>");            
            //out.println("</head>");
            //out.println("<body>");
            //out.println("<h1>Servlet TransactionServlet at " + request.getContextPath() + "</h1>");
            //out.println("</body>");
            //out.println("</html>");
        }
        finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Call the doPost method
        doPost(request, response);
    }

}
