<%-- 
    Document   : ajouter_hotel
    Created on : 22 mai 2017, 14:37:29
    Author     : formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        

        
        <h1>Nouvelle Hotel</h1>
      
        <form method="POST">
            <label>Nom Hotel</label>
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
        
        
    </body>
</html>
