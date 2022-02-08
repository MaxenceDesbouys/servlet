 <%-- 
    Document   : login
    Created on : 18 janv. 2022, 07:16:30
    Author     : madesbouys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Venez donner vos données</h1>
        
        
        <p>Toutes vos données nous appartiennent</p>
        
        <form method="post" action="login">
            <p>Username :</p>
            <input name="user" placeholder="user"/>
            <br/>
            <p>Password :</p>
            <input type="password" name="password" placeholder="password"/>
            <br>
            <input type="submit" value="OK" />
        </form>
    </body>
</html>
