/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.Packages;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import toba.Beans.User; //import the Java beans Class library
import toba.Data.UserDB; //import the Java Data Class library
/**
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
 */

/**
 * 
 *1. 
 * 2. 
 * 3. 
 */

@WebServlet(name = "PasswordResetServlet", urlPatterns = {"/PasswordResetServlet"})
public class PasswordResetServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        //set the Content Type
        response.setContentType("text/html;charset=UTF-8");

        //set printwriter to pull message
        PrintWriter htmlnote = response.getWriter();
        
        //Set the string url
        String url = "/password_reset.jsp";

        // get parameters from the request        
        String username = "TestName";
        String password = request.getParameter("password");;
    
        //create the session scope
        HttpSession session = request.getSession();
        
        // store data in User object
        User user = new User();
        user.setPassword(password);
 
        String message;

        //use a condition to validate the parameters
        if (password == null || password.isEmpty()) {
            //set the variable message
            message = "Please add the new password for the password reset. </h1><br><h1> To return to Passoword Reset form, please press the back button";
            //set the url
            url = "/password_reset.jsp";
            //set the message attributes
            request.setAttribute("message", message);
            //using a try finally
            try {
                //print the message to inform the user that information is missing from the form
                htmlnote.println("<h1>Missing Information: </h1><br><h1>" + request.getAttribute("message") + "</h1>");
            }
            finally{
                //close the html connection
                htmlnote.close();
            }
        } 
        else {
            //set the variable message
            message = "";
            UserDB.insert(user);
            //set the url
            url = "/Account_activity.jsp";
            //set the message attributes
            request.setAttribute("message", message);
            //set the user Attributes to sesson scope
            session.setAttribute("user", user);
            }   
        
        //get the information from the form
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }

    //Create the doGet Method
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Call the doPost method
        doPost(request, response);
    }


}
