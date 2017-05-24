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
import webtest.service.ChambreService;

/**
 *
 * @author formation
 */
@WebServlet(name = "SupprimerChambreServelet", urlPatterns = {"/supprimer_chambre"})
public class SupprimerChambreServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        Long idchambre = Long.valueOf( req.getParameter("idchambre"));
        
        ChambreService service = new ChambreService();
        
        service.supprimerChambre(idchambre);
        resp.sendRedirect("lister_chambres");
        
        
    }

    

}
