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
        
        <h1>${titre}</h1>
        <table border="1">
            <tr>
                <th>nom</th>
                <th>prix</th>
                <th>nomhotel</th>
                
            </tr>
            <c:forEach items="${listeChambres}" var="h" >
                <tr>
                    <td>${h.nom}</td>
                    <td>${h.prix}</td>
                    <td>${h.hotel}</td>
                    
                </tr>
            </c:forEach>
        </table>
          <c:import url="footer.jsp"></c:import>
    </body>
</center>
</html>
