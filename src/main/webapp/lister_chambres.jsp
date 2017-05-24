<%-- 
    Document   : lister_chambres
    Created on : 23 mai 2017, 09:43:25
    Author     : formation
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <c:import url="Menu"></c:import>
    <center>
    <body>
        
      <center><a href="ajouter_chambre"> Ajouter une Chabre</a> </center>
    <br>
        <table border="1">
            <tr>
                <th>nom        </th>
                <th>prix       </th>
                <th>nomhotel   </th>
                <th>Suppression</th>
                
            </tr>
            <c:forEach items="${listeChambres}" var="ch" >
                <tr>
                    <td>${ch.nom}</td>
                    <td>${ch.prix}</td>
                    <td>${ch.hotel}</td>
                    <td><a href="supprimer_chambre?idchambre=${ch.id}"> Supprimer une chambre</a></td>
                    
                </tr>
            </c:forEach>
        </table>
          <c:import url="footer.jsp"></c:import>
    </body>
</center>
</html>
