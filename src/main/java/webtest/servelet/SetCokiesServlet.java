/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author formation
 */
@WebServlet(name = "SetCokiesServlet", urlPatterns = {"/set_cokies"})
public class SetCokiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Cookie  cookie = new Cookie("langue", req.getParameter("langue"));
        resp.addCookie(cookie);  
        
         resp.sendRedirect("lister_hotels");
        
       //req.getRequestDispatcher("lister_hotels.jsp").forward(req, resp);
    }    
}
