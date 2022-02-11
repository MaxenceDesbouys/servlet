<%-- 
    Document   : index
    Created on : 17 janv. 2022, 13:50:57
    Author     : madesbouys
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
    </head>
    <body>
        <%= new Date() %>
        <h1>Hello World!</h1>
        
        <br/>
        <% if ( session.getAttribute("user") == null) { %>
        <p><a href="add_station.jsp">une page permettant de rajouter des stations</a></p>
        <br>
        <p><a href="create_modify_line.jsp"> une page permettant de créer ou modifiez des lignes</a></p>
        <br>
        <p><a href="create_voyage.jsp">une permettant de créez des voyages</a></p>
        <br>
            <p><em><a href="login">sauthentifier</a></em></p>
        <% } else { %>
         <p>Bienvenue
         <%= session.getAttribute("user") %>
         </p>
         <p><em><a href="logout">logout</a></em></p>
        <% } %>
    </body>
</html>
