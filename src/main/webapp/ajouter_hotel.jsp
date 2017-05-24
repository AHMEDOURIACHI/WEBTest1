<%-- 
    Document   : ajouter_hotel
    Created on : 22 mai 2017, 14:37:29
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
        

        <c:import url ="Menu"></c:import>
       
    <center> 
        <table border="1">
        <form method="POST">
            <label>Nom Hotel    </label>
            <input type="text" name="nom"/>
            <br>
            <label>adresse hotel</label>
            <input type="text" name="adresse"/>
            <br>
            <label>Code postale</label>
            <input type="text" name="codePostal"/>
            <br>
            <input type="submit" value="ajouter"/>
        </form>
            </table>
          <c:import url="footer.jsp"></c:import>
    </body>
</center>
</html>
