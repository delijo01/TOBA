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
 *
 * @author delijo01
 */
public class LoginServlet extends HttpServlet {

    /**
     * 1. Code the servlet to retrieve the username and password form the form
     * we added to login.html. Have the servlet check that the username is equal
     * to jsmith@toba.com and the password is equal to "letmein". Make sure you
     * use these values. If the username and password match, the servlet to 
     * forward the request to the account_activity.html page. If it is incorrect,
     * it should forward the request to the login_failure.html page.
     * 
     */
    //Create the doPost method
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //set the Content Type
        response.setContentType("text/html;charset=UTF-8");
        
        // get parameters from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String url = "/index.html";
        //create a variable for the message and set to string type
        //String message;
        //Create a condition to look for the username and password specified
        if (username == "jsmith@toba.com" && password == "letmein") {
            //message = "username is correct";
            url = "/Account_activity.html";
        } else {
            //message = "Incorrect username";
            url = "/Login_failure.html";
        }
        //get the information from the form
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
        //print the message on the form
        try (PrintWriter out = response.getWriter()) {

            out.println("<title>Servlet LoginServlet</title>");            
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");

        }
    }

    //Create the doGet Method
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Call the doPost method
        doPost(request, response);
    }


}
