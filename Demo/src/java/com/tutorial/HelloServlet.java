package com.tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author BYUKUSENGE Ezira
 */
// Maps the servlet to /HelloServlet as required for the web app 
@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"}) 
public class HelloServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Sets the response type so the browser knows to render HTML [cite: 90]
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
//            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            
            // Displays the context path (e.g., /ServletTutorial or /Demo) 
//            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("<h2>Hello World! </h2>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}