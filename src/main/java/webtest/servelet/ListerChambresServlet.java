/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ListerChambreservelet", urlPatterns = {"/lister_chambres"})
public class ListerChambresServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ChambreService service = new ChambreService();
        List<Chambre> listerchambre = service.listerchambrre();
        req.setAttribute("listeChambres", listerchambre);

        req.getRequestDispatcher("lister_chambres.jsp").forward(req, resp);

    }

}
