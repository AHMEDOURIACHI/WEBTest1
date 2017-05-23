<%-- 
    Document   : ajouter_chambre
    Created on : 22 mai 2017, 16:38:53
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
        
        <c:import url="Menu"></c:import>
    <center>
        <h1>Ajout Chambre </h1>
        
        <form method="POST" >
            <label> Nom chambre </label> 
            <input type="text"  name="nom"/>
            <br>
            <label> Prix chambre</label>
            <input type="text"  name="prix"/>
            <br>
            <label> Nom hotel</label>
            <input type="text" name="hotel"/>
            <br>
            <input type="submit" value="ajouter"/>
        </form>   
        
          <c:import url="footer.jsp"></c:import>
    
    </body>
</center>
    
</html>
