<%-- 
    Document   : add_station
    Created on : 25 janv. 2022, 13:56:33
    Author     : madesbouys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MET TES ATTRIBUTS AJOUTER UNE STATION</h1>
        
        <form action="SNCFServlet" method="POST" >
            <input type="text" name="nom" >
            <input type="text" name="adresse"/>
            <input type="number" name="prix"/>
            
            <input type="submit" value="click">
        </form>
        
    </body>
</html>
