<%-- 
    Document   : lister_hotels
    Created on : 22 mai 2017, 11:32:29
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
        <h1>
            
             <c:if test="${ cookie['langue'].value=='fr' }">
               Liste hotels 
             </c:if>
            
             <c:if test="${ cookie['langue'].value=='en' }">
               hotels list
             </c:if>
        
        </h1>
     
    <center> <a href="ajouter_hotel">Ajouter un hotel</a></center> 
    <br>
    <br>
        <table border="1">
            <tr>
                <th>Adresse     </th>
                <th>Nom         </th>
                <th>Code postale</th>
            </tr>
            <c:forEach items="${ListeHotels}" var="h" >
                <tr>
                    <td>${h.nom}</td>
                    <td>${h.adresse}</td>
                    <td>${h.codePostal}</td>
                    <td> <a href="supprimer_hotels?idhotel=${h.id}">Supprimer hotel</a></td>
                </tr>
            </c:forEach>
        </table>
          <c:import url="footer.jsp"></c:import>
    </body>
    </center>
</html>
