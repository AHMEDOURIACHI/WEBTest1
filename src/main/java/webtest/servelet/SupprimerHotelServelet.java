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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webtest.service.HotelService;

/**
 *
 * @author formation
 */
@WebServlet(name = "SupprimerHotelServelet", urlPatterns = {"/supprimer_hotels"})
public class SupprimerHotelServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        
          Long idHotel = Long.valueOf(req.getParameter("idhotel"));
          
          HotelService service = new HotelService();
          service.supprimerHotel(idHotel);
          resp.sendRedirect("lister_hotels");
          
          
          
          
          
          
          
    }
    
    
    
    
  

}
