<%-- 
    Document   : create_voyage
    Created on : 31 janv. 2022, 12:37:42
    Author     : madesbouys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Création de Voyage</title>
    </head>
    <body>
        <form action="VoyageServlet" method="POST">
            <label>Départ</label>
            <br/>
            <input type='text' name="depart" placeholder="Entrer station de départ" />
            <br/>
            <label>Arrivée</label>
            <br/>
            <input type='text' name="arriver" placeholder="Entrer station d'arriver" />
            <br/>
            <label>Prix</label>
            <br/>
            <input type='integer' name="prix" placeholder="Entrer le prix du voyage" />
            <br/>
            <input type="submit" value="creer" />
        </form>
    </body>
</html>
