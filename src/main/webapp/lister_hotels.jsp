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
    <body>
        <h1>${titre}</h1>
        <table>
            <tr>
                <th>Adresse</th>
                <th>Nom</th>
                <th>Code postale</th>
            </tr>
            <c:forEach items="${ListeHotels}" var="h" >
                <tr>
                    <td>${h.nom}</td>
                    <td>${h.adresse}</td>
                    <td>${h.codePostal}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
