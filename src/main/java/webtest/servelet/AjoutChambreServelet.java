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
import webtest.entity.Chambre;
import webtest.service.ChambreService;

/**
 *
 * @author formation
 */
@WebServlet(name = "AjoutChambreServelet", urlPatterns = {"/ajouter_chambre"})
public class AjoutChambreServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        
        Chambre c= new Chambre();
        c.setNom(req.getParameter("nom"));
        c.setPrix(Long.valueOf(req.getParameter("prix")));
        c.setHotel(req.getParameter("hotel"));
        
        ChambreService  service = new ChambreService();
        service.ajouterchambre(c);
        resp.sendRedirect("lister_chambres");
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        
        req.getRequestDispatcher("ajouter_chambre.jsp").forward(req, resp);
    }
    
    

    
    
  

}
