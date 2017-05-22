<%-- 
    Document   : ajouter_chambre
    Created on : 22 mai 2017, 16:38:53
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
        <h1>Ajout Chambre </h1>
        
        <form method=="POST">
            <label> Nom chambre </label> 
            <input type="text"  name="nom"/>
            <br>
            <label> Preix chambre</label>
            <input type="text"  name="prix"/>
            <br>
            <label type="text" name="hotel"/>
            
            <input type="submit" value="ajouter"/>
        </form>
    </body>
</html>
