/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import static java.util.Collections.list;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webtest.entity.Hotel;
import webtest.service.HotelService;

/**
 *
 * @author formation
 */
@WebServlet(name = "ListerHotelsServelet", urlPatterns = {"/lister_hotels"})
public class ListerHotelsServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //recupere la liste des hotels à partir du service 
        HotelService service = new HotelService();
        List<Hotel>  hotels =  service.liste();
        
         req.setAttribute("ListeHotels", hotels);
        
        String titre = "Listes des hotels";
       
        
   
        
        // renvoie vers vue lister_hotels.jsp
          req.getRequestDispatcher("lister_hotels.jsp").forward(req, resp);
    }

  
}
